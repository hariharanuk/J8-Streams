package com.streams.app;

import java.util.stream.IntStream;

public class IntStreamA {

	public IntStreamA() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		IntStream.range(1, 100).forEach(System.out::println);
	}

}
