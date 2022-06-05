package com.wmcserver.Service;

import com.wmcserver.Dto.KeywordDto;
import com.wmcserver.Repository.KeywordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.wmcserver.Class.Keyword;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class KeywordService {

    private final KeywordRepository keywordRepository;

    @Transactional
    public Long update(Long keywordNum, KeywordDto keywordDto) {
        Keyword keyword = keywordRepository.findById(keywordNum).orElseThrow(
                () -> new IllegalArgumentException("해당 키워드 번호가 존재하지 않습니다.")
        );
        keyword.update(keywordDto);
        return keyword.getKeywordNum();
    }
}
