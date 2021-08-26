package com.grandaniel;

import java.util.ArrayList;

public class Stack {

  private int Top;
  private ArrayList<Integer> List;

  public Stack() {
    List = new ArrayList<>();
  }

  
  public void push(int number) {
    List.add(number);
    Top = number;
  }

  public void pop() {
    List.remove(List.size() - 1);
    Top = List.get(List.size() - 1);
  }


  public int GetTop() {
    return Top;
  }

  public int GetSize() {
    return List.size();
  }
}
