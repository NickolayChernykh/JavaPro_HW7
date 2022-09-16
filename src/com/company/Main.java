package com.company;

import com.company.game.FieldOfDreams;
import com.company.strings.Strings;

public class Main {

  public static void main(String[] args) {

    FieldOfDreams game = new FieldOfDreams();
    Strings strings = new Strings();

    strings.start();
    game.start();


  }
}


