package com.savioromario.produtos_api.modules.produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savioromario.produtos_api.modules.produto.dto.CategoryRequest;
import com.savioromario.produtos_api.modules.produto.dto.CategoryResponse;
import com.savioromario.produtos_api.modules.produto.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

  @Autowired
  private CategoryService service;

  @PostMapping
  public CategoryResponse saved(@RequestBody CategoryRequest request){
    return service.save(request);
  }
}