package mev.com.automation.hisTestsUI.addEditListing;

import com.codeborne.selenide.SelenideElement;
import mev.com.automation.hisTestsUI.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class AddListings extends TestBase {
  //@Test
  public void CreateListingWithSetRequiredFields() {
    clickMenuBurger();
    openAddEditListing();
    clickCreateListing();
    enterTMK("4-3-5-1-216-42");
    $(".continue-button > .mls-button").shouldBe(visible, Duration.ofSeconds(30)).click();
    $(".switch-wrapper").shouldBe(visible, Duration.ofSeconds(30)).click();
    executeJavaScript("window.scrollTo(0,0)");


    //Subtype of Listing
    $(".ng-star-inserted:nth-child(1) > .form:nth-child(1) > .ng-untouched:nth-child(2) .input").click();
    $(".item:nth-child(2) .checkbox").shouldBe(visible, Duration.ofSeconds(30)).click();
    $(".focus").click();

    //Price
    $("mls-listing-basic-section .ng-untouched:nth-child(5) .form > .input").setValue("123456");

    //CSB
    $("mls-listing-basic-section > .ng-star-inserted:nth-child(1) .ng-untouched:nth-child(6) .input").setValue("6");

    // $(".ng-untouched > .ng-dirty").val("3");
    //Expires date
    $(".p-calendar > .ng-tns-c28-71").click();
    $(".ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71").click();
    //$(".focus > .input").click();

    //$(".focus > .input").setValue("h");
    //$(".option:nth-child(2)").click();
    $(".form:nth-child(1) > .inputs-container:nth-child(1) > .middle:nth-child(1) .mls-button:nth-child(1) > .mls-button").click();
    $(".form:nth-child(1) > .inputs-container:nth-child(1) > .middle:nth-child(2) .mls-button:nth-child(1) > .mls-button").click();
    $(".inputs-container:nth-child(2) > .middle:nth-child(1) .mls-button:nth-child(1) > .mls-button").click();
     /* $(".ng-invalid:nth-child(6) .input").click();
      $(".item:nth-child(1) .checkbox").click();
      $(".focus").click();
      $(".ng-invalid:nth-child(7) .input").click();
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
  //@Test
  public void CreateListingWithoutFillingAnyField (){
    clickMenuBurger();
    openAddEditListing();
    clickCreateListing();
    enterTMK("1-1-1-1-1");
    clickContinue();
    clickCreateListingButton();
    //SelenideElement listingCreatedMessage =
    // $(By.xpath("//p[@class = 'message ng-star-inserted']")).shouldBe(visible).getText();
    //System.out.println($(By.xpath("//p[@class = 'message ng-star-inserted']")).shouldBe(visible).getText());
    clickMaintenance();
    selectDeleteInMaintenance();
    clickDeleteInConfirmationWindow();
    SelenideElement deleteMessage = $(By.xpath("//p[@class = 'message ng-star-inserted'][contains(text('deleted'))]")).shouldBe(visible);
    System.out.println("Delete message - "+ deleteMessage);

//p[@class = 'message ng-star-inserted']
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



}

