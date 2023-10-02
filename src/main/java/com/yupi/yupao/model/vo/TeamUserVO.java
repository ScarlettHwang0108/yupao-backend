package com.yupi.yupao.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 队伍和用户信息封装类（脱敏）
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class TeamUserVO implements Serializable {

    private static final long serialVersionUID = 1899063007109226944L;

    /**
     * id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

    // 作_者 【程序员_鱼皮】 https://space.bilibili.com/12890453/

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人用户信息
     */
    private UserVO createUser;

    /**
     * 已加入的用户数
     */
    private Integer hasJoinNum;

    /**
     * 是否已加入队伍
     */
    private boolean hasJoin = false;

    public TeamUserVO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getMaxNum() {
        return this.maxNum;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public UserVO getCreateUser() {
        return this.createUser;
    }

    public Integer getHasJoinNum() {
        return this.hasJoinNum;
    }

    public boolean isHasJoin() {
        return this.hasJoin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setCreateUser(UserVO createUser) {
        this.createUser = createUser;
    }

    public void setHasJoinNum(Integer hasJoinNum) {
        this.hasJoinNum = hasJoinNum;
    }

    public void setHasJoin(boolean hasJoin) {
        this.hasJoin = hasJoin;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamUserVO)) return false;
        final TeamUserVO other = (TeamUserVO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$maxNum = this.getMaxNum();
        final Object other$maxNum = other.getMaxNum();
        if (this$maxNum == null ? other$maxNum != null : !this$maxNum.equals(other$maxNum)) return false;
        final Object this$expireTime = this.getExpireTime();
        final Object other$expireTime = other.getExpireTime();
        if (this$expireTime == null ? other$expireTime != null : !this$expireTime.equals(other$expireTime))
            return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$createUser = this.getCreateUser();
        final Object other$createUser = other.getCreateUser();
        if (this$createUser == null ? other$createUser != null : !this$createUser.equals(other$createUser))
            return false;
        final Object this$hasJoinNum = this.getHasJoinNum();
        final Object other$hasJoinNum = other.getHasJoinNum();
        if (this$hasJoinNum == null ? other$hasJoinNum != null : !this$hasJoinNum.equals(other$hasJoinNum))
            return false;
        if (this.isHasJoin() != other.isHasJoin()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamUserVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $maxNum = this.getMaxNum();
        result = result * PRIME + ($maxNum == null ? 43 : $maxNum.hashCode());
        final Object $expireTime = this.getExpireTime();
        result = result * PRIME + ($expireTime == null ? 43 : $expireTime.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $createUser = this.getCreateUser();
        result = result * PRIME + ($createUser == null ? 43 : $createUser.hashCode());
        final Object $hasJoinNum = this.getHasJoinNum();
        result = result * PRIME + ($hasJoinNum == null ? 43 : $hasJoinNum.hashCode());
        result = result * PRIME + (this.isHasJoin() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "TeamUserVO(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", maxNum=" + this.getMaxNum() + ", expireTime=" + this.getExpireTime() + ", userId=" + this.getUserId() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", createUser=" + this.getCreateUser() + ", hasJoinNum=" + this.getHasJoinNum() + ", hasJoin=" + this.isHasJoin() + ")";
    }
}
