// it is a binary operator. Where if any one operand is true output is true.

class LogicalOr {
    public static void main(String[] args)
    {
        int a = 10, b = 20, c = 20, d = 0;

        // using logical AND to verify two constraints
        if ((a > b) || (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}
