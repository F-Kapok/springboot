package com.fans.common;

/**
 * className: CommonConstants
 *
 * @author k
 * @version 1.0
 * @description 系统通用字段
 * @date 2018-12-20 14:14
 **/
public class CommonConstants {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String JAR_JOB = "0";
    public static final String CLASS_JOB = "1";
    /**
     * session在线人数
     */
    public static final String ON_LINE_COUNT = "onLineCount";
    /**
     * session管理列表
     */
    public static final String LOGIN_MAP = "loginMap";

    public interface Role {
        /**
         * 普通用户
         */
        Integer ROLE_CUSTOMER = 0;
        /**
         * 管理员
         */
        Integer ROLE_ADMIN = 1;
    }
}
