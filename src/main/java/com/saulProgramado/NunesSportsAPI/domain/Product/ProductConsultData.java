package com.saulProgramado.NunesSportsAPI.domain.Product;

public record ProductConsultData(Long id, String name, String code, String describe, Double price) {
	
	public ProductConsultData(Product product) {
		this(product.getId(), product.getName(), product.getCode(), product.getDescribe(), product.getPrice());
	}

}
