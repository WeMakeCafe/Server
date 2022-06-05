package com.wmcserver.Service;

import com.wmcserver.Dto.ScoreDto;
import com.wmcserver.Repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.wmcserver.Class.Score;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    @Transactional
    public Long update(Long scoreNum, ScoreDto scoreDto) {
        Score score = scoreRepository.findById(scoreNum).orElseThrow(
                () -> new IllegalArgumentException("해당 점수 번호가 존재하지 않습니다.")
        );
        score.update(scoreDto);
        return score.getScoreNum();
    }
}
