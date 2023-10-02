package com.yupi.yupao.common;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;

    public PageRequest() {
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageRequest)) return false;
        final PageRequest other = (PageRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getPageSize() != other.getPageSize()) return false;
        if (this.getPageNum() != other.getPageNum()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getPageSize();
        result = result * PRIME + this.getPageNum();
        return result;
    }

    public String toString() {
        return "PageRequest(pageSize=" + this.getPageSize() + ", pageNum=" + this.getPageNum() + ")";
    }
}
