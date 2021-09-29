package mev.com.automation.hisTestsUI.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AddListingsTest extends TestBase {

 @Test
  public void CreateListingWithoutFillingAnyField() {
    app.clickMenuBurger();
    app.openAddEditListing();
    app.clickCreateListing();
    app.enterTMK("1-1-1-1-1");
    app.clickContinue();
    app.clickCreateListingButton();
    app.checkListingStatusChangeToHold();
    app.clickMaintenance();
    app.selectDeleteInMaintenance();
    app.clickDeleteInConfirmationWindow();
  }

  @Test
  public void CreateListingWithSetRequiredFields() {
    app.clickMenuBurger();
    app.openAddEditListing();
    app.clickCreateListing();
    app.enterTMK("4-3-5-1-216-42");
    app.clickContinue();
    $(By.xpath("//div[@class = 'switcher']")).shouldBe(visible, Duration.ofSeconds(30)).click();
    //executeJavaScript("window.scrollTo(0,0)");


    //Subtype of Listing
    $(By.xpath("//label[text() = ' Subtype of Listing ']/following-sibling::mls-input-multi-select")).click();
    $(".item:nth-child(2) .checkbox").shouldBe(visible, Duration.ofSeconds(30)).click();
    $(".focus").click();


    $(By.xpath("//span[text() = '$']/following-sibling::input")).val("123456");

    $(By.xpath("//label[text() = ' CSB ']/following-sibling::*/form/input")).val("6");

    $(By.xpath("//label[text() = ' Expires Date ']/following-sibling::mls-input-date")).click();
    $(".ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71").click(); //need to refactor

    $(By.xpath("//label[text() = ' Disclosure Form ']/following-sibling::*/div/mls-button/button")).click();

    $(By.xpath("//label[text() = ' GET? ']/following-sibling::*/div/mls-button/button")).click();

    $(By.xpath("//label[text() = ' Restrictions on Commission ']/following-sibling::mls-input-multi-select")).click();

    //Select drpNone = new Select ($(By.xpath("//label[text() = ' Restrictions on Commission ']/following-sibling::mls-input-multi-select"))).selectByValue;



      /*$(".ng-invalid:nth-child(7) .input").click();
      $(".item:nth-child(3) .checkbox").click();
      $(".focus").click();

      $(".ng-tns-c76-74:nth-child(2)").click();
      $(".ng-tns-c76-74:nth-child(3) .ng-star-inserted").click();

      $(".form:nth-child(2) > .inputs-container:nth-child(1) > .middle:nth-child(1) .mls-button:nth-child(1) > .mls-button").click();
      $(".inputs-container:nth-child(4) > .middle:nth-child(1) .mls-button:nth-child(1) > .mls-button").click();
      $("mls-property-details-section > .ng-star-inserted:nth-child(4) .ng-untouched:nth-child(1) .input").click();
      $(".item:nth-child(2) .checkbox").click();
      $(".item:nth-child(3) .checkbox").click();
      $(".focus").click();
      $(".ng-star-inserted:nth-child(4) > .form > .ng-untouched:nth-child(2) .input").click();
      $(".item:nth-child(2) .checkbox").click();
      $(".focus").click();
      $("mls-property-details-section > .ng-star-inserted:nth-child(4) .ng-untouched:nth-child(3) .input").click();
      $(".item:nth-child(3) .checkbox").click();
      $(".focus").click();
      $(".ng-tns-c76-88:nth-child(2)").click();
      $(".ng-tns-c76-88:nth-child(2) .ng-star-inserted").click();
      $(".ng-invalid:nth-child(3) .input").click();
      $(".item:nth-child(2) .checkbox").click();
      $(".focus").click();
      $(".ng-star-inserted:nth-child(1) > .wrap > .header .edit-button > .mls-button").click();
      $(".ng-star-inserted:nth-child(8) > .form > .ng-touched .input").click();
      $(".item:nth-child(2) .checkbox").click();
      $(".save-button > .mls-button").click();
      $(".buttons:nth-child(3) > .remove-button > .mls-button").click();
      $(".flex .contained").click();
      $(".item:nth-child(8)").click();
      $(".ng-invalid:nth-child(1) .form > .input").click();
      $(".item:nth-child(4) > .label").click();
      $(".focus").click();
      $(".item:nth-child(12)").click();
      $(".ng-star-inserted:nth-child(1) > .form .input-container > .input").click();
      $(".input-container > .ng-dirty").val("test");
      $(".ng-star-inserted:nth-child(1) > .form > .ng-untouched:nth-child(2) .input").click();
      $(".ng-untouched > .ng-dirty").val("test");
      $(".ng-untouched:nth-child(1) > .wrap .input-container > .input").click();
      $(".ng-dirty > .input-container > .ng-untouched").val("test");
      $(".detail-sticky .mls-button").click();*/
  }

}

