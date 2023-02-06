public class L4_Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b = 9;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
        // System.out.println(64<6);
       //System.out.println(2 == 2);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        //        10   --> 2 in binary
        //        11   --> 3 in binary
        //       ----
        //        10   --> 1 and 1 gives 1     but    0 and 1 gives 0
    }
}
