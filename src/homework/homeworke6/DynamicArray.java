package homework.homeworke6;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index <= array.length - 1) {
            return array[index];
        } else {
            return -1;
        }
    }

    public void print() {
        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
