package com.saulProgramado.NunesSportsAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saulProgramado.NunesSportsAPI.domain.Product;
import com.saulProgramado.NunesSportsAPI.domain.ProductConsultData;
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
	
	@GetMapping
	public ResponseEntity<Page<ProductConsultData>> consult(@PageableDefault(sort = {"name"}) Pageable pagination) {
		var page = repository.findAll(pagination).map(ProductConsultData::new);
		return ResponseEntity.ok(page);
	}
	
}
