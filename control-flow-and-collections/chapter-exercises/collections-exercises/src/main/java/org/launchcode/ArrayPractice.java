package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String greenEggsAndHam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = greenEggsAndHam.split(" ");
        System.out.println(Arrays.toString(words));
        //System.out.println(words.length);

        String[] sentences = greenEggsAndHam.split("\\.");
        System.out.println(Arrays.toString(sentences));
        //System.out.println(sentences.length);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(sumEven(numbers));

//        ArrayList<String> wordArr = new ArrayList<>();
//        wordArr.add("something");
//        wordArr.add("five");
//        wordArr.add("anything");
//        wordArr.add("okay");
//        wordArr.add("dog");
//        wordArr.add("cat");
//        wordArr.add("woof");
        ArrayList<String> wordArr = stringToArrayList(greenEggsAndHam);
        //fiveLetters(wordArr);
        studentById();
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void fiveLetters(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired word length: ");
        int wordLength = input.nextInt();

        for (String word : arr) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }

        input.close();
    }

    public static ArrayList<String> stringToArrayList(String input) {
        String[] words = input.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        return wordList;
    }

    public static void studentById() {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

        System.out.println("Enter your students id (or ENTER to finish):");

        do {
            System.out.println("Student Name:");
            studentName = input.nextLine();

            if (!studentName.isEmpty()) {
                System.out.println("Student Id:");
                Integer studentId = input.nextInt();
                students.put(studentId, studentName);
                input.nextLine();
            }
        } while (!studentName.isEmpty());
        input.close();
        System.out.println("\nStudents:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s Id: " + student.getKey());
        }
        System.out.println("\nNumber of students: " + students.size());
    }
}