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
	private double imc,pesoDesejado,height,fat, water, muscle,kcal,bone,kg;
	
	
	public MedidasInternas() {}

	
 
	public MedidasInternas(long id, Date date,double height , double fat, double water, double muscle, double kcal, double bone,
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
		this.height = height;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	private Owner owner;



	
	
	
	
	public double getPesoDesejado() {
		return 24.9 * (height*height);
	}



	public void setPesoDesejado(double pesoDesejado) {
		this.pesoDesejado = pesoDesejado;
	}



	public double getImc() {
		
		
		return kg/(height*height);
	}



	public void setImc(double imc) {
		this.imc = imc;
	}



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
		 int x=0;
		 
		 return x==0 ?  3 :  4;
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



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}
	
	


	
	
	
	
	

	
}
