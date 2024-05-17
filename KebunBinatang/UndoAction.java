package KebunBinatang;

class UndoAction {
    enum Type {
        ADD, SWIPE, SWAP
    }

    private Type type;
    private int index;
    private int index1;
    private int index2;

    UndoAction(Type type, int index) {
        this.type = type;
        this.index = index;
    }

    UndoAction(Type type, int index1, int index2) {
        this.type = type;
        this.index1 = index1;
        this.index2 = index2;
    }

    public Type getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }
}
