package ru.test.testlab.my.nalbandian.client;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
// такой эксепшн возникнет при работе с объектом URL
import java.net.MalformedURLException;
import ru.test.testlab.my.nalbandian.LoginWebService;

/**
 * Created by Eduard Nalbandian on 25.09.2016.
 */
public class LoginWebServiceClient {
    public static void main(String[] args) {
        try {
            //задаем где wsdl
            URL url = new URL("http://localhost:1991/wss/login?wsdl");
            //задаем targetNAmespace и name
            QName qname = new QName("http://nalbandian.my.testlab.test.ru/", "ReadLoginAndPasswordImplService");
            //создаем команду сервиса
            Service service = Service.create(url, qname);
            //подключаем проимпортированое
            LoginWebService hello = service.getPort(LoginWebService.class);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String login;
            String password;
            System.out.println("Введите имя пользователя");
            login = reader.readLine();
            System.out.println("Введите пароль");
            //
            password = reader.readLine();
            System.out.println(hello.ReadLoginAndPassword(login, password));
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}
