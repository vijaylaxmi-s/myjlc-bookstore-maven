package com.study.maven.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import jakarta.persistence.Table;


@Entity
@Table(name="mybooks")
public class Book {
	@Id
	@Column(name="bid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bid;
	
	@Column(name="bname")
	@NotEmpty(message = "Book Name is Required")
	 @Size(min=8,max=20,message="Name length must be between 8 and 20")
	private String bname;
	
	@Column(name="author")
	 @NotEmpty(message = "Author is Required")
	 @Size(min=7,max=18,message="Name length must be between 7 and 18")
	private String author;
	
	@Column(name="price")
	@NotNull(message ="Price is  Required" )
	 @Min(value=5000, message="Price must be min : 5000")
	 @Max(value=18000, message="Price must be max : 18000")
	private BigDecimal price;
	
	@Column(name="category")
	 @NotEmpty(message = "Category is  Required")
	private String category;
	
	@Column(name="pub")
	 @NotEmpty(message = "Pub is  Required")
	private String pub;

	public Book() {
	}

	public Book( String bname, String author, BigDecimal price, String category, String pub) {
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}
	public Book(Integer bid, String bname, String author, BigDecimal price, String category, String pub) {
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return "[" + bid + " ,  " + bname + " , " + author + " , " + price + " , " + category	+ " , " + pub+ "]";
	}

}
