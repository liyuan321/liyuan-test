package com.yimei.site.common;

import core.config.DatabaseConfig;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhaoyikui on 16/4/19.
 */
public class GetValidatorCode {

    // 定义数据库变量
    static String sql = null;
    static DatabaseConfig db = null;
    static ResultSet ret = null;

    /**
     * 获取验证码
     * @param username
     * @return code
     */
    public static String getValidatorCodeReg(String username){

        String code = null;
        sql = "select code from phonevalidators where phone = '" + username + "' and validated = 0 and validatetype = 'register';";
        System.out.println(sql);
        db = new DatabaseConfig(sql);
        try {
            ret = db.pst.executeQuery();
            while (ret.next()) {

                code =   ret.getString(1);
//                db.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return code;
    }

    /**
     * 删除当天特定ip下的验证码记录
     * @param username
     * @return
     */
    public static void deleteCode(String username){

        //  TODO
        String code = null;
//        sql = "select code from phonevalidators where phone = '" + username + "' and validated = 0 and validatetype = 'register';";
//        System.out.println(sql);
//        db = new DatabaseConfig(sql);
//        try {
//            ret = db.pst.executeQuery();
//            while (ret.next()) {
//
//                code =   ret.getString(1);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

}
