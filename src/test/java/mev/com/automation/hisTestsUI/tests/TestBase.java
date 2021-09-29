package mev.com.automation.hisTestsUI.tests;

import mev.com.automation.hisTestsUI.appmanager.ApplicationManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

  public ApplicationManager app = new ApplicationManager();

  @BeforeEach
  public void setUp(){
    app.init();
  }

  @AfterEach
  public void tearDown() {
    app.stop();
  }


}
