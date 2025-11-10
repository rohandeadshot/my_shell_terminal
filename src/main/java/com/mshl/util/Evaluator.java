package com.mshl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Evaluator {
	
	private static final Logger logger = LoggerFactory.getLogger(Evaluator.class);
	
	
	public static void eval(String input) {
		
		ArrayList<String> args = new ArrayList<>(Arrays.stream(input.strip().split(" ")).collect(Collectors.toList()));
		
		String command = args.removeFirst().toLowerCase();
		
		if(command.equals("echo")) {
			String outLine ="";
			for(String arg : args) {
				outLine+=arg+" ";
			}
			System.out.println(outLine);
			return;
		}
		
	}

}
