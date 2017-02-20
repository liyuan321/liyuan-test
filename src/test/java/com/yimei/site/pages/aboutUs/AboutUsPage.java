package com.yimei.site.pages.aboutUs;

import com.yimei.site.common.pages.SiteUrl;
import org.openqa.selenium.By;

import static com.yimei.site.support.Driver.get;
import static com.yimei.site.support.Driver.waitForElement;

/**
 * Created by liyuan on 16/5/03.
 */
public class AboutUsPage {

    private static final String ABOUTUS_URL = SiteUrl.HOME_URL + "aboutUs";

    //private static final By ABOUTUS = By.xpath(".//*[@id='headerBan']/div/div/ul/li[5]/a");
    private static final By ABOUTUS=By.linkText("关于我们");
    private static final By ABOUTUS_GSJJ = By.xpath(".//*[@id='aboutLeftNav']/ul/li[1]/a");
    private static final By ABOUTUS_ZXDT = By.xpath(".//*[@id='aboutLeftNav']/ul/li[2]/a");
    private static final By ABOUTUS_WWGG = By.xpath(".//*[@id='aboutLeftNav']/ul/li[3]/a");
    private static final By ABOUTUS_ZXNS = By.xpath(".//*[@id='aboutLeftNav']/ul/li[4]/a");
    private static final By ABOUTUS_LXWM = By.xpath(".//*[@id='aboutLeftNav']/ul/li[5]/a");
    private static final By ABOUTUS_JJFK = By.xpath(".//*[@id='aboutLeftNav']/ul/li[6]/a");

    /**
     * 点击【关于我们】
     */
    public static void clickAboutUs() throws InterruptedException {

        waitForElement(ABOUTUS).click();
    }

    public static void access() {

        get(SiteUrl.ABOUT_US_URL);
    }

    /**
     * 点击【公司简介】
     */
    public static void clickABOUTUS_GSJJ() throws InterruptedException {

        waitForElement(ABOUTUS_GSJJ).click();
    }

    /**
     * 点击【最新动态】
     */
    public static void clickABOUTUS_ZXDT() throws InterruptedException {

        waitForElement(ABOUTUS_ZXDT).click();
    }

    /**
     * 点击【网站公告】
     */
    public static void clickABOUTUS_WZGG() throws InterruptedException {

        waitForElement(ABOUTUS_WWGG).click();
    }

    /**
     * 点击【招贤纳士】
     */
    public static void clickABOUTUS_ZXNS() throws InterruptedException {

        waitForElement(ABOUTUS_ZXNS).click();
    }

    /**
     * 点击【联系我们】
     */
    public static void clickABOUTUS_LXWM() throws InterruptedException {

        waitForElement(ABOUTUS_LXWM).click();
    }

    /**
     * 点击【建议反馈】
     */
    public static void clickABOUTUS_JYFK() throws InterruptedException {

        waitForElement(ABOUTUS_JJFK).click();
    }

}
