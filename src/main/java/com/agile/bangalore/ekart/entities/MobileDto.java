package com.agile.bangalore.ekart.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "MobileDetails")
public class MobileDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50)
	@Column(name = "MOBILENAME", nullable = false)
	private String mobileName;

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "MANUFACTUREDATE", nullable = false)
	private Date mobileManufactureDate;

	@NotNull
	@Digits(integer = 8, fraction = 2)
	@Column(name = "PRICE", nullable = false)
	private double price;

	@NotEmpty
	@Column(name = "DESCRIPTION", unique = true, nullable = false)
	private String description;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName
				+ ", mobileManufactureDate=" + mobileManufactureDate
				+ ", price=" + price + ", description=" + description + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Date getMobileManufactureDate() {
		return mobileManufactureDate;
	}

	public void setMobileManufactureDate(Date mobileManufactureDate) {
		this.mobileManufactureDate = mobileManufactureDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
