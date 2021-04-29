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
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getNationalIdentityNumber() {
        return super.getNationalIdentityNumber();
    }

    @Override
    public void setNationalIdentityNumber(String nationalIdentityNumber) {
        super.setNationalIdentityNumber(nationalIdentityNumber);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getContact() {
        return super.getContact();
    }

    @Override
    public void setContact(String contact) {
        super.setContact(contact);
    }

    @Override
    public String getDescreption() {
        return DESCREPTION;
    }


}
