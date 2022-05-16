package stepdef.adac;

import org.basec.BaseClass;
import org.openqa.selenium.support.ui.Select;
import org.pojoadac.Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition extends BaseClass {
	Pojo p;
	Select s;

	@Given("user have to enter Adactin hotel login page")
	public void user_have_to_enter_Adactin_hotel_login_page() {
		launchbrowser();
		launchurl("https://adactinhotelapp.com/");
		maximize();
	}

	@When("user have to enter the {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_have_to_enter_the(String username, String password, String checkin, String checkout,
			String firstname, String lastname, String address, String creditcard, String cvv)
			throws InterruptedException {
		// page1
		p = new Pojo();
		implecitywait();
		filltext(p.getAdusername(), username);
		filltext(p.getAdpass(), password);
		clickbtn(p.getAdlogin());

		// page2
		dropdown_visibletext(p.getAdloc(), "Paris");
		dropdown_visibletext(p.getAdhotel(), "Hotel Hervey");
		dropdown_visibletext(p.getAdroomtype(), "Standard");
		dropdown_value(p.getAdnor(), "1");

		p.getAdcheckin().clear();
		filltext(p.getAdcheckin(), checkin);

		p.getAdchkout().clear();
		filltext(p.getAdchkout(), checkout);

		dropdown_value(p.getAdadult(), "2");
		dropdown_value(p.getAdchild(), "1");
		clickbtn(p.getAdsubmit());

		// Page3
		clickbtn(p.getAdselect());
		clickbtn(p.getAdcontinue());

		// page4
		filltext(p.getAdfirstname(), firstname);
		filltext(p.getAdlastname(), lastname);
		filltext(p.getAdaddress(), address);
		filltext(p.getAdcreditcard(), creditcard);
		dropdown_value(p.getAdcctype(), "VISA");
		dropdown_value(p.getAdexpmonth(), "2");
		dropdown_value(p.getAdexpyear(), "2022");
		filltext(p.getAdcvv(), cvv);
		clickbtn(p.getAdbook());
		Thread.sleep(5000);

		String attribute = p.getAdorderno().getAttribute("value");
		System.out.println("order no:" + attribute);

		// page5
		clickbtn(p.getAditinerary());
		clickbtn(p.getAdcheckall());
		clickbtn(p.getAdcancel());

		driver.switchTo().alert().accept();
		clickbtn(p.getAdlogout());
	}

	@Then("user have to be in valid credentials page")
	public void user_have_to_be_in_valid_credentials_page() {
		System.out.println("Login Successful");
	}
}
