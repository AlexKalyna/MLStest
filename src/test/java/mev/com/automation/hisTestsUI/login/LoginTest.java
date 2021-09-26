package mev.com.automation.hisTestsUI.login;

import com.codeborne.selenide.Selenide;
import mev.com.automation.hisTestsUI.testconfigs.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
