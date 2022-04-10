package co.com.choucair.certification.retotecnico.tasks;


import co.com.choucair.certification.retotecnico.userinterface.FormUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FormUser implements Task {

    private String first_name;
    private String last_name;
    private String email_address;
    private String month_birth;
    private String day_birth;
    private String year_birth;
    private String city;
    private String postal_code;
    private String country;
    private String your_computer;
    private String version;
    private String language;
    private String your_mobile_device;
    private String model;
    private String operating_system;
    private String password;
    private String password_confirmation;

    public FormUser(String first_name, String last_name, String email_address, String month_birth, String day_birth, String year_birth, String city, String postal_code, String country, String your_computer, String version, String language, String your_mobile_device, String model, String operating_system, String password, String password_confirmation) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.month_birth = month_birth;
        this.day_birth = day_birth;
        this.year_birth = year_birth;
        this.city = city;
        this.postal_code = postal_code;
        this.country = country;
        this.your_computer = your_computer;
        this.version = version;
        this.language = language;
        this.your_mobile_device = your_mobile_device;
        this.model = model;
        this.operating_system = operating_system;
        this.password = password;
        this.password_confirmation = password_confirmation;
    }

    private FormUserPage formUserPage;

    public static FormUser The(String first_name,String last_name,String email_address,String month_birth,String day_birth,String year_birth,
                               String city,String postal_code,String country,String your_computer,String version,String language,
                               String your_mobile_device,String model,String operating_system,String password,String password_confirmation) {

        return Tasks.instrumented(FormUser.class,first_name,last_name,email_address,month_birth,day_birth,year_birth,city, postal_code,country,
                your_computer,version,language,your_mobile_device,model,operating_system,password,password_confirmation);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(formUserPage.BTN_JOIN),
                Enter.theValue(first_name).into(formUserPage.INPUT_FIRST_NAME),
                Enter.theValue(last_name).into(formUserPage.INPUT_LAST_NAME),
                Enter.theValue(email_address).into(formUserPage.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(month_birth).from(formUserPage.INPUT_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(day_birth).from(formUserPage.INPUT_DAY_BIRTH),
                SelectFromOptions.byVisibleText(year_birth).from(formUserPage.INPUT_YEAR_BIRTH),
                Click.on(formUserPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(formUserPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.CITY),
                Hit.the(Keys.ENTER).into(formUserPage.CITY),
                Enter.theValue(postal_code).into(formUserPage.POSTAL_CODE),
                Click.on(formUserPage.COUNTRY_CONTAINER),
                Enter.theValue(country).into(formUserPage.COUNTRY),
                Click.on(FormUserPage.BUTTON_NEXT_DEVICES),
                Click.on(formUserPage.YOUR_COMPUTER_CONTAINER),
                Enter.theValue(your_computer).into(formUserPage.YOUR_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.YOUR_COMPUTER),
                Hit.the(Keys.ENTER).into(formUserPage.YOUR_COMPUTER),
                Click.on(formUserPage.VERSION_CONTAINER),
                Enter.theValue(version).into(formUserPage.VERSION),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.VERSION),
                Hit.the(Keys.ENTER).into(formUserPage.VERSION),
                Click.on(formUserPage.LANGUAGE_CONTAINER),
                Enter.theValue(language).into(formUserPage.LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.LANGUAGE),
                Hit.the(Keys.ENTER).into(formUserPage.LANGUAGE),
                Click.on(formUserPage.YOUR_MOBILE_DEVICE_CONTAINER),
                Enter.theValue(your_mobile_device).into(formUserPage.YOUR_MOBILE_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.YOUR_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(formUserPage.YOUR_MOBILE_DEVICE),
                Click.on(formUserPage.MODEL_CONTAINER),
                Enter.theValue(model).into(formUserPage.MODEL),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.MODEL),
                Hit.the(Keys.ENTER).into(formUserPage.MODEL),
                Click.on(formUserPage.OPERATING_SYSTEM_CONTAINER),
                Enter.theValue(operating_system).into(formUserPage.OPERATING_SYSTEM),
                Hit.the(Keys.ARROW_DOWN).into(formUserPage.OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(formUserPage.OPERATING_SYSTEM),
                Click.on(formUserPage.BUTTON_NEXT_LAST_SETUP),

                Enter.theValue(password).into(formUserPage.INPUT_PASSWORD),
                Enter.theValue(password_confirmation).into(formUserPage.INPUT_CONFIRM_PASSWORD),
                Click.on(formUserPage.CHECKBOX_STAY_INFORMED),
                Click.on(formUserPage.CHECKBOX_TERMS_OF_USE),
                Click.on(formUserPage.CHECKBOX_PRIVACY),
                Click.on(formUserPage.BUTTON_SETUP)
        );


    }
}
