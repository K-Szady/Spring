package kszaweb.service;

public interface SecurityService {
    String findLoggedInUserName();

    void autologin(String userName, String password);
}
