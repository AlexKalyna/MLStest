package mev.com.automation.hisTestsUI.tests;

import org.junit.jupiter.api.Test;

public class SubdivisionsListTest extends TestBase {

 @Test
  public void openSubdivisionsListPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openSubdivisionsList();
  }
}
