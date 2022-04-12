package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UterJoinTodayPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import org.openqa.selenium.Keys;


public class JoinToday implements Task {

    private String strFirtsName;
    private String strLastName;
    private String strEmail;
    private String strMoth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strOperatingSystem;
    private String strPassword;
    private String strRepassword;

    public JoinToday(String strFirtsName, String strLastName, String strEmail, String strMoth, String strDay,
                     String strYear,String strCity, String strZip,String strCountry,String strComputer,
                     String strVersion, String strLanguage,  String strMobileDevice, String strModel,String strOperatingSystem,
                     String strPassword, String strRepassword) {
        this.strFirtsName = strFirtsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMoth = strMoth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
        this.strPassword = strPassword;
        this.strRepassword = strRepassword;
    }

    public static JoinToday onThePage(String strFirtsName, String strLastName, String strEmail, String strMoth, String strDay,
                                      String strYear,String strCity, String strZip,String strCountry,String strComputer,
                                      String strVersion, String strLanguage, String strMobileDevice, String strModel,String strOperatingSystem,
                                      String strPassword, String strRepassword){
        return Tasks.instrumented(JoinToday.class,strFirtsName,strLastName,strEmail,strMoth,strDay, strYear,
                                                    strCity, strZip,strCountry,strComputer,strVersion,strLanguage, strMobileDevice,
                                                    strModel,strOperatingSystem,strPassword,strRepassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UterJoinTodayPage.JOINTODAY_BUTOON),
                Enter.theValue(strFirtsName).into(UterJoinTodayPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UterJoinTodayPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UterJoinTodayPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMoth).from(UterJoinTodayPage.SELECT_MOTH),
                SelectFromOptions.byVisibleText(strDay).from(UterJoinTodayPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UterJoinTodayPage.SELECT_YEAR),
                Click.on(UterJoinTodayPage.NEXT_LOCATION_BUTTON),

                Enter.theValue(strCity).into(UterJoinTodayPage.INPUT_CITY), Hit.the(Keys.ARROW_DOWN).into(UterJoinTodayPage.INPUT_CITY),
                Enter.theValue(strZip).into(UterJoinTodayPage.INPUT_ZIP),
                Enter.theValue(strZip).into(UterJoinTodayPage.INPUT_ZIP),
                Click.on(UterJoinTodayPage.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(UterJoinTodayPage.INPUT_SEARCH_COUNTRY), Hit.the(Keys.ARROW_UP).into(UterJoinTodayPage.INPUT_SEARCH_COUNTRY),
                Click.on(UterJoinTodayPage.NEXT_DEVICES),

                Click.on(UterJoinTodayPage.SELECT_COMPUTER),
                Enter.theValue(strComputer).into(UterJoinTodayPage.INPUT_SEARCH_COMPUTER), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_SEARCH_COMPUTER),
                Click.on(UterJoinTodayPage.SELECT_VERSION),
                Enter.theValue(strVersion).into(UterJoinTodayPage.INPUT_SEARCH_VERSION), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_SEARCH_VERSION),
                Click.on(UterJoinTodayPage.SELECT_LANGUAGE),
                Enter.theValue(strLanguage).into(UterJoinTodayPage.INPUT_SEARCH_LANGUAGE), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_SEARCH_LANGUAGE),
                Click.on(UterJoinTodayPage.SELECT_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(UterJoinTodayPage.INPUT_SEARCH_MOBILE_DEVICE), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_SEARCH_MOBILE_DEVICE),
                Click.on(UterJoinTodayPage.SELECT_MODEL),
                Enter.theValue(strModel).into(UterJoinTodayPage.INPUT_MODEL), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_MODEL),
                Click.on(UterJoinTodayPage.SELECT_OPERATING_SYSTEM),
                Enter.theValue(strOperatingSystem).into(UterJoinTodayPage.INPUT_OPERATING_SYSTEM), Hit.the(Keys.ENTER).into(UterJoinTodayPage.INPUT_OPERATING_SYSTEM),
                Click.on(UterJoinTodayPage.NEX_LAST_STEP),

                Enter.theValue(strPassword).into(UterJoinTodayPage.INPUT_PASSWORD),
                Enter.theValue(strRepassword).into(UterJoinTodayPage.INPUT_REPASSWORD),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_STAY_INFORMED),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_READ_ACCEPT),
                JavaScriptClick.on(UterJoinTodayPage.CHECK_PRIVACY_SEGURITY),
                Click.on(UterJoinTodayPage.COMPLETE_SETUP_BUTTON)
                );
    }
}
