package com.Jwt.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import ch.qos.logback.core.status.Status;

@Document(collection = "orders")
public class Orders {
    @Id
    private String id;

    @Field("userType")
    private UserType userType;

    @Field("orderDate")
    private Date orderDate;

    @Field("deliveryDate")
    private Date deliveryDate;

    @Field("person")
    private Person person;

    @Field("items")
    private List<ProductOrder> items;

    @Field("status")
    private Status status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<ProductOrder> getItems() {
		return items;
	}

	public void setItems(List<ProductOrder> items) {
		this.items = items;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
    

   
}
