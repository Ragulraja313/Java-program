package com.TNS.user_service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user_service_controller 
{
		@Autowired
	private user_service us;
	
	@GetMapping("/user_service")
	public List<user> list()
	{
		return us.listAll();
	}
	@GetMapping("/user_service/{user_id}")
	public ResponseEntity<user> get(@PathVariable Integer user_id)
	{
		try
		{
			user ussr=us.get(user_id);
			return new ResponseEntity<user>(ussr,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<user>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/user_service/{user_id}")
	public ResponseEntity<?> update(@RequestBody user usr,@PathVariable Integer user_id)
	{
		@SuppressWarnings("unused")
		user existuser=us.get(user_id);
		us.save(usr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/user_service/{user_id}")
	public void delete(@PathVariable Integer user_id)
	{
		us.delete(user_id);
	}
}
