package com.wmcserver.Controller;

import com.wmcserver.Class.*;
import com.wmcserver.Dto.*;
import com.wmcserver.Repository.*;
import com.wmcserver.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final PersonalRepository personalRepository;
    private final PersonalService personalService;

    private final CafeRepository cafeRepository;
    private final CafeService cafeService;

    private final ReviewRepository reviewRepository;
    private final ReviewService reviewService;

    private final CategoryRepository categoryRepository;
    private final CategoryService categoryService;

    private final KeywordRepository keywordRepository;
    private final KeywordService keywordService;

    private final BookmarkRepository bookmarkRepository;
    private final BookmarkService bookmarkService;

    private final RequirementRepository requirementRepository;
    private final RequirementService requirementService;

    private final ScoreRepository scoreRepository;
    private final ScoreService scoreService;

    private final LoveRepository loveRepository;


    //Personal
    @GetMapping("/personal")
    public List<Personal> getPersonal() {
        return personalRepository.findAll();
    }

    @PutMapping("/personal/{memNum}")
    public Long updatePersonal(@PathVariable Long memNum, @RequestBody PersonalDto personalDto) {
        return personalService.update(memNum, personalDto);
    }

    @DeleteMapping("/personal/{memNum}")
    public Long deletePersonal(@PathVariable Long memNum) {
        personalRepository.deleteById(memNum);
        return memNum;
    }


    //Cafe
    @GetMapping("/cafe") // create
    public List<Cafe> getCafe() {
        return cafeRepository.findAll();
    }

    @PostMapping("/cafe") // read
    public Cafe createCafe(@RequestBody CafeDto cafeDto) {
        Cafe cafe = new Cafe(cafeDto);
        return cafeRepository.save(cafe);
    }

    @PutMapping("/cafe/{cafeNum}") // update
    public Long updateCafe(@PathVariable Long cafeNum, @RequestBody CafeDto cafeDto) {
        return cafeService.update(cafeNum, cafeDto);
    }

    @DeleteMapping("/cafe/{cafeNum}") // delete
    public Long deleteCafe(@PathVariable Long cafeNum) {
        cafeRepository.deleteById(cafeNum);
        return cafeNum;
    }


    //Review
    @GetMapping("/review") // create
    public List<Review> getReview() {
        return reviewRepository.findAll();
    }

    @PostMapping("/review") // read
    public Review createReview(@RequestBody ReviewDto reviewDto) {
        Review review = new Review(reviewDto);
        return reviewRepository.save(review);
    }

    @PutMapping("/review/{reviewNum}") // update
    public Long updateReview(@PathVariable Long reviewNum, @RequestBody ReviewDto reviewDto) {
        return reviewService.update(reviewNum, reviewDto);
    }

    @DeleteMapping("/review/{reviewNum}") // delete
    public Long deleteReview(@PathVariable Long reviewNum) {
        reviewRepository.deleteById(reviewNum);
        return reviewNum;
    }


    //Category
    @GetMapping("/category") // create
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    @PostMapping("/category") // read
    public Category createCategory(@RequestBody CategoryDto categoryDto) {
        Category category = new Category(categoryDto);
        return categoryRepository.save(category);
    }

    @PutMapping("/category/{categoryNum}") // update
    public Long updateCategory(@PathVariable Long categoryNum, @RequestBody CategoryDto categoryDto) {
        return categoryService.update(categoryNum, categoryDto);
    }

    @DeleteMapping("/category/{categoryNum}") // delete
    public Long deleteCategory(@PathVariable Long categoryNum) {
        categoryRepository.deleteById(categoryNum);
        return categoryNum;
    }


    //Keyword
    @GetMapping("/keyword")
    public List<Keyword> getKeyword() {
        return keywordRepository.findAll();
    }

    @PostMapping("/keyword")
    public Keyword createKeyword(@RequestBody KeywordDto keywordDto) {
        Keyword keyword = new Keyword(keywordDto);
        return keywordRepository.save(keyword);
    }

    @PutMapping("/keyword/{keywordNum}")
    public Long updateKeyword(@PathVariable Long keywordNum, @RequestBody KeywordDto keywordDto) {
        return keywordService.update(keywordNum, keywordDto);
    }

    @DeleteMapping("/keyword/{keywordNum}")
    public Long deleteKeyword(@PathVariable Long keywordNum) {
        keywordRepository.deleteById(keywordNum);
        return keywordNum;
    }


    //Bookmark
    @GetMapping("/bookmark") // create
    public List<Bookmark> getBookmark() {
        return bookmarkRepository.findAll();
    }

    @PostMapping("/bookmark") // read
    public Bookmark createBookmark(@RequestBody BookmarkDto bookmarkDto) {
        Bookmark bookmark = new Bookmark(bookmarkDto);
        return bookmarkRepository.save(bookmark);
    }

    @PutMapping("/bookmark/{bookmarkNum}") // update
    public Long updateBookmark(@PathVariable Long bookmarkNum, @RequestBody BookmarkDto bookmarkDto) {
        return bookmarkService.update(bookmarkNum, bookmarkDto);
    }

    @DeleteMapping("/bookmark/{bookmarkNum}") // delete
    public Long deleteBookmark(@PathVariable Long bookmarkNum) {
        bookmarkRepository.deleteById(bookmarkNum);
        return bookmarkNum;
    }


    //Requirement
    @GetMapping("/Requirement")
    public List<Requirement> getRequirement() {
        return requirementRepository.findAll();
    }

    @PostMapping("/Requirement")
    public Requirement createRequirement(@RequestBody RequirementDto requirementDto) {
        Requirement requirement = new Requirement(requirementDto);
        return requirementRepository.save(requirement);
    }

    @PutMapping("/Requirement/{requireNum}")
    public Long updateRequirement(@PathVariable Long requireNum, @RequestBody RequirementDto requirementDto) {
        return requirementService.update(requireNum, requirementDto);
    }

    @DeleteMapping("/Requirement/{requireNum}")
    public Long deleteRequirement(@PathVariable Long requireNum) {
        personalRepository.deleteById(requireNum);
        return requireNum;
    }


    //Score
    @GetMapping("/Score")
    public List<Score> getScore() {
        return scoreRepository.findAll();
    }

    @PostMapping("/Score")
    public Score createScore(@RequestBody ScoreDto scoreDto) {
        Score score = new Score(scoreDto);
        return scoreRepository.save(score);
    }

    @PutMapping("/Score/{scoreNum}")
    public Long updateScore(@PathVariable Long scoreNum, @RequestBody ScoreDto scoreDto) {
        return scoreService.update(scoreNum, scoreDto);
    }

    @DeleteMapping("/Score/{scoreNum}")
    public Long deleteScore(@PathVariable Long scoreNum) {
        scoreRepository.deleteById(scoreNum);
        return scoreNum;
    }

    //Like
    @GetMapping("/love")
    public List<Love> getLove() {
        return loveRepository.findAll();
    }

    @PostMapping("/love")
    public Love createLike(@RequestBody LoveDto loveDto) {
        Love love = new Love(loveDto);
        return loveRepository.save(love);
    }

    @DeleteMapping("/love/{loveNum}")
    public Long deleteLike(@PathVariable Long loveNum) {
        loveRepository.deleteById(loveNum);
        return loveNum;
    }

}
