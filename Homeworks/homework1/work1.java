package Homeworks.homework1;

import java.util.Scanner;

public class work1 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Введите число n, для которого хотите получить треугольное число: ");
        int n = scan.nextInt();

        System.out.printf("Если хотите получить одно число, введите 0. Если хотите \nувидеть последовательность треугольных чисел от 1 до n, введите 1: ");
        int choise = scan.nextInt();
        if (choise == 0) {
            ;
            System.out.printf("Треугольное число для %d равняется %d", n, TriangularNumber(n));
        } else {
            if (choise == 1) {
                System.out.println(Output(TriangularSequence(n)));
            }
            else {
                System.out.println("Ошибка: недопустимое значение!");
            }
        }
    }
    public static int TriangularNumber (int num) {
        int result = num*(num+1)/2;
        return result;
    }
    public static int[] TriangularSequence (int num) {
        int[] massive = new int[num];
        int count = 1;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = TriangularNumber(count);
            count++;
        }
        return massive;        
    }
    public static String Output (int[] data) {
        String output = "";
        int count = data.length;
    
        int index = 0;
        while (index < count) {
          output += data[index] + " ";
          index = index + 1;
        }
        return output;
      }
}
