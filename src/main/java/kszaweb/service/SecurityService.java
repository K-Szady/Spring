package kszaweb.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String userName, String password);
}
