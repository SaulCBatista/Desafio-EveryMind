package com.saulProgramado.NunesSportsAPI.domain;

public record ProductDetailsData(Long id, String nome, String code, String describe, Double price) {

	public ProductDetailsData(Product product) {
		this(product.getId(), product.getName(), product.getCode(), product.getDescribe(), product.getPrice());
	}
}
