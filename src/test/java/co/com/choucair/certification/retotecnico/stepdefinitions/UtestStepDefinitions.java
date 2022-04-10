package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.PersonalInformation;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.FormUser;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Daniel want to know the sities uTest$")
    public void thanDanielWantToKnowTheSitiesUTest() throws Exception {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.ThePage());

    }


    @When("^entering the data from the uTest registration form$")
    public void enteringTheDataFromTheUTestRegistrationForm(List<PersonalInformation> personalInformation) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FormUser.The(personalInformation.get(0).getFirst_name(),personalInformation.get(0).getLast_name(),personalInformation.get(0).getEmail_address(),
                personalInformation.get(0).getMonth_birth(),personalInformation.get(0).getDay_birth(),personalInformation.get(0).getYear_birth(),
                personalInformation.get(0).getCity(),personalInformation.get(0).getPostal_code(),personalInformation.get(0).getCountry(),
                personalInformation.get(0).getYour_computer(),personalInformation.get(0).getVersion(),personalInformation.get(0).getLanguage(),
                personalInformation.get(0).getYour_mobile_device(),personalInformation.get(0).getModel(),personalInformation.get(0).getOperating_system(),
                personalInformation.get(0).getPassword(),personalInformation.get(0).getPassword_confirmation()));

    }

    @Then("^he Know the functionalities of the uTest$")
    public void heKnowTheFunctionalitiesOfTheUTest(List<PersonalInformation> personalInformation) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(personalInformation.get(0).getWelcome())));

    }
}
