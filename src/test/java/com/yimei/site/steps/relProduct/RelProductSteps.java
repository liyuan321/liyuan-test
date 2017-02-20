package com.yimei.site.steps.relProduct;

import com.yimei.site.pages.login.LoginPage;
import com.yimei.site.pages.relProduct.RelProductPage;
import com.yimei.site.support.domain.Product;
import com.yimei.site.support.domain.User;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by liyuan on 16/5/6.
 */
public class RelProductSteps {
//    private static User user;
    private static Product product;

    @Given("^输入用户名、密码$")
    public void inputUser(DataTable inputs) throws Throwable {

        product = (Product) inputs.asList(Product.class).get(0);
        LoginPage.access();                         //  打开登录页面
        LoginPage.inputUser(product.getUsername());    //  输入用户名
        LoginPage.inputPwd(product.getPassword());     //  输入密码
    }

    @When("^点击登录$")
    public void clickLoginBtn() throws Throwable {

        LoginPage.clickLoginBtn();    //  点击登录按钮
    }



    @When("^点击发布供应")
    public void clickRelSupply() throws Throwable{
        RelProductPage.clickRelSupply();     //点击发布供应按钮
    }

    @Given("^输入基本信息$")
    public void inputSupply() throws Throwable{
//        product = (Product) inputs.asList(Product.class).get(1);
        RelProductPage.inputCoal();
        RelProductPage.inputOrplace(product.getOriginplace());
        RelProductPage.inputBrname(product.getBrandname());
        RelProductPage.inputDelWay();
        RelProductPage.inputSupplyNum(product.getSupplyNumber1());
        RelProductPage.inputDelprovince();
        RelProductPage.inputDelplace();
        RelProductPage.inputPaymode();
        RelProductPage.inputDeldate();
//        RelProductPage.inputOrgSelect();
        RelProductPage.inputdjfs();
        RelProductPage.inputdwrz(product.getnCV());
        RelProductPage.inputdwrz2(product.getnCV02());
        RelProductPage.inputkgjhf(product.getaDV());
        RelProductPage.inputkgjhf2(product.getaDV02());
        RelProductPage.inputsdjl(product.getrS());
        RelProductPage.inputsdjl2(product.getrS02());
        RelProductPage.inputqs(product.gettM());
        RelProductPage.inputqs2(product.gettM02());
        RelProductPage.inputhf(product.getaSH());
        RelProductPage.inputhf2(product.getaSH02());

//        RelProductPage.upload();

    }

    @Then("^发布成功$")
    public void supplySuccess() throws Throwable{
        RelProductPage.relSuccess();
        RelProductPage.relConfirm();
        RelProductPage.relSkip();

    }




}
