package com.coderbyte_project.scorebat.stepdefinitions;

import org.openqa.selenium.By;

import com.coderbyte_project.scorebat.pages.HomePage;
import com.coderbyte_project.scorebat.utilities.ConfigurationReader;
import com.coderbyte_project.scorebat.utilities.Driver;
import com.coderbyte_project.scorebat.utilities.BrowserUtils;

import io.cucumber.java.en.*;

public class homePageStepDef extends BrowserUtils {
	
	HomePage homePage = new HomePage();
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@Then("user has the following Developer Tools in sidebar menu")
	public void user_has_the_following_developer_tools_in_sidebar_menu() {
		verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("developerTools")));
	}

	@Then("user has the following Top Leagues in sidebar menu")
	public void user_has_the_following_top_leagues_in_sidebar_menu() {
		verifyElementDisplayed(Driver.getDriver().findElement(By.xpath("topLeagues")));
	}

	@Then("user has the following Countries in sidebar menu")
	public void user_has_the_following_countries_in_sidebar_menu() {
		verifyElementDisplayed(By.xpath("countries"));
	}

	@Then("user has the following Sign In in sidebar menu")
	public void user_has_the_following_sign_in_in_sidebar_menu() {
		verifyElementDisplayed(By.xpath("signIn"));
	}

}
