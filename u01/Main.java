public class Main {
    public static int cmp_nbr = 0;
    public static int ARRAY_SIZE = 200;
    public static int threshold = 20;
    public static void main(String[] args) {

        if (args.length > 0) {
            String mainArgument = args[0];
            if (mainArgument.equals("TEST0")) {
                System.out.println("please wait! sorting 20 millions elements of an array!");
                ARRAY_SIZE = 20000000;
                Test0.test0();
            } else if (mainArgument.equals("TEST1")){
                ARRAY_SIZE = 100;
                Test1.test1();
            } else if (mainArgument.equals("TEST2")){
                ARRAY_SIZE = 1000;
                Test2.test2();
            }
            else if (mainArgument.equals("TEST3")){
                ARRAY_SIZE = 20;
                Test3.test3();
            }
            } else {
                System.out.println("No main argument provided. \n Or invalid Arugments \n");
                System.out.println("take a look at Readme file!");
            }
        }
}

