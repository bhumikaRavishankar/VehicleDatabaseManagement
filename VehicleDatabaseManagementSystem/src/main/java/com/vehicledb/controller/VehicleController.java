package com.vehicledb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.vehicledb.module.Vehicle;
import com.vehicledb.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService ser;
	

	@PostMapping("/addVehicle")
	ResponseEntity<Vehicle> addEmployee(@RequestBody Vehicle v){
		return new ResponseEntity<Vehicle>(ser.addVehicle(v), HttpStatus.CREATED);
	}
	
	@GetMapping("/getById")
	ResponseEntity<Vehicle> getById(@RequestHeader Integer vId){
		return new ResponseEntity<Vehicle>(ser.getById(vId), HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllDetails")
	ResponseEntity<List<Vehicle>> getAllDetails(){
		return new ResponseEntity<List<Vehicle>>(ser.getAllDetails(), HttpStatus.FOUND);
	}
	
	@GetMapping("/getByColor")
	ResponseEntity<List<Vehicle>> getByColor(@RequestHeader String vColor){
		return new ResponseEntity<List<Vehicle>>(ser.getVehicleByColor(vColor), HttpStatus.FOUND);
	}
	
	@GetMapping("/priceMoreThan1000000")
	ResponseEntity<List<Vehicle>> getByPriceMore(){
		return new ResponseEntity<List<Vehicle>>(ser.getByPriceMore(), HttpStatus.FOUND);
	}
	
	@GetMapping("/getByPriceSort")
	ResponseEntity<List<Vehicle>> getByPriceSort(){
		return new ResponseEntity<List<Vehicle>>(ser.getByPriceSort(), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/deleteById")
	ResponseEntity<Vehicle>deleteById(@RequestHeader Integer vId){
		return new ResponseEntity<Vehicle>(ser.deleteVehicleById(vId), HttpStatus.OK);
	}
	
	@GetMapping("/getByPriceColorSort")
	ResponseEntity<List<Vehicle>> getByPriceColorSort(){
		return new ResponseEntity<List<Vehicle>>(ser.getByPriceColor(), HttpStatus.FOUND);
	}
	
}
