package basics.collections;

public class ArrayExamples {
    private int[] short_fib = new int[5];
    private int[] long_fib = {0,1,1,2,3,5,8,13};
    private String[] names = {"Jamie", "Jon", "joffrey"};

    private int[] oddNums = {1,3,5,7,9};
    private int[] evenNums = {2,4,6,8,10};

    private int[][] twoDArray = new int[3][3];

    public ArrayExamples() {
        setShort_fib();
        setTwoDArray();
    }

    public void printNames(){
        for (String name : names) {
            System.out.println(name);
        }
    }

    private void setTwoDArray(){
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[0][2] = 2;
        twoDArray[1][0] = 2;
        twoDArray[1][1] = 1;
        twoDArray[1][2] = 0;
    }

    public void getTwoDArray(int arrayRef, int arrayObjectRef ){
        System.out.println(twoDArray[arrayRef][arrayObjectRef]);
    }

    private void setShort_fib(){
        short_fib[0] = 0;
        short_fib[1] = 1;
        short_fib[2] = 1;
    }

    public void getShort_fib(int arrayRef){
        System.out.println(short_fib[arrayRef]);
    }

    public int getLong_fib(int arrayIndex) {
        return long_fib[arrayIndex];
    }

    public String[] getNames() {
        return names;
    }
}
