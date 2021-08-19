package com.seleniummaster.project1;



public class MaharaTestRunner {
    public static void main(String[] args) {

        LoginUser loginUser=new LoginUser("student","MaharaDemo");
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser("https://demo.mahara.org/");
        functionLibrary.login(loginUser);
        functionLibrary.logOut();
        functionLibrary.closeBrowser();

    }
}
