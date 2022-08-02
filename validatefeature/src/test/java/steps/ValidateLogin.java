package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class ValidateLogin {

    WebDriver driver;

    @Given("User Launch Chrome browser")
    public void launchBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
    }

    @When("User opens URL {string}")
    public void user_opens_URL(String appURL) {
        
        driver.get(appURL);

    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String uname, String pwd) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(uname);
        
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(pwd);
    }

    @When("Click on Login")
    public void click_on_Login() {
        driver.findElement(By.tagName("button")).click();
    }

    @Then("Page Title should be {string}")
    public void page_Title_should_be(String expectedTitle) throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link() throws Exception {
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
    }

    @Then("close browser")
    public void close_browser() throws Exception {
        Thread.sleep(4000);
        driver.close();
    }
    
    @When("enter Email admin@yourstore.com and Password as admin")
    public void enter_Email_admin_yourstore_com_and_Password_as_admin(String username, String password) {
 
    	 driver.findElement(By.id("Email")).clear();
         driver.findElement(By.id("Email")).sendKeys(username);
         
         driver.findElement(By.name("Password")).clear();
         driver.findElement(By.name("Password")).sendKeys(password);
    }

}
