package org.pojoadac;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {

	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	// Adactin login1
	@FindBy(id = "username")
	private WebElement adusername;

	@FindBy(id = "password")
	private WebElement adpass;

	@FindBy(id = "login")
	private WebElement adlogin;

	// Adac2
	@FindBy(id = "location")
	private WebElement adloc;

	@FindBy(id = "hotels")
	private WebElement adhotel;

	@FindBy(id = "room_type")
	private WebElement adroomtype;

	@FindBy(id = "room_nos")
	private WebElement adnor;

	@FindBy(id = "datepick_in")
	private WebElement adcheckin;

	@FindBy(id = "datepick_out")
	private WebElement adchkout;

	@FindBy(id = "adult_room")
	private WebElement adadult;

	@FindBy(id = "child_room")
	private WebElement adchild;

	@FindBy(id = "Submit")
	private WebElement adsubmit;

	// adac3
	@FindBy(id = "radiobutton_0")
	private WebElement adselect;

	@FindBy(id = "continue")
	private WebElement adcontinue;

	// adac4
	@FindBy(id = "first_name")
	private WebElement adfirstname;

	@FindBy(id = "last_name")
	private WebElement adlastname;

	@FindBy(id = "address")
	private WebElement adaddress;

	@FindBy(id = "cc_num")
	private WebElement adcreditcardnum;

	@FindBy(id = "cc_type")
	private WebElement adcctype;

	@FindBy(id = "cc_exp_month")
	private WebElement adexpmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement adexpyear;

	@FindBy(id = "cc_cvv")
	private WebElement adcvv;

	@FindBy(id = "book_now")
	private WebElement adbook;

	// adac5
	@FindBy(id = "my_itinerary")
	private WebElement aditinerary;

	@FindBy(id = "check_all")
	private WebElement adcheckall;

	@FindBy(name = "cancelall")
	private WebElement adcancel;

	// adac5
	@FindBy(id = "logout")
	private WebElement adlogout;

	@FindBy(id = "order_no")
	private WebElement adorderno;

	public WebElement getAdorderno() {
		return adorderno;
	}

	public WebElement getAdlogout() {
		return adlogout;
	}

	public WebElement getAdcreditcardnum() {
		return adcreditcardnum;
	}

	public WebElement getAditinerary() {
		return aditinerary;
	}

	public WebElement getAdcheckall() {
		return adcheckall;
	}

	public WebElement getAdcancel() {
		return adcancel;
	}

	public WebElement getAdfirstname() {
		return adfirstname;
	}

	public WebElement getAdlastname() {
		return adlastname;
	}

	public WebElement getAdaddress() {
		return adaddress;
	}

	public WebElement getAdcreditcard() {
		return adcreditcardnum;
	}

	public WebElement getAdcctype() {
		return adcctype;
	}

	public WebElement getAdexpmonth() {
		return adexpmonth;
	}

	public WebElement getAdexpyear() {
		return adexpyear;
	}

	public WebElement getAdcvv() {
		return adcvv;
	}

	public WebElement getAdbook() {
		return adbook;
	}

	public WebElement getAdcontinue() {
		return adcontinue;
	}

	public WebElement getAdusername() {
		return adusername;
	}

	public WebElement getAdpass() {
		return adpass;
	}

	public WebElement getAdlogin() {
		return adlogin;
	}

	public WebElement getAdloc() {
		return adloc;
	}

	public WebElement getAdhotel() {
		return adhotel;
	}

	public WebElement getAdroomtype() {
		return adroomtype;
	}

	public WebElement getAdnor() {
		return adnor;
	}

	public WebElement getAdcheckin() {
		return adcheckin;
	}

	public WebElement getAdchkout() {
		return adchkout;
	}

	public WebElement getAdadult() {
		return adadult;
	}

	public WebElement getAdchild() {
		return adchild;
	}

	public WebElement getAdselect() {
		return adselect;
	}

	public WebElement getAdsubmit() {
		return adsubmit;
	}

}
