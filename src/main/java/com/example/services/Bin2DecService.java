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

  public void run() {

    String binary;

    try {
      while (true) {

        binary = input.getInput();

        if (validator.validate(binary)) {
          System.out.printf("The result is: %d", convertor.convert(binary));

          break;
        } else {
          System.out.printf("\nInvalid input: %s"
                                + "\nYour binary should:"
                                + "\n- have length of 8"
                                + "\n- contain only 0 and 1"
                                + "\nTry again.\n",
                            binary);
        }
      }
    } finally {
      if (input instanceof Bin2DecInput)
        ((Bin2DecInput)input).closeScanner();
    }
  }
}
