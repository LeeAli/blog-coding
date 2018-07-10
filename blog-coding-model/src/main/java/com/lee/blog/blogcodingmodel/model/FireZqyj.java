package com.lee.blog.blogcodingmodel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
//@Table(name = "A_FIRE_ZQYJ",schema = "DB_YJZH")
@Table(name = "A_FIRE_ZQYJ", schema = "EZVIEW")
//@Table(name = "A_FIRE_ZQYJ")
public class FireZqyj {
    @Id
    private String YJBH;

    private String BZXX;

    private String FBDW;

    private String FBRY;

    private Date FBSJ;

    private String GXRY;

    private Date GXSJ;

    private String JLZT;

    private String JSNR;

    private String RKRY;

    private Date RKSJ;

    private String YJNR;

    private String ZQDD;

    private String YJBT;

    private String ZQDJ;

    private String ZQLX;

    public FireZqyj() {
    }

    public String getBZXX() {
        return BZXX;
    }

    public void setBZXX(String BZXX) {
        this.BZXX = BZXX;
    }

    public String getFBDW() {
        return FBDW;
    }

    public void setFBDW(String FBDW) {
        this.FBDW = FBDW;
    }

    public String getFBRY() {
        return FBRY;
    }

    public void setFBRY(String FBRY) {
        this.FBRY = FBRY;
    }

    public Date getFBSJ() {
        return FBSJ;
    }

    public void setFBSJ(Date FBSJ) {
        this.FBSJ = FBSJ;
    }

    public String getGXRY() {
        return GXRY;
    }

    public void setGXRY(String GXRY) {
        this.GXRY = GXRY;
    }

    public Date getGXSJ() {
        return GXSJ;
    }

    public void setGXSJ(Date GXSJ) {
        this.GXSJ = GXSJ;
    }

    public String getJLZT() {
        return JLZT;
    }

    public void setJLZT(String JLZT) {
        this.JLZT = JLZT;
    }

    public String getJSNR() {
        return JSNR;
    }

    public void setJSNR(String JSNR) {
        this.JSNR = JSNR;
    }

    public String getRKRY() {
        return RKRY;
    }

    public void setRKRY(String RKRY) {
        this.RKRY = RKRY;
    }

    public Date getRKSJ() {
        return RKSJ;
    }

    public void setRKSJ(Date RKSJ) {
        this.RKSJ = RKSJ;
    }

    public String getYJBH() {
        return YJBH;
    }

    public void setYJBH(String YJBH) {
        this.YJBH = YJBH;
    }

    public String getYJNR() {
        return YJNR;
    }

    public void setYJNR(String YJNR) {
        this.YJNR = YJNR;
    }

    public String getZQDD() {
        return ZQDD;
    }

    public void setZQDD(String ZQDD) {
        this.ZQDD = ZQDD;
    }

    public String getYJBT() {
        return YJBT;
    }

    public void setYJBT(String YJBT) {
        this.YJBT = YJBT;
    }

    public String getZQDJ() {
        return ZQDJ;
    }

    public void setZQDJ(String ZQDJ) {
        this.ZQDJ = ZQDJ;
    }

    public String getZQLX() {
        return ZQLX;
    }

    public void setZQLX(String ZQLX) {
        this.ZQLX = ZQLX;
    }

    @Override
    public String toString() {
        return "FireZqyj{" +
                "BZXX='" + BZXX + '\'' +
                ", FBDW='" + FBDW + '\'' +
                ", FBRY='" + FBRY + '\'' +
                ", FBSJ='" + FBSJ + '\'' +
                ", GXRY='" + GXRY + '\'' +
                ", GXSJ=" + GXSJ +
                ", JLZT='" + JLZT + '\'' +
                ", JSNR='" + JSNR + '\'' +
                ", RKRY='" + RKRY + '\'' +
                ", RKSJ=" + RKSJ +
                ", YJBH='" + YJBH + '\'' +
                ", YJNR='" + YJNR + '\'' +
                ", ZQDD='" + ZQDD + '\'' +
                ", YJBT='" + YJBT + '\'' +
                ", ZQDJ='" + ZQDJ + '\'' +
                ", ZQLX='" + ZQLX + '\'' +
                '}';
    }
}
