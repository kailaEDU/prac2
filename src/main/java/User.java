public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    /**
     * gets the username of the user
     */
    public String getUsername() {
        return username;
    }
    /**
     * gets password of the user
     */
    public String getPassword() {
        return password;
    }
    /**
     * sets the username of the user
     * @param username the username to reset
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Sets the password of the user.
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
