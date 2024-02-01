package com.saulProgramado.NunesSportsAPI.domain.Product;

import java.math.BigDecimal;

public record ProductConsultData(Long id, String name, String code, String describe, BigDecimal price) {
	
	public ProductConsultData(Product product) {
		this(product.getId(), product.getName(), product.getCode(), product.getDescribe(), product.getPrice());
	}

}
