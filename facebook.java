
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class facebook {


        public static void main(String[] args){

            System.setProperty("webdriver.chrome.driver","/Users/manas/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/");
//** Facebook Login
//    driver.findElement(By.id("email")).sendKeys("manasranjan22@gmail.com");
//    driver.findElement(By.id("pass")).click();
//    driver.findElement(By.id("pass")).sendKeys("0063#Apple");
//    driver.findElement(By.id("u_0_2")).click();

            //** Facebook Create Accnt
            WebElement Fname = driver.findElement(By.id("u_0_e"));
            Actions actionsfn= new Actions(driver);
            actionsfn.moveToElement(Fname);
            actionsfn.click();
            actionsfn.sendKeys("Suchismita");
            actionsfn.build().perform();

            WebElement Lname = driver.findElement(By.id("u_0_g"));

            Actions actionsln= new Actions(driver);
            actionsln.moveToElement(Lname);
            actionsln.click();
            actionsln.sendKeys("Sethi");
            actionsln.build().perform();

            WebElement em_mo = driver.findElement(By.id("u_0_j"));

            Actions actionsem_mo= new Actions(driver);
            actionsem_mo.moveToElement(em_mo);
            actionsem_mo.click();
            actionsem_mo.sendKeys("juliasuchi09@gmail.com");
            actionsem_mo.build().perform();

            WebElement em_mo2 = driver.findElement(By.id("u_0_m"));

            Actions actionsem_mo2= new Actions(driver);
            actionsem_mo2.moveToElement(em_mo2);
            actionsem_mo2.click();
            actionsem_mo2.sendKeys("juliasuchi09@gmail.com");
            actionsem_mo2.build().perform();

            WebElement passwd = driver.findElement(By.id("u_0_q"));

            Actions actionspass= new Actions(driver);
            actionspass.moveToElement(passwd);
            actionspass.click();
            actionspass.sendKeys("Abc$123");
            actionspass.build().perform();

            driver.findElement(By.id("month")).sendKeys("Jun");
            driver.findElement(By.id("day")).sendKeys("10");
            driver.findElement(By.id("year")).sendKeys("1987");
            driver.findElement(By.id("u_0_b")).click();
            driver.findElement(By.id("u_0_w")).click();

//    driver.get("https://www.google.com/");
//    driver.findElement(By.className("gb_P")).click();
//    driver.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__create-account")).click();



        }

    }




















