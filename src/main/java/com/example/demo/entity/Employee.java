package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "GETALLEMPLOYEES", query = "select E from Employee E")
@Table(schema = "demojpaappschema1")
public class Employee {
    public Employee() {
    }

    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "fname")
    private String firstName;

    @Column(name = "lname")
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }
}
