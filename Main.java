import myutils.*;
import myutils.time.*;

class Main {
    public static void main(String[] args) {
        StopWatch c = new StopWatch();
        c.start();
        int[] t = {1, 2, 4};
        Array.print(t);

        int[] t2 = Array.genArray(20000);
        Array.print(t2);

        File.cat("README.md");
        Time.print();
        c.stop();
        System.out.println(c);
    }
}