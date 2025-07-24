package com.example.validators;

import com.example.interfaces.Validator;

public class Bin2DecValidator implements Validator {

  @Override
  public boolean validate(String binary) throws IllegalArgumentException {

    return binary.matches("^[01]{8}$");
  }
}
