package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>
{
	public List<Employee> findByAddress(String address);
	public List<Employee> findByName(String name);
	public List<Employee> findByNameAndAddress(String name,String address);
}
