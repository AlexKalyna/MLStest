package mev.com.automation.hisTestsUI.tests;

import org.testng.annotations.Test;

public class SubdivisionsListTest extends TestBase {

 @Test
  public void openSubdivisionsListPage(){
    app.clickMenuBurger();
    app.clickMarket();
    app.openSubdivisionsList();
  }
}
