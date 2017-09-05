package com.edocti.jintro.lab01;
import static java.lang.System.*;

public class Operators2 {
    
    public static String toBinary (int n) {
    // return Integer.toBinaryString(n);
    return String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    }
    
    public static void main (String[] args) {
    int i = 10;
    out.println(i++); // i=i+1
    out.println(i); // 11
    out.println(++i);
        
    i = 10;
    out.println(toBinary(i));
    out.println(toBinary(i << 1)); // 0000 0010 => 00000100
        
    out.println(i << 1); // valoare de dinainte inmultita cu 2
    out.println(i << 2); // valoare de dinainte inmultita cu 2
        
    //for (int j =0; j<16; j++)
    //out.println(toBinary(j));
        
    // out.println(toBinary(10));
    // out.println(toBinary(11));
        
    out.println(i >> 1);
    out.println(toBinary(i >> 1));
    out.println(i >> 2);
    out.println(i >> 3);
    out.println(i >> 4);
        
    out.println(toBinary(-2));
    out.println (-1 >> 10);
    out.println(toBinary(-1));
    out.println(toBinary(-1 >>2));
        
    out.println (-10 >> 2);
        
    out.println (-1 >>> 1);
    out.println(toBinary(-1 >>> 1));
        
    //11111111111111111111111111111111 =
    //00000000000000000000000000000000 +
    //00000000000000000000000000000001
    //00000000000000000000000000000001
        
    //11111111111111111111111111111110
    //00000000000000000000000000000001 +
    //00000000000000000000000000000001
    //00000000000000000000000000000010 =2 |n| = 2, n = -2
    }
} 
