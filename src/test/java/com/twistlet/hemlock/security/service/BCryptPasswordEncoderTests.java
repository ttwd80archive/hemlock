package com.twistlet.hemlock.security.service;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTests {

	@Test
	public void testPassword() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		System.out.println(encoder.encode("diamond*64"));
	}

}
