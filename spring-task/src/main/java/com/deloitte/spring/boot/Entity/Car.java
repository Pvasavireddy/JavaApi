package com.deloitte.spring.boot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private long carid;
	
	@Column(name="car_name")
	private String carname;
	
	@Column(name="car_model")
	private String carmodel;
	
	
	@Column(name="car_cost")
	private float carcost;


	public long getCarid() {
		return carid;
	}


	public void setCarid(long carid) {
		this.carid = carid;
	}


	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}


	public String getCarmodel() {
		return carmodel;
	}


	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}


	public float getCarcost() {
		return carcost;
	}


	public void setCarcost(float carcost) {
		this.carcost = carcost;
	}


	/**
	 * @param carid
	 * @param carname
	 * @param carmodel
	 * @param carcost
	 */
	public Car(long carid, String carname, String carmodel, float carcost) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.carmodel = carmodel;
		this.carcost = carcost;
	}


	/**
	 * 
	 */
	public Car() {
		super();
	}


	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", carmodel=" + carmodel + ", carcost=" + carcost + "]";
	}
	
	
}
