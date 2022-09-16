package com.company.strings;

/**
 * Created by Chernykh on 16.09.2022
 */
public class Strings {

  public void start() {
    findSymbolOccurance("null", 'l');
    findWordPosition("Apollo", "pollo");
    findWordPosition("Apple", "Plant");
    stringReverse("Hello");
    isPalindrome("ERE");
    isPalindrome("Allo");
  }

  private void findSymbolOccurance(String word, char ch) {
    int counter = 0;
    if (isCheck(word)) {
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

  private void findWordPosition(String source, String target) {
    if (isCheck(source) || isCheck(target)) {
      return;
    }
    int index;
    if (source.contains(target)) {
      index = source.indexOf(target);
      System.out.println("Номер позиции (индекс) первого элемента подстроки "
          + target + " в строке " + source + " - " + index);
    } else {
      System.out.println(source.indexOf(target));
    }
  }

  private void stringReverse(String s) {
    if (isCheck(s)) {
      return;
    }
    System.out.println(getReverse(s));
  }

  private void isPalindrome(String s) {
    if (isCheck(s)) {
      return;
    }
    String another = String.valueOf(getReverse(s));
    boolean isFlag = another.contentEquals(s);
    System.out.println(isFlag);
  }

  private static boolean isCheck(String s) {
    if (s == null) {
      System.out.println("В параметрах метода null!");
      return true;
    }
    if (s.isEmpty()) {
      System.out.println("В параметрах метода пустая строка!");
      return true;
    }
    return false;
  }

  private static StringBuilder getReverse(String s) {
    return new StringBuilder(s).reverse();
  }
}
