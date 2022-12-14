package com.email.service;

import java.util.Arrays;

import java.util.Random;

public class CredentialService {
	
	public char[] generatePassword() { 
		String numbers="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="?!@#$%^&*_+-=/.<>)";
		
		String values=capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random=new Random();
		
		char[] Password=new char [8];
		
		for (int i=0;i<8;i++) {
			Password [i]=values.charAt(random.nextInt(values.length()));
		}
		
		return Password;
}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".xycompany.com";
	}
	
	public void showCredentials(String firstName,String Email,char[] pwd) {
		
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email               --->"+Email); 
		System.out.println("Password            --->"+Arrays.toString(pwd));
		
	}
		

}
