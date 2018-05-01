package com.example.cascer.mvpdemo;

/**
 * Created by cascer on 01/05/18.
 */

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void doLogin(String email, String pass) {
        if (email.isEmpty()) {
            view.showErrorMessage("Email cannot be blank!");
            return;
        }
        if (pass.isEmpty()) {
            view.showErrorMessage("Password cannot br blank!");
            return;
        }
        if (userInvalid(email, pass)) view.openMainPage();
        else view.showErrorMessage("Email or Password invalid!");
    }

    private boolean userInvalid(String email, String pass) {
        return email.equalsIgnoreCase("ghafirin@me.abc")
                && pass.equalsIgnoreCase("123456");
    }
}
