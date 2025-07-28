package com.example.services;

import com.example.interfaces.Input;
import java.util.Scanner;

public class Bin2DecInput implements Input {

  private final Scanner scan;

  public Bin2DecInput() { this.scan = new Scanner(System.in); }

  @Override
  public String getInput() {

    System.out.print("Enter binary number: ");

    return scan.next();
  }

  @Override
  public void close() {
    scan.close();
  }
}
