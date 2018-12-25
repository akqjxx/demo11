/**
 * 
 */
package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

/**
 * @author admin
 *
 */
public class TestInteger {

	@Test
	public void test() {

		System.out.println(Integer.MAX_VALUE);
		Arrays.stream(UUID.randomUUID().toString().split("-"))
		.forEach(x -> System.out.println(x));
		
		List<String> list = Arrays.asList("1","3","5");
		list.forEach(System.out::println);
		
		
	}

}
