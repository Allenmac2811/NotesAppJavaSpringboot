package com.AllenProjects.NotesAppJavaSpringboot.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authentication(String username, String password) {

		boolean isValidUsername = username.equalsIgnoreCase("allen");
		boolean isValidPassword = password.equalsIgnoreCase("123");
		return isValidUsername && isValidPassword;
	}
}
