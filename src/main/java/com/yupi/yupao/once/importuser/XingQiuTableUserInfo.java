package com.yupi.yupao.once.importuser;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 星球表格用户信息
 */
public class XingQiuTableUserInfo {

    /**
     * id
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

    public XingQiuTableUserInfo() {
    }

    public String getPlanetCode() {
        return this.planetCode;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPlanetCode(String planetCode) {
        this.planetCode = planetCode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof XingQiuTableUserInfo)) return false;
        final XingQiuTableUserInfo other = (XingQiuTableUserInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planetCode = this.getPlanetCode();
        final Object other$planetCode = other.getPlanetCode();
        if (this$planetCode == null ? other$planetCode != null : !this$planetCode.equals(other$planetCode))
            return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof XingQiuTableUserInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planetCode = this.getPlanetCode();
        result = result * PRIME + ($planetCode == null ? 43 : $planetCode.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        return result;
    }

    public String toString() {
        return "XingQiuTableUserInfo(planetCode=" + this.getPlanetCode() + ", username=" + this.getUsername() + ")";
    }

    // [加入编程导航](https://t.zsxq.com/0emozsIJh) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路

}
