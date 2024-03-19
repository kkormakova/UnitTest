package org.example.task1;

import java.util.Arrays;
import java.util.Scanner;

public class View {
    int[]list;
    public int[] getList (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для заполнения списка введите числа через пробел, в конце нажмите Enter: ");
        String [] userInput = scanner.nextLine().strip().split(" ");
        int [] numbers = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();
        this.list = numbers;
        return numbers;
    }
}