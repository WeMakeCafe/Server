package com.wmcserver.Repository;

import com.wmcserver.Class.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonalRepository extends JpaRepository<Personal, Long> {

    List<Personal> findById(String Id);

    List<Personal> findByPhoneNum(Integer phoneNumber);
}
