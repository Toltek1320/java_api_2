package org.example.sem2.hw3;
// Дан массив целых чисел. Заменить отрицательные элементы на сумму
// индексов двузначных элементов массива.
import java.util.ArrayList;
import java.util.Scanner;
public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> twoDigitElements = new ArrayList<>();
        ArrayList<Integer> twoDigitIndexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                twoDigitElements.add(array[i]);
                twoDigitIndexes.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                int sum = 0;
                for (int j = 0; j < twoDigitElements.size(); j++) {
                    sum += twoDigitIndexes.get(j);
                }
                array[i] = sum;
            }
        }
        System.out.println("Массив после замены отрицательных элементов:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
