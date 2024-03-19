package org.example.task1;

import java.util.Arrays;

public class Model {

    public int getAverage(int[]list){
        return Arrays.stream(list).sum() / list.length;
    }

    public String compareAverages(int first, int second) {
        String message = "";
        if (first > second) {
            message = "Первый список имеет большее среднее значение";
        }
        else if (first < second) {
            message =  "Второй список имеет большее среднее значение";

        } else {
            message =  "Средние значения равны";
        }
        return message;
    }
}