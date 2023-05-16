package com.io.rest.bankApi.dto;

public class CustomerBankingInput {
    private String customerId;
    private String surname;
    private String creditScore;
    private String geography;
    private String gender;
    private String age;
    private String tenure;
    private String balance;
    private String hasCrCard;
    private String salary;
    private String satisfactionScore;
    private String cardType;
    private String points;



    public CustomerBankingInput() {
    }

    public String getHasCrCard() {
        return hasCrCard;
    }

    public void setHasCrCard(String hasCrCard) {
        this.hasCrCard = hasCrCard;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSatisfactionScore() {
        return satisfactionScore;
    }

    public void setSatisfactionScore(String satisfactionScore) {
        this.satisfactionScore = satisfactionScore;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}


