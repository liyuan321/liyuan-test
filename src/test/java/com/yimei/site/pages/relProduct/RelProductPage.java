package com.yimei.site.pages.relProduct;

import com.yimei.site.common.pages.SiteUrl;
import org.openqa.selenium.By;
import static com.yimei.site.support.Driver.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by liyuan on 16/5/6.
 */
public class RelProductPage {
    private static final By USERNAME = By.id("securephone");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BTN = By.id("create-btn");

    private static final By PIC_BTN = By.xpath(".//*[@id='subHeader']/div/div/div[1]/a/img");    //个人中心的左侧易煤网图标

    private static final By SUPPLY_BTN = By.className("releasesupply");        //发布供应按钮
    private static final By COALTYPE = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[1]/ul/li[1]/div/div");
    private static final By COALTYPE1 = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[3]");
    private static final By ORIGINPLACE = By.id("originplace");        ///产地
    private static final By BRANDNAME = By.id("brandname");            //品名
//    private static final By DELIVERYWAY = By.id("deliveryWay");        //交货方式
    private static final By DELIVERYWAY = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[2]/div/div");
    private static final By DELIVERYWAY1 = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[6]");
    private static final By SUPPLYNUMBER = By.id("supplyNumber1");     //供货数量

    private static final By DELIVERYPROVINCE= By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[3]/div[1]/div");     //交货地点：省
    private static final By DELIVERYPROVINCE1= By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[3]/div[1]/ul/li[2]");
    private static final By DELIVERYPLACE= By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[3]/div[2]/div");     //交货地点：市
    private static final By DELIVERYPLACE1= By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[2]/ul/li[3]/div[2]/ul/li[3]");


    //付款方式
    private static final By PAYMODE1 = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[1]/ul/li[4]/div/div");
    private static final By PATMODE2 = By.xpath(".//*[@id='supply-form']/div[1]/div[2]/div[1]/ul/li[4]/div/ul/li[1]");

    //交货时间
    private static final By DELIVERYDATE1 = By.id("deliverydate");       //开始
    private static final By DELIVERYDATE12 = By.xpath(".//*[@id='deliverydate_root']/div/div/div/div/div/div[4]");
    private static final By DELIVERYDATE13 = By.xpath(".//*[@id='deliverydate_table']/tbody/tr[1]/td[3]/div");
//private static final By DELIVERYDATE13 = By.xpath(".//*[@id='deliverydate_table']/tbody/tr[3]/td[4]/div");
    private static final By DELIVERYDATE2 =By.id("deliverydate2");       //截止
    private static final By DELIVERYDATE22 = By.xpath(".//*[@id='deliverydate2_table']/tbody/tr[1]/td[5]/div");


//    private static final By ORGSELECT = By.id("orgSelect");   //检验机构
    private static final By PRICE = By.id("ykj2");             //一口价
//    private static final By DWRZ12 = By.xpath(".//*[@id='J_coaltype_dlm']/div[1]/div[1]/ul/li[1]/input[1]");            //低位热值
    private static final By DWRZ03 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[1]/input[1]");
    private static final By DWRZ02 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[1]/input[2]");
    private static final By HGJHF = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[2]/ul/li[1]/input[1]");           //空干基挥发分
    private static final By HGJHF02 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[2]/ul/li[1]/input[2]");
    private static final By SDJL = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[2]/input[1]");           //收到基硫份
    private static final By SDJL02 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[2]/input[2]");
    private static final By QS = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[2]/ul/li[2]/input[1]");            //全水分
    private static final By QS02 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[2]/ul/li[2]/input[2]");
    private static final By HF = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[3]/input[1]");          //灰分
    private static final By HF02 = By.xpath(".//*[@id='J_coaltype_pcm']/div[1]/div[1]/ul/li[3]/input[2]");


    private static final By HYBG = By.xpath(".//*[@id='myBody']/div[16]/input");   //上传图片文件

    private static final String URL= "/Users/rihime/Desktop/截图/小鸭子.jpg";

    private static final By SCAN = By.id("uploadClick");


    private static final By RELSUCCESS_BTN = By.id("btn-confirmSupply");          //确认发布按钮
    private static final By CONFIRM_BTN = By.id("confirm-announce");             //二次确认按钮
    private static final By SKIP_SUCCESS = By.xpath(".//*[@id='myBody']/div[3]/div/div[2]/div/div/p[2]/a");           //进入个人中心-我的供应列表





    //打开URL
    public static void access() throws InterruptedException {
        get(SiteUrl.LOGIN_URL);
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }

    //输入账号    @param user
    public static void inputUser(String user) throws InterruptedException {
        waitForElement(USERNAME).sendKeys(user);
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }


    //输入密码   @param password
    public static void inputPwd(String password) throws InterruptedException {
        waitForElement(PASSWORD).sendKeys(password);
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }

    //点击登录按钮
    public static void clickLoginBtn() throws InterruptedException {



        waitForElement(LOGIN_BTN).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);

