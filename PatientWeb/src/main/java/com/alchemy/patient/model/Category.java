package com.alchemy.patient.model;

import org.springframework.data.annotation.Id;



public class Category
{
	@Id
	private String categoryId;
	private  String categoryNam;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryNam() {
		return categoryNam;
	}
	public void setCategoryNam(String categoryNam) {
		this.categoryNam = categoryNam;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryNam=" + categoryNam + "]";
	}


	
	


}
	

	
	
	
	
	
	