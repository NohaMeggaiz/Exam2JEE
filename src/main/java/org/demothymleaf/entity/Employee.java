package org.demothymleaf.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Table
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    private String Role;


    @ElementCollection
    private List<String> skills;
    @ManyToMany
    @JoinTable(
            name = "emp_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;

    public Employee() {
        this.skills = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public Employee(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = new ArrayList<>();
        this.projects = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    // Utility methods to manage the bi-directional relationship

    public void addProject(Project project) {
        this.projects.add(project);
        if (!project.getEmployees().contains(this)) {
            project.getEmployees().add(this);
        }
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
        project.getEmployees().remove(this);
    }
}
