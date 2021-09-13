package basics.loops;

public class Loops {
    // Standard for loop where a counter needs to be managed
    public void basicForLoopPrinter(int end) {
        for (int i = 0; i <= end; i++) {
            System.out.println(i);
        }
    }

    // Within the for each syntax an iterable object must be passed i.e. a List, Map or even a string to iterate through characters
    public void forEachLoop(int[] numberList) {
        for (int number:numberList) {
            System.out.println(number);
        }
    }

    // The following while loop relies on a boolean value being achieved.
    // both of the following examples are using equality matchers to achieve the boolean state
    public void whileLoopPrinter(int end) {
        int start = 0;
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }

    // A do while loop is no different to a while loop in the gradn scheme of things
    // it is often used as a better descriptor of what is happening in your program
    // i.e. do this thing while the game is active
    public void doWhileLoopPrinter(int end) {
        int start = 0;
        do {
            System.out.println(start);
            start++;
        } while (start <= end);
    }



}
