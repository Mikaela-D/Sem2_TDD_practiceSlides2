public class CalculatorTest {

    private int nbErrors = 0;

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();

        try {
            test.testAdd();
        }
        catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("There were " + test.nbErrors + " error(s)");
        }
    }
}
