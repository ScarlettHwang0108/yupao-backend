package com.yupi.yupao.model.request;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;

    public UserRegisterRequest() {
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public String getCheckPassword() {
        return this.checkPassword;
    }

    public String getPlanetCode() {
        return this.planetCode;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    public void setPlanetCode(String planetCode) {
        this.planetCode = planetCode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserRegisterRequest)) return false;
        final UserRegisterRequest other = (UserRegisterRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userAccount = this.getUserAccount();
        final Object other$userAccount = other.getUserAccount();
        if (this$userAccount == null ? other$userAccount != null : !this$userAccount.equals(other$userAccount))
            return false;
        final Object this$userPassword = this.getUserPassword();
        final Object other$userPassword = other.getUserPassword();
        if (this$userPassword == null ? other$userPassword != null : !this$userPassword.equals(other$userPassword))
            return false;
        final Object this$checkPassword = this.getCheckPassword();
        final Object other$checkPassword = other.getCheckPassword();
        if (this$checkPassword == null ? other$checkPassword != null : !this$checkPassword.equals(other$checkPassword))
            return false;
        final Object this$planetCode = this.getPlanetCode();
        final Object other$planetCode = other.getPlanetCode();
        if (this$planetCode == null ? other$planetCode != null : !this$planetCode.equals(other$planetCode))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserRegisterRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userAccount = this.getUserAccount();
        result = result * PRIME + ($userAccount == null ? 43 : $userAccount.hashCode());
        final Object $userPassword = this.getUserPassword();
        result = result * PRIME + ($userPassword == null ? 43 : $userPassword.hashCode());
        final Object $checkPassword = this.getCheckPassword();
        result = result * PRIME + ($checkPassword == null ? 43 : $checkPassword.hashCode());
        final Object $planetCode = this.getPlanetCode();
        result = result * PRIME + ($planetCode == null ? 43 : $planetCode.hashCode());
        return result;
    }

    public String toString() {
        return "UserRegisterRequest(userAccount=" + this.getUserAccount() + ", userPassword=" + this.getUserPassword() + ", checkPassword=" + this.getCheckPassword() + ", planetCode=" + this.getPlanetCode() + ")";
    }
}
