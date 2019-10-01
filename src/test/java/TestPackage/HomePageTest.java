package TestPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectPackage.BaseObject;
import PageObjectPackage.HomePageObjects;


public class HomePageTest {

	HomePageObjects homePage;
	BaseObject bp;

	public HomePageTest() {
		homePage = new HomePageObjects();
		bp = new BaseObject();
	}
	@Test
	public void womentab()
	{
		if(homePage.iswomenTabPresent())
		{
			System.out.println("women tab present");
		}
		else
		{
			System.out.println("women tab not present");
		}
	}
	@Test
	public void dresstab()
	{
		if(homePage.isdressTabPresent())
		{
			System.out.println("dress tab present");
		}
		else
		{
			System.out.println("dress tab not present");
		}
	}
	@Test
	public void tshirttab()
	{
		if(homePage.istshirtTabPresent())
		{
			System.out.println("Tshirt tab present");
		}
		else
		{
			System.out.println("Tshirt tab not present");
		}
	}
	@Test
	public void womenpagenavigate()
	{
		Assert.assertEquals("Women", homePage.isWomenPageNavigate(),"women tab is not navigated");
	}
	@Test
	public void dresspagenavigate()
	{
		Assert.assertEquals("Dresses", homePage.isdressPageNavigate(),"dress tab is not navigated");
	}
	@Test
	public void tshirtpagenavigate()
	{
		Assert.assertEquals("T-shirts", homePage.istshirtPageNavigate(),"T-shirt tab is not navigated");
	}
	
	@Test
	public void newlettertextbox()
	{
		Assert.assertEquals(true,homePage.isNewsLetterPresent(),"newsLetter is not verified ");
	}
}



















