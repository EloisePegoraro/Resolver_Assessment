package code.utils;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class CommonMethods {

    //This method verify if the button is disabled or not.
    public void isButtonDisabled(WebElement button){
        Assert.assertFalse(button.isEnabled());
    }
    //This method will wait until the web element is visible, otherwise will throw exception.
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    //This method will retrieve the value of the selected cell according to the coordinates.
    public String getCellData(int rowNumber, int columnNumber){
       WebElement cell = Driver.getDriver().findElement(By.xpath("//div/table/tbody/tr["+(rowNumber+1)+"]/td["+(columnNumber+1)+"]"));
       String cellValue = cell.getText();
       return cellValue;
    }
}
