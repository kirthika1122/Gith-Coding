package PageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BaseObject {
	@FindBy(xpath ="//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']")
	private WebElement WomenPage;
	
	@FindBy(xpath ="//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
	private WebElement dresspage;

	@FindBy(xpath ="//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']")
	private WebElement tshirtpage;
	
	@FindBy(xpath ="//span[@class='category-name']")
	private WebElement womenNavigate;
	
	@FindBy(xpath ="//span[@class='category-name']")
	private WebElement dressNavigate;
	
	@FindBy(xpath ="//span[@class='category-name']")
	private WebElement tshirtNavigate;
	
	@FindBy(xpath ="//input[@id='newsletter-input']")
	private WebElement newletter;	
	
	@FindBy(xpath ="//p[@class='alert alert-success']")
	private WebElement newletterbeforenotification;
	
	@FindBy(xpath ="//p[@class='alert alert-danger']")
	private WebElement newletterafternotification;
	
	
	@FindBy(xpath ="//button[@class='btn btn-default button button-small']")
	private WebElement submit;


	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean iswomenTabPresent()
	{
		return elementFound(WomenPage);
	}
	public boolean isdressTabPresent()
	{
		return elementFound(dresspage);
	}
	public boolean istshirtTabPresent()
	{
		return elementFound(tshirtpage);
	}
	public String isWomenPageNavigate()
	{
		WomenPage.click();
		if(elementFound(womenNavigate))
			
		{
		return womenNavigate.getText();
		}
		else
		{
			return " ";
		}
	}
	public String isdressPageNavigate()
	{
		dresspage.click();
		if(elementFound(dressNavigate))
			
		{
		return dressNavigate.getText();
		}
		else
		{
			return " ";
		}
	}
	public String istshirtPageNavigate()
	{
		tshirtpage.click();
		if(elementFound(tshirtNavigate))
			
		{
		return tshirtNavigate.getText();
		}
		else
		{
			return " ";
		}
	}
	public boolean isNewsLetterPresent()
	{
		newletter.click();
		newletter.sendKeys("kirthika.m11@gmail.com");
		submit.click();
		return elementFound(newletterafternotification);
		
	/*	if(newletterbeforen)
		{
		return elementFound(newletterafternotification);
		}
		else
		{
			return elementFound(newletterbeforenotification);
		}*/
	}
	}	
