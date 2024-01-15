package com.saulProgramado.NunesSportsAPI.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	private String describe;
	private Double price;
	
	public Product (ProductRegisterData data) {
		this.name = data.name();
		this.code = data.code();
		this.describe = data.describe();
		this.price = data.price();
	}
	
	public Long getId() {
		return id;
	}
	
}
