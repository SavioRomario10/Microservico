package com.savioromario.produtos_api.modules.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.savioromario.produtos_api.modules.produto.model.Product;

public interface ProdutoRepository extends JpaRepository<Product, Integer>{
}