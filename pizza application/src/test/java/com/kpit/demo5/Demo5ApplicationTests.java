package com.kpit.demo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("context load is started");
		System.out.println("context load is started");
		Assertions.assertTrue(20>14);
		System.out.println("context load is started");
		System.out.println("context load is started");
		System.out.println("context load is started");
	}

}
