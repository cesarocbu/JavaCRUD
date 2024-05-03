package com.cesarocbu.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarocbu.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Long> {



}
