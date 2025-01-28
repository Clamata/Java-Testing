class OverTheLimitException extends Exception {
    public OverTheLimitException(String message) {
        super(message);
    }
}
public class AdvancedMath {
    //Adds two integers
    public int addition(int a, int b) {
        return a + b;
    }
    //Adds an integer and a number represented as a string
    public int addition(String a, int b) {
        try {
            int i = Integer.parseInt(a);
            return i + b;
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    //Multiplies two integers
    //throws OverTheLimitException if the result exceeds integer maximum value
    public int multiply(int a, int b) throws OverTheLimitException {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE) {
            throw new OverTheLimitException("value over the limit");
        }
        return (int) result;
    }
}



