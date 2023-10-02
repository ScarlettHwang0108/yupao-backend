package com.yupi.yupao.model.request;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class TeamQuitRequest implements Serializable {

    // 开发者 [coder_yupi](https://space.bilibili.com/12890453/)

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    private Long teamId;

    public TeamQuitRequest() {
    }

    public Long getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamQuitRequest)) return false;
        final TeamQuitRequest other = (TeamQuitRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$teamId = this.getTeamId();
        final Object other$teamId = other.getTeamId();
        if (this$teamId == null ? other$teamId != null : !this$teamId.equals(other$teamId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamQuitRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $teamId = this.getTeamId();
        result = result * PRIME + ($teamId == null ? 43 : $teamId.hashCode());
        return result;
    }

    public String toString() {
        return "TeamQuitRequest(teamId=" + this.getTeamId() + ")";
    }
}
