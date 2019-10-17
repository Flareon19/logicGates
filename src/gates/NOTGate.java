package gates;

public class NOTGate {
    private int input;

    public NOTGate() {
        input = 0;
    }

    public NOTGate(int input) {
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    private int getOutput(int input) {
        return input == 0 ? 1 : 0;
    }

    private void printOutput(int input1) {
        System.out.println(input == 0 ? 1 : 0);
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NOT Gate----");
        System.out.println("NOT0 results 1\n" +
                "NOT1 results 0");
    }
}
