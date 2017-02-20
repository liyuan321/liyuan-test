package com.yimei.site.steps.aboutUs;

import com.yimei.site.common.pages.DriverPage;
import com.yimei.site.common.pages.SiteUrl;
import com.yimei.site.pages.aboutUs.AboutUsPage;
import com.yimei.site.pages.login.LoginPage;
import com.yimei.site.pages.login.LoginRedirectPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by liyuan on 16/5/03.
 */
public class AboutUsSteps {

    @When("^点击\\【关于我们\\】$")
    public void clickAboutUs() throws Throwable {

        //  打开易煤网首页页面
        AboutUsPage.access();

        //  点击【关于我们】
        AboutUsPage.clickAboutUs();

    }

    @Then("^页面跳转到\\【关于我们\\】$")
    public void goToAboutUs() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUT_US_URL);
    }

    @When("^点击\\【公司简介\\】$")
    public void clickABOUTUS_GSJJ() throws Throwable {

        //  点击【公司简介】
        AboutUsPage.clickABOUTUS_GSJJ();
    }

    @Then("^页面跳转到\\【公司简介\\】页面$")
    public void goToAboutUs_GSJJ() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_GSJJ_URL);
    }

    @When("^点击\\【最新动态\\】$")
    public void clickABOUTUS_ZXDT() throws Throwable {

        //  点击【最新动态】
        AboutUsPage.clickABOUTUS_ZXDT();
    }

    @Then("^页面跳转到\\【最新动态\\】页面$")
    public void goToAboutUs_ZXDT() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_ZXDT_URL);
    }

    @When("^点击\\【网站公告\\】$")
    public void clickABOUTUS_WZGG() throws Throwable {

        //  点击【网站公告】
        AboutUsPage.clickABOUTUS_WZGG();
    }

    @Then("^页面跳转到\\【网站公告\\】页面$")
    public void goToAboutUs_WZGG() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_WZGG_URL);
    }

    @When("^点击\\【招贤纳士\\】$")
    public void clickABOUTUS_ZXNS() throws Throwable {

        //  点击【招贤纳士】
        AboutUsPage.clickABOUTUS_ZXNS();
    }

    @Then("^页面跳转到\\【招贤纳士\\】页面$")
    public void goToAboutUs_ZXNS() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_ZXNS_URL);
    }

    @When("^点击\\【联系我们\\】$")
    public void clickABOUTUS_LXWM() throws Throwable {

        //  点击【联系我们】
        AboutUsPage.clickABOUTUS_LXWM();
    }

    @Then("^页面跳转到\\【联系我们\\】页面$")
    public void goToAboutUs_LXWM() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_LXWM_URL);
    }

    @When("^点击\\【建议反馈\\】$")
    public void clickABOUTUS_JYFK() throws Throwable {

        //  点击【建议反馈】
        AboutUsPage.clickABOUTUS_JYFK();
    }

    @Then("^页面跳转到\\【建议反馈\\】页面$")
    public void goToAboutUs_JYFK() throws Throwable {

        Assert.assertEquals(DriverPage.getCurrentUrl(), SiteUrl.ABOUTUS_JYFK_URL);
    }


}
