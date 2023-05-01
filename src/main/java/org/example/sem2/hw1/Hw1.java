package org.example.sem2.hw1;
// Дана последовательность N целых чисел. Найти сумму простых чисел.
// (Простым называется любое натуральное число, которое больше единицы
// и имеет два конкретных делителя: себя и единицу).
import java.util.Scanner;
public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = sc.nextInt();
        int[] sequence = new int[n];
        System.out.println("Введите последовательность чисел:");
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(sequence[i])) {
                sum += sequence[i];
            }
        }
        System.out.println("Сумма простых чисел в последовательности: " + sum);
    }
    // функция, которая проверяет, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

