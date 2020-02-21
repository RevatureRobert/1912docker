package com.example.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trophy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String material;

	private int place;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Trophy(int id, String material, int place) {
		super();
		this.id = id;
		this.material = material;
		this.place = place;
	}

	public Trophy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trophy(String material, int place) {
		super();
		this.material = material;
		this.place = place;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, material, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trophy other = (Trophy) obj;
		return id == other.id && Objects.equals(material, other.material) && place == other.place;
	}

	@Override
	public String toString() {
		return "Trophy [id=" + id + ", material=" + material + ", place=" + place + "]";
	}

}
