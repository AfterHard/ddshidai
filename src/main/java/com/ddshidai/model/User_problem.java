package com.ddshidai.model;

import java.util.Date;

public class User_problem {
    private Integer id;

    private Integer userId;

    private Integer problemFreeId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProblemFreeId() {
        return problemFreeId;
    }

    public void setProblemFreeId(Integer problemFreeId) {
        this.problemFreeId = problemFreeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}