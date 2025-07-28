package com.example.interfaces;

public interface Input extends AutoCloseable {

  String getInput();

  void close();
}
