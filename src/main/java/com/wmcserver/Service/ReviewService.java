package com.wmcserver.Service;

import com.wmcserver.Dto.ReviewDto;
import com.wmcserver.Repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.wmcserver.Class.Review;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Transactional
    public Long update(Long reviewNum, ReviewDto reviewDto) {
        Review review = reviewRepository.findById(reviewNum).orElseThrow(
                () -> new IllegalArgumentException("해당 리뷰 번호가 존재하지 않습니다.")
        );
        review.update(reviewDto);
        return review.getReviewNum();
    }
}