package com.or.PageObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
* 
* 
* This class will store all the locator and methods of login page
*
*/
public class LoginPage 
{

		WebDriver driver;

	//Ubicate each object from view

	
		
		By userField=	By.cssSelector("#username");
		By passwordField=	By.cssSelector("#password");
		By logInButton=	By.cssSelector("#Login");

    	
	// Initialize Page
		
			public LoginPage(WebDriver driver)
			{
				
					this.driver=driver;
					
			}
			
	// Actions for each objects combinations
			
			public void completeUser(String User)
			{
		
				driver.findElement(userField).sendKeys(User);				
			}			
			

			public void completePassword(String Password)
			{
				driver.findElement(passwordField).sendKeys(Password);
			}			
			
			
			
        	
			public void clickOnLogIn()
			{
				driver.findElement(logInButton).click();				
			}			
			
			
			
}

