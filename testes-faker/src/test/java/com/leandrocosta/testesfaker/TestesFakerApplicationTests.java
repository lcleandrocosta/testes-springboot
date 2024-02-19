package com.leandrocosta.testesfaker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestesFakerApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void testCreateUser() {
		var user = Factories.createUser();
		System.out.println(user);

		userService.create(user);

		var userFound = userService.findByUsername(user.username());

		assertEquals(user, userFound);
	}

}
