package com.wmcserver.Repository;

import com.wmcserver.Class.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}