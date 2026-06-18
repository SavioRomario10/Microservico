package com.savioromario.produtos_api.modules.produto.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "STOQUE", nullable = false)
  private Integer stoque;

  @ManyToOne
  @JoinColumn(name = "FK_category", nullable = false)
  private Category category;

  @ManyToOne
  @JoinColumn(name = "FK_supplier", nullable = false)
  private Supplier supplier;
}
