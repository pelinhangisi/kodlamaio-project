package com.pelinhangisi;

public class UserManager {
    public void add(User user){
        System.out.println(user.getFullName()+ " sisteme yeni kayıt gerçekleştirildi.");
    }

    public void login(User user){
        System.out.println(user.getFullName() + " sisteme giriş yaptı.");
    }

    public void logout(User user){
        System.out.println(user.getFullName() + " sistemden çıkış yaptı.");
    }
}
