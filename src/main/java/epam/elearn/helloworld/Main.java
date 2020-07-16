package epam.elearn.helloworld;

public class Main {
    public static void main(String[] args) {

//        ==============

        System.out.println("1 .");
        System.out.println("2 . .");
        System.out.println("3 . . .");
        System.out.println("4 . . . .");
        System.out.println("Hello World");

//        ==============
        int i = 1;

        System.out.println(i);

        i++;
        System.out.println(i);

        i++;
        System.out.println(i);

        System.out.println("Hello World Again");

//        ==============
        int arg1 = 1;
        int arg2 = 2;

        int sumArgs = intSum(arg1, arg2);

        System.out.println("sum = " + sumArgs);
    }

    public static int intSum (int arg1, int arg2){
        return arg1 + arg2;
    }


}
