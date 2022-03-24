package com.grupo8.login.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grupo8.login.models.dtos.AdminSearchDTO;
import com.grupo8.login.models.dtos.UserSearchDTO;
import com.grupo8.login.models.entities.Admin;
import com.grupo8.login.models.entities.Users;


@Controller
@RequestMapping("/admin")

public class AdminControllers {
	private static final List<Admin> admin = Arrays.asList(
            new Admin("00053923", "Dinora Maria", "Rivera Gomez", "12-01-2020", "activo"),
            new Admin("00230978", "Lucas Daniel", "Gonzalez Reyes", "15-06-2019", "activo"),
            new Admin("01234566", "Mariana Jazmin", "Ramos Perez", "05-02-2020", "activo"),
            new Admin("00365655", "Tomas Alejandro", "Matinez Santos", "20-05-2018", "activo"),
            new Admin("00246789", "Lucia Fabiola", "Aguilar Garcia", "17-03-2021", "activo")
            
			);
	
	
	@GetMapping("/ ")
	public String getMainPageAdmin(Model model) {
		return "admin";
	}
	
	@PostMapping("/admin")
	private String requestUser(@ModelAttribute AdminSearchDTO search, Model model) {
		
		System.out.println("Name: " + search.getCodeUserAdmin());
		System.out.println("Password: " + search.getPassword());  
		
		Admin adminFind = admin.stream() 
		.filter((codeUser) -> codeUser.getUserCode().equals(codeUser))
		.findAny()
		.orElse(new Admin(""," "," ", " ", " "));
		
		
		 
		return "userPage "; 
	}

}
