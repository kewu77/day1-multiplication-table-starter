package com.tw;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
//        String multiplicationTable = builder.build(start, end);

        System.out.println(builder.generateMultiplicationRows(2,4,true));
    }

    public boolean checkNumber(int start, int end){
        return start >= end && start > 1 && start <= 1000 && end > 1 && end <= 1000;
    }

    public String generateRow(int start, int end){
        String result = "";
        int i = start;
        for(; i < end; i++){
            result += i + "*" + end + "=" + end * i + "\t";
        }
        result += i + "*" + end + "=" + i * end;
        return result;
    }

    public List<String> generateMultiplicationRows(int start, int end, boolean isValid){
        if(!isValid)
            return new ArrayList<>();
        List<String> multiplicationRows = new ArrayList<>();
        for(int i = start; i <= end; i++){
            String multiplicationRow = generateRow(start,i);
            multiplicationRows.add(multiplicationRow);
        }
        return multiplicationRows;
    }

    public String generateMultiplicationTable(List<String> multiplicationRows){
        String multiplicationTable = "";
        for(int i = 0; i < multiplicationRows.size() - 1; i++){
            multiplicationTable += multiplicationRows.get(i) + "\n";
        }
        multiplicationTable += multiplicationRows.get(multiplicationRows.size() - 1);
        return multiplicationTable;
    }

    public String build(int start, int end) {
        return "";
    }
}

