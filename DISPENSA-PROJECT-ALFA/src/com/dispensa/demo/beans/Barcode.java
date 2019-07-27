package com.dispensa.demo.beans;

public class Barcode {

	private Integer id;
	private String brand;
	private String productCode;
	private Integer brandId;
	private Integer productId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barcode [id=");
		builder.append(id);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", productCode=");
		builder.append(productCode);
		builder.append(", brandId=");
		builder.append(brandId);
		builder.append(", productId=");
		builder.append(productId);
		builder.append("]");
		return builder.toString();
	}
	
}
