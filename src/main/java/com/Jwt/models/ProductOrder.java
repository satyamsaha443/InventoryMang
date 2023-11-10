package com.Jwt.models;

import org.springframework.data.mongodb.core.mapping.Field;

public class ProductOrder {
	
	@Field("product_id")
	private String id;
	
	@Field("quantity")
	private int quantity;
	
	@Field("priceAgreement")
	private double priceAgreement;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPriceAgreement() {
		return priceAgreement;
	}

	public void setPriceAgreement(double priceAgreement) {
		this.priceAgreement = priceAgreement;
	}

}
