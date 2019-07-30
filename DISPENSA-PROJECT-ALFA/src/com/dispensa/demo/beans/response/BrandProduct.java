package com.dispensa.demo.beans.response;

public class BrandProduct {

	private String brandName;
	private String productName;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrandProduct [brandName=");
		builder.append(brandName);
		builder.append(", productName=");
		builder.append(productName);
		builder.append("]");
		return builder.toString();
	}
	
}
