package mev.com.automation.hisTestsUI.market;

import com.codeborne.selenide.Condition;
import mev.com.automation.hisTestsUI.testconfigs.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MarketIQTest extends TestBase {

  @Test
  public void openMarketIQPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketIQ();
    checkPageLoading();
  }

  private void checkPageLoading() {
    $(By.xpath("//h3[contains(text(),'Market IQ')]")).shouldBe(Condition.visible);
  }
}
