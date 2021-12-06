package com.torryharris.model;

public class User {
    String name;
    String emailId;
    int phoneNo;
    String passWord;

    public User(String name, String emailId, int phoneNo, String passWord) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNo=" + phoneNo +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
