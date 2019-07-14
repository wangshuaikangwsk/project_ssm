package com.wsk.project_ssm.entity;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private int id;
    private String name;
    private int sex;
    private Date birthday;
    private int classid;
    private String hobbys;
    private String create_time;
    private int jianjie;

    public Person(int id, String name, int sex, Date birthday, int classid, String hobbys, String create_time, int jianjie) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.classid = classid;
        this.hobbys = hobbys;
        this.create_time = create_time;
        this.jianjie = jianjie;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getJianjie() {
        return jianjie;
    }

    public void setJianjie(int jianjie) {
        this.jianjie = jianjie;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", classid=" + classid +
                ", hobbys='" + hobbys + '\'' +
                ", create_time='" + create_time + '\'' +
                ", jianjie=" + jianjie +
                '}';
    }
}
