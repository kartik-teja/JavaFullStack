package week1_8;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int sum=0,avg;
		for (int i=0;i<5;i++) {
			arr[i]=Integer.parseInt(args[i]);
			sum+=arr[i];
		}
		avg = sum/5;
		System.out.println("Sum of the numbers is "+sum);
		System.out.println("Average of the numbers is "+avg);
	}

}
