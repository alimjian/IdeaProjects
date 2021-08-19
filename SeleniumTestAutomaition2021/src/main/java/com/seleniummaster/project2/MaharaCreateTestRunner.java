package com.seleniummaster.project2;

public class MaharaCreateTestRunner {
    public static void main(String[] args) {
        LoginUser loginUser=new LoginUser("alimjan","Alim8861@");
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser("http://mahara.unitedcoderschool.com/mahara/");
        functionLibrary.Login(loginUser);
    }
}
