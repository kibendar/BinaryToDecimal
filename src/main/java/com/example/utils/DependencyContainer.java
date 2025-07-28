package com.example.utils;

import com.example.interfaces.Convertor;
import com.example.interfaces.Input;
import com.example.interfaces.Validator;
import com.example.services.Bin2DecConvertor;
import com.example.services.Bin2DecInput;
import com.example.services.Bin2DecService;
import com.example.validators.Bin2DecValidator;

public class DependencyContainer {

  public Input getInput() { return new Bin2DecInput(); }

  public Convertor getConvertor() { return new Bin2DecConvertor(); }

  public Validator getValidator() { return new Bin2DecValidator(); }

  public Bin2DecService createService() {
    return new Bin2DecService(getInput(), getConvertor(), getValidator());
  }
}
