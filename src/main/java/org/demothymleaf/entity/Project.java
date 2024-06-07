package org.demothymleaf.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;


@Table
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double budget;

    @ManyToMany(mappedBy = "projects")

    private List<Employee> employees;

    public Project() {
        this.employees = new ArrayList<>();
    }

    public Project(Long id, String name, double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.employees = new ArrayList<>();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Utility methods to manage the bi-directional relationship

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        if (!employee.getProjects().contains(this)) {
            employee.getProjects().add(this);
        }
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
        employee.getProjects().remove(this);
    }
}
