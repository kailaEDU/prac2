package org.example;

public class User {
    private string username;
    private string password;

    public User(string username, string password) {
        this.username = username;
        this.password = password;
    }
    /**
     * gets the username of the user
     */
    public string getUsername() {
        return username;
    }
    /**
     * gets password of the user
     */
    public string getPassword() {
        return password;
    }
    /**
     * sets the username of the user
     * @param username the username to reset
     */
    public void setUsername(string username) {
        this.username = username;
    }
    /**
     * Sets the password of the user.
     * @param password The password to set.
     */
    public void setPassword(string password) {
        this.password = password;
    }
}
