package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CloudVendor;


public interface CloudVendorService {

	public String createCloudVendor(CloudVendor cloudvendor);
	//public String updateCloudVendor(String cloudvendor);
	public String deleteCloudVendor(String cloudvendorId);
	public CloudVendor getCloudVendor(String cloudvendorId);
	public List<CloudVendor> getAllCloudVenddor();
	//public String updateCloudVendor(String cloudvendor);
	String updateCloudVendor(CloudVendor cloudvendor);
	
	
}
