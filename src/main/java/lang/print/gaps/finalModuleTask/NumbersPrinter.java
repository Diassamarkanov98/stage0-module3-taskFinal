package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        String[] results = {String.valueOf(false), String.valueOf(false), String.valueOf(true)};
        System.out.println(results[Integer.signum(number)+1]); ;
    }
}
