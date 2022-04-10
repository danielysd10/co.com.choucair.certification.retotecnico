package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormUserPage extends PageObject {
    public static final Target BTN_JOIN = Target.the("BTN JOIN")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first-name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last-name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email-address")
            .located(By.id("email"));
    public static final Target INPUT_MONTH_BIRTH = Target.the("where do we write the month-birth")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY_BIRTH = Target.the("where do we write the day-birth")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR_BIRTH = Target.the("where do we write the year of birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("button Next Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("where do we write the postal-code")
            .located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER = Target.the("where do we write the country container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("button Next Location")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));



    public static final Target YOUR_COMPUTER_CONTAINER = Target.the("OS container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));
    public static final Target YOUR_COMPUTER = Target.the("OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION_CONTAINER = Target.the("version OS container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public static final Target VERSION= Target.the("version OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target LANGUAGE_CONTAINER  = Target.the("language OS container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));
    public static final Target LANGUAGE = Target.the("language OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target YOUR_MOBILE_DEVICE_CONTAINER = Target.the("your-mobile-device container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target YOUR_MOBILE_DEVICE = Target.the("your-mobile-device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL_CONTAINER = Target.the("model container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODEL = Target.the("model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target OPERATING_SYSTEM_CONTAINER = Target.the("operating-system container")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target OPERATING_SYSTEM = Target.the("operating-system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT_LAST_SETUP = Target.the("button NEXT_LAST_SETUP")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write confirm  password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED = Target.the("checkbox informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("checkbox terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY = Target.the("checkbox PRIVACY")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_SETUP = Target.the("Complete Setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    public static final Target CAPTCHA_UTEST = Target.the("Welcome")
            .locatedBy("//*[@id='rc-imageselect']/div[2]/div[1]/div[1]/div/text()");

}
