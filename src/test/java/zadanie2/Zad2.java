package zadanie2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

import java.util.List;

public class Zad2 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        // Uruchom Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
        @Test
        public void testGoogleSearch() {
            // Znajdź element wprowadzania tekstu na podstawie id
            WebElement First_name = driver.findElement(By.id("first-name"));
            // Wpisz informacje do pola first name
            First_name.sendKeys("Karol");
            // Prześlij formularz
            First_name.submit();

            // Znajdź last name wprowadzania tekstu na podstawie id
            WebElement Last_name = driver.findElement(By.id("last-name"));
            // Wpisz informacje do pola first name
            Last_name.sendKeys("Kowalski");
            // Prześlij formularz
            Last_name.submit();

// Znajdź gender

            List<WebElement> genders = driver.findElements(By.xpath("//input[@name='gender']"));
            // tablica[0] -> dla listy robimy lista.get(0)
            // 0 -> male, 1 -> female, 2 -> in between
            WebElement genderToClick = genders.get(0);
            //kliknij w niego
            genderToClick.click();


// Znajdź date of birth
            WebElement Date_of_Birth = driver.findElement(By.id("dob"));
            // Wpisz informacje do pola
            Date_of_Birth.sendKeys("05/22/2010");
            // Prześlij formularz
            Date_of_Birth.submit();
// Znajdź address
            WebElement Address = driver.findElement(By.id("address"));
            // Wpisz informacje do pola
            Address.sendKeys("Prosta 51");
            // Prześlij formularz
            Address.submit();

            // Znajdź email
            WebElement Email = driver.findElement(By.id("email"));
            // Wpisz informacje do pola
           Email.sendKeys("karol.kowalski@mailinator.com");
            // Prześlij formularz
          Email.submit();

            // Znajdź password
            WebElement Password = driver.findElement(By.id("password"));
            // Wpisz informacje do pola
            Password.sendKeys("Pass123");
            // Prześlij formularz
            Password.submit();

            // Znajdź company
            WebElement Company = driver.findElement(By.id("company"));
            // Wpisz informacje do pola
           Company.sendKeys("Coders Lab");
            // Prześlij formularz
            Company.submit();

            // Znajdź comment
            WebElement Comment = driver.findElement(By.id("comment"));
            // Wpisz informacje do pola
            Comment.sendKeys("To jest mój pierwszy automat testowy");
            // Prześlij formularz
            Comment.submit();


        }
}