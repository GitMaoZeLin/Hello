package com.tt.data.pojo;

import java.io.Serializable;

/**
 * @作者：mzl
 * @时间：2018/11/19 19:54
 * @描述：实体类Teachers 映射的使数据库ruan1中user表
 */
public class User implements Serializable{
    private Integer userId;
    private String userName;
    private String userPwd;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
