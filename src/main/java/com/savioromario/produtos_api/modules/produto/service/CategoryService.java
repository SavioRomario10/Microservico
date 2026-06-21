package com.savioromario.produtos_api.modules.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.savioromario.produtos_api.modules.produto.model.Category;
import com.savioromario.produtos_api.config.exception.ValidationException;
import com.savioromario.produtos_api.modules.produto.dto.CategoryRequest;
import com.savioromario.produtos_api.modules.produto.dto.CategoryResponse;
import com.savioromario.produtos_api.modules.produto.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

  @Autowired
  private final CategoryRepository categoryRepository;

  public CategoryResponse save(CategoryRequest request){
    validate(request);
    var category = categoryRepository.save(Category.of(request));
    return CategoryResponse.of(category);
  }

  private void validate(CategoryRequest request){
    if(ObjectUtils.isEmpty(request.getDescription())) {
      throw new ValidationException("Descrição é obrigatorio");
    }
  }
}