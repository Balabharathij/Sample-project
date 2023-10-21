package stepdefined;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Exe {
	@Given("Launch the Browser")
	public void launch_the_browser() {
	   System.out.println("Browser");
	}
	@Given("Enter the URL")
	public void enter_the_url() {
	   System.out.println("URL");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    System.out.println(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	   System.out.println(pass);
	}
	@When("Enter the loginbutton")
	public void enter_the_loginbutton() {
	    System.out.println("loginbutton");
	}
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	    System.out.println("HOmepage");
	}
}