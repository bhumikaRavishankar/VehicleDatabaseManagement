package com.vehicledb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicledb.exception.ResourceNotFoundException;
import com.vehicledb.module.Vehicle;
import com.vehicledb.repo.VehicleRepo;
import com.vehicledb.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleRepo repo;
	
	@Override
	public Vehicle addVehicle(Vehicle v) {
		return repo.save(v);
	}

	@Override
	public List<Vehicle> getAllDetails() {
		return repo.findAll();
	}

	@Override
	public List<Vehicle> getVehicleByColor(String vColor) {
		return repo.getByColor(vColor);
	}

	@Override
	public List<Vehicle> getByPriceSort() {
		return repo.getVehiclePriceSort();
	}

	@Override
	public List<Vehicle> getByPriceMore() {
		return repo.getByPriceMore();
	}

	@Override
	public Vehicle updateVehicle(Vehicle v) {
		Vehicle v1 = repo.findById(v.getvId()).orElse(null);
		if(v1!=null) {
			v1.setvName(v.getvName());
			v1.setvColor(v.getvColor());
			v1.setvPrice(v.getvPrice());
			v1.setvModel(v.getvModel());
			return repo.save(v1);
		}
		else {
			throw new ResourceNotFoundException("Vehicle", "Id", v.getvId());
		}
	}

	@Override
	public Vehicle getById(Integer vId) {
		return  repo.findById(vId).orElseThrow(()->new ResourceNotFoundException("Vehicle", "Id", vId));
	}

	@Override
	public Vehicle deleteVehicleById(Integer vId) {
		Vehicle v = repo.findById(vId).orElseThrow(()->new ResourceNotFoundException("Vehicle", "Id", vId));
		repo.deleteById(vId);	
		return null;
	}

	@Override
	public List<Vehicle> getByPriceColor() {
		return repo.getByPriceColor();
	}
	
}
