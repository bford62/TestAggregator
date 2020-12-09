package objects;


import base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TargetHome extends ApplicationPageBase {

//    private WebDriver driver;

    @FindBy(xpath = "//span[text()= 'Categories']")
    WebElement catELm;

    @FindBys({@FindBy(xpath = "//li[@id]/a")})
    List<WebElement> catList;

    @FindBy( xpath = "//p[contains(text(),\"We're sorry\")]")
    WebElement badPage;

    @FindBy(id = "search")
    WebElement searchBar;

    @FindBy(how = How.CLASS_NAME, className = "h-text-lg")
    WebElement searchedProduct;

    @FindBy(how = How.XPATH, xpath = "//button[@data-test=\"btnSearch\"]")
    WebElement searchBtn;

    @FindBy(how = How.XPATH, xpath = "//span[text() = \"Sign in\"]")
    WebElement sDropDown;
    //locator strategy - important
    @FindBy(how = How.XPATH, xpath = "/html/body/div[8]/div/div/ul/li[1]")
    WebElement sTransport;


    /*public TargetHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }*/

    public List<String> retrieveCategories(){
        List<String> urls = new ArrayList<>();
        catELm.click();
        catList.forEach(x -> urls.add(x.getAttribute("href")));
        return urls;
    }

    public Boolean doesItExist() {
        boolean check = false;
        try{
            if (badPage.getText() != null) {
                check = true;
            }
        } catch(Exception e){
            return false;
        }
        return check;
    }

    public void searchProduct(){

//        searchBar.sendKeys("shirt", Keys.ENTER);
        searchBtn.click();
    }
    public WebElement isSearch(){
        return searchedProduct;
    }
    public void getSignOn() {
        sDropDown.click();
    }
    public void clickSignOn() throws InterruptedException {
        Thread.sleep(3000);
        sTransport.click();
    }
    public WebElement isSignOn(){return sTransport;}
}
