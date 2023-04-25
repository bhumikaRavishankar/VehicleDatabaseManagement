package com.vehicledb.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vId;
	private String vName;
	private String vColor;
	private double vPrice;
	private String vModel;
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvColor() {
		return vColor;
	}
	public void setvColor(String vColor) {
		this.vColor = vColor;
	}
	public double getvPrice() {
		return vPrice;
	}
	public void setvPrice(double vPrice) {
		this.vPrice = vPrice;
	}
	public String getvModel() {
		return vModel;
	}
	public void setvModel(String vModel) {
		this.vModel = vModel;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", vColor=" + vColor + ", vPrice=" + vPrice + ", vModel="
				+ vModel + "]";
	}
		
}
