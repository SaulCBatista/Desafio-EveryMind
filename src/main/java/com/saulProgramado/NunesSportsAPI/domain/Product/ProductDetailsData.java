package com.saulProgramado.NunesSportsAPI.domain.Product;

import java.math.BigDecimal;

public record ProductDetailsData(Long id, String nome, String code, String describe, BigDecimal price) {

	public ProductDetailsData(Product product) {
		this(product.getId(), product.getName(), product.getCode(), product.getDescribe(), product.getPrice());
	}
}
