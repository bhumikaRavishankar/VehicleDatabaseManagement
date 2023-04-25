package com.vehicledb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicledb.module.Vehicle;

@Service
public interface VehicleService {
	
	public Vehicle addVehicle(Vehicle v);
	
	public Vehicle getById(Integer vId);
	
	public List<Vehicle> getAllDetails();
	
	public List<Vehicle> getVehicleByColor(String vColor);
	
	public List<Vehicle> getByPriceSort();
	
	public List<Vehicle> getByPriceMore();
	
	public Vehicle updateVehicle(Vehicle v);
	
	public Vehicle deleteVehicleById(Integer vId);
	
	public List<Vehicle> getByPriceColor();
	
}
