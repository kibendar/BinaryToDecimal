package com.example.services;

import com.example.interfaces.Input;
import java.util.Scanner;

public class Bin2DecInput implements Input {

  private final Scanner scan;

  public Bin2DecInput() { this.scan = new Scanner(System.in); }

  @Override
  public String getInput() {

    System.out.println("Enter binary number: ");

    Scanner scan = new Scanner(System.in);

    return scan.nextLine();
  }

  public void closeScanner() { scan.close(); }
}
