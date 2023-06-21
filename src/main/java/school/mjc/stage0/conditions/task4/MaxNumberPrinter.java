package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        if (third<second && second<first ||second<third && third<first ){
            System.out.println(first);
        } else if (first<second && first< third || second <first && first<third){
            System.out.println(third);
        } else {
            System.out.println(second);
        }
    }
}
