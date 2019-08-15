package com.bbg.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-14
 */
public class TLoggerInfos implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ali_id", type = IdType.AUTO)
    private Integer aliId;
    private String aliClientIp;
    private String aliUri;
    private String aliType;
    private String aliMethod;
    private String aliParamData;
    private String aliSessionId;
    private Date aliTime;
    private String aliReturnTime;
    private String aliReturnData;
    private String aliHttpStatusCode;
    private Integer aliTimeConsuming;


    public Integer getAliId() {
        return aliId;
    }

    public void setAliId(Integer aliId) {
        this.aliId = aliId;
    }

    public String getAliClientIp() {
        return aliClientIp;
    }

    public void setAliClientIp(String aliClientIp) {
        this.aliClientIp = aliClientIp;
    }

    public String getAliUri() {
        return aliUri;
    }

    public void setAliUri(String aliUri) {
        this.aliUri = aliUri;
    }

    public String getAliType() {
        return aliType;
    }

    public void setAliType(String aliType) {
        this.aliType = aliType;
    }

    public String getAliMethod() {
        return aliMethod;
    }

    public void setAliMethod(String aliMethod) {
        this.aliMethod = aliMethod;
    }

    public String getAliParamData() {
        return aliParamData;
    }

    public void setAliParamData(String aliParamData) {
        this.aliParamData = aliParamData;
    }

    public String getAliSessionId() {
        return aliSessionId;
    }

    public void setAliSessionId(String aliSessionId) {
        this.aliSessionId = aliSessionId;
    }

    public Date getAliTime() {
        return aliTime;
    }

    public void setAliTime(Date aliTime) {
        this.aliTime = aliTime;
    }

    public String getAliReturnTime() {
        return aliReturnTime;
    }

    public void setAliReturnTime(String aliReturnTime) {
        this.aliReturnTime = aliReturnTime;
    }

    public String getAliReturnData() {
        return aliReturnData;
    }

    public void setAliReturnData(String aliReturnData) {
        this.aliReturnData = aliReturnData;
    }

    public String getAliHttpStatusCode() {
        return aliHttpStatusCode;
    }

    public void setAliHttpStatusCode(String aliHttpStatusCode) {
        this.aliHttpStatusCode = aliHttpStatusCode;
    }

    public Integer getAliTimeConsuming() {
        return aliTimeConsuming;
    }

    public void setAliTimeConsuming(Integer aliTimeConsuming) {
        this.aliTimeConsuming = aliTimeConsuming;
    }

    @Override
    public String toString() {
        return "TLoggerInfos{" +
        ", aliId=" + aliId +
        ", aliClientIp=" + aliClientIp +
        ", aliUri=" + aliUri +
        ", aliType=" + aliType +
        ", aliMethod=" + aliMethod +
        ", aliParamData=" + aliParamData +
        ", aliSessionId=" + aliSessionId +
        ", aliTime=" + aliTime +
        ", aliReturnTime=" + aliReturnTime +
        ", aliReturnData=" + aliReturnData +
        ", aliHttpStatusCode=" + aliHttpStatusCode +
        ", aliTimeConsuming=" + aliTimeConsuming +
        "}";
    }
}
