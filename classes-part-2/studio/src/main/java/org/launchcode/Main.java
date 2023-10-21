package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Pepperoni Pizza", 7.39, "The classic slice, hot and delicious!", "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", 6.89, "A St. Louis favorite, served with a side of marinara.", "appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", 4.99, "The ooiest, gooiest dessert this side of the Mississippi.", "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", 6.39, "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo.", "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", 4.59, "Hot, garlicky carbs FTW.", "appetizer");

//        System.out.println(item1.isNew());
//
//        System.out.println(item1.toString());

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item4);

        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Garlic Breadsticks", 4.59, "Hot, garlicky carbs FTW.", "appetizer");

        System.out.println(item5.equals(item6));

        menu.addItem(item6);

        System.out.println(menu);

    }
}
