package com.company;

import com.company.game.Game;
import com.company.strings.Strings;

public class Main {

  public static void main(String[] args) {

    Game game = new Game();
    Strings strings = new Strings();

    game.start();
    strings.strStart();
  }
}


