import java.util.Scanner;

public class calculator_new {


    public static void main(String[] args) {
        System.out.println("Enter Numbers with Operators : e.g., 5+6 , 6*9");
        Scanner inp = new Scanner(System.in);
        String str1 = inp.nextLine();
        String array1[]=str1.split("[+-/*]",3);

        int num1 = Integer.parseInt(array1[0]);
        int num2 = Integer.parseInt(array1[1]);

        //System.out.println(str1.contains("+"));
        if (str1.contains("+")) {
            System.out.println("Sum is "+add(num1, num2));
        }
        if (str1.contains("-")) {
                System.out.println("Subtraction is "+sub(num1, num2));
        }
        if (str1.contains("*")) {
                System.out.println("Multiplication is " +mult(num1, num2));
        }
        if (str1.contains("/")) {
                System.out.println("Divison is "+div(num1, num2));
        }


    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static float div(float x, float y) {
        float result = x / y;
        return result;
    }

}

