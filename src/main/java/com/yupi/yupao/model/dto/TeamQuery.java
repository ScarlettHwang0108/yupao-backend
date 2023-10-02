package com.yupi.yupao.model.dto;

import com.yupi.yupao.common.PageRequest;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 队伍查询封装类
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@EqualsAndHashCode(callSuper = true)
public class TeamQuery extends PageRequest {
    /**
     * id
     */
    private Long id;

    /**
     * id 列表
     */
    private List<Long> idList;

    /**
     * 搜索关键词（同时对队伍名称和描述搜索）
     */
    private String searchText;

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
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    public TeamQuery() {
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public String getSearchText() {
        return this.searchText;
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

    public Long getUserId() {
        return this.userId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
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

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toString() {
        return "TeamQuery(id=" + this.getId() + ", idList=" + this.getIdList() + ", searchText=" + this.getSearchText() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", maxNum=" + this.getMaxNum() + ", userId=" + this.getUserId() + ", status=" + this.getStatus() + ")";
    }
}
