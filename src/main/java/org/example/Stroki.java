package org.example;

public class Stroki {
    public String[] stringArray = {"a","aaa", "aaaaa", "aaaaaaaa"};
    public void addElem(String elem){
        String[] newArr = new String[stringArray.length + 1];
        int j = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (elem.length() < stringArray[i].length()) {
                newArr[i] = elem;
                j = i;
                break;
            } else {
                newArr[i] = stringArray[i];
            }
        }
        for (int i = j;i < stringArray.length; i++){
            newArr[i+1] = stringArray[i];
        }
        stringArray = newArr;
        for (int i = 0; i < stringArray.length; i++) {
           System.out.print(stringArray[i] + " ");
        }

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
