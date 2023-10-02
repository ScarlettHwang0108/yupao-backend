package com.yupi.yupao.model.request;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    // [加入编程导航](https://yupi.icu) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路

    private String userPassword;

    public UserLoginRequest() {
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserLoginRequest)) return false;
        final UserLoginRequest other = (UserLoginRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userAccount = this.getUserAccount();
        final Object other$userAccount = other.getUserAccount();
        if (this$userAccount == null ? other$userAccount != null : !this$userAccount.equals(other$userAccount))
            return false;
        final Object this$userPassword = this.getUserPassword();
        final Object other$userPassword = other.getUserPassword();
        if (this$userPassword == null ? other$userPassword != null : !this$userPassword.equals(other$userPassword))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserLoginRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userAccount = this.getUserAccount();
        result = result * PRIME + ($userAccount == null ? 43 : $userAccount.hashCode());
        final Object $userPassword = this.getUserPassword();
        result = result * PRIME + ($userPassword == null ? 43 : $userPassword.hashCode());
        return result;
    }

    public String toString() {
        return "UserLoginRequest(userAccount=" + this.getUserAccount() + ", userPassword=" + this.getUserPassword() + ")";
    }
}
