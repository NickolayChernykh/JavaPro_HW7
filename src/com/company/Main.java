package com.company;

public class Main {

  public static void main(String[] args) {
    findSymbolOccurance("молоко", 'о');

  }

  static void findSymbolOccurance(String word, char ch) {
    int counter = 0;
    if (word == null) {
      System.out.println("В методе пустая строка!");
      return;
    }
    char[] strWorld = word.toCharArray();
    for (char c : strWorld) {
      if (c == ch) {
        counter++;
      }
    }
    System.out.println("Количество символов " + "'" +
        ch + "'" + " в слове " + word + " = " + counter);
  }

  static void findWordPosition(String source, String target) {

  }
}

