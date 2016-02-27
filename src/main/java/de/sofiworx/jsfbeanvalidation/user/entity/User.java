package de.sofiworx.jsfbeanvalidation.user.entity;

/**
 * @author Ulrich Cech
 */
public class User {

    private String username;

    private String email;

    private String gender;


    public User() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
