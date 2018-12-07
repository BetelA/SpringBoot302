package com.example.demo;

import com.intellij.javaee.model.xml.persistence.mapping.GenerationType;
import org.intellij.lang.annotations.Identifier;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

@Entity

public class Job {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(@NotNull String employer) {
        this.employer = employer;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String employer;

    @NotNull
    @Size(min = 10)
    private String description;





}
