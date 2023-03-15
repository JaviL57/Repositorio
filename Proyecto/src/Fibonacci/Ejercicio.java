package Fibonacci;

import java.util.Scanner;

public class Ejercicio {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese el número de elementos de la serie: ");
      int n = sc.nextInt();
      int t1 = 0, t2 = 1;
      System.out.print("Los " + n + " primeros términos de la serie de Fibonacci son:");

      for (int i = 1; i <= n; ++i) {
         System.out.print(t1 + " ");
         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
      }
   }
}

