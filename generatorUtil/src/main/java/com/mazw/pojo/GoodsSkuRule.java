package com.mazw.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class GoodsSkuRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String 类别;
    private String 布局编码;
    private String 布局名称;
    @TableField("理论单节货架SKU")
    private Double 理论单节货架SKU;
    @TableField("T版货架节数")
    private Double T版货架节数;
    @TableField("T版理论SKU数")
    private Double T版理论SKU数;
    @TableField("S版货架节数")
    private Double S版货架节数;
    @TableField("S版理论SKU数")
    private Double S版理论SKU数;
    @TableField("M版货架节数")
    private Double M版货架节数;
    @TableField("M版理论SKU数")
    private Double M版理论SKU数;
    @TableField("L版货架节数")
    private Double L版货架节数;
    @TableField("L版理论SKU数")
    private Double L版理论SKU数;
    @TableField("XL版货架节数")
    private Double XL版货架节数;
    @TableField("XL版理论SKU数")
    private Double XL版理论SKU数;


    public String get类别() {
        return 类别;
    }

    public void set类别(String 类别) {
        this.类别 = 类别;
    }

    public String get布局编码() {
        return 布局编码;
    }

    public void set布局编码(String 布局编码) {
        this.布局编码 = 布局编码;
    }

    public String get布局名称() {
        return 布局名称;
    }

    public void set布局名称(String 布局名称) {
        this.布局名称 = 布局名称;
    }

    public Double get理论单节货架SKU() {
        return 理论单节货架SKU;
    }

    public void set理论单节货架SKU(Double 理论单节货架SKU) {
        this.理论单节货架SKU = 理论单节货架SKU;
    }

    public Double getT版货架节数() {
        return T版货架节数;
    }

    public void setT版货架节数(Double T版货架节数) {
        this.T版货架节数 = T版货架节数;
    }

    public Double getT版理论SKU数() {
        return T版理论SKU数;
    }

    public void setT版理论SKU数(Double T版理论SKU数) {
        this.T版理论SKU数 = T版理论SKU数;
    }

    public Double getS版货架节数() {
        return S版货架节数;
    }

    public void setS版货架节数(Double S版货架节数) {
        this.S版货架节数 = S版货架节数;
    }

    public Double getS版理论SKU数() {
        return S版理论SKU数;
    }

    public void setS版理论SKU数(Double S版理论SKU数) {
        this.S版理论SKU数 = S版理论SKU数;
    }

    public Double getM版货架节数() {
        return M版货架节数;
    }

    public void setM版货架节数(Double M版货架节数) {
        this.M版货架节数 = M版货架节数;
    }

    public Double getM版理论SKU数() {
        return M版理论SKU数;
    }

    public void setM版理论SKU数(Double M版理论SKU数) {
        this.M版理论SKU数 = M版理论SKU数;
    }

    public Double getL版货架节数() {
        return L版货架节数;
    }

    public void setL版货架节数(Double L版货架节数) {
        this.L版货架节数 = L版货架节数;
    }

    public Double getL版理论SKU数() {
        return L版理论SKU数;
    }

    public void setL版理论SKU数(Double L版理论SKU数) {
        this.L版理论SKU数 = L版理论SKU数;
    }

    public Double getXL版货架节数() {
        return XL版货架节数;
    }

    public void setXL版货架节数(Double XL版货架节数) {
        this.XL版货架节数 = XL版货架节数;
    }

    public Double getXL版理论SKU数() {
        return XL版理论SKU数;
    }

    public void setXL版理论SKU数(Double XL版理论SKU数) {
        this.XL版理论SKU数 = XL版理论SKU数;
    }

    @Override
    public String toString() {
        return "GoodsSkuRule{" +
        ", 类别=" + 类别 +
        ", 布局编码=" + 布局编码 +
        ", 布局名称=" + 布局名称 +
        ", 理论单节货架SKU=" + 理论单节货架SKU +
        ", T版货架节数=" + T版货架节数 +
        ", T版理论SKU数=" + T版理论SKU数 +
        ", S版货架节数=" + S版货架节数 +
        ", S版理论SKU数=" + S版理论SKU数 +
        ", M版货架节数=" + M版货架节数 +
        ", M版理论SKU数=" + M版理论SKU数 +
        ", L版货架节数=" + L版货架节数 +
        ", L版理论SKU数=" + L版理论SKU数 +
        ", XL版货架节数=" + XL版货架节数 +
        ", XL版理论SKU数=" + XL版理论SKU数 +
        "}";
    }
}
