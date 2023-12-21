package org.example;

public class Stroki {
    public String[] stringArray = {"a","aaa", "aaaaa", "aaaaaaaa"};
    public void addElem(String elem){
        String[] newArr = new String[stringArray.length + 1];

        for (int i = 0; i < stringArray.length; i++) {
            newArr[i] = stringArray[i];
        }
        newArr[newArr.length - 1] = elem;
        stringArray = newArr;
    }
    public String getMax(){
        return stringArray[stringArray.length-1];
    }
    public double Averege(){
        int s = 0;
        int k = 0;
        for (int i = 0; i < stringArray.length; i++) {
            s += stringArray[i].length();
            k++;
        }
        return s / k;
    }

}
