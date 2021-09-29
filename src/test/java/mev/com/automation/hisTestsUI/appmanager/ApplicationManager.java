package mev.com.automation.hisTestsUI.appmanager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class ApplicationManager {

  public void init() {
    Configuration.browser = "chrome";
    Configuration.startMaximized = true;
    Configuration.timeout = 20000;

    String baseUrl = "https://dev.mls.hiinfo.com/";
    //https://live.mls.hiinfo.com/ - Live

    Selenide.open(baseUrl);
    login("TMK11800", "pwd@TMK11800");
    //login("MLSTest06", "pwd@mlstest06"); - Live
  }

  public void stop() {
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
   // $(By.xpath("//mls-main-header/div[1]/div[1]/div[1]/*[1]")).shouldBe(Condition.visible,Duration.ofSeconds(30)).click();
    $(By.xpath("//div[@class = 'hamburger animate-scale']/*")).shouldBe(Condition.visible, Duration.ofSeconds(30)).click();

  }

  public void clickCreateListing() {
    $(By.xpath("//button[text() = 'Add Listing ']")).click();
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

  public void checkListingStatusChangeToHold() {
    $(By.xpath("//p[@class = 'message ng-star-inserted']")).shouldBe(visible, Duration.ofSeconds(30));
    $(By.xpath("//div[text() = 'Status: ']/span")).shouldHave(text("Hold"));
  }

  public void clickDeleteInConfirmationWindow() {
    $(By.xpath("//button[contains(text(),'delete')]")).shouldBe(visible, Duration.ofSeconds(30)).click();
  }

  public void selectDeleteInMaintenance() {
    $(By.xpath("//li[contains(text(),'Delete')]")).click();
  }

  public void clickMaintenance() {
    $(By.xpath("//button[@type='button'][contains(.,'Maintenance')]")).shouldBe(visible, Duration.ofSeconds(30)).click();
  }

  public void checkPageLoading() {
    $(By.xpath("//h3[contains(text(),'Market IQ')]")).shouldBe(visible);
  }
}
