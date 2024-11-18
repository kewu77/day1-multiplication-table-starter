package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);
        System.out.println(multiplicationTable);
    }

    public boolean checkNumber(int start, int end){
        return start >= end && start > 1 && start <= 1000 && end > 1 && end <= 1000;
    }

    public String generateRow(int start, int end){
        String result = "";
        for(int i = start; i < end; i++){
            result += start + "*" + i + "=" + start * i + "\t";
        }
        result += start + "*" + end + "=" + start * end;
        return result;
    }

    public String build(int start, int end) {
        return "";
    }
}
