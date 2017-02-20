package com.yimei.site.pages.login;

import com.yimei.site.common.pages.SiteUrl;
import org.openqa.selenium.By;

import static com.yimei.site.support.Driver.get;
import static com.yimei.site.support.Driver.getCurrentURL;
import static com.yimei.site.support.Driver.waitForElement;

public class LoginPage {
    private static final By USERNAME = By.id("userPhone");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BTN = By.xpath("html/body/div[2]/div/div[2]/form/button");
//    private static final By LOGIN_INFO = By.id("loginInfo");
//    private static final By PWD_ERROR_INFO = By.id("pwdErrorInfo");
    private static final By LOGIN_FLAG = By.xpath("id('headerBan')/div/div/ul/li[2]/a");

    private static String result = null;
    private static Boolean loginFlag = true;

    /**
     *  打开URL
     */
    public static void access() {

        get(SiteUrl.LOGIN_URL);
    }

    /**
     * 判断是否登录成功（根据昵称）
     * @return false:成功 true:失败
     */
    public static boolean loginCheck() throws InterruptedException {

        if(getCurrentURL().equals(SiteUrl.HOME_URL_1)){
            if(waitForElement(LOGIN_FLAG).getText().equals("登录")){

                loginFlag = true;
            }else{

                loginFlag = false;
            }
        }else{

            clickLoginBtn();
            loginCheck();
        }

        return loginFlag;
    }

    /**
     * 输入账号
     * @param user
     */
    public static void inputUser(String user) {

        waitForElement(USERNAME).sendKeys(user);
    }

    /**
     * 输入密码
     * @param password
     */
    public static void inputPwd(String password) {

        waitForElement(PASSWORD).sendKeys(password);
    }

    /**
     * 点击登录按钮
     */
    public static void clickLoginBtn() throws InterruptedException {

        waitForElement(LOGIN_BTN).click();
    }

//    /**
//     * 获取Message信息(递归)
//     */
//    public static String getMessage() throws InterruptedException {
//
//        if(!waitForElement(LOGIN_INFO).getText().equals("")){
//
//            result = waitForElement(LOGIN_INFO).getText();
//        }else if(!waitForElement(PWD_ERROR_INFO).getText().equals("")){
//
//            result = waitForElement(PWD_ERROR_INFO).getText();
//        }else{
//
//            clickLoginBtn();
//            getMessage();
//        }
//
//        return result;
//    }

}
