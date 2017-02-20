package com.yimei.site.steps.login;

import com.yimei.site.common.pages.DriverPage;
import com.yimei.site.common.pages.SiteUrl;
import com.yimei.site.pages.login.LoginPage;
import com.yimei.site.pages.login.LoginRedirectPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by zhaoyikui on 16/4/21.
 */
public class LoginRedirectSteps {

    @When("^点击\\【Logo\\】$")
    public void clickLogo() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【Logo】
        LoginRedirectPage.clickLogo();
    }

    @Then("^页面跳转到\\【首页\\】$")
    public void goToHomePage() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.HOME_URL);
    }

    @When("^点击\\【忘记密码\\?\\】$")
    public void clickForgetPwd() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【忘记密码】
        LoginRedirectPage.clickForgetPwd();
    }

    @Then("^页面跳转到\\【找回密码\\】页面$")
    public void goToResetPwd() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.RESET_PASSWORD_URL);
    }

    @When("^点击\\【免费注册\\】$")
    public void clickRegister() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【免费注册】
        LoginRedirectPage.clickRegister();
    }

    @Then("^页面跳转到\\【注册\\】页面$")
    public void goToRegister() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.REGISTER_URL);
    }

    @When("^点击\\【新手上路\\】$")
    public void clickNewRegister() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【新手上路】
        LoginRedirectPage.clickNewRegister();
    }

    @Then("^页面跳转到\\【新手指导\\】页面$")
    public void goToTeach() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.TEACH_REGISTER_URL);
    }

    @When("^点击\\【行情资讯\\】$")
    public void clickNews() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【行情资讯】
        LoginRedirectPage.clickNews();
    }

    @Then("^页面跳转到\\【行情资讯\\】页面$")
    public void goToNews() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.NEWS_URL);
    }

    @When("^点击\\【增值服务\\】$")
    public void clickVAS() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【增值服务】
        LoginRedirectPage.clickVAS();
    }

    @Then("^页面跳转到\\【金融\\】页面$")
    public void goToFinance() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.FINANCE_URL);
    }

    @When("^点击\\【关于我们\\】$")
    public void clickAboutUs() throws Throwable {

        //  打开【登录】页面
        LoginPage.access();

        //  点击【关于我们】
        LoginRedirectPage.clickAboutUs();
    }

    @Then("^页面跳转到\\【关于我们\\】页面$")
    public void goToAboutUs() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUT_US_URL);
    }


}
