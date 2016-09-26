package ru.test.testlab.my.nalbandian;

import javax.jws.WebService;

/**
 * Created by Eduard Nalbandian on 23.09.2016.
 */
@WebService (endpointInterface = "ru.test.testlab.my.nalbandian.LoginWebService")
public class ReadLoginAndPasswordImpl implements LoginWebService {
    @Override
    public String ReadLoginAndPassword(String login, String password) {

        if(CheckLogin()) {
            return "Hello" + login;
        } else {
            return  "Wrong login or password";
        }

    }

    private boolean CheckLogin() {
        return true;
    }
}
