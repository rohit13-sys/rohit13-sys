package com.pheonix.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pheonix.entity.User;
import com.pheonix.exception.UserNotFoundException;
import com.pheonix.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	//@RequestMapping(path = "/login", method = RequestMethod.POST)
	@PostMapping("/login")
	public String validateUser(User user, ModelMap map, HttpSession session) {

		if (user.getUsername() != null && !user.getUsername().isEmpty() && user.getPassword() != null
				&& !user.getPassword().isEmpty()) {

			try {
				User dbUser = userService.findByUserName(user.getUsername());
				String userName = user.getUsername();
				if (dbUser.getPassword().equals(user.getPassword())) {
					map.addAttribute("uname",dbUser.getUsername());
					return "welcome.jsp";
				}

				else {
					map.addAttribute("LogonError", "Invalid User/Password");
					session.setAttribute("LogonError", "Invalid User/Password");
					// return "redirect:/login.jsp";
					return "redirect:/login-error";
				}
			} catch (UserNotFoundException e) {

				map.addAttribute("LogonError", "Invalid User/Password");
				return "redirect:/login-error";
			}

		} else {
			map.addAttribute("LogonError", "Invalid User/password");
			return "redirect:/login-error";
		}

	}

	//@RequestMapping(path = "/login-error")
	@GetMapping("/login-error")
	public String loginError(ModelMap map) {
		return "login.jsp";
	}

}
