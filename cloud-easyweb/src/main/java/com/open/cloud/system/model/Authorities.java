package com.open.cloud.system.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.security.core.GrantedAuthority;

import java.util.Date;

@TableName("sys_authorities")
public class Authorities implements GrantedAuthority {
    private static final long serialVersionUID = -6058060376656180793L;
    @TableId(type = IdType.INPUT)
    private String authority;

    private String authorityName;

    private Date createTime;

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
