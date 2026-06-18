package com.savioromario.produtos_api.modules.produto.dto;

import org.springframework.beans.BeanUtils;

import com.savioromario.produtos_api.modules.produto.model.Category;
import lombok.Data;

@Data
public class CategoryResponse {

  private Integer id;
  private String description;

  public static CategoryResponse of(Category category) {
    var response = new CategoryResponse();
    BeanUtils.copyProperties(category, response);
    return response;
  }
}