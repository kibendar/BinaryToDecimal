package com.example;

import com.example.services.Bin2DecConvertor;
import com.example.services.Bin2DecInput;
import com.example.services.Bin2DecService;
import com.example.validators.Bin2DecValidator;

public class Bin2DecApp {

  private final Bin2DecService service;

  public Bin2DecApp(Bin2DecService service) { this.service = service; }

  public void run() { service.run(); }

  public static void main(String[] args) {

    Bin2DecApp app = new Bin2DecApp(new Bin2DecService(
        new Bin2DecInput(), new Bin2DecConvertor(), new Bin2DecValidator()));

    app.run();
  }
}
