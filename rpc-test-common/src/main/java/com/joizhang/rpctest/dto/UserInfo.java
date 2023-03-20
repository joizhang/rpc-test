package com.joizhang.rpctest.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    /**
     * 主键ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 随机盐
     */
    private String salt;

    /**
     * 锁定标记
     */
    private String lockFlag;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 0-正常，1-删除
     */
    private String delFlag;

}
