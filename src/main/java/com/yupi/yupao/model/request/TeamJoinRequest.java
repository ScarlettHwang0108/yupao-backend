package com.yupi.yupao.model.request;

// 本项目_所属 [程序员鱼皮](https://github.com/liyupi)

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;

    public TeamJoinRequest() {
    }

    public Long getTeamId() {
        return this.teamId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamJoinRequest)) return false;
        final TeamJoinRequest other = (TeamJoinRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamJoinRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    public String toString() {
        return "TeamJoinRequest(teamId=" + this.getTeamId() + ", password=" + this.getPassword() + ")";
    }
}
