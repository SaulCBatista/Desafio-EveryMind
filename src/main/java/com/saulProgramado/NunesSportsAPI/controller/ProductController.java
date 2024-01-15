package com.saulProgramado.NunesSportsAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saulProgramado.NunesSportsAPI.domain.Product;
import com.saulProgramado.NunesSportsAPI.domain.ProductRegisterData;

import jakarta.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {

	public ResponseEntity register(@RequestBody @Valid ProductRegisterData data) {
		Product product = new Product(data);
		return null;		
	}
	
}
