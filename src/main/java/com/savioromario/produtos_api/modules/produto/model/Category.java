package com.savioromario.produtos_api.modules.produto.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.beans.BeanUtils;

import com.savioromario.produtos_api.modules.produto.dto.CategoryRequest;
import com.savioromario.produtos_api.modules.produto.dto.CategoryResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CATEGORY")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "description", nullable = false)
  private String description;

  public static Category of(CategoryRequest request) {
    var response = new Category();
    BeanUtils.copyProperties(request, response);
    return response;
  }
}
