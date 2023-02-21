package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int acc;
        int result = 0;
        while(number > 0){
            acc = number%10;
            result = (result*10) + acc;
            number = number/10;
        }
        System.out.println(result);
    }
}
