class Demo {

	static void threeDimensionalArray() {
		System.out.println("\nInside threeDimensionalArray ...");

		int[][][] unitsSold = new int[][][] { // <-- or we can do without new int[][]][] and just start with '{'
				{ // new york
						{ 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0 }, // Mar
						{ 0, 850, 0, 0 } // Aprl
				},
				{ // San Francisco
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
				},
				{
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 }
				},
				{
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 }
				}
		};
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}

	static double sum(double x, double y) {
		return x + y;
	}

	static double avg(double x, double y){
		double sum = sum(x, y);
		return	sum/2;
	}

	static boolean search(int[] list, int key){
		return true;
	}

	public static void main(String[] args) {  

		// threeDimensionalArray();
		double d = sum(3.0f, 2.0);
		System.out.println(d);

		double d2 =  avg(3.0,2.0);
		System.out.println(d2);

		System.out.println(search(new int[]{1,2,3},2)) ;



	}
}