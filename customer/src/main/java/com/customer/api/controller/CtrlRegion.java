package com.customer.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.api.entity.Region;

@RestController
@RequestMapping("/region")
public class CtrlRegion {

	@GetMapping
	public ResponseEntity<List<Region>> getRegions(){
		Region region1 = new Region();
		region1.setRegion_id(1);
		region1.setRegion("Norte");
		region1.setStatus(1);
		Region region2 = new Region();
		region2.setRegion_id(2);
		region2.setRegion("Sur");
		region2.setStatus(1);
		
		List regions = new ArrayList();
		regions.add(region1);
		regions.add(region2);
		
		return new ResponseEntity<>(regions, HttpStatus.OK);
	}
	
	@GetMapping("/{region_id}")
	public ResponseEntity<Region> getRegion(@PathVariable int region_id){
		Region region1 = new Region();
		region1.setRegion_id(1);
		region1.setRegion("Norte");
		region1.setStatus(1);
		
		return new ResponseEntity<>(region1, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<String> createRegion(@Valid @RequestBody Region region, BindingResult bindingResult){
		String message = "";
		if(bindingResult.hasErrors()) {
			message = bindingResult.getAllErrors().get(0).getDefaultMessage();
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
		message = "region created";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@PutMapping("/{region_id}")
	public ResponseEntity<String> updateRegion(@PathVariable int region_id, @Valid @RequestBody Region region, BindingResult bindingResult){
		String message = "";
		if(bindingResult.hasErrors()) {
			message = bindingResult.getAllErrors().get(0).getDefaultMessage();
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}
		message = "region updated";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@DeleteMapping("/{region_id}")
	public ResponseEntity<String> deleteRegion(@PathVariable int region_id){
		String message = "";

		message = "region removed";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
