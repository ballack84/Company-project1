import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class issueTradeLicenseHQ {
WebDriver driver = new ChromeDriver();
String website = "https://cls1.qa.rta.ae/journey-start?journeyCode=IPJ";
String eid = "199585170733";
String expirydate = "01092026";
String otpdata = "123456";
    By advancedBtn = By.id("details-button");
    By proccessBtn = By.id("proceed-link");
    Random rand = new Random();
    String mobile ="04548745";
    String orgmobile = "505457875";
    String corpphone = "50545454";


    @BeforeTest()
public void setup(){
    driver.manage().window().maximize();
    driver.get(website);
    try {
        driver.findElement(advancedBtn).click();
        driver.findElement(proccessBtn).click();
    } catch (Exception ignored)
    {

    }


}
@Test(priority =1,description = "issue trade license with HQ ")

    public void chooseindividualoption() throws InterruptedException {

//Enter the EID data
    Thread.sleep(3000);
    WebElement individualbutton = driver.findElement(By.className("individual"));
    individualbutton.click();
    Thread.sleep(3000);
        WebElement eiddata = driver.findElement(By.id("EIDNumber"));
        eiddata.click();
        Thread.sleep(3000);
        eiddata.sendKeys(eid);

//Enter the expiry date
    Thread.sleep(3000);
    WebElement eidexpirydate = driver.findElement(By.id("expiryDate"));
    Thread.sleep(3000);
    eidexpirydate.click();
    Thread.sleep(3000);
    eidexpirydate.sendKeys(expirydate);

    //Enter the next button after filling the eid data and expiry date
    WebElement nextbutton = driver.findElement(By.id("nextId"));
    nextbutton.click();
    Thread.sleep(3000);

    //Enter the OTP and click next
    WebElement enterotp = driver.findElement(By.id("otp"));
    Thread.sleep(3000);
    enterotp.click();
    Thread.sleep(3000);
    enterotp.sendKeys(otpdata);
    WebElement otpnxtbutton = driver.findElement(By.id("btncontinueId"));
    otpnxtbutton.click();
    Thread.sleep(3000);

    //enter create new NOC button
    WebElement createnocbutton = driver.findElement(By.id("Id_continue"));
    createnocbutton.click();
    Thread.sleep(3000);

    //Choose one of radio button (Typing center) and click cont
    WebElement typingcenter = driver.findElement(By.xpath("//label[@for='66']"));
    Thread.sleep(3000);
    typingcenter.click();
    Thread.sleep(3000);
    WebElement contbutton = driver.findElement(By.id("Id_continue"));
    contbutton.click();
    Thread.sleep(3000);

    //Apply the terms and conditions
    WebElement termsconditions = driver.findElement(By.className("GC_checkbox"));
    Thread.sleep(3000);
    termsconditions.click();
    Thread.sleep(3000);
    WebElement acceptbuttonterms = driver.findElement(By.id("Id_acceptContinueBtn"));
    acceptbuttonterms.click();
    Thread.sleep(3000);

    //Choose new company
    WebElement newcompanyhq = driver.findElement(By.id("Id_continue"));
    newcompanyhq.click();
    Thread.sleep(3000);

    //fill Representation class
    WebElement represintationclass = driver.findElement(By.xpath("//div[@id='Id_licenseType']//div[@class='p-dropdown-trigger']"));
    Thread.sleep(3000);
    represintationclass.click();
    Thread.sleep(3000);
    WebElement repclass = driver.findElement(By.xpath("//li[@class='p-dropdown-item' and .//div[text()='Local Branch']]"));
    repclass.click();
    Thread.sleep(3000);


    //fill company legal form
    WebElement companyform = driver.findElement(By.xpath("//span[contains(text(), 'Select a legal form')]/ancestor::div[contains(@class, 'p-dropdown')]//div[contains(@class, 'p-dropdown-trigger')]"));
    companyform.click();
    Thread.sleep(3000);
    WebElement companylegal = driver.findElement(By.xpath("//li[contains(@class, 'p-dropdown-item') and .//div[text()='Limited Liability Company']]"));
    companylegal.click();
    Thread.sleep(3000);

    //fill the trade license source
    WebElement tradelicensesource = driver.findElement(By.xpath("//div[@id='Id_tradeLicenseSource']//span[text()='Select a Trade licence source']"));
    tradelicensesource.click();
    Thread.sleep(3000);
    WebElement source = driver.findElement(By.xpath("//li[contains(@class, 'p-dropdown-item') and .//div[text()='Jabel Ali Free Zone']]"));
    source.click();
    Thread.sleep(3000);

    //fill the initial approval number
    int randomNumber = rand.nextInt(8001) + 1000; // 1000 to 9000
    WebElement initialnumber = driver.findElement(By.xpath("//input[@id='Id_initialApprovalNumber']\n"));
    initialnumber.click();
    Thread.sleep(3000);
    //Clear and input the random number
    initialnumber.clear();
    initialnumber.sendKeys(String.valueOf(randomNumber));
    Thread.sleep(3000);


    //upload initial approval certificate
    WebElement initialcert = driver.findElement(By.xpath("//input[@accept='application/pdf,image/jpeg,image/png']"));
    initialcert.sendKeys("D:\\dls-testcomplete-automation2\\src\\test\\resources\\attachments\\Att1.jfif");
    Thread.sleep(3000);
    WebElement contbutton2 = driver.findElement(By.id("Id_continue"));
    contbutton2.click();
    Thread.sleep(3000);

//select activity
    WebElement selectactivity = driver.findElement(By.id("Id_businessActivity"));
    selectactivity.click();
    Thread.sleep(3000);
    WebElement selectactivity2 = driver.findElement(By.xpath("//div[contains(text(),'Vehicles Numbers Trading')]"));
    selectactivity2.click();
    Thread.sleep(3000);

//click on select acitivty button
    WebElement activitybutton = driver.findElement(By.id("Id_addActivity"));
    activitybutton.click();
    Thread.sleep(3000);

    //Review and Confirm activity
    WebElement reviewconfirm = driver.findElement(By.xpath("//span[contains(text(),'Review & Confirm')]"));
    reviewconfirm.click();
    Thread.sleep(3000);

    //agree to add the activity
    WebElement agreeactivity = driver.findElement(By.id("Id_agreeAddActivity"));
    agreeactivity.click();
    Thread.sleep(3000);
    WebElement contbutton3 = driver.findElement(By.id("Id_continue"));
    contbutton3.click();
    Thread.sleep(3000);

    // to  Provide the shareholder’s details below to proceed with your permit
    WebElement indiv = driver.findElement(By.id("individual"));
    indiv.click();
    Thread.sleep(3000);

    //Provide the shareholder’s details from the list below.
    WebElement uaeresidents = driver.findElement(By.xpath("//label[@for='UAE_RESIDENT']"));
    uaeresidents.click();
    Thread.sleep(3000);
    //find shareholders by EID
    WebElement eidnumber = driver.findElement(By.id("Id_emirateIDNumber"));
    eidnumber.click();
    Thread.sleep(3000);
    eidnumber.sendKeys(eid);
    Thread.sleep(3000);
    WebElement expirdate = driver.findElement(By.id("Id_expiryDate"));
    expirdate.click();
    Thread.sleep(3000);
    expirdate.sendKeys(expirydate);
    Thread.sleep(3000);
    WebElement findbutton = driver.findElement(By.id("Id_find"));
    findbutton.click();
    Thread.sleep(3000);

    //add commrecial information
    WebElement typedroplist = driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']/span[text()='Select member type']\n"));
    typedroplist.click();
    Thread.sleep(3000);
    WebElement membertype = driver.findElement(By.xpath("//div[contains(text(),'Manager')]"));
    membertype.click();
    Thread.sleep(3000);
    WebElement attachpassport = driver.findElement(By.xpath("//input[@id='document_2']\n"));
    attachpassport.sendKeys("D:\\dls-testcomplete-automation2\\src\\test\\resources\\attachments\\Att1.jfif");
    Thread.sleep(3000);
    WebElement attachresidancy = driver.findElement(By.xpath("//input[@id='document_4']\n"));
    attachresidancy.sendKeys("D:\\dls-testcomplete-automation2\\src\\test\\resources\\attachments\\Att1.jfif");
    Thread.sleep(3000);
    WebElement savecontinuebutton = driver.findElement(By.id("Id_saveContinueAdd"));
    savecontinuebutton.click();
    Thread.sleep(3000);

    //View the list of shareholders details added then continoue
    WebElement continuebutton4 = driver.findElement(By.id("Id_continue"));
    continuebutton4.click();
    Thread.sleep(3000);

    //fill Trade Licence information
    WebElement commercialnameenglish = driver.findElement(By.xpath("//input[@id='Id_commercialNameEnglish']"));
    commercialnameenglish.sendKeys("Traders company");
    Thread.sleep(3000);
    WebElement commercialnamearabic = driver.findElement(By.xpath("//input[@id='Id_commercialNameArabic']"));
    commercialnamearabic.sendKeys("شركه تجار اللوحات");
    Thread.sleep(3000);
    WebElement corporatelang = driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']/span[text()='Select Language']\n"));
    corporatelang.click();
    WebElement englishlang = driver.findElement(By.xpath("//li[@aria-label='English']\n"));
    englishlang.click();
    Thread.sleep(3000);
    WebElement emailadress = driver.findElement(By.xpath("//input[@id='Id_emailAdress']"));
    emailadress.sendKeys("haitham@yahoo.com");
    Thread.sleep(3000);
    WebElement mobileno = driver.findElement(By.xpath("//input[@id='Id_mobileNumber']"));
    mobileno.click();
    Thread.sleep(3000);
    mobileno.sendKeys(mobile);
    Thread.sleep(3000);
    WebElement applicantlang = driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']/span[text()='Select Language']\n"));
    applicantlang.click();
    WebElement applicantenglish = driver.findElement(By.xpath("//li[@aria-label='English']\n"));
    applicantenglish.click();
    Thread.sleep(3000);
    WebElement orgmobileno = driver.findElement(By.xpath("//input[@id='Id_mobileNumber2']"));
    orgmobileno.click();
    Thread.sleep(3000);
    orgmobileno.sendKeys(orgmobile);
    Thread.sleep(3000);
    WebElement corporateadress = driver.findElement(By.xpath("//input[@id='Id_detailedAddress']"));
    corporateadress.sendKeys("Alnahda");
    Thread.sleep(3000);
    WebElement corporatephoneno = driver.findElement(By.xpath("//input[@id='Id_phone']"));
    corporatephoneno.click();
    Thread.sleep(3000);
    corporatephoneno.sendKeys(corpphone);
    Thread.sleep(3000);
    WebElement corporatemail = driver.findElement(By.xpath("//input[@id='Id_emailAdress2']"));
    corporatemail.sendKeys("barqawi@hotmail.com");
    Thread.sleep(3000);
    WebElement contbutton5 = driver.findElement(By.id("Id_continue"));
    contbutton5.click();
    Thread.sleep(3000);

    //review and confirm
    WebElement reviewcheckbox = driver.findElement(By.id("Id_termsCondation"));
    reviewcheckbox.click();
    Thread.sleep(3000);
    WebElement confirmandcont = driver.findElement(By.id("Id_confirmContinue"));
    confirmandcont.click();
    Thread.sleep(3000);

    //paymanet
    WebElement paymentbutton = driver.findElement(By.id("paymentBTN"));
    paymentbutton.click();
    Thread.sleep(3000);

    //close happymeter popup
    WebElement closepopup = driver.findElement(By.xpath("//span[@class='closePopup']\n"));
    closepopup.click();
    Thread.sleep(3000);



















































}
}
