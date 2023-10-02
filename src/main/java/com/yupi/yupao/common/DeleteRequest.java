package com.yupi.yupao.common;

import java.io.Serializable;

/**
 * 通用删除请求
 *
 */
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -5860707094194210842L;

    private long id;

    public DeleteRequest() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeleteRequest)) return false;
        final DeleteRequest other = (DeleteRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeleteRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        return result;
    }

    public String toString() {
        return "DeleteRequest(id=" + this.getId() + ")";
    }
}
