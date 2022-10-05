package com.wmcserver.Controller;

import com.amazonaws.services.s3.AmazonS3;
import com.wmcserver.Class.CafeImage;
import com.wmcserver.Class.Personal;
import com.wmcserver.Class.ReviewImage;
import com.wmcserver.Dto.PersonalDto;
import com.wmcserver.ImageService.FileService;
import com.wmcserver.Repository.CafeImageRepository;
import com.wmcserver.Repository.PersonalRepository;
import com.wmcserver.Repository.ReviewImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class FileController {

    private final FileService fileService;

    private final ReviewImageRepository reviewImageRepository;

    private final CafeImageRepository cafeImageRepository;

    private final PersonalRepository personalRepository;


    //personal
    @PostMapping("/personal/image")
    public Personal createPersonal(@RequestParam(value="image") MultipartFile file,
                                   @RequestParam(value="id") String id,
                                   @RequestParam(value="pwd") String pwd,
                                   @RequestParam(value="nickname") String nickName,
                                   @RequestParam(value="grade") Integer grade,
                                   @RequestParam(value="phoneNum") Integer phoneNum,
                                   @RequestParam(value="favorite1") String favorite1,
                                   @RequestParam(value="favorite2") String favorite2) throws IllegalAccessException {

        String fileUrl = fileService.uploadImage(file);

        Personal save = new Personal(id, pwd, nickName, grade, phoneNum, favorite1, favorite2);
        save.setProfileImageUrl(fileUrl);
        return save;
    }

    @PutMapping("/personal/image/{memNum}")
    public Personal updatePersonal(@PathVariable Long memNum, @RequestParam(value="image") MultipartFile file) throws IllegalAccessException {
        Optional<Personal> personal = personalRepository.findById(memNum);
        Personal save = personal.get();
        String fileUrl = fileService.uploadImage(file);
        save.setProfileImageUrl(fileUrl);
        return save;
    }

    //reviewImage
    @GetMapping("/reviewImage")
    public List<ReviewImage> downloadReviewImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return reviewImageRepository.findAll();
    }

    @PostMapping("/reviewImage/upload")
    public ReviewImage uploadReviewImage(@RequestParam(value="image") MultipartFile file,
                              @RequestParam(value="memNum") Long memNum,
                              @RequestParam(value="reviewNum") Long reviewNum) throws IllegalAccessException {

        String fileUrl = fileService.uploadImage(file);

        ReviewImage reviewImage = new ReviewImage(memNum, reviewNum, fileUrl);
        reviewImageRepository.save(reviewImage);

        return reviewImage;
    }

    @DeleteMapping("/reviewImage/{rImageNum}")
    public Long deleteReviewImage(@PathVariable Long rImageNum) {
        reviewImageRepository.deleteById(rImageNum);
        return rImageNum;
    }


    //cafeImage
    @GetMapping("/cafeImage")
    public List<CafeImage> downloadCafeImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return cafeImageRepository.findAll();
    }

    @PostMapping("/cafeImage/upload")
    public CafeImage uploadCafeImage(@RequestParam(value="image") MultipartFile file,
                                         @RequestParam(value="cafeNum") Long cafeNum ) throws IllegalAccessException {

        String fileUrl = fileService.uploadImage(file);

        CafeImage cafeImage = new CafeImage(cafeNum, fileUrl);
        cafeImageRepository.save(cafeImage);

        return cafeImage;
    }

    @DeleteMapping("/cafeImage/{cImageNum}")
    public Long deleteCafeImage(@PathVariable Long cImageNum) {
        cafeImageRepository.deleteById(cImageNum);
        return cImageNum;
    }
}
