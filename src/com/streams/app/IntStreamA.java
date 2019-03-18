package com.streams.app;

import java.util.stream.IntStream;

public class IntStreamA {

	public IntStreamA() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//IntStream.range(1, 100).forEach(System.out::println);
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.range(1, 10).count());
		System.out.println(IntStream.of(1,2,3,4).toString());
		IntStream.rangeClosed(1, 10).forEach(System.out::print);
	}

}
