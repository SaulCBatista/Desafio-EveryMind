package com.saulProgramado.NunesSportsAPI.domain.Product;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Product")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String code;
	@Column(name = "product_describe")
	private String describe;
	private BigDecimal price;
	
	public Product (ProductRegisterData data) {
		this.name = data.name();
		this.code = data.code();
		this.describe = data.describe();
		this.price = data.price();
	}

	public void updateData(@Valid ProductUpdateData data) {
		if(data.name() != null) {
			this.name = data.name();
		}
		
		if(data.describe() != null) {
			this.describe = data.describe();
		}
		
		if(data.price() != null) {
			this.price = data.price();
		}
	}
	
}
