package com.yimei.site.pages.register;

import com.yimei.site.common.GetValidatorCode;
import com.yimei.site.common.pages.SiteUrl;
import com.yimei.site.support.domain.User;
import org.openqa.selenium.By;

import static com.yimei.site.support.Driver.get;
import static com.yimei.site.support.Driver.waitForElement;

public class RegisterPage {
    private static final By USERNAME = By.id("securephone");
    private static final By PASSWORD = By.id("password");
    private static final By CONFIRM_PASSWORD = By.id("confirm_password");
    private static final By SMS_CODE = By.id("smsCode");
    private static final By SEND_CODE_BTN = By.id("sendCode");
    private static final By REGISTER_BTN = By.id("register-btn");

    /**
     * 打开URL
     */
    public static void access() {

        get(SiteUrl.REGISTER_URL);
    }

    /**
     * 输入账号
     * @param user
     */
    public static void inputUser(User user) {

        waitForElement(USERNAME).sendKeys(user.getUsername());
    }

    /**
     * 输入密码、确认密码
     * @param user
     */
    public static void inputPwd(User user) {

        waitForElement(PASSWORD).sendKeys(user.getPassword());
        waitForElement(CONFIRM_PASSWORD).sendKeys(user.getConfirmPassword());
    }

    /**
     * 输入短信验证码
     * @param smsCode
     */
    public static void inputSmsCode(String smsCode) {

        waitForElement(SMS_CODE).sendKeys(smsCode);
    }

    /**
     * 点击获取短信验证码按钮
     */
    public static void clickSendCodeBtn() {

        waitForElement(SEND_CODE_BTN).click();
    }

    /**
     * 获取短信验证码
     * @param user
     * @return
     */
    public static String getValidatorCode(User user) {

        return GetValidatorCode.getValidatorCodeReg(user.getUsername());
    }

    /**
     * 点击注册按钮
     */
    public static void clickRegisterBtn() {

        waitForElement(REGISTER_BTN).click();
    }

}
