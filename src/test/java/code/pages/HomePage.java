package code.pages;

import code.utils.CommonMethods;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CommonMethods {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement emailTextBox;
    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    private WebElement signInButton;
    @FindBy(xpath="//*[@id='test-2-div']/ul/li")
    private List<WebElement> listGroup;

    @FindBy(xpath="//*[@id='test-2-div']/ul/li[2]/span")
    private WebElement listItem2Badge;
    @FindBy(id="dropdownMenuButton")
    private WebElement optionButton;
    @FindBy(xpath="//*[text()='Option 3']")
    private WebElement option3Button;
    @FindBy(xpath ="//*[@id='test-4-div']/button[1]")
    private WebElement firstButton;
    @FindBy(xpath ="//*[@id='test-4-div']/button[2]")
    public WebElement secondButton;

    @FindBy(xpath="//*[@id='test5-button']")
    public WebElement buttonTest5;

    @FindBy(id="test5-alert")
    public WebElement button5Message;


    public void isEmailTextBoxDisplayed(){
        Assert.assertTrue("Email address text box is not present", emailTextBox.isDisplayed());
    }
    public void inputEmailAndPassword(String emailAddress, String password){
        emailTextBox.sendKeys(emailAddress);
        passwordTextBox.sendKeys(password);
    }
    public void isPasswordTextBoxDisplayed(){
        Assert.assertTrue("Password text box is not present",passwordTextBox.isDisplayed());
    }
    public void isSignInButtonDisplayed(){
        Assert.assertTrue("Login button is not present", signInButton.isDisplayed());
    }
    public void itemsListGroup(int qtyItems){
        System.out.println(listGroup.size());
        Assert.assertEquals("Expected 3 items in the list group",qtyItems, listGroup.size());

    }
    public void secondItemValue(String item2){
        System.out.println(listGroup.get(1).getText());
        Assert.assertEquals("Expected text not matching",item2, listGroup.get(1).getText());
    }
    public void secondItemBadgeValue(String item2Badge){
        Assert.assertEquals(item2Badge, listItem2Badge.getText());
    }

    public void isOption1Default(String option){
        Assert.assertEquals(option, optionButton.getText());
    }
    public void selectOption3(){
        optionButton.click();
        option3Button.click();
    }
    public void buttonEnabled(){
        Assert.assertTrue("Button is disabled", firstButton.isEnabled());
    }
    public void isTextMessageDisplayed(){
        Assert.assertEquals("You clicked a button!", button5Message.getText());
    }

}
