package by.java.EPAM._2_Algoritmization;
//Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( , , , ) 1 2 n a a  a .

import java.util.Scanner;

public class Task_2_1_8 {
    public static void main(String[] args) {
        int n=7, y=0, x=0;

        int[] arr = new int[n];
        System.out.print("Строка до сортировки    ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30));
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <arr.length ; i++) {
            y = arr[0];
            if (y>arr[i]){
                y = arr[i];
            }
        }
            System.out.println(y);
            System.out.println(x);


        }
    }
