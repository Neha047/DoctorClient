package com.springProject_ms.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Doctor")
@Entity
public class DoctorList {
   
	@Id
	private int id;
	
	private String imgUr;
	
	public DoctorList(int id, String imgUr, String name, String depart) {
		super();
		this.id = id;
		this.imgUr = imgUr;
		this.name = name;
		this.depart = depart;
	}
	//private String image;
	
public String getImgUr() {
		return imgUr;
	}
	public void setImgUr(String imgUr) {
		this.imgUr = imgUr;
	}
	//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
	public DoctorList(int id, String name, String depart) {
		super();
		this.id = id;
		this.name = name;
		this.depart = depart;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String name;
	
	private String depart;
	public DoctorList(String name, String depart) {
		super();
		this.name = name;
		this.depart = depart;
	}
	public DoctorList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}

}
