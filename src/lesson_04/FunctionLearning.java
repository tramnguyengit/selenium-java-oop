package lesson_04;

public class FunctionLearning {
    public static void main(String[] args) {
        //printARandomNum(3);
       int manximumValue = getMaximumValue(2, 3);
        System.out.println(manximumValue);

    }

    private static int getMaximumValue(int firstNum, int secondNum) {
        int maximumValue = firstNum;
        if (secondNum >= maximumValue) {
            maximumValue = secondNum;
        }
        return maximumValue;
    }

    //Access Modifier | Class method | returned type

  /*  public static void printARandomNum(){
        System.out.println(new SecureRandom().nextInt(100));
    }*/

/*    public static void printARandomNum(int inputNumber){
        if (inputNumber == 3) return;
        System.out.println(inputNumber);
    }*/
}
