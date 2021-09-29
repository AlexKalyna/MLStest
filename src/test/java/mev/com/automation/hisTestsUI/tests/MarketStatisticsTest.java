package mev.com.automation.hisTestsUI.tests;

import org.testng.annotations.Test;

public class MarketStatisticsTest extends TestBase {

  @Test
  public void openMarketStatisticsPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketStatistics();
  }
}
