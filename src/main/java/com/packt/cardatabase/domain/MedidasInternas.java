package com.packt.cardatabase.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MedidasInternas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Date date;
	private double fat, water, muscle,kcal,bone,kg;
	
	
	public MedidasInternas() {}

	
 
	public MedidasInternas(long id, Date date, double fat, double water, double muscle, double kcal, double bone,
			double kg, Owner owner) {
		super();
		this.id = id;
		this.date = date;
		this.fat = fat;
		this.water = water;
		this.muscle = muscle;
		this.kcal = kcal;
		this.bone = bone;
		this.kg = kg;
		this.owner = owner;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	private Owner owner;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getMuscle() {
		return muscle;
	}

	public void setMuscle(double muscle) {
		this.muscle = muscle;
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	public double getBone() {
		return bone;
	}

	public void setBone(double bone) {
		this.bone = bone;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}


	
	
	
	
	

	
}
