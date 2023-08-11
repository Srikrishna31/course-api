package io.javabrains.springbootquickstart.courseapi.topic;

import lombok.Getter;

public class Topic {
    @Getter
    private String id;

    public Topic() {}

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    private String name;
    private String description;

    public void setId(String id) {
        this.id = id;
    }
}
