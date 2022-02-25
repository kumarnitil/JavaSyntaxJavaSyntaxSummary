package basics.java;

public class LearnArrays {
    /**
     * The limitations with Array is - 
     * 1.> You can store variables of one data type.
     * 2.> Once the size of the array has been initialized it cannot be changed.
     * 3.> Index always starts with 0
     * 4.> intArr.length will give the length of the Array
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(intArr);//This will be just print memory address
		//System.out.println(intArr[4]);// This will print the element at location index 5
		
		/*
		 * Initialization of Arrays can be done in multiple ways 
		 * as shown below.
		 */
		
		//Initialization of the array with the new keyword.
		int[] Array1 = new int[5];
		Array1[0] = 1;//Index of the Array starts with 0 and not 1 like Array1[0]
		Array1[1] = 2;
		Array1[2] = 3;
		Array1[3] = 4;
		Array1[4] = 5;
		
		//Using for each loop to print the values of this loop.	
		System.out.println("Elements of Array 1 are");
		for(int Arrval :Array1) {
			System.out.println(Arrval);
		}
		
		//Initialization of the array with directly using values in th list enclosed in curly braces.
		int[] Array2 = {1,2,3,4,5};
		//Using traditional for loop to print values of the element.
		for(int i=0;i<Array2.length;i++) {
			System.out.printf("The value at index %d of the Array2 is %d\n",i,Array2[i]);
			//formatted printing of integers using %d
			
		}
		
		

	}

}
