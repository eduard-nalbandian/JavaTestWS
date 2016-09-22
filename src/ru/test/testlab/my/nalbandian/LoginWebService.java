package ru.test.testlab.my.nalbandian;

/**
 * Created by Eduard Nalbandian on 22.09.2016.
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface LoginWebService {
    @WebMethod
    public String ReadLoginAndPassword(String login, String password);
}
