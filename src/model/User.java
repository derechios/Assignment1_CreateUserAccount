package model;

import java.io.Serializable;

/**
 * Created by tkanchanawanchai6403 on 6/29/2016.
 */
public class User extends Person implements Serializable, Comparable<User> {
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String photo;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String email, String phone, String password, String photo) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public User(String firstName, String lastName, String dob, String gender, String userName, String email, String phone, String password, String photo) {
        super(firstName, lastName, dob, gender);
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean equals(User user) {
        return(this.userName.equals(user.userName));
    }

    @Override
    public int compareTo(User user) {
        return(this.userName.compareTo(user.userName));
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }


}
