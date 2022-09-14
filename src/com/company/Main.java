package com.company;

public class Main {

  public static void main(String[] args) {
    findSymbolOccurance("Молоко", 'о');

  }

  static void findSymbolOccurance(String word, char ch) {
    int counter = 0;
    char[] strWorld = word.toCharArray();
    for (int i = 0; i < strWorld.length; i++) {
      if (strWorld[i] == ch) {
        counter++;
      }
    }
    System.out.println(
        "Количество символов " + "'" + ch + "'" + " в слове " + word + " = " + counter);
  }

  static void findWordPosition(String source, String target) {

  }
}

