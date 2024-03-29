package com.edgetech.school.model;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private String description;
    private List<String> steps;

    public Course() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSteps() {
        return steps;
    }

    public Course(int id, String name, String description, List<String> steps) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return String.format("Course [id=%s, name=%s, description=%s, steps=%s]",
                id, name, description, steps);
    }
}
