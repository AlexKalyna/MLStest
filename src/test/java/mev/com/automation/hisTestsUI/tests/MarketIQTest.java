package mev.com.automation.hisTestsUI.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class MarketIQTest extends TestBase {

  @Test
  public void openMarketIQPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketIQ();
    app.checkPageLoading();
  }

}
