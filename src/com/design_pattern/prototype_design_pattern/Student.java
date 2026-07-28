package com.design_pattern.prototype_design_pattern;

public class Student implements ClonePrototype {

    int id;
    String name;
    Long mobileNo;
    private int userId;

    public Student(int id, String name, long mobileNo, int userId) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.userId = userId;
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
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }


    @Override
    public ClonePrototype clone() {
        return new Student(id,name,mobileNo,userId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", userId=" + userId +
                '}';
    }
}
