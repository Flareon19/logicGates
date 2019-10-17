package gates;

public class ANDGate {
    // Todo:
    //  4. Complete the following methods
    private int input1;
    private int input2;

    public ANDGate() {
        input1 = 0;
        input2 = 0;
    }
    public ANDGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    private int getOutput(int input1, int input2) {
        // write your code here
    }

    private void printOutput(int input1, int input2) {
        // write your code here
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For AND Gate----");
        // write your code here
    }
}
