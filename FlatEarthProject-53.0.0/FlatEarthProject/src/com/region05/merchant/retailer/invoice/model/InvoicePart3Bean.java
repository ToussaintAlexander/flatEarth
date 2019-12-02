package com.region05.merchant.retailer.invoice.model;

import java.sql.Timestamp;

public class InvoicePart3Bean {

	private int id;
	private int code;
	private int category;
	private int seq;
	private String productName;
	private String description;
	private String gender;
	private String season;
	private int frequency;
	private int supplier;
	private int unitsInStock;
	private int unitSize;
	private int unitPrice;
	private int discount;
	private int unitWeight;
	private int picture;
	private String notes;
	
	private String createUser;
	private Timestamp createTimestamp;
	private String modifyUser;
	private Timestamp modifyTimestamp;

	public InvoicePart3Bean () {}

	public InvoicePart3Bean(int id, int code, int category, int seq, String productName, String description, String gender,
			String season, int frequency, int supplier, int unitsInStock, int unitSize, int unitPrice, int discount,
			int unitWeight, int picture, String notes, String createUser, Timestamp createTimestamp, String modifyUser,
			Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.code = code;
		this.category = category;
		this.seq = seq;
		this.productName = productName;
		this.description = description;
		this.gender = gender;
		this.season = season;
		this.frequency = frequency;
		this.supplier = supplier;
		this.unitsInStock = unitsInStock;
		this.unitSize = unitSize;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.unitWeight = unitWeight;
		this.picture = picture;
		this.notes = notes;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getSupplier() {
		return supplier;
	}

	public void setSupplier(int supplier) {
		this.supplier = supplier;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public int getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(int unitSize) {
		this.unitSize = unitSize;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(int unitWeight) {
		this.unitWeight = unitWeight;
	}

	public int getPicture() {
		return picture;
	}

	public void setPicture(int picture) {
		this.picture = picture;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
