package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Employee;
import com.example.demo.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	private HomeService hs;
	
//	@Autowired
//	private RestTemplate rt;
	
	@PostMapping("/save")
	public String save(@RequestBody Employee e)
	{
		return hs.save(e);
		
	}
	@GetMapping("/get")
	public List<Employee> getdata()
	{
		return hs.getdata();
	}
	@DeleteMapping("/id/{id}")
	public String deletedata(@PathVariable("id") int id)
	{
		return hs.deletedata(id);		
	}
	
	@GetMapping("/edit/{id}")
	public Employee editdata(@PathVariable("id") int id)
	{
		return hs.editdata(id);
		
	}
	@PutMapping("/update")
	public List<Employee> updatedata(@RequestBody Employee e)
	{
		return hs.updatedata(e);
	}

	@GetMapping("/getaddress/{address}")
	public List<Employee> getdatabyaddress(@PathVariable("address") String address)
	{
		return hs.getdatabyaddress(address);
	}
	@GetMapping("/getname/{name}")
	public List<Employee> fetchbyname(@PathVariable("name") String name)
	{
		System.out.println(name);
		return hs.fetchdatabyname(name);
	}
	@GetMapping("/get/{name}/{address}")
			public List<Employee> fetchbynameandaddress(@PathVariable("address") String address,
					@PathVariable("name") String name)
			{
				return hs.getdatabyaddressandname(name, address);
			}
}