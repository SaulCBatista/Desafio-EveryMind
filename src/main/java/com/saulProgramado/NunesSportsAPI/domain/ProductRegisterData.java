package com.saulProgramado.NunesSportsAPI.domain;

import jakarta.validation.constraints.NotBlank;

public record ProductRegisterData(
		@NotBlank
		String name,
		
		@NotBlank
		String code,
		
		String describe,
		
		@NotBlank
		Double price
		) {

}
