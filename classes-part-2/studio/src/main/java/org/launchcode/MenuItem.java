package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.dateAdded = LocalDate.now();
        //test isNew() to be false
        //this.dateAdded = LocalDate.parse("2022-06-12");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" +
                description +
               " | $" + price ;
    }

    @Override
    public boolean equals (Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if(toBeCompared == null) {
            return false;
        }
        if(getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItems = (MenuItem) toBeCompared;
        return this.name.equals(otherItems.getName());
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
}

