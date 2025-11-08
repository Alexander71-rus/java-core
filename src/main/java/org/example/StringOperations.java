package ru.mentee.power;
public class StringOperations {
    public static void main(String[] args) {
        String q="Alexander";
        String w="Zotov";
        System.out.println(q+w);

        char c = 'A';
        String s = String.valueOf(c);
        System.out.println(c);
        int x = 5;
        String Test=Integer.toString(x);
        System.out.println("convert int to String: "+Test);
        String z="5";
        int chil=Integer.parseInt(z);
        System.out.println(z);
        String streac="Hello";
        char c1=streac.charAt(3);
        System.out.println(c1);
    }
}
