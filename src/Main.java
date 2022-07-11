
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = Calculator.sumOfNum(1,2);
        int subtract = Calculator.subOfNum(4,3);
        int multiply = Calculator.multiplicationOfNum(2,3);
        float divide = Calculator.divisionOfNum (6,3);

        System.out.println(sum); //should print 3
        System.out.println(subtract); //should print 1
        System.out.println(multiply); //should print 6
        System.out.println(divide); //should print 2


    }

}