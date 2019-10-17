package gates;

public class NANDGate {

    private int input1;
    private int input2;

    public NANDGate() {
        input1 = 0;
        input2 = 0;
    }

    public NANDGate(int input1, int input2) {
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
        return (input1 * input2) == 0 ? 1 : 0;
    }

    private void printOutput(int input1, int input2) {
        System.out.println((input1 * input2) == 0 ? 1 : 0);
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NAND Gate----");
        System.out.println("0 NAND 0 results 1\n" +
                "0 NAND 1 results 1\n" +
                "1 NAND 0 results 1\n" +
                "1 NAND 1 results 0");
    }
}
