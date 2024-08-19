package Amazon_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Step_defination {

	@Given("^Open browser and application$")
	public void open_browser_and_application() {
	    System.out.println("Open browser");
	}

	@Given("^login into application using (.*),(.*)$")
	public void login_into_application_using_username_password(String username,String password) {
		System.out.println(username);
		System.out.println(password);  
	}

	@Given("^navigate to your account page$")
	public void navigate_to_your_account_page() {
		System.out.println("navigate to your account page");
	}

	@When("^clicks on your addresses to navigate your adress page$")
	public void clicks_on_your_addresses_to_navigate_your_adress_page() {
		System.out.println("clicks on your addresses to navigate your adress page");
	}

	@When("^clicks on add adress$")
	public void clicks_on_add_adress() {
		System.out.println("clicks on add adress");
	}

	@When("^fill all mandatory fields and clicks on add adress button$")
	public void fill_all_mandatory_fields_and_clicks_on_add_adress_button() {
		System.out.println("fill all mandatory fields and clicks on add adress button ");
	}

	@Then("^validate the adress on your address page$")
	public void validate_the_adress_on_your_address_page() {
		System.out.println("validate the adress on your address page");
	}

	@When("^clicks on edit button for existing adress$")
	public void clicks_on_edit_button_for_existing_adress() {
		System.out.println("clicks on edit button for existing adress");
	}

	@When("^update address and clicks on update address button$")
	public void update_address_and_clicks_on_update_address_button() {
		System.out.println("update address and clicks on update address button");
	}

	@When("^clicks on remove button for existing adress$")
	public void clicks_on_remove_button_for_existing_adress() {
		System.out.println("clicks on remove button for existing adress");
	}

	@When("^clicks on yes button in confirmation pop-up window$")
	public void clicks_on_yes_button_in_confirmation_pop_up_window() {
		System.out.println("clicks on yes button in confirmation pop-up window");
	}
}
