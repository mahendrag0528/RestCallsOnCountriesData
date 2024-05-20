package com.rest.mahi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.rest.mahi.country.Country;
import com.rest.mahi.country.CountryRepository;

@RestController
public class CountryRepoServ {

	@Autowired
	private CountryRepository repo;
	
	@GetMapping("/countries/getList")
	public List<Country> listAll(){
		return repo.findAllByOrderByNameAsc();
	}
	
	@PostMapping("/countries/save")
	public String save(@RequestBody Country country) {
		Country saved=repo.save(country);
		return String.valueOf(saved.getId());
	}
	
	@GetMapping("/countries/delete/{id}")
	public void delete(@PathVariable int id) {
		repo.deleteById(id);
	}
}
