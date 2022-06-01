package org.example;

import java.time.LocalDate;

public class BankCardsInformation {

    private int id;
    private String name;
    private int cvv;
    private String cardNumber;
    private LocalDate date;
    private double balance;
    private String login;

    public BankCardsInformation(){

    }

    public BankCardsInformation(String name, int cvv, String cardNumber, LocalDate date, double balance, String login) {
        this.name = name;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.date = date;
        this.balance = balance;
        this.login = login;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    @Override
    public String toString() {
        return "BankCardsInformation{" +
                "name='" + name + '\'' +
                ", cvv=" + cvv +
                ", cardNumber='" + cardNumber + '\'' +
                ", date=" + date +
                ", balance=" + balance +
                '}';
    }
}
