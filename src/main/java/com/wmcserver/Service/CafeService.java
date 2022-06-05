package com.wmcserver.Service;

import com.wmcserver.Class.Cafe;
import com.wmcserver.Dto.CafeDto;
import com.wmcserver.Repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CafeService {

    private final CafeRepository cafeRepository;

    @Transactional
    public Long update(Long cafeNum, CafeDto cafeDto) {
        Cafe cafe = cafeRepository.findById(cafeNum).orElseThrow(
                () -> new IllegalArgumentException("해당 카페 번호가 존재하지 않습니다.")
        );
        cafe.update(cafeDto);
        return cafe.getCafeNum();
    }
}