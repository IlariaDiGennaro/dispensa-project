package com.dispensa.demo.beans;

public class Barcode {

	private Integer id;
	private String barcode;
	private String brandCode;
	private String productCode;
	private Brand brand;
	private Product product;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Barcode [id=");
		builder.append(id);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", brandCode=");
		builder.append(brandCode);
		builder.append(", productCode=");
		builder.append(productCode);
		builder.append(", brand=");
		builder.append(brand.toString());
		builder.append(", product=");
		builder.append(product.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
