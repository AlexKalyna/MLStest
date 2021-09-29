package mev.com.automation.hisTestsUI.tests;

import org.junit.jupiter.api.Test;

public class MarketStatisticsTest extends TestBase {

  @Test
  public void openMarketStatisticsPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketStatistics();
  }
}
