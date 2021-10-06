package mev.com.automation.hisTestsUI.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

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

    $(By.xpath("//label[text() = ' Property Type ']/following-sibling::mls-input-multi-select/div")).click();
    $(By.xpath("//p[text()='Condo']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();

    $(By.xpath("//label[text() = ' Subtype of Listing ']/following-sibling::mls-input-multi-select/div")).click();
    $(By.xpath("//p[text()='Attached']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();

    $(By.xpath("//span[text() = '$']/following-sibling::input")).val("123456");

    $(By.xpath("//label[text() = ' CSB ']/following-sibling::*/form/input")).val("6");

    $(By.xpath("//label[text() = ' Expires Date ']/following-sibling::mls-input-date")).click();
    $(".ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71:nth-child(5) > .ng-tns-c28-71").click(); //need to refactor

    //$(By.xpath("//label[text() = ' City ']/following-sibling::mls-input-text-auto-suggest/mls-autocomplete/div")).click();
    $(By.xpath("//label[text() = ' City ']/following-sibling::mls-input-text-auto-suggest/mls-autocomplete/div")).click();
    $(By.xpath("//label[text() = ' City ']/following-sibling::mls-input-text-auto-suggest/mls-autocomplete/div/input")).setValue("H");
    $(By.xpath("//li[@class = 'item option ng-star-inserted' and text() = ' HILO ']")).click();




    $(By.xpath("//label[text() = ' Disclosure Form ']/following-sibling::*/div/mls-button/button")).click();

    $(By.xpath("//label[text() = ' GET? ']/following-sibling::*/div/mls-button/button")).click();

    $(By.xpath("//label[text() = ' Restrictions on Commission ']/following-sibling::mls-input-multi-select")).click();
    $(By.xpath("//p[text()='Court Confirmation']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();


    $(By.xpath("//label[text() = ' Possession ']/following-sibling::mls-input-single-select/form/p-dropdown/div/div/span")).click();
    $(By.xpath("//span[@class = 'ng-star-inserted' and text()='Negotiable']")).click();

    $(By.xpath("//label[text() = ' Zoning ']/following-sibling::mls-zoning-input/form/p-dropdown/div")).click();
    $(By.xpath("//span[@class = 'ng-star-inserted' and text()='I-G - Industrial General']")).click();


    $(By.xpath("//label[text() = ' Power ']/following-sibling::mls-input-multi-select/div")).click();
    $(By.xpath("//p[text()='Overhead']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();

    $(By.xpath("//label[text() = ' Water ']/following-sibling::mls-input-multi-select/div")).click();
    $(By.xpath("//p[text()='Private']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();

    $(By.xpath("//label[text() = ' Terms Acceptable ']/following-sibling::mls-input-multi-select/div")).click();
    $(By.xpath("//p[text()='Cash']/preceding-sibling::mls-checkbox")).click();
    $(By.xpath("//html")).click();

    String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
    $(By.xpath("//label[text() = ' Public Remarks ']/following-sibling::mls-input-text-area/form/div/textarea")).val("Test Listing " + timeStamp);

    $(By.xpath("//label[text() = ' Public Remarks Excerpt ']/following-sibling::mls-input-text/form/input")).val("Test Listing " + timeStamp);

    $(By.xpath("//label[text() = ' Driving Directions ']/following-sibling::mls-input-text-area/form/div/textarea")).val("Test Listing " + timeStamp);

  }

}

