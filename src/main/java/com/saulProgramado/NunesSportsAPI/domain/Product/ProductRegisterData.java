package com.saulProgramado.NunesSportsAPI.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRegisterData(
		@NotBlank
		String name,
		
		@NotBlank
		String code,
		
		String describe,
		
		@NotNull
		Double price
		) {

}