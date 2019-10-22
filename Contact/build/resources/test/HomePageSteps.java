public class HomePageSteps {
    public HomePageSteps() {

        When("^I launch ContactsApp\\.$", () -> {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.1");
            capabilities.setCapability("deviceName", "Nexus6");
            capabilities.setCapability("app", "/Users/vamsiv/contacts.apk");
            AppiumDriver wd = new AppiumDriver(new  URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        });


        And("^I given permission to  access my contacts\\.$", () -> {


        });



        Then("^I see list of contatcs loaded on the screen\\.$", () -> {


        });
    }
}
