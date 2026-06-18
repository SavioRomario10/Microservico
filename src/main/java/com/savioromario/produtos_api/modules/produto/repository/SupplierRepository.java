package com.savioromario.produtos_api.modules.produto.repository;

import com.savioromario.produtos_api.modules.produto.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}