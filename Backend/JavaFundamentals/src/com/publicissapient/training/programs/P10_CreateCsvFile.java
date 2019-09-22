package com.publicissapient.training.programs;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class P10_CreateCsvFile {
	
	public static void main(String[] args) throws Exception{
		FileWriter file = new FileWriter("friends.csv", true);
		//decorator for additional functionalities
		PrintWriter out = new PrintWriter(file);
		out.println("SlNo,Name,Email,City");
		
		int i=1;
		while(true) {
			String name = getStringFromKeyboard("Enter name: ");
			String email = getStringFromKeyboard("enter email id: ");
			String city = getStringFromKeyboard("Enter City: ");
			
			out.printf("%d,\"%s\",\"%s\",\"%s\"\n",i++, name, email, city);
			
			String ans = getStringFromKeyboard("Do you want to add another? y/n:");
			if(ans.equalsIgnoreCase("n")) {
				break;
			}	
		}
		out.close();
		file.close();
	}
	
	static String getStringFromKeyboard(String message) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return in.readLine();
	}

}
