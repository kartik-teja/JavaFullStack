package week2_2;

public class MathOperation {
	public static void main(String[] args) {
		int []nums = new int[5];
        if (args.length != 5) {
            System.out.print("Please enter only 5 numbers");
            return;
            }
        try {
        	for (int i = 0; i<5; i++) {
        		nums[i]=Integer.parseInt(args[i]);
        	}
        	
        }catch(NumberFormatException e) {
        	System.out.println(e);
        	return;
        }
        int sum=0;
        double avg=0;
        try {
        	for (int i = 0; i<5; i++) {
        		sum+=nums[i];
        	}
        	avg=sum/5;
        }catch(ArithmeticException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("The sum of the given numbers is "+sum);
        System.out.println("The average of the given numbers is "+avg);        
	}

}
