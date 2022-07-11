import java.sql.SQLOutput;

public class Calculator {
    public static int sumOfNum(int val1, int val2) {
        return val1 + val2;
    }
    public static int subOfNum(int val1, int val2) {
        return val1 - val2;
    }
    public static int multiplicationOfNum(int val1, int val2) {
        return val1 * val2;
    }
    public static float divisionOfNum(float val1, float val2) {
        if (val1 == 0 || val2 == 0){
            System.out.println("0 is an invalid number!");
            return 0;
        }
        return val1 / val2;
    }
}
