package com.revature.models;

public class User implements Comparable<User>{

    // Let's start by defining all of the fields for our user

    private int userId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;

    private static int userIdCounter = 1;

    // Constructors
    // By default there is a no-args constructor in this class let's add a constructor for every parameter
    // except userId and role
    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        // We don't want to take in userId or role because we want these to be set to a default value
        this.role = Role.USER;
        // UserId should be unique across all users and every user needs one
        this.userId = userIdCounter;
        userIdCounter++;
    }
    public User(){

    }

    // Mutators (Getters and Setters)
    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    // Everything below was automatically generated by IntelliJ
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // Generate a toString method
    // Recall this comes from the Object class which all classes inherit from

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public int compareTo(User o) {

        // What is the COMPARABLE Interface? Why is it important? What do we use it for?
        // Comparable is an Interface used to define the NATURAL ordering of a class (the default way you want
        // objects of this class sorted).

        // For users I want them sorted by their UserIds

        // compareTo is a method that takes in an object of the same type and allows you to perform some operation for
        // sorting

        // Positive numbers means this comes after
        // Negative numbers means this comes before
        // 0 means they have the same ranking
        if (this.getUserId() > o.getUserId()){
            return 1;
        } else if( this.getUserId() < o.getUserId()){
            return -1;
        } else{
            return 0;
        }
    }
}