    //登录完成后点击易煤图标进入易煤网首页


    }


    /****************点击发布供应******************************/



    public  static void clickRelSupply() throws InterruptedException{

        waitForElement(PIC_BTN).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(SUPPLY_BTN).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }


    /****************输入基本信息******************************/

    //select选择煤种
    public static void inputCoal() throws InterruptedException{
        waitForElement(COALTYPE).click();
        waitForElement(COALTYPE1).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }

    //输入产地
    public static void inputOrplace(String originplace) throws InterruptedException {
        waitForElement(ORIGINPLACE).sendKeys(originplace);
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }

    //输入品名
    public static void inputBrname(String brandname){
        waitForElement(BRANDNAME).sendKeys(brandname);
    }

    //输入交货方式
    public static void inputDelWay() throws InterruptedException{
//        Select selectdeliveryWay = new Select(driver.findElement(By.id("deliveryWay")));
//        selectdeliveryWay .selectByValue("坑口车板");
        waitForElement(DELIVERYWAY).click();
        Thread.sleep(1000);

        Thread.sleep(1000);

        waitForElement(DELIVERYWAY1).click();

        Thread.sleep(1000);

        Thread.sleep(1000);

    }

    //输入供货数量
    public static void inputSupplyNum(String supplyNumber1){
        waitForElement(SUPPLYNUMBER).sendKeys(supplyNumber1);
    }

    //输入交货地点
    public static void inputDelprovince() throws InterruptedException{
//        Select selectdeliveryprovince = new Select(driver.findElement(By.id("deliveryprovince")));
//        selectdeliveryprovince .selectByValue("河北");
        Thread.sleep(1000);

        Thread.sleep(1000);

        Thread.sleep(1000);

        waitForElement(DELIVERYPROVINCE).click();

        Thread.sleep(1000);

        Thread.sleep(1000);

        waitForElement(DELIVERYPROVINCE1).click();
    }

    public static void inputDelplace() throws InterruptedException{
//        Select selectdeliveryplace = new Select(driver.findElement(By.id("deliveryplace")));
//        selectdeliveryplace .selectByValue("京唐港");
        waitForElement(DELIVERYPLACE).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);


        waitForElement(DELIVERYPLACE1).click();

        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);

    }

    //付款方式
    public static void inputPaymode() throws InterruptedException{
        waitForElement(PAYMODE1).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
        waitForElement(PATMODE2).click();
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);
    }

    //交货时间
    public  static void inputDeldate() throws InterruptedException{
        waitForElement(DELIVERYDATE1).click();

        Thread.sleep(1000);

        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(DELIVERYDATE12).click();

        Thread.sleep(1000);

        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(DELIVERYDATE13).click();

        Thread.sleep(1000);

        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(DELIVERYDATE2).click();

        Thread.sleep(1000);

        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(DELIVERYDATE22).click();

        Thread.sleep(1000);

        Thread.sleep(1000);
        Thread.sleep(1000);
    }

//    //检验机构
//    public static void inputOrgSelect() throws InterruptedException{
//        Select selectorgSelect = new Select(driver.findElement(By.id("orgSelect")));
//        selectorgSelect .selectByValue("中国检验认证(集团)有限公司(CCIC)");
//    }

    //定价方式
    public static void inputdjfs() throws InterruptedException{
        waitForElement(PRICE).sendKeys("125.5");
    }

    //低位热值
    public static void inputdwrz(String nCV){
//        removeAttr();
//        setAttr();
        waitForElement(DWRZ03).sendKeys(nCV);
    }
    public static void inputdwrz2(String nCV02){
        waitForElement(DWRZ02).sendKeys(nCV02);
    }

    //空干基挥发分
    public static void inputkgjhf(String aDV){
        waitForElement(HGJHF).sendKeys(aDV);
    }
    public static void inputkgjhf2(String aDV02){
        waitForElement(HGJHF02).sendKeys(aDV02);
    }

    //收到基硫份
    public static void inputsdjl(String rS){
        waitForElement(SDJL).sendKeys(rS);
    }
    public static void inputsdjl2(String rS02){
        waitForElement(SDJL02).sendKeys(rS02);
    }

    //全水分
    public static void inputqs(String tM){
        waitForElement(QS).sendKeys(tM);
    }
    public static void inputqs2(String tM02){
        waitForElement(QS02).sendKeys(tM02);
    }
    //灰分
    public static void inputhf(String aSH){
        waitForElement(HF).sendKeys(aSH);
    }
    public static void inputhf2(String aSH02){
        waitForElement(HF02).sendKeys(aSH02);
    }


////
////    //上传图片
////
//    public static void upload() throws InterruptedException{
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        waitForElement(HYBG).sendKeys(URL);
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(SCAN).click();
//    }


    /****************发布成功及确认******************************/
    public static void relSuccess() throws InterruptedException{
        waitForElement(RELSUCCESS_BTN).click();

        Thread.sleep(1000);
        Thread.sleep(1000);

    }

    public static void relConfirm() throws InterruptedException{
        waitForElement(CONFIRM_BTN).click();

        Thread.sleep(1000);
        Thread.sleep(1000);

    }

    public static void relSkip() throws InterruptedException{

        Thread.sleep(1000);
        Thread.sleep(1000);

        waitForElement(SKIP_SUCCESS).click();


        Thread.sleep(1000);
        Thread.sleep(1000);
    }


}