//package com.yimei.site.pages.tender;
//
//import com.yimei.site.common.pages.SiteUrl;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import java.time.LocalDate;
//
//import static com.yimei.site.support.Driver.get;
//import static com.yimei.site.support.Driver.waitForElement;
//
///**
// * Created by liyuan on 16/5/17.
// */
//public class TenderPage {
//
//    private static final By USERNAME = By.id("securephone");
//    private static final By PASSWORD = By.id("password");
//    private static final By LOGIN_BTN = By.id("create-btn");
//    private static final By WEBSITE_NAVIGATION =By.linkText("网站导航");
//    private static final By SUNSHINE_PURCHASE = By.linkText("阳光采购中心");
//
//    private static final By REL_PRO = By.linkText("发布项目");       //发布项目按钮
//    //标题
//    private static final By ADD_BTN = By.id("tenderNameAddBtn");    //添加标题和编号按钮
//    private static final By TenderCode = By.name("tenderTitle");    //采购标题输入框
//    private static final By SUBMIT = By.xpath(".//*[@id='tenderNameForm']/div[2]/input");       //标题保存按钮
//
//
//
//    //内容
//    private static final By ADDINDEX_BTN = By.cssSelector("#tenderProjectAddBtn .add-btn");   //添加煤炭指标按钮
//    private static final By RECEIVING_UNIT = By.name("receiptUnitName");       //收货单位
//    private static final By TRANSPORTMODE = By.name("transportMode");           //运输方式
//    private static final By RECEIVING_LAND = By.name("receiptAddress");           //收货地
//    private static final By PURCHASE_QUANTITY = By.name("purchaseAmount");           //采购量
//    private static final By PARTICLE_SIZE = By.name("PS");                     //颗粒度
//    private static final By COALSTR = By.name("coalStr");              //煤种
//    private static final By ORIGIN = By.name("origin");          //产地
//    private static final By DWRZ = By.name("NCV");           //地位热值
//    private static final By DWRZ2 = By.name("NCV2");           //地位热值2
//    private static final By ADV = By.name("ADV");             //空干基挥发分
//    private static final By ADV2 = By.name("ADV2");           //空干基挥发分
//    private static final By PROJECT_BTN =  By.xpath(".//*[@id='tenderProjectForm']/div[14]/input");      //项目一的保存按钮
//
//
//
//    //商务条款
//
//    private static final By TENDERCOMMERCEADDBTN = By.id("tenderCommerceAddBtn");    //添加商务条款按钮
//    private static final By CapitalSettlement = By.name("settlementMode");        //结算方式
//    private static final By Margins = By.id("margins");         //保证金
//    private static final By TENDERSTARTDATE = By.id("tenderStartDate");      //报价开始时间
//    private static final By TENDERENDDATE = By.id("tenderEndDate");      //报价截止时间
//    private static final By ContractconBegindate = By.id("startDate");         //合同开始日期
//    private static final By ContractconEnddate = By.id("endDate");          //合同截止时间
//
//    private static final By  BIDDING_REQUIRE = By.id("bidRequirement");     //投标单位要求
//    private static final By JKBZTK = By.id("rewardPenaltyTerms");           //奖扣条款
//
//    private static final By UPLOAD_FILE = By.id("uploadBtn");         //上传图片文件
//
//    private static final By SCAN = By.xpath(".//*[@id='tenderCommerceForm']/div[10]/input");      //保存按钮
//
//
//
//
//    private static final By Submit_All = By.id("publish");     // 发布按钮
//
//    private static final By  BOMB_BOX  = By.linkText("跳转至我的招标");        //弹框确认按钮
//    private static final By Tender_List = By.id("laterBtn");       //返回我的招标
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    //打开URL
//    public static void access() {
//        get(SiteUrl.LOGIN_URL);
//    }
//
//    //输入账号    @param user
//    public static void inputUser(String user) {
//        waitForElement(USERNAME).sendKeys(user);
//    }
//
//    //输入密码   @param password
//    public static void inputPwd(String password) {
//        waitForElement(PASSWORD).sendKeys(password);
//    }
//
//    //点击登录按钮
//    public static void clickLoginBtn() throws InterruptedException {
//        waitForElement(LOGIN_BTN).click();
//    }
//
//    //点击【阳光采购】，进入阳光采购模块
//    public static void clickpurchase() throws InterruptedException{
//        waitForElement(WEBSITE_NAVIGATION).click();
//        waitForElement(SUNSHINE_PURCHASE).click();
//    }
//
//
//
//    /****************点击发布招标******************************/
//
//    //点击【发布招标】按钮,进入发布招标页面
//    public static void clickReleaseBtn() throws InterruptedException{
//        waitForElement(REL_PRO).click();
//        waitForElement(ADD_BTN).click();
//
//        waitForElement(TenderCode).sendKeys("ZB201612070001");
//        waitForElement(SUBMIT).click();
//    }
//
//
//    public static void clickContentBtn() throws InterruptedException{
//
//        waitForElement(ADDINDEX_BTN).click();
//
//    }
//
//
//
//    //输入招标基本信息（参数化）    煤炭指标内容
//    public static void inputteninfo(String tendercode,String tendername,String tenderunits,String capitalsettlement, String margins,
//                                    String purchase_title,String receiving_unit,String purchase_quantity,String delivery_unit,String ncv,String rs, String adv,
//                                    String adv02, String tm,String purchaseamount) throws InterruptedException{
//
//        waitForElement(RECEIVING_UNIT).sendKeys(tendername);
//        waitForElement(TRANSPORTMODE).sendKeys(tenderunits);
//        waitForElement(RECEIVING_LAND).sendKeys(capitalsettlement);
//        waitForElement(PURCHASE_QUANTITY).sendKeys(margins);
//        waitForElement(PARTICLE_SIZE).sendKeys(purchase_title);
//        waitForElement(COALSTR).sendKeys(receiving_unit);
//        waitForElement(ORIGIN).sendKeys(purchase_quantity);
//        waitForElement(DWRZ).sendKeys(delivery_unit);
//        waitForElement(DWRZ2).sendKeys(ncv);
//        waitForElement(ADV).sendKeys(rs);
//        waitForElement(ADV2).sendKeys(adv);
//
//    }
//
//    //发布招标-内容；相应煤炭指标的保存
//    public static void contengSave() throws InterruptedException{
//        waitForElement(PROJECT_BTN).click();
//    }
//
//    //商务条款点击按钮
//    public static void businessTerms() throws InterruptedException{
//        waitForElement(TENDERCOMMERCEADDBTN).click();
//
//    }
//
//    //相应的商务条款指标内容
//    public static void businessInfo() throws InterruptedException{
//
//        waitForElement(CapitalSettlement).sendKeys();        //
//        waitForElement(Margins).sendKeys();             //
//        waitForElement(BIDDING_REQUIRE).sendKeys();                //
//        waitForElement(JKBZTK).sendKeys();
//        waitForElement(UPLOAD_FILE).sendKeys();
//    }
//
//
//
//    //输入招标时间
//    public static void inputtime() throws InterruptedException{
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(Tenderenddate).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
////
////        waitForElement(Tenderenddate2).click();
////
////
////        Thread.sleep(1000);
////        Thread.sleep(1000);
////        Thread.sleep(1000);
//
//
//        waitForElement(Tenderenddate3).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(ContractconBegindate).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(Tenderenddate4).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(ContractconEnddate).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(Tenderenddate5).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//    }
//
//    public static void clause() throws InterruptedException{
//        waitForElement(JKBZTK).sendKeys("去玩儿推欧赔阿斯蒂芬刚回家考虑自行车泉州橡树湾得出通过并你还要");
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//
//
//    //上传图片
//    public static void upload() throws InterruptedException{
//
//        waitForElement(HYBG).sendKeys("/Users/rihime/Desktop/截图/小鸭子.jpg");
//        waitForElement(SCAN).click();
//    }
//
//
//    //点击提交按钮，发布成功
//    public static void relSuccess() throws InterruptedException{
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        waitForElement(Submit_All).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//    public static void relConfirm() throws InterruptedException{
//        waitForElement(Submit).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//    public static void skipTender() throws InterruptedException{
//        waitForElement(Tender_List).click();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//
//}
//
//
