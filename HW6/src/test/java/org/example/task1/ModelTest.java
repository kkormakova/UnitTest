package org.example.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    Model model = new Model();
    int[] testFirstList = {1, 2, 3};
    int[] testSecondList = {4, 5, 6};

    @Test
    void getAverage() {

        int expectedAverage = 2;
        int actualAverage = model.getAverage(testFirstList);
        assertEquals(expectedAverage,actualAverage,"Не верный расчет среднего значения");
    }

    @Test
    void compareAverages() {

        String expectedFirstBigger = "Первый список имеет большее среднее значение";
        int averageFirstCase1 = 7;
        int averageSecondCase1 = 5;
        String actualFirstBigger = model.compareAverages(averageFirstCase1,averageSecondCase1);

        String expectedSecondBigger = "Второй список имеет большее среднее значение";
        int averageFirstCase2 = 7;
        int averageSecondCase2 = 15;
        String actualSecondBigger = model.compareAverages(averageFirstCase2,averageSecondCase2);

        String expectedEquals = "Средние значения равны";
        int averageFirstCase3 = 7;
        int averageSecondCase3 = 7;
        String actualEquals = model.compareAverages(averageFirstCase3,averageSecondCase3);
        assertEquals(expectedFirstBigger,actualFirstBigger,"неверно сравнивает при большем первом значении");
        assertEquals(expectedSecondBigger,actualSecondBigger,"неверно сравнивает при большем втором значении");
        assertEquals(expectedEquals,actualEquals, "неверно сравнивает при равных значениях");
    }
}