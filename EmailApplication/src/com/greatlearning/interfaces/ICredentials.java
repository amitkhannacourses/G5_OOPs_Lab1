package com.greatlearning.interfaces;

import com.greatlearning.entities.Employee;

public interface ICredentials 
{
String generatePassword ();
String generateEmailAddress (String firstName, String lastName, String department);
void showCredentials (Employee emp);
	 
}
	

