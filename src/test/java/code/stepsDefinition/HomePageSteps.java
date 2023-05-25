package code.stepsDefinition;

import code.pages.HomePage;
import code.utils.CommonMethods;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps extends CommonMethods {

    HomePage homePage = new HomePage();

    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("URL"));
    }
    @Then("verify if email address and password inputs and the login button are present")
    public void verify_if_email_address_and_password_inputs_and_the_login_button_are_present() {
        homePage.isEmailTextBoxDisplayed();
        homePage.isPasswordTextBoxDisplayed();
        homePage.isSignInButtonDisplayed();
    }
    @And("enter email address {string} and password {string}")
    public void enterEmailAddressAndPassword(String emailAddress, String password) {
        homePage.inputEmailAndPassword(emailAddress, password);
    }
    @Then("verify that there are {int} values in the list group")
    public void verify_that_there_are_values_in_the_list_group(int qtyItems) {
        homePage.itemsListGroup(qtyItems);
    }
    @Then("verify that the second list item's value is set to {string}")
    public void verify_that_the_second_list_item_s_value_is_set_to(String item2Value) {
        homePage.secondItemValue(item2Value);
    }
    @Then("verify that the second list item's badge value is {string}")
    public void verify_that_the_second_list_item_s_badge_value_is(String item2Badge) {
        homePage.secondItemBadgeValue(item2Badge);
    }
    @Then("verify that {string} is the default selected value")
    public void verify_that_is_the_default_selected_value(String option) {
        homePage.isOption1Default(option);
    }
    @Then("select Option 3 from the select list")
    public void select_from_Option_3_the_select_list() {
        homePage.selectOption3();
    }
    @Then("verify that the first button is enabled and that the second button is disabled")
    public void verify_that_the_first_button_is_enabled_and_that_the_second_button_is_disabled() {
        homePage.buttonEnabled();
        isButtonDisabled(homePage.secondButton);
    }
    @When("the user waits for a button to be displayed and click")
    public void the_user_waits_for_a_button_to_be_displayed_and_click() {
        waitForVisibility(homePage.buttonTest5, 12);
        homePage.buttonTest5.click();
    }
    @Then("verify a success message is displayed")
    public void verify_a_success_message_is_displayed() {
        homePage.isTextMessageDisplayed();
    }
    @Then("verify that the button is now disabled")
    public void verify_that_the_button_is_now_disabled() {
        isButtonDisabled(homePage.buttonTest5);
    }
    String cellValue;
    @When("the user wants to find the value of the cell at coordinates {int} {int}")
    public void the_user_wants_to_find_the_value_of_the_cell_at_coordinates(int row, int column) {
        cellValue = getCellData(row, column);
    }
    @Then("verify that the value of the cell is {string}")
    public void verify_that_the_value_of_the_cell_is(String value) {
        Assert.assertEquals(value, cellValue);

    }


}
