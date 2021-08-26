package com.grandaniel;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class StackTest {

  public Stack CreateStack() {
    return new Stack();
  }

  @Test
  public void Stack_IsPresent() {
    Stack s = CreateStack();

    assertTrue(s != null);
    assertTrue(s.GetSize() == 0);
  }

  @Test
  public void Stack_pushNumber() {
    Stack stack = CreateStack();
    stack.push(11);
    stack.push(14);
    stack.push(16);

    assertTrue(stack.GetTop() == 16);
  }

  @Test
  public void Stack_popNumber() {
    Stack stack = CreateStack();
    stack.push(12);
    stack.push(13);
    stack.push(15);
    stack.pop();

    assertTrue(stack.GetTop() == 13);
  }

  @Test
  public void Stack_PushPopSize() {
    Stack stack = CreateStack();
    for (int i = 0; i < 1000; i++)

      stack.push(54 + i);
    for (int i = 0; i < 600; i++)
      stack.pop();

    assertTrue(stack.GetSize() == 400);
  }
}
