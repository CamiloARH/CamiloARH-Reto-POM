package co.com.sofka.model;

import co.com.sofka.util.*;

public class DespegarModel {
    private String origen;
    private String destiny;
    private Integer firstDay;
    private String firstMonth;
    private Integer firstYear;
    private Integer lastDay;
    private String lastMonth;
    private Integer lastYear;
    private Banks bancoPse;
    private String name;
    private String lastName;
    private Documents documents;
    private State state;
    private City city;
    private String address;
    private Gender gender;
    private String birthday;
    private String birthMont;
    private String birthYear;
    private String email;
    private Phone phone;
    private String area;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Integer getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Integer firstDay) {
        this.firstDay = firstDay+1;
    }

    public String getFirstMonth() {
        return firstMonth;
    }

    public void setFirstMonth(String firstMonth) {
        this.firstMonth = firstMonth;
    }

    public Integer getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(Integer firstYear) {
        this.firstYear = firstYear;
    }

    public Integer getLastDay() {
        return lastDay;
    }

    public void setLastDay(Integer lastDay) {
        this.lastDay = lastDay+1;
    }

    public String getLastMonth() {
        return lastMonth;
    }

    public void setLastMonth(String lastMonth) {
        this.lastMonth = lastMonth;
    }

    public Integer getLastYear() {
        return lastYear;
    }

    public void setLastYear(Integer lastYear) {
        this.lastYear = lastYear;
    }

    public Banks getBancoPse() {
        return bancoPse;
    }

    public void setBancoPse(Banks bancoPse) {
        this.bancoPse = bancoPse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Documents getDocuments() {
        return documents;
    }

    public void setDocuments(Documents documents) {
        this.documents = documents;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthMont() {
        return birthMont;
    }

    public void setBirthMont(String birthMont) {
        this.birthMont = birthMont;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
