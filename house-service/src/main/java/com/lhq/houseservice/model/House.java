package com.lhq.houseservice.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "houses")
@EntityListeners(AuditingEntityListener.class)
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long house_id;
	private String user_id;
	private String catalog;
	private String title;
	private String content;
	private int price;
	private int area;
	private String image_url;
	private String city;
	private String district;
	private String address;
	private String location;
	private int bedroom;
	private int restroom;
	private int floor;
	private String certification;
	private String direction;
	private int rating;
	
	public House() {}
	public House(Long house_id, String user_id, String catalog, String title, String content, int price, int area,
			String image_url, String city, String district, String address, String location, int bedroom, int restroom, int floor, String certification,
			String direction, int rating) {
		super();
		this.house_id = house_id;
		this.user_id = user_id;
		this.catalog = catalog;
		this.title = title;
		this.content = content;
		this.price = price;
		this.area = area;
		this.image_url = image_url;
		this.city = city;
		this.district = district;
		this.address = address;
		this.location = location;
		this.bedroom = bedroom;
		this.restroom = restroom;
		this.floor = floor;
		this.certification = certification;
		this.direction = direction;
		this.rating = rating;
	}

	public Long getHouse_id() {
		return house_id;
	}
	public void setHouse_id(Long house_id) {
		this.house_id = house_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getRestroom() {
		return restroom;
	}
	public void setRestroom(int restroom) {
		this.restroom = restroom;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLocation() {
		return location;
	}
	public int getRating() {
		return rating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Home [house_id=" + house_id + ", user_id=" + user_id + ", catalog=" + catalog + ", title=" + title
				+ ", content=" + content + ", price=" + price + ", area=" + area + ", image_url=" + image_url
				+ ", city=" + city + ", district=" + district + ", bedroom=" + bedroom + ", restroom=" + restroom
				+ ", floor=" + floor + ", certification=" + certification + ", direction=" + direction + "]";
	}
	
}
