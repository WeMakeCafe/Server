package com.wmcserver.Repository;

import com.wmcserver.Class.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
}