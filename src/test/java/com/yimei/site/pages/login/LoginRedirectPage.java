package com.yimei.site.pages.login;

import com.yimei.site.common.pages.SiteUrl;
import org.openqa.selenium.By;

import static com.yimei.site.support.Driver.waitForElement;

/**
 * Created by zhaoyikui on 16/4/21.
 */
public class LoginRedirectPage {

    private static final String LOGIN_URL = SiteUrl.HOME_URL + "login";

    private static final By LOGO = By.xpath("/html/body/div[1]/div/div[1]/div[1]/a/img");
    private static final By RESET_PASSWORD = By.className("resetPwd");
    private static final By REGISTER = By.xpath("id('login_form')/div[6]/div/a");
    private static final By TEACH_REGISTER = By.xpath("id('regBottom')/div/div[1]/div/ul/li[1]/span/a");
    private static final By NEWS = By.xpath("id('regBottom')/div/div[1]/div/ul/li[3]/span/a");
    private static final By VAS = By.xpath("id('regBottom')/div/div[1]/div/ul/li[5]/span/a");
    private static final By ABOUT_US = By.xpath("id('regBottom')/div/div[1]/div/ul/li[7]/span/a");

    /**
     * 点击【Logo】
     */
    public static void clickLogo() throws InterruptedException {

        waitForElement(LOGO).click();
    }

    /**
     * 点击【忘记密码】
     */
    public static void clickForgetPwd() throws InterruptedException {

        waitForElement(RESET_PASSWORD).click();
    }

    /**
     * 点击【免费注册】
     */
    public static void clickRegister() throws InterruptedException {

        waitForElement(REGISTER).click();
    }

    /**
     * 点击【新手上路】
     */
    public static void clickNewRegister() throws InterruptedException {

        waitForElement(TEACH_REGISTER).click();
    }

    /**
     * 点击【行情资讯】
     */
    public static void clickNews() throws InterruptedException {

        waitForElement(NEWS).click();
    }

    /**
     * 点击【增值服务】
     */
    public static void clickVAS() throws InterruptedException {

        waitForElement(VAS).click();
    }

    /**
     * 点击【关于我们】
     */
    public static void clickAboutUs() throws InterruptedException {

        waitForElement(ABOUT_US).click();
    }

}
