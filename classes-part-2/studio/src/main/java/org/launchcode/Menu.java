package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

//    public Menu() {
//        this.lastUpdated = d;
//        this.items = i;
//    }

//    public void setLastUpdated(Date lastUpdated) {
//        this.lastUpdated = lastUpdated;
//    }
//
//    public void setItems(ArrayList<MenuItem> items) {
//        this.items = items;
//    }
//
//    public Date getLastUpdated() {
//        return lastUpdated;
//    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\n-----TIM'S PIZZERIA MENU-----\n\n" +
                "~APPETIZERS~\n" + appetizers.toString() + "\n" +
                "~Main Courses~\n" + mainCourses.toString() + "\n" +
                "~Desserts~\n" + desserts.toString() + "\n";
    }

    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (items.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item: items) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }
}


