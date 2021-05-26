package com.example.demo.resource;

import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	@Autowired
	UsersRepository usersRepository;
	@GetMapping(value = "/allUsers")
	public List<Users> getAll(){
		return usersRepository.findAll();
	}
	
	@PostMapping(value = "/setUser")
	public List<Users> persist(@RequestBody Users users ) {
		usersRepository.save(users);
		return usersRepository.findAll();
	}
	
}
