package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import javax.swing.*;

import static junit.framework.Assert.assertTrue;

public class CastiPage extends Page {
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//div[contains(@class,'span16 uk-margin-bottom')]//div[4]//div[1]//div[1]//a[1]//picture[1]//img[1]")
    private WebElement butonCasti;
    //button[@id='button_cart_95028']
    @FindBy(xpath = "//button[@id='button_cart_95028']")
    private WebElement butonAddtocartProduct;
    @FindBy(xpath = "//div[@id='cart_status_3262_cart']")
    private WebElement butonCartStatus;
    @FindBy(xpath = "//a[@class='ty-btn ty-btn__secondary xh-highlight']")
    private WebElement butonCartStatusSecondary;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement butonCartStatusPopUp;
    //a[contains(@class,'ty-btn ty-btn__primary')]
    //a[contains(@class,'ty-btn ty-btn__primary')]
    //button[@name='dispatch[checkout.customer_info]']
    @FindBy(xpath = "//button[@name='dispatch[checkout.customer_info]']")
    private WebElement butonCartProcessFaraInregistrare;
    @FindBy(xpath = "//input[@id='elm_15']")
    private WebElement inputPrenume;
    @FindBy(xpath = "//input[@id='elm_17']")
    private WebElement inputNume;
    @FindBy(xpath = "//input[@id='elm_33']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='elm_31']")
    private WebElement inputPhoneNumber;
    @FindBy(xpath = "//input[@id='elm_23']")
    private WebElement inputCity;
    @FindBy(xpath = "//input[@id='elm_19']")
    private WebElement inputAddres;
    @FindBy(xpath = "//button[@name='dispatch[checkout.update_steps]']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//button[@id='step_three_but']")
    private WebElement buttonDeliveryOption;
    @FindBy(xpath = "//button[@id='place_order_tab1']")
    private WebElement buttonAmplaseazaComanda;
    @FindBy(xpath = "//p[contains(text(),'Felicitari! Comanda dumneavoastra a fost plasata c')]")
    private WebElement confirmationOfPurchase;

    public void assertingConfirmationOfPurchase() {
        assertTrue(confirmationOfPurchase.isDisplayed());
    }


    public void clickButtonAmplaseazaComanda() {
        actions.moveToElement(buttonAmplaseazaComanda).build().perform();
        buttonAmplaseazaComanda.click();
    }

    public void clickButtonDeliveryOption() {

        buttonDeliveryOption.click();
    }

    public void clickButtonContinue() {

        buttonContinue.click();
    }

    public void fillInputAddres(String value) {

        inputAddres.sendKeys(value);
    }

    public void fillInputCity(String value) {

        inputCity.sendKeys(value);
    }

    public void fillInputPhoneNumber(String value) {

        inputPhoneNumber.sendKeys(value);
    }

    public void fillInputEmail(String value) {

        inputEmail.sendKeys(value);
    }

    public void fillInputNume(String value) {

        inputNume.sendKeys(value);
    }

    public void fillInputPrenume(String value) {

        inputPrenume.sendKeys(value);
    }

    public void clickButonCartProcessFaraInregistrare() {
        actions.moveToElement(butonCartProcessFaraInregistrare).build().perform();
        butonCartProcessFaraInregistrare.click();
    }

    public void clickButonCartStatusPopUp() {

        butonCartStatusPopUp.click();
    }

    public void clickButonCartStatusSecondary() {

        butonCartStatusSecondary.click();
    }

    public void clickButonCartStatus() {
        butonCartStatus.click();

    }

    public void clickButonAddtocartProduct() {
        actions.moveToElement(butonAddtocartProduct).build().perform();
        butonAddtocartProduct.click();
    }

    public void clickButonCasti() {
        butonCasti.click();
    }
}
