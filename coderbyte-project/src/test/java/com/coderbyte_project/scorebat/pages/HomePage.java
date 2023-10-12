package com.coderbyte_project.scorebat.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.coderbyte_project.scorebat.utilities.Driver;

public class HomePage {
	
	public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
	
	@FindBy(xpath = "//div[@class='BatFeedItem BatFeedItemPadding BatFeedItemNoM']")
    public WebElement sidebar;
	
	@FindBy(xpath = "//div[.='Developer Tools']/..")
    public WebElement developerTools;
	
	@FindBy(xpath = "//div[@class='_715555b9']/a[@href='/video-widget/']")
    public WebElement freeVideoWidget;
	
	@FindBy(xpath = "//div[@class='_715555b9']/a[@href='/video-api/']")
    public WebElement freeVideoApi;
	
	@FindBy(xpath = "//div[@class='_715555b9']/a[@href='/free-livescore-widget/']")
    public WebElement freeLiveScoreWidget;
	
	@FindBy(xpath = "//div[.='Top Leagues']/..")
    public WebElement topLeagues;
	
	//TODO
	
	@FindBy(xpath = "//div[.='Countries']/..")
    public WebElement countries;
	
	//TODO
	
	@FindBy(xpath = "//div[@class='_715555b9']/a[@href='/account/']")
    public WebElement signIn;

}
