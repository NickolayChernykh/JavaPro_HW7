package com.company.game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Chernykh on 16.09.2022
 */
public class FieldOfDreams {

  private String[] wordList = {"apple", "orange", "lemon", "banana",
      "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
      "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
      "pineapple", "pumpkin", "potato"};

  private void guesser() {
    greeting();
    Scanner scanner = new Scanner(System.in);
    String ansWord = randomWord();
    System.out.println(ansWord);
    System.out.println("Угадай слово. Это скорее всего овощ или фрукт.");
    System.out.println("Введи свой вариант:");
    String userWord = scanner.next();
    String result = ansWord.contains(userWord) ? "Угадал с первого раза"
        : "C первого раза не получилось, продолжай!!!";
    System.out.println(result);

    while (!ansWord.equals(userWord)) {
      System.out.println("Введи свой вариант:");
      userWord = scanner.next();
      for (int i = 0; i < 15; i++) {
        if (ansWord.equals(userWord)) {
          System.out.println("Правильно! Ответ \"" + ansWord + "\"");
          break;
        }
        int ansLength = ansWord.length();
        int userLength = userWord.length();
        if (i < ansLength && i < userLength && ansWord.charAt(i) == userWord.charAt(i)) {
          System.out.print(ansWord.charAt(i));
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }

  private String randomWord() {
    Random random = new Random();
    int wrd = random.nextInt(wordList.length);
    return wordList[wrd];
  }

  private void greeting() {
    System.out.println();
    String greeting = "Welcome Field Of dreams!";
    System.out.println(greeting);
    for (int i = 0; i < greeting.length(); i++) {
      System.out.print("=");
    }
    System.out.println();
  }

  public void start() {
    guesser();
  }
}