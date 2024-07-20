package com.SpringRest.SpringRestXmlJson.WebLayer;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Course
{
    private Integer id;
    
    private String cname;
    
    private double price;

	public Course() {
		super();
	}

	public Course(Integer id, String cname, double price) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", price=" + price + "]";
	}
    
    
}
