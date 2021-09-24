package mev.com.automation.hisTestsUI;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
  @BeforeEach
  public void setup(){
    Configuration.browser = "chrome";
    Configuration.startMaximized = true;
    String baseUrl = "https://dev.mls.hiinfo.com/";
    //https://live.mls.hiinfo.com/ - Live

    Selenide.open(baseUrl);
    login("TMK11800", "pwd@TMK11800");
    //login("MLSTest06", "pwd@mlstest06"); - Live
  }

  @AfterEach
  public void tearDown() {
    closeWebDriver();
  }

  public void login(String username, String password) {
    $(By.xpath("//button[@type='button']")).click();
    $("#j_username").shouldBe(Condition.visible, Duration.ofSeconds(30));
    //$("#j_username").should(exist);
    $(By.id("j_username")).setValue(username);
    $(By.id("j_password")).setValue(password);
    $(By.name("submit")).click();

  }

  public void openMarketIQ() {
    $(By.linkText("Market IQ")).click();
  }

  public void openAddEditListing() {
    $(By.linkText("Add/Edit")).click();
  }

  public void clickMarket() {
    $(By.xpath("//span[contains(.,'Market')]")).click();
  }

  public void openMarketStatistics() {
    $(By.linkText("Market Statistics")).click();
  }

  public void openSubdivisionsList() {
    $(By.linkText("Subdivisions List")).click();
  }

  public void clickMenuBurger() {
    $(By.xpath("//mls-main-header/div[1]/div[1]/div[1]/*[1]")).shouldBe(Condition.visible,Duration.ofSeconds(30)).click();

  }
  public void clickCreateListing() {
    $(By.xpath("//body/app-root[1]/main[1]/mls-add-edit[1]/mls-router-tabs[1]/main[1]/section[2]/mls-my-listings[1]/mls-aside-wrapper[1]/main[1]/mls-router-tabs-bottom[1]/div[1]/div[1]/mls-add-listing-button[1]/mls-custom-dropdown[1]/div[1]/mls-button[1]/button[1]")).click();
    $(".create-listing").shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
  }

  public void clickCreateListingButton() {
    $(By.xpath("//button[contains(text(),'Create Listing')]")).shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
  }

  public void enterTMK(String valueTMK) {
    $(".input").click();
    $(".input").val(valueTMK);
  }

  public void clickContinue() {
    $(".continue-button > .mls-button").shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
  }

}
