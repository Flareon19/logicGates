package gates;

public class GATETest {
    public static void main(String[] args) {
        ANDGate andGate = new ANDGate();
        andGate.printTruthTable();
        ORGate orGate = new ORGate();
        orGate.printTruthTable();
        NOTGate notGate = new NOTGate();
        notGate.printTruthTable();
        NANDGate nandGate = new NANDGate();
        nandGate.printTruthTable();
        NORGate norGate = new NORGate();
        norGate.printTruthTable();
        EXORGate exorGate = new EXORGate();
        exorGate.printTruthTable();
        EXNORGate exnorGate = new EXNORGate();
        exnorGate.printTruthTable();
    }
}
