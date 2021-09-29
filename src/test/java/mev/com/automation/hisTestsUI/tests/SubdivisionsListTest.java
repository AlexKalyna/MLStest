package mev.com.automation.hisTestsUI.market;

import mev.com.automation.hisTestsUI.testconfigs.TestBase;
import org.junit.jupiter.api.Test;

public class SubdivisionsListTest extends TestBase {

 @Test
  public void openSubdivisionsListPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openSubdivisionsList();
  }
}
