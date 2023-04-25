package com.vehicledb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vehicledb.module.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{
	
	@Query(value="select * from vehicle where v_color=?1", nativeQuery=true)
	public List<Vehicle> getByColor(String vColor);
	
	@Query(value="select * from vehicle where v_price>1000000", nativeQuery=true)
	public List<Vehicle> getByPriceMore();
	
	@Query(value="select * from vehicle order by v_price", nativeQuery=true)
	public List<Vehicle> getVehiclePriceSort();
	
	@Query(value="select * from vehicle order by v_price, v_color ASC", nativeQuery=true)
	public List<Vehicle> getByPriceColor();
	
}
