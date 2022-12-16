package model;

import enums.Gender;

import java.math.BigDecimal;
import java.util.List;


public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private BigDecimal money;
    private List<Book> basket;

    public User(List<Book> basket) {
        this.basket = basket;
    }

    public User(Long id, String name, String surname, String email, String phoneNumber, Gender gender, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.money = money;
    }

    public User(long l, String samara, String nurlanova_, String s, String s1, Gender female, BigDecimal valueOf, User user) {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Book> getBasket() {
        return basket;
    }

    public void setBasket(List<Book> basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", money=" + money +
                '}';
    }
}
