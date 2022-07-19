package MementoPattern;

import java.util.Stack;


class TextUndoCareTaker {
 private Stack<TextMemento> _mementos;

 public TextUndoCareTaker() {
     _mementos = new Stack<TextMemento>();
 }

 

 public void setMemento(TextMemento memento) {
     _mementos.push(memento);
 }

 public TextMemento getMemento() {
     return _mementos.pop();
 }
}