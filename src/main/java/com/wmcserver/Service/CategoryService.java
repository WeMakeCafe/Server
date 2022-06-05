package com.wmcserver.Service;

import com.wmcserver.Class.Category;
import com.wmcserver.Dto.CategoryDto;
import com.wmcserver.Repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public Long update(Long categoryNum, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(categoryNum).orElseThrow(
                () -> new IllegalArgumentException("해당 카테고리 번호가 존재하지 않습니다.")
        );
        category.update(categoryDto);
        return category.getCategoryNum();
    }
}
