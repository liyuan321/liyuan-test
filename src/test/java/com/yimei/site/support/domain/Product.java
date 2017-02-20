package com.yimei.site.support.domain;

/**
 * Created by liyuan on 16/5/6.
 */

import lombok.Getter;

@Getter
public class Product {
    private String username;
    private String password;
    private String originplace;       //产地
    private String brandname;         //品名
    private String supplyNumber1;     //供货数量
    private String nCV;               //低位热值
    private String nCV02;               //低位热值02
    private String aDV;               //空干基挥发分
    private String aDV02;               //空干基挥发分02
    private String rS;               //收到基硫分
    private String rS02;               //收到基硫分02
    private String tM;               //全水分
    private String tM02;               //全水分02
    private String aSH;               //灰分
    private String aSH02;               //灰分02

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginplace() {
        return originplace;
    }

    public void setOriginplace(String originplace) {
        this.originplace = originplace;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getSupplyNumber1() {
        return supplyNumber1;
    }

    public void setSupplyNumber1(String supplyNumber1) {
        this.supplyNumber1 = supplyNumber1;
    }

    public String getnCV() {
        return nCV;
    }

    public void setnCV(String nCV) {
        this.nCV = nCV;
    }

    public String getnCV02() {
        return nCV02;
    }

    public void setnCV02(String nCV02) {
        this.nCV02 = nCV02;
    }

    public String getaDV() {
        return aDV;
    }

    public void setaDV(String aDV) {
        this.aDV = aDV;
    }

    public String getaDV02() {
        return aDV02;
    }

    public void setaDV02(String aDV02) {
        this.aDV02 = aDV02;
    }

    public String getrS() {
        return rS;
    }

    public void setrS(String rS) {
        this.rS = rS;
    }

    public String getrS02() {
        return rS02;
    }

    public void setrS02(String rS02) {
        this.rS02 = rS02;
    }

    public String gettM() {
        return tM;
    }

    public void settM(String tM) {
        this.tM = tM;
    }

    public String gettM02() {
        return tM02;
    }

    public void settM02(String tM02) {
        this.tM02 = tM02;
    }

    public String getaSH() {
        return aSH;
    }

    public void setaSH(String aSH) {
        this.aSH = aSH;
    }

    public String getaSH02() {
        return aSH02;
    }

    public void setaSH02(String aSH02) {
        this.aSH02 = aSH02;
    }
}
