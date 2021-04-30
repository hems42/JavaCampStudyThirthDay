package com.company.People;

public class User extends  Person{

    private static final String   DESCREPTION="USER";


    String userName;
    String userNickName;
    String userJoinDate;
    String password;
    String logo; // package has no bitmap  ı guess , cant find it...
    String userPasswordHint;


    // this class getter and setters...
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserJoinDate() {
        return userJoinDate;
    }

    public void setUserJoinDate(String userJoinDate) {
        this.userJoinDate = userJoinDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUserPasswordHint() {
        return userPasswordHint;
    }

    public void setUserPasswordHint(String userPasswordHint) {
        this.userPasswordHint = userPasswordHint;
    }





    // super class overrides...

    @Override
    public String getDescreption() {
        return DESCREPTION;
    }

}
