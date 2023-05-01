package org.example.sem2.hw2;
// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = sc.nextInt();
        int[] sequence = new int[n];
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        boolean isIncreasing = true;
        for (int i = 0; i < n - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Последовательность является возрастающей.");
        }
        else {
            System.out.println("Последовательность не является возрастающей.");
        }
    }
}
