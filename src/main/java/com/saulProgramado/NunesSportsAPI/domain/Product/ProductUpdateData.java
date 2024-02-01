package com.saulProgramado.NunesSportsAPI.controller;

import jakarta.validation.constraints.NotNull;

public record ProductUpdateData(
		@NotNull
		Long id,
		String name,
		String describe, 
		Double price) {

}
