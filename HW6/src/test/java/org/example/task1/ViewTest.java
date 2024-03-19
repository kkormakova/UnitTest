package org.example.task1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;

class ViewTest {
    View view = new View();

    @Test
    void getListTest() {
        int[] expected = {1,2,3};
        ByteArrayInputStream in = new ByteArrayInputStream("1 2 3\n".getBytes());
        System.setIn(in);
        int[] actual = view.getList();

        assertArrayEquals(expected,actual,"Заполнение листа не корректно");
        System.setIn(System.in);
    }


}