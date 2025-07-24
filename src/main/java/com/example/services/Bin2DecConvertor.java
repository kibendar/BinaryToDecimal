package com.example.services;

import com.example.interfaces.Convertor;

public class Bin2DecConvertor implements Convertor {

  @Override
  public int convert(String binary) {

    int decimal = 0;

    for (char c : binary.toCharArray())
      decimal = decimal * 2 + (c - '0');

    return decimal;
  }
}
