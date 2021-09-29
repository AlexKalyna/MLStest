package mev.com.automation.hisTestsUI.tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends TestBase {
   @Test
  public void LoginSuccessfulCheckTest (){
    String ActualTitle = Selenide.title();
    String ExpectedTitle = "MLS";
    assertEquals(ExpectedTitle, ActualTitle);
    // if ($(By.xpath("//main[@class = 'main ng-star-inserted']")).isDisplayed())
    //  {return;}
  }
}
