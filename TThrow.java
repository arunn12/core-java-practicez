package tthrow;

public class TThrow {

    static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {

        validate(12);

        System.out.println("rest of the code");
    }
}
