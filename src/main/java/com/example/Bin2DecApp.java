package com.example;

import com.example.services.Bin2DecService;
import com.example.utils.DependencyContainer;

public class Bin2DecApp {

  private final Bin2DecService service;

  public Bin2DecApp(Bin2DecService service) { this.service = service; }

  public void run() { service.runService(); }

  public static void main(String[] args) {

    DependencyContainer container = new DependencyContainer();

    Bin2DecApp app = new Bin2DecApp(container.createService());

    app.run();
  }
}
