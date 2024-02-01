package com.saulProgramado.NunesSportsAPI.domain.Product;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record ProductUpdateData(
		@NotNull
		Long id,
		String name,
		String describe, 
		BigDecimal price) {

}
