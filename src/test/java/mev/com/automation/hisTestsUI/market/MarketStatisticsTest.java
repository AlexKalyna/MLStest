package mev.com.automation.hisTestsUI.market;

import mev.com.automation.hisTestsUI.TestBase;
import org.junit.jupiter.api.Test;

public class MarketStatisticsTest extends TestBase {

  @Test
  public void openMarketStatisticsPage(){
    clickMenuBurger();
    clickMarket();
    openMarketStatistics();
  }
}
