package mev.com.automation.hisTestsUI.tests;

import org.testng.annotations.Test;

public class MarketIQTest extends TestBase {

  @Test
  public void openMarketIQPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketIQ();
    app.checkPageLoading();
  }

}
