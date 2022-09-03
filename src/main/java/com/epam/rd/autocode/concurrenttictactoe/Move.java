package com.epam.rd.autocode.concurrenttictactoe;

import java.util.HashMap;
import java.util.Map;

public class Move {
    final int row;
    final int column;

    public Move(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public static void main(String[] args) {
        Map<Object,String> values = new HashMap<>();
        values.put("1","2");
        System.out.println(values.get(1));
    }
}
