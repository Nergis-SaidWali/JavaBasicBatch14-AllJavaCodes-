package com.syntax.class13;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		 * How would you find out how many sentences are in that String?
﻿
		 */
		String str="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		
		String[] arr=str.split("[?]"); // period is a regular expression so we use square brackets
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr.length);
		
		
	}

}
