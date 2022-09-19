package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeRepository hr;

	@Override
	public String save(Employee e) {
		
		 hr.save(e);
		 return "Save SuccessFully";
	}

	@Override
	public List<Employee> getdata() {
		
		return hr.findAll();
	}

	@Override
	public String deletedata(int id) {
	hr.deleteById(id);
		return "delete data successfully";
	}

	@Override
	public Employee editdata(int id) {
		Employee emp=hr.findById(id).get();
		return emp;
	}

	@Override
	public List<Employee> updatedata(Employee e) {
		hr.save(e);
		return hr.findAll();
	}

	@Override
	public List<Employee> getdatabyaddress(String address) {
		
		return hr.findByAddress(address);
	}

	@Override
	public List<Employee> fetchdatabyname(String name) {
		
		return hr.findByName(name);
	}

	@Override
	public List<Employee> getdatabyaddressandname(String name, String address) {
	
		return hr.findByNameAndAddress(name, address);
	}

	
	}


