package gates;

public class EXORGate {
    private int input1;
    private int input2;

    public EXORGate() {
        input1 = 0;
        input2 = 0;
    }

    public EXORGate(int input1, int input2) {
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
        if (input1 == input2)
            return 0;
        else
            return 1;
    }

    private void printOutput(int input1, int input2) {
        System.out.println((input1 == input2) ? 0 : 1);
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For EXOR Gate----");
        System.out.println("0 EXOR 0 results 0\n" +
                "0 EXOR 1 results 1\n" +
                "1 EXOR 0 results 1\n" +
                "1 EXOR 1 results 0");
    }

    @Override
    public String toString() {
        return getOutput(input1, input2) + " ";
    }
}
