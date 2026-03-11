package org.example;

public interface IAuthenticationService {
    User signUp(string username, string password);
    User logIn(string username, string password);
}
