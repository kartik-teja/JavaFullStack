package week2_2;

import java.util.Scanner;

public class CalculateAverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		int s1Sum = 0,s2Sum = 0, s1Avg,s2Avg,i=0;
		int[] s1Marks = new int[3], s2Marks = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		s1=scan.nextLine();
		System.out.println("Enter Marks: ");
		while(i<3) {
			String temp = scan.nextLine();
			try{
				s1Marks[i] = Integer.parseInt(temp);
				validateMarks(s1Marks[i]);
				i+=1;
			}
			catch(NumberFormatException e){
				System.out.println(e+" ReEnter the value");
			}
			catch(Exception e){
				System.out.println(e+" ReEnter the value");
			}
			s1Sum += s1Marks[0];
		}
		i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name : ");
		s2=sc.nextLine();
		System.out.println("Enter Marks: ");
		while(i<3) {
			String temp = sc.nextLine();
			try{
				s2Marks[i] = Integer.parseInt(temp);
				validateMarks(s2Marks[i]);
				i+=1;
			}catch(NumberFormatException e){
				System.out.println(e+" ReEnter the value");
			}catch(Exception e){
				System.out.println(e+" ReEnter the value");
			}
			s2Sum += s2Marks[i];
		}
		s1Avg=s1Sum/3;
		s2Avg=s2Sum/3;

		scan.close();
		sc.close();
		System.out.println("Student "+s1+" average score is: "+s1Avg);
		System.out.println("Student "+s2+" average score is: "+s2Avg);
	}
	public static void validateMarks(int marks) throws NegativeValueException, OutOfRangeException {
        try {
        	if(marks<0) {
        		throw new NegativeValueException("The given value is Negative: "+marks);
        	}
        	if(marks<8 | marks>100) {
        		throw new OutOfRangeException("The give value is out of the range (8-100): "+marks);
        	}
        }
        catch(NegativeValueException | OutOfRangeException e) {
        	throw e;
        }
    }

}
