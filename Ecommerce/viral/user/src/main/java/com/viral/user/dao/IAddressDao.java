package com.viral.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.user.model.Address;
import com.viral.user.model.User;

@Repository
public interface IAddressDao extends JpaRepository<Address, Long>{

	public List<User> searchAllUserByCity(String city);
	
}
