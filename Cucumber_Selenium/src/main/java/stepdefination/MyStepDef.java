package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepDef {
    WebDriver driver=null;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("Inside step browser is open");
        String chromeDriverPath = "C:\\software\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://letcode.in/signin");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[1]/div/input")).sendKeys("iswaryagunupudi129@gmail.com");
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[2]/div/input")).sendKeys("Renu@1234");
        Thread.sleep(2000);

    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();

    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a")).isDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}
