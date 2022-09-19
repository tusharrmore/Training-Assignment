package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface HomeService{
	public String save(Employee e);
	public List<Employee> getdata();
	public String deletedata(int id);
	public Employee editdata(int id);
	public List<Employee> updatedata(Employee e);
	public List<Employee> getdatabyaddress(String address);
	public List<Employee> fetchdatabyname(String name);
	public List<Employee> getdatabyaddressandname(String name,String address);
 
}
