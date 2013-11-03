package com.twistlet.hemlock.security.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTests {

	@Test
	public void testPassword() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		assertTrue(encoder.matches("diamond*64", "$2a$10$DCD3My32T23h0lLSXHRzA.RG4/TrIEUfBHKF6hBQfUmXJaiZxDQby"));
	}

}
