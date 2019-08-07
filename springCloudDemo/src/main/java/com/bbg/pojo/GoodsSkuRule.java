package com.bbg.pojo;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;

public class GoodsSkuRule {
    @TableField("类别")
    private String category;
    @TableField("布局编码")
    private String layoutCode;
    @TableField("布局名称")
    private String layoutName;
    @TableField("理论单节货架SKU")
    private String theorySingleSku;
    @TableField("T版货架节数")
    private BigDecimal tSectionNum;
    @TableField("T版理论SKU数")
    private BigDecimal tTheorySku;
    @TableField("S版货架节数")
    private BigDecimal sSectionNum;
    @TableField("S版理论SKU数")
    private BigDecimal sTheorySku;
    @TableField("M版货架节数")
    private BigDecimal mSectionNum;
    @TableField("M版理论SKU数")
    private BigDecimal mTheorySku;
    @TableField("L版货架节数")
    private BigDecimal lSectionNum;
    @TableField("L版理论SKU数")
    private BigDecimal lTheorySku;
    @TableField("XL版货架节数")
    private BigDecimal xlSectionNum;
    @TableField("XL版理论SKU数")
    private BigDecimal xlTheorySku;
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getLayoutCode() {
        return layoutCode;
    }
    public void setLayoutCode(String layoutCode) {
        this.layoutCode = layoutCode;
    }
    public String getLayoutName() {
        return layoutName;
    }
    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }
    public String getTheorySingleSku() {
        return theorySingleSku;
    }
    public void setTheorySingleSku(String theorySingleSku) {
        this.theorySingleSku = theorySingleSku;
    }
    public BigDecimal gettSectionNum() {
        return tSectionNum;
    }
    public void settSectionNum(BigDecimal tSectionNum) {
        this.tSectionNum = tSectionNum;
    }
    public BigDecimal gettTheorySku() {
        return tTheorySku;
    }
    public void settTheorySku(BigDecimal tTheorySku) {
        this.tTheorySku = tTheorySku;
    }
    public BigDecimal getsSectionNum() {
        return sSectionNum;
    }
    public void setsSectionNum(BigDecimal sSectionNum) {
        this.sSectionNum = sSectionNum;
    }
    public BigDecimal getsTheorySku() {
        return sTheorySku;
    }
    public void setsTheorySku(BigDecimal sTheorySku) {
        this.sTheorySku = sTheorySku;
    }
    public BigDecimal getmSectionNum() {
        return mSectionNum;
    }
    public void setmSectionNum(BigDecimal mSectionNum) {
        this.mSectionNum = mSectionNum;
    }
    public BigDecimal getmTheorySku() {
        return mTheorySku;
    }
    public void setmTheorySku(BigDecimal mTheorySku) {
        this.mTheorySku = mTheorySku;
    }
    public BigDecimal getlSectionNum() {
        return lSectionNum;
    }
    public void setlSectionNum(BigDecimal lSectionNum) {
        this.lSectionNum = lSectionNum;
    }
    public BigDecimal getlTheorySku() {
        return lTheorySku;
    }
    public void setlTheorySku(BigDecimal lTheorySku) {
        this.lTheorySku = lTheorySku;
    }
    public BigDecimal getXlSectionNum() {
        return xlSectionNum;
    }
    public void setXlSectionNum(BigDecimal xlSectionNum) {
        this.xlSectionNum = xlSectionNum;
    }
    public BigDecimal getXlTheorySku() {
        return xlTheorySku;
    }
    public void setXlTheorySku(BigDecimal xlTheorySku) {
        this.xlTheorySku = xlTheorySku;
    }
    @Override
    public String toString() {
        return "GoodsSkuRule [category=" + category + ", layoutCode=" + layoutCode + ", layoutName="
                + layoutName + ", theorySingleSku=" + theorySingleSku + ", tSectionNum=" + tSectionNum
                + ", tTheorySku=" + tTheorySku + ", sSectionNum=" + sSectionNum + ", sTheorySku="
                + sTheorySku + ", mSectionNum=" + mSectionNum + ", mTheorySku=" + mTheorySku
                + ", lSectionNum=" + lSectionNum + ", lTheorySku=" + lTheorySku + ", xlSectionNum="
                + xlSectionNum + ", xlTheorySku=" + xlTheorySku + "]";
    }
    
}
