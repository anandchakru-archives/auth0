package com.core.Home;

import java.security.Principal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.auth0.spring.security.api.authentication.AuthenticationJsonWebToken;
import com.core.model.Customer;

@RestController
public class HomeController {
	@RequestMapping("/api/home/{id}")
	public Customer home(@PathVariable String id) {
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName("Anonymous");
		customer.setToken(null);
		return customer;
	}
	@RequestMapping("/sapi/home/{id}")
	public Customer secretHome(@PathVariable String id, Principal auth) {
		AuthenticationJsonWebToken jwt = (AuthenticationJsonWebToken) auth;
		Customer customer = new Customer();
		customer.setId(jwt.getKeyId());
		customer.setName(jwt.getName());
		customer.setToken(jwt.getToken());
		return customer;
	}
}
