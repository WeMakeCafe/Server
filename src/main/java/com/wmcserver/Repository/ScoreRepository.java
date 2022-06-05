package com.wmcserver.Repository;

import com.wmcserver.Class.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}