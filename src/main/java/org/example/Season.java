package org.example;

public enum Season {
    SPRING("Warm"),SUMMER("Hot"),AUTUMN("Cool"),WINTER("Cold");
    private final String description;
    Season(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
