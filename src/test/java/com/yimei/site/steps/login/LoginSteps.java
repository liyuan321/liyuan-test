package com.yimei.site.steps.login;

import com.yimei.site.pages.login.LoginPage;
import com.yimei.site.support.domain.User;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * 登录
 */
public class LoginSteps {

    private static User user;

    @Given("^输入用户名、密码$")
    public void inputUser(DataTable inputs) throws Throwable {

        user = (User) inputs.asList(User.class).get(0);

        //  打开登录页面
        LoginPage.access();

        //  输入用户名
        LoginPage.inputUser(user.getUsername());

        //  输入密码
        LoginPage.inputPwd(user.getPassword());
    }

    @When("^点击登录$")
    public void clickLoginBtn() throws Throwable {

        //  点击登录按钮
        LoginPage.clickLoginBtn();
    }

    @Then("^登录成功$")
    public void loginSuccess() throws Throwable {

        Assert.assertFalse(LoginPage.loginCheck());
    }

//    @Then("^验证提示信息$")
//    public void loginFailed() throws Throwable {
//
//        Assert.assertEquals(LoginPage.getMessage(), user.getMessage());
//    }

}
