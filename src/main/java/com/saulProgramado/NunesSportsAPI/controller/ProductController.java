package com.saulProgramado.NunesSportsAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saulProgramado.NunesSportsAPI.domain.Product;
import com.saulProgramado.NunesSportsAPI.domain.ProductDetailsData;
import com.saulProgramado.NunesSportsAPI.domain.ProductRegisterData;
import com.saulProgramado.NunesSportsAPI.domain.ProductRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping
	@Transactional
	public ResponseEntity register(@RequestBody @Valid ProductRegisterData data) {
		Product product = new Product(data);
		repository.save(product);
		
		return ResponseEntity.created(null).body(new ProductDetailsData(product));
	}
	
}
