import java.lang.*;
import java.io.*;
import java.util.*;
public class reversestring {

    public static void main(String[] args)
    {
        String input = "qauber";
        StringBuilder input1 = new StringBuilder();

        char[] str = input.toCharArray();

        for (int i = str.length-1; i>=0; i--)
            System.out.print(str[i]);
    }

}
