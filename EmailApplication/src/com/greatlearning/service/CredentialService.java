package com.greatlearning.service;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.entities.Employee;
import java.util.Random;

public class CredentialService implements ICredentials 
{

	@Override
	public String generatePassword()
	{	
	String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small = "abcdefghijklmnopqrstuvwxyz";
	String nums ="0123456789";
	String special = "!@#$%^&*<>?";
	StringBuffer rtnValue=new StringBuffer();
	
	Random random = new Random ();
	
	int rand = random.nextInt(caps.length());
	rtnValue.append(caps.charAt(rand));
	
	rand = random.nextInt(small.length());
	rtnValue.append(small.charAt(rand));
			
	rand = random.nextInt(nums.length());
	rtnValue.append(nums.charAt(rand));
	
	rand = random.nextInt(special.length());
	rtnValue.append(special.charAt(rand));
			
	for (int index=0; index <4; index++) 
	
	{
		rand = random.nextInt(4);
		
		switch (rand) 
		{
		case 0:
			rand = random.nextInt(caps.length());
			rtnValue.append(caps.charAt(rand));
			break;
		
		case 1:
			rand = random.nextInt(small.length());
			rtnValue.append(small.charAt(rand));
			break;
			
		case 2:
			rand = random.nextInt(nums.length());
			rtnValue.append(nums.charAt(rand));
			
		case 3:
			rand = random.nextInt(special.length());
			rtnValue.append(special.charAt(rand));
		}
	}
	
	return rtnValue.toString();
	
	
	}
	

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) 
	{
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".greatlearning.com";
	}

	@Override
	public void showCredentials(Employee emp) 
	{
	 System.out.println(emp);
		
	}

	
	
}
