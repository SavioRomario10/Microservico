package com.savioromario.produtos_api.modules.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.savioromario.produtos_api.modules.produto.model.Category;
import com.savioromario.produtos_api.modules.produto.dto.CategoryRequest;
import com.savioromario.produtos_api.modules.produto.dto.CategoryResponse;
import com.savioromario.produtos_api.modules.produto.repository.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public CategoryResponse save(CategoryRequest request){
    var category = categoryRepository.save(Category.of(request));
    validate(request);
    return CategoryResponse.of(category);
  }

  private void validate(CategoryRequest request){
    if(ObjectUtils.isEmpty(request.getDescription())) {
      throw new IllegalArgumentException("Description is required");
    }
  }
}