
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] numbers;
int [] numbers = { 43, 34, 20, 44, 23, 55, 22, 34, 12, 17, 33, 77 };

int total = 0;

for(int counter = 0; counter < numbers.length; counter++) {
	
	total += numbers[counter];
	
	System.out.println();

	System.out.printf("the total value: %d%n", total);
}



//numbers [0] = 43;
//numbers [1] = 34;
//numbers [2] = 20;
//numbers [3] = 44;
//numbers [4] = 23;
//numbers [5] = 55;
//numbers [6] = 22;
//numbers [7] = 34;
//numbers [8] = 12;
//numbers [9] = 17;
//numbers [10] =33;
//numbers [11] = 77;


//numbers[6] = 23;
//numbers [11] = 78;
//System.out.println(numbers[11]);


//for (int i = 0; i < numbers[2]; i+=2) {
//System.out.println(i);
//}

//for (int i = 2; i <= numbers[2]; i++) {
	//if (i % 2 == 0)
	//	System.out.println(i);
//}

//		int [] initArray = new int[10] ;
//		
//		System.out.printf("%s%8s%n", "ïndex", "value");
//		
//		for(int counter = 0; counter < initArray.length; counter++) {
//			System.out.printf("%5d%8d%n", counter,initArray[counter]);
//		}
//	
		

	}

}
