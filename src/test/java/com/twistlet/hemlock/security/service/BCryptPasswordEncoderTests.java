package com.twistlet.hemlock.security.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTests {

	@Test
	public void testPasswordAdmin() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		assertTrue(encoder.matches("diamond*64", "$2a$10$DCD3My32T23h0lLSXHRzA.RG4/TrIEUfBHKF6hBQfUmXJaiZxDQby"));
	}

	@Test
	public void testPasswordUser01() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		System.out.println(encoder.encode("ph3a9iab"));
		assertTrue(encoder.matches("ph3a9iab", "$2a$10$cLDgv.Sis/mmHQz1.fv6cOVAkmqe3i14J5bP7O8OCJhjCOKKCmtNG"));
	}

}
