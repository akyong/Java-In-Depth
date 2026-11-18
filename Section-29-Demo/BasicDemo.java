class BasicDemo {

    static void primitives() {
        long intHex = 0x0041L;

        // Java7
        int intBinary = 0b01000_0001;

        int intOctal = 0101;

        printx("intHex: " + intHex);
        printx("intBinary: " + intBinary);
        printx("intOctal: " + intOctal);

    }

    static void printx(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        primitives();
    }
}
