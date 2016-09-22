package ru.test.testlab.my.nalbandian;

/**
 * Created by Eduard Nalbandian on 23.09.2016.
 */
import ru.test.testlab.my.nalbandian.ReadLoginAndPasswordImpl;
import javax.xml.ws.Endpoint;

public class LoginWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1991/wss/login",new ReadLoginAndPasswordImpl());
    }
}
