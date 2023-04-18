package com.TNS.user_service;

import javax.transaction.Transactional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class user_service 
{
	@Autowired
	private user_service_repository repo;
	public List<user> listAll()
	{
		return repo.findAll();
	}
	public user get(Integer user_id)
	{
		return repo.findById(user_id).get();
	}
	public void delete(Integer user_id)
	{
		repo.deleteById(user_id);
	}
	public void save(user usr)
	{
		repo.save(usr);
	}
	
}
