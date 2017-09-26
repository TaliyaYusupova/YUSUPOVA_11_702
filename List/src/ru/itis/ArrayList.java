package ru.itis;

public class ArrayList {
    int array[] = new int[10];
    int count = 0;

    void addToEand(int element) {
        if (count < array.length) {
            array[count] = element;
            count++;
        } else {
            System.err.println("НЕт места");
        }
    }

    void showList() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i] + " ");

        }
    }
}

