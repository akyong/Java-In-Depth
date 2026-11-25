public class Main {
	public static void main(String[] args){
		byte a = 1;
		byte b;
		
        String a_bits, b_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a );	
        //it must be convert 0000 0000 = 1

        // SHIFT LEFT OPERATOR
        p("======== SHIFT LEFT or <<");
        b = (byte) (a << 1); //because of 1 is integer so we need to cast it to byte since  b is byte
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        /**
         * so first, let's say we have:
         * 0000 0000 <= it is 0;
         * 0000 0001 <= it is 1;
         * 0000 0010 <= it is 2;
         * 
         * let's take 1 as en example which 1 binary is:
         * 0000 0001
         * then we want to move that '1' bit to right, and final result become 0000 0001
         * we need to use SHIFT RIGHT  which the code is '>>'
         * 
         * let's try it
         * */
         p("\n\n============== EXAMPLE ============== ");

         byte x = 2; //we need to convert it to binary and store it as a String;
         String x_bits = String.format("%8s", Integer.toBinaryString(x)).replace(' ','0');

         pf("%s = %d \n", x_bits, x);
         p("so, we want to move binary '1' to right become 0000 0001\nthen we will use  >> ");
         /**
          * result
          * ============== EXAMPLE ============== 
          * 00000010 = 2
          * 
          * so, we want to move binary '1' to right become 0000 0001 
          * then we will use  >> 
          * */
          byte mvRight = (byte) (x >> 1);
          String mvResult = String.format("%8s", Integer.toBinaryString(mvRight)).replace(' ','0');
          pf("%s = %d\n",mvResult, mvRight);



	}

	public static void pf(String x, Object... o){
		System.out.printf(x,o);
	}

	public static void p(String x){
		System.out.println(x);
	}
}