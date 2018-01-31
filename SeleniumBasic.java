package samplelearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        //System.setProperty("webdriver.chrome.marionette","C:\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver","/Users/suchismitasethi/Downloads/chromedriver");
    //    WebDriver driver = new ChromeDriver();
        WebDriver Chromedriver = new ChromeDriver();

       // String expectedTitle = "Facebook - Log In or Sign Up";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        Chromedriver.get("http://automationpractice.com/index.php?55");
        Chromedriver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
        WebElement Sbutton = Chromedriver.findElement(By.xpath("id(\"searchbox\")/button[1]"));
        Sbutton.click();

        WebElement SignInbutton = Chromedriver.findElement(By.xpath("id(\"header\")/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
        SignInbutton.click();

        Chromedriver.findElement(By.xpath("id(\"email_create\")")).sendKeys("juliea.suchi@gmail.com");
        Chromedriver.findElement(By.id("SubmitCreate")).click();

        //Chromedriver.findElement(By.id("id_gender1")).click();
        Chromedriver.findElement(By.name("customer_firstname")).sendKeys("julia");
        Chromedriver.findElement(By.id("customer_lastname")).sendKeys("Suchi");
        Chromedriver.findElement(By.id("passwd")).sendKeys("lhs=rhs");
        Chromedriver.findElement(By.id("days")).sendKeys("09");
        Chromedriver.findElement(By.id("months")).sendKeys("oct");
        Chromedriver.findElement(By.id("years")).sendKeys("1989");

        // get the actual value of the title
       // actualTitle = Chromedriver.getTitle();
       // System.out.println(actualTitle);
        System.out.println("Page Source :"+Chromedriver.navigate());

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
      //  if (actualTitle.contentEquals(expectedTitle)){
     //       System.out.println("Test Passed!");
      //  } else {
      //      System.out.println("Test Failed");
      //  }

        //close Fire fox
        //Chromedriver.close();
        Chromedriver.quit();

    }
}
