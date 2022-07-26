package com.company.trainreservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name= "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="customer_id")
    private int id;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastname;

    private String email;

    private String password;

    private String mobile;

    public Customer() {
    }

    public Customer(String firstName, String lastname, String email, String password, String mobile) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public Customer(int id, String firstName, String lastname, String email, String password, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(firstName, customer.firstName) && Objects.equals(lastname, customer.lastname) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password) && Objects.equals(mobile, customer.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastname, email, password, mobile);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
