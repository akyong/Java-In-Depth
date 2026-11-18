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
	byte age = 18;

	void compute() {
		id = 1000;

		int nextId = id + 1;

		System.out.println(id);
		System.out.println(nextId);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.compute();
	}
}