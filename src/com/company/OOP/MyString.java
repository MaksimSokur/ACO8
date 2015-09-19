package com.company.OOP;

/**
 * Created by User on 19.09.2015.
 */
public class MyString {
    public static void main(String [] args) {
        char ch = 'i';
        String string = "Max";
        char[] symbolsOne = {'M', 'a','x'};
        char[] symbolsTwo
        toString(symbolsOne);
        indexOf(ch);

    }
    public static String toString(char[] in){
            String str = " ";
            str = in.toString();
            System.out.println(str);
            return str;
    }

        public static int indexOf ( char[] src, char ch){
            for(int i = 0; i<src.length; i++){
                if(src[i]==ch){
                    return  i;
                }
            }
            System.out.print(ch);
            return -1;
        }

    public static int count(char[] in, char target) {
       int count = 0;
        for(int i = 0; i < in.length; i++){
            if(in[i] == target){
                target++;
            }
        }
        System.out.print(count);
        return count;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char [] res = new char[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++,k++){
            res[i] = arr1[k];
        }
        for(int i =0; i < arr2.length; i++,k++){
            res[k] = arr2[i];
        }
        return  res;
    }

}
