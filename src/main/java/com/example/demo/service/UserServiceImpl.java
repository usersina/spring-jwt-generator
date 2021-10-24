package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.RoleRepository;
import com.example.demo.repos.UserRepository;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	@Override
	public User findUserByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public Role addRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public User addRoleToUser(String username, String rolename) {
		User user = userRepo.findByUsername(username);
		Role role = roleRepo.findByRole(rolename);
		user.getRoles().add(role);
		return user;
	}

}
