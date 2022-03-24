package com.grupo8.login.controllers;

import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.grupo8.login.models.dtos.UserSearchDTO;
import com.grupo8.login.models.entities.Users;

@Controller
@RequestMapping("/user")
public class UserControllers {
	
	
	private static final List<Users> user = Arrays.asList(
            new Users("00053923", "Dinora Maria", "Rivera Gomez", "12-01-2020", "activo"),
            new Users("00230978", "Lucas Daniel", "Gonzalez Reyes", "15-06-2019", "activo"),
            new Users("01234566", "Mariana Jazmin", "Ramos Perez", "05-02-2020", "activo"),
            new Users("00365655", "Tomas Alejandro", "Matinez Santos", "20-05-2018", "activo"),
            new Users("00246789", "Lucia Fabiola", "Aguilar Garcia", "17-03-2021", "activo")
            
			);
            
	
	@GetMapping("/ ")
	public String getMainPageUser(Model model) {
		return "login";
	}
	
	@PostMapping("/user")
	private String requestUser(@ModelAttribute UserSearchDTO search, Model model) {
		
		System.out.println("Name: " + search.getCodeUser());
		System.out.println("Password: " + search.getPassword());  
		
		Users userFind = user.stream()
		.filter((codeUser) -> codeUser.getUserCode().equals(codeUser))
		.findAny()
		.orElse(new Users(""," "," ", " ", " "));
		 
		return "userPage "; 
	}
 
}
