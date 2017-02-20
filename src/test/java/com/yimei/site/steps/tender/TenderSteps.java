//package com.yimei.site.steps.tender;
//
//import com.yimei.site.pages.login.LoginPage;
//import com.yimei.site.pages.relProduct.RelProductPage;
//import com.yimei.site.pages.tender.TenderPage;
//import com.yimei.site.support.domain.Product;
//import com.yimei.site.support.domain.Tender;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.omg.CORBA.PUBLIC_MEMBER;
//
///**
// * Created by rihime on 16/5/17.
// */
//public class TenderSteps {
//    private static Tender tender;
//
//    @Given("^输入用户名、密码$")
//    public void inputUser(DataTable inputs) throws Throwable {
//
//        tender = (Tender) inputs.asList(Tender.class).get(0);
//        LoginPage.access();                         //  打开登录页面
//        LoginPage.inputUser(tender.getUsername());    //  输入用户名
//        LoginPage.inputPwd(tender.getPassword());     //  输入密码
//    }
//
//    @When("^点击登录$")
//    public void clickLoginBtn() throws Throwable {
//
//        LoginPage.clickLoginBtn();    //  点击登录按钮
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//    @And("^点击\\【阳光采购\\】模块$")
//    public void clicktPurchase() throws Throwable{
//        TenderPage.clickpurchase();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//    @When("^点击\\【发布招标\\】按钮$")
//    public void clickTenbtn() throws Throwable{
//        TenderPage.clickReleaseBtn();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//    }
//
//
//    @Given("^输入招标基本信息$")
//    public void inputTeninfo() throws Throwable{
//        TenderPage.inputteninfo(tender.getTendercode(),tender.getTendername(),tender.getTenderunits(),tender.getCapitalsettlement(),
//                tender.getMargins(),tender.getPurchase_title(),tender.getReceiving_unit(),tender.getPurchase_quantity(),
//                tender.getDelivery_unit(),tender.getNcv(),tender.getRs(),tender.getAdv(),tender.getAdv02(),tender.getTm(),tender.getPurchaseamount());
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        TenderPage.inputtime();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        TenderPage.clause();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        TenderPage.upload();
//    }
//
//
//    @Then("^点击提交按钮，发布成功$")
//    public void clickSubmit() throws Throwable{
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        TenderPage.relSuccess();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//        TenderPage.relConfirm();
//
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//
//
//        TenderPage.skipTender();
//    }
//
//
//}
//
//
////String user,String password,String tendercode,String tendername,String tenderunits,String capitalsettlement, String margins,
////        String purchase_title,String receiving_unit,String purchase_quantity,String delivery_unit,String ncv,String rs, String adv,
////        String adv02, String tm,String purchaseamount