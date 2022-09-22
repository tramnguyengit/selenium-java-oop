package lab_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if(getFirstNum()!=0 | getsecondNum()!=0) {
            System.out.println("Calculating....");
        }

    }

    private static int getsecondNum() {
        System.out.println("Calling second number");
        return 0;
    }

    private static int getFirstNum(){
        System.out.println("calling first number");
        return 1;
    }

}
