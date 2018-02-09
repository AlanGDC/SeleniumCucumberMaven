package stepDefination;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.or.PageObjet.EmpireStrikesBackPage;
import com.or.PageObjet.MainPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{
	
	WebDriver driver = firefoxHeadless.ffHeadless();
		
	@Given("^User located in wikipedia Page$")
	public void user_located_in_wikipedia_Page() throws Throwable {
		driver.get("https://www.wikipedia.org/");
	   
	}
				

		
		
	@When("^Search Star Wars Movie$")				
	public void search_Star_Wars_Movie() throws Throwable
					{
					
							MainPage main = new MainPage(driver);
							
							main.searchForMovie("The Empire Strikes back");
							
							
					}					

					
	@When("^Chose Spanish Language$")	
	public void chose_Spanish_Language() throws Throwable
					{
			
							EmpireStrikesBackPage moviePage = new EmpireStrikesBackPage(driver); 
							
							moviePage.clickChangeLanguage();
							
							
								
					}								

					
	@Then("^Star Wars Movie is shown in Spanish language$")				
	public void star_Wars_Movie_is_shown_in_Spanish_language() throws Throwable
					{
					
							Assert.assertEquals("https://es.wikipedia.org/wiki/Star_Wars:_Episode_V_-_The_Empire_Strikes_Back", driver.getCurrentUrl()); 
							
							
					}											
			
			
}
