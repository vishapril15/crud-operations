package com.example.demo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	CloudVendorRepository cloudVendorRepository;
	

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudvendor) {
		
		cloudVendorRepository.save(cloudvendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudvendor) {

		cloudVendorRepository.save(cloudvendor);
		return "Success Update";
	}

	@Override
	public String  deleteCloudVendor(String cloudvendorId) {
		
		cloudVendorRepository.deleteById(cloudvendorId);
		return "Delete Success";
		
	}

	@Override
	public CloudVendor getCloudVendor(String cloudvendorId) {
		
		return cloudVendorRepository.findById(cloudvendorId).get();

	}

	@Override
	public List<CloudVendor> getAllCloudVenddor() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}
