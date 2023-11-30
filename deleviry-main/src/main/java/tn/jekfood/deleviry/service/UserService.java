package tn.jekfood.deleviry.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import  tn.jekfood.deleviry.model.User;
import  tn.jekfood.deleviry.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}