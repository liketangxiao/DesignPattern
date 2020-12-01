package com.design.behavior.visitor.design.user;

import com.design.behavior.visitor.design.visitor.IVisitor;

/**
 * @author wangyuj
 * @date 2020/12/1
 **/
public abstract class User {
    public String name;      // 姓名
    public String identity;  // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
    public String clazz;     // 班级

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    public abstract void accept(IVisitor visitor);
}
