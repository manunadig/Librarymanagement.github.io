package com.knf.dev.librarymanagementsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.knf.dev.librarymanagementsystem.entity.User;
import com.knf.dev.librarymanagementsystem.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
