package MementoPattern;

class TextOriginator {
    public String text;

    public int cursorPosition;

    private TextUndoCareTaker _textCareTaker;

    public TextOriginator() {
        _textCareTaker = new TextUndoCareTaker();
    }

    
    public void save() {
        TextMemento textMemento = new TextMemento();
        textMemento.cursorPosition = this.cursorPosition;
        textMemento.text = this.text;

        _textCareTaker.setMemento(textMemento);
    }

    
    public void undo() {
        TextMemento previousTextMemento = _textCareTaker.getMemento();

        cursorPosition = previousTextMemento.cursorPosition;
        text = previousTextMemento.text;
    }

    public String ToString() {
        return String.format("text: %s, cursor position: %d", text, cursorPosition);
    }
}
