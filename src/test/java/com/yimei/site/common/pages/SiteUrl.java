package com.yimei.site.common.pages;

/**
 * Created by zhaoyikui on 16/4/21.
 */
public class SiteUrl {

    public static final String HOME_URL = "http://www-local.yimei180.com:8080/";
    //    public static final String HOME_URL = "http://site.kittc/";



    public static final String HOME_URL_1 = "http://member-local.yimei180.com:3000/account/individualCenter";
    //    public static final String HOME_URL = "http://site.kittc/";


    //  会员系统
    public static final String MEMBER_URL = "member-local.yimei180.com:3000/";

    //  登录
    public static final String LOGIN_URL =  MEMBER_URL + "login";;

    //  找回密码
    public static final String RESET_PASSWORD_URL = MEMBER_URL + "resetpassword";

    //  注册
    public static final String REGISTER_URL = MEMBER_URL + "register";

    //  新手指导
    public static final String TEACH_REGISTER_URL = HOME_URL + "teach/register";

    //  行情资讯
    public static final String NEWS_URL = "http://info-local.yimei180.com:8085/news";

    //  增值服务（金融）
    public static final String FINANCE_URL = HOME_URL + "finance";

    //  关于我们
    public static final String ABOUT_US_URL = HOME_URL + "aboutUs";

    //  公司简介
    public static final String ABOUTUS_GSJJ_URL = HOME_URL + "aboutUs/intro";

    //  最新动态
    public static final String ABOUTUS_ZXDT_URL = HOME_URL + "aboutUs/news";

    //  网站公告
    public static final String ABOUTUS_WZGG_URL = HOME_URL + "aboutUs/notices";

    //  招贤纳士
    public static final String ABOUTUS_ZXNS_URL = HOME_URL + "aboutUs/invite";

    //  联系我们
    public static final String ABOUTUS_LXWM_URL = HOME_URL + "aboutUs/contact";

    //  建议反馈
    public static final String ABOUTUS_JYFK_URL = HOME_URL + "aboutUs/advice";


    //  注册成功
    public static final String REGISTER_SUCCESS_URL = MEMBER_URL + "registeredSuccess";

    //阳光采购
    public static final String TENDER_URL = HOME_URL + "tender";



}
