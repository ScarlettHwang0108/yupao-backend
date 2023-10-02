package com.yupi.yupao.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 队伍实体
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@TableName(value = "team")
public class Team implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 队伍名称
     */
    private String name;

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
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Team() {
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

    public String getPassword() {
        return this.password;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public Integer getIsDelete() {
        return this.isDelete;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Team)) return false;
        final Team other = (Team) o;
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
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$isDelete = this.getIsDelete();
        final Object other$isDelete = other.getIsDelete();
        if (this$isDelete == null ? other$isDelete != null : !this$isDelete.equals(other$isDelete)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Team;
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
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $isDelete = this.getIsDelete();
        result = result * PRIME + ($isDelete == null ? 43 : $isDelete.hashCode());
        return result;
    }

    public String toString() {
        return "Team(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", maxNum=" + this.getMaxNum() + ", expireTime=" + this.getExpireTime() + ", userId=" + this.getUserId() + ", status=" + this.getStatus() + ", password=" + this.getPassword() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", isDelete=" + this.getIsDelete() + ")";
    }
}
