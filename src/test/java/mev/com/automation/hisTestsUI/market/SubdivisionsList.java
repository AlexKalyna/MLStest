package mev.com.automation.hisTestsUI.market;

import mev.com.automation.hisTestsUI.TestBase;
import org.junit.jupiter.api.Test;

public class SubdivisionsList extends TestBase {

 @Test
  public void openSubdivisionsListPage(){
    clickMenuBurger();
    clickMarket();
    openSubdivisionsList();
  }
}
