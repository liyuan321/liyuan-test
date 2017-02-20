package com.yimei.site.steps.register;

import com.yimei.site.common.pages.DriverPage;
import com.yimei.site.common.pages.SiteUrl;
import com.yimei.site.pages.register.RegisterPage;
import com.yimei.site.support.domain.User;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 *  注册
 */
public class RegisterSteps {

    private static User user;

    @When("^输入注册信息,并且提交按钮$")
    public void inputRegisterInfo(DataTable inputs) throws Throwable {

            user = (User) inputs.asList(User.class).get(0);

            //  打开注册页面
            RegisterPage.access();

            //  输入账号、密码
            RegisterPage.inputUser(user);
            RegisterPage.inputPwd(user);

            //  获取验证码
            RegisterPage.clickSendCodeBtn();

            //  输入验证码
            RegisterPage.inputSmsCode(RegisterPage.getValidatorCode(user));

            //  点击注册按钮
            RegisterPage.clickRegisterBtn();
            Thread.sleep(800);

    }

    @Then("^注册成功$")
    public void loginSuccess() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.REGISTER_SUCCESS_URL);
    }

}
