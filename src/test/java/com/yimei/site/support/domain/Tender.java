package com.yimei.site.support.domain;

/**
 * Created by liyuan on 16/5/17.
 */
import lombok.Getter;

@Getter

public class Tender {
    private String username;
    private String password;
    private String tendercode;
    private String tendername;
    private String tenderunits;
    private String capitalsettlement;
    private String margins;
    private String purchase_title;
    private String receiving_unit;
    private String purchase_quantity;
    private String delivery_unit;
    private String ncv;
    private String rs;
    private String adv;
    private String adv02;
    private String tm;
    private String purchaseamount;


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

    public String getTendercode() {
        return tendercode;
    }

    public void setTendercode(String tendercode) {
        this.tendercode = tendercode;
    }

    public String getTendername() {
        return tendername;
    }

    public void setTendername(String tendername) {
        this.tendername = tendername;
    }

    public String getTenderunits() {
        return tenderunits;
    }

    public void setTenderunits(String tenderunits) {
        this.tenderunits = tenderunits;
    }

    public String getCapitalsettlement() {
        return capitalsettlement;
    }

    public void setCapitalsettlement(String capitalsettlement) {
        this.capitalsettlement = capitalsettlement;
    }

    public String getMargins() {
        return margins;
    }

    public void setMargins(String margins) {
        this.margins = margins;
    }

    public String getPurchase_title() {
        return purchase_title;
    }

    public void setPurchase_title(String purchase_title) {
        this.purchase_title = purchase_title;
    }

    public String getReceiving_unit() {
        return receiving_unit;
    }

    public void setReceiving_unit(String receiving_unit) {
        this.receiving_unit = receiving_unit;
    }

    public String getPurchase_quantity() {
        return purchase_quantity;
    }

    public void setPurchase_quantity(String purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }

    public String getDelivery_unit() {
        return delivery_unit;
    }

    public void setDelivery_unit(String delivery_unit) {
        this.delivery_unit = delivery_unit;
    }

    public String getNcv() {
        return ncv;
    }

    public void setNcv(String ncv) {
        this.ncv = ncv;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getAdv() {
        return adv;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public String getAdv02() {
        return adv02;
    }

    public void setAdv02(String adv02) {
        this.adv02 = adv02;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(String purchaseamount) {
        this.purchaseamount = purchaseamount;
    }



}