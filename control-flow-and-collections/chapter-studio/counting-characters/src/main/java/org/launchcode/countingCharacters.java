package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter words:");
        String hiddenFigs = input.nextLine();
                //"If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = hiddenFigs.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < charactersInString.length; i++) {

            if (charMap.containsKey(charactersInString[i])) {
                counter = charMap.get(charactersInString[i]) + 1;
                charMap.put(charactersInString[i], counter);
                continue;
            }
            charMap.put(charactersInString[i], 1);
        }
        for (Map.Entry<Character, Integer> character : charMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}