package com.yupi.yupao.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户包装类（脱敏）
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class UserVO implements Serializable {
    /**
     * id
     */
    private long id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 标签列表 json
     */
    private String tags;

    /**
     * 状态 0 - 正常
     */
    private Integer userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 用户角色 0 - 普通用户 1 - 管理员
     */
    private Integer userRole;

    /**
     * 星球编号
     */
    private String planetCode;

    private static final long serialVersionUID = 1L;

    public UserVO() {
    }

    public long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public Integer getGender() {
        return this.gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTags() {
        return this.tags;
    }

    public Integer getUserStatus() {
        return this.userStatus;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUserRole() {
        return this.userRole;
    }

    public String getPlanetCode() {
        return this.planetCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public void setPlanetCode(String planetCode) {
        this.planetCode = planetCode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserVO)) return false;
        final UserVO other = (UserVO) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$userAccount = this.getUserAccount();
        final Object other$userAccount = other.getUserAccount();
        if (this$userAccount == null ? other$userAccount != null : !this$userAccount.equals(other$userAccount))
            return false;
        final Object this$avatarUrl = this.getAvatarUrl();
        final Object other$avatarUrl = other.getAvatarUrl();
        if (this$avatarUrl == null ? other$avatarUrl != null : !this$avatarUrl.equals(other$avatarUrl)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$tags = this.getTags();
        final Object other$tags = other.getTags();
        if (this$tags == null ? other$tags != null : !this$tags.equals(other$tags)) return false;
        final Object this$userStatus = this.getUserStatus();
        final Object other$userStatus = other.getUserStatus();
        if (this$userStatus == null ? other$userStatus != null : !this$userStatus.equals(other$userStatus))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$userRole = this.getUserRole();
        final Object other$userRole = other.getUserRole();
        if (this$userRole == null ? other$userRole != null : !this$userRole.equals(other$userRole)) return false;
        final Object this$planetCode = this.getPlanetCode();
        final Object other$planetCode = other.getPlanetCode();
        if (this$planetCode == null ? other$planetCode != null : !this$planetCode.equals(other$planetCode))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $userAccount = this.getUserAccount();
        result = result * PRIME + ($userAccount == null ? 43 : $userAccount.hashCode());
        final Object $avatarUrl = this.getAvatarUrl();
        result = result * PRIME + ($avatarUrl == null ? 43 : $avatarUrl.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $tags = this.getTags();
        result = result * PRIME + ($tags == null ? 43 : $tags.hashCode());
        final Object $userStatus = this.getUserStatus();
        result = result * PRIME + ($userStatus == null ? 43 : $userStatus.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $userRole = this.getUserRole();
        result = result * PRIME + ($userRole == null ? 43 : $userRole.hashCode());
        final Object $planetCode = this.getPlanetCode();
        result = result * PRIME + ($planetCode == null ? 43 : $planetCode.hashCode());
        return result;
    }

    public String toString() {
        return "UserVO(id=" + this.getId() + ", username=" + this.getUsername() + ", userAccount=" + this.getUserAccount() + ", avatarUrl=" + this.getAvatarUrl() + ", gender=" + this.getGender() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", tags=" + this.getTags() + ", userStatus=" + this.getUserStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", userRole=" + this.getUserRole() + ", planetCode=" + this.getPlanetCode() + ")";
    }
}
