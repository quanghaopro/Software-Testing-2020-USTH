public class Calc {

    private boolean status;

    public Calc() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot division by zero");
        } else {
            return a / b;
        }
    }
}