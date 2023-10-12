package com.coderbyte_project.scorebat.pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.coderbyte_project.scorebat.utilities.Driver;

public class HomePage {
	
	public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

}
