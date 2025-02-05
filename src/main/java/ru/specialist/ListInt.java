package ru.specialist;

public class ListInt {
    public NodeInt first = null;
    public int size = 0;

    public boolean contains(int value) {
        var node = first;
        while(node != null) {
            if (node.value == value) return true;
            node = node.next;
        }

        return false;
    }
    public int indexOf(int value) {
        var node = first;
        int index = 0;
        while(node != null) {
            if (node.value == value) return index;
            node = node.next;
            index++;
        }

        return -1;
    }
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        var node = first;
        while(node != null && index != 0) {
            node = node.next;
            index--;
        }

        return node.value;
    }
}
