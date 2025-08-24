package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {

	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		
		return cloudVendorService.getCloudVendor(vendorId);
		
	}
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudVenddor();
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Create SuccessFully";
	}
@PutMapping
public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor)
{
	cloudVendorService.updateCloudVendor(cloudvendor);
	return " Cloud Vendor Update SuccessFullly";
}
@DeleteMapping("{vendorId}")
public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
{
	cloudVendorService.deleteCloudVendor(vendorId);
	return "cloudVendor Deleted Succefully";
}
	
}

