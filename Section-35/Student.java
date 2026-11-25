import java.math.BigDecimal;

/**
 * Section-20 Declaring & Re-initializing Variable
 * 
 */

class Student {
	/**
	 * @note because int id is not declare in method, so default value is 0 by java
	 *       but if int id is declared in method, it will causes error, because
	 *       there's no initialization value
	 */
	int id;
	String name;
	String gender;
	byte age;

	long phone;
	double gpa;
	char degree;

	boolean international;
	double tuittionFee = 12000.0;
	double internationalFees = 5000.0;

	void compute() {

		int nextId = id + 1;

		System.out.println(id);
		System.out.println(nextId);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(gpa);
		System.out.println("===============");
		System.out.println(1 - 0.9); // result 0.09999999999999998
		System.out.println(0.1 + 0.2); // result 0.30000000000000004
		/**
		 * Why?
		 * Because, in java, floating point number is represented in binary format, so
		 * it will causes precision error
		 * 
		 */

		double price = 1000;
		double discountPercent = 0.9;
		double discountAmount = price * discountPercent;

		System.out.println("DiscountAmount = " + discountAmount);
		System.out.println("Prices - DiscountAmount = " + (price - discountAmount));
		System.out.println("Prices * (1 - DiscountPercent) = " + (1 - discountPercent));

		System.out.println("============BIG DECIMAL========");

		BigDecimal first = new BigDecimal("0.1");
		BigDecimal second = new BigDecimal("0.2");

		System.out.println(first.add(second));

	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id = 1000;
		student1.name = "John";
		student1.gender = "male";
		student1.age = 18;
		student1.phone = 223_234_123L;
		student1.gpa = 3.8;
		student1.degree = 'B';
		student1.international = false;
		student1.compute();
	}
}