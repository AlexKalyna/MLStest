package mev.com.automation.hisTestsUI.market;

import mev.com.automation.hisTestsUI.testconfigs.TestBase;
import org.junit.jupiter.api.Test;

public class MarketStatisticsTest extends TestBase {

  @Test
  public void openMarketStatisticsPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openMarketStatistics();
  }
}
