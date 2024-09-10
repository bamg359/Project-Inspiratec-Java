package com.cesde.academic.domain;

public class UserAcademic {


    private int idUser;
    private String userName;
    private String lastName;
    private String email;
    private String phone;
    private String password;


    // Constructores

    public UserAcademic(){

    }

    public UserAcademic(int idUser, String userName, String lastName, String email, String phone, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
