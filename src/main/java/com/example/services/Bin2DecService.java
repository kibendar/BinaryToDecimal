package com.example.services;

import com.example.interfaces.Convertor;
import com.example.interfaces.Input;
import com.example.interfaces.Validator;

public class Bin2DecService {

  private final Input input;
  private final Convertor convertor;
  private final Validator validator;

  public Bin2DecService(Input input, Convertor convertor, Validator validator) {
    this.input = input;
    this.convertor = convertor;
    this.validator = validator;
  }

  private void whileInvalidInput() {
    try (Input ipnut = input) {

      String binary;

      while (true) {
        binary = input.getInput();

        if (validator.validate(binary)) {

          throwResult(convertor.convert(binary));

          break;
        } else {

          throwError(binary);
        }
      }
    }
  }

  private void throwResult(int result) {
    System.out.printf("\nThe result is: %d", result);
  }

  private void throwError(String invalidInput) {
    System.out.printf("\nInvalid input: %s"
                          + "\nYour binary should:"
                          + "\n- have length of 8"
                          + "\n- contain only 0 and 1\n"
                          + "\nTry again.\n",
                      invalidInput);
  }

  public void runService() { whileInvalidInput(); }
}
