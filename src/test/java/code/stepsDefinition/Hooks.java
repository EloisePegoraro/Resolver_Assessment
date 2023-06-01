package code.stepsDefinition;

import code.utils.CommonMethods;
import code.utils.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends CommonMethods {

    @Before
    public void setup(){
        Driver.getDriver().manage().window().maximize();
        System.out.println("driver has successfully started");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
