package week3_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to Copy contents: ");
		String input = scan.nextLine();
		System.out.println("Enter the destination file for the copied content: ");
		String output = scan.nextLine();
		try {
			copyFileContents(input,output);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			scan.close();
		}
	}
	private static void copyFileContents(String inputFileName, String outputFileName) throws IOException {
        ;
        FileWriter fw = new FileWriter(new File(outputFileName));
		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))){
			
			int ch;
			while ((ch = br.read())!= -1) {
				fw.write(ch);
			}
			
			fw.close();
		}catch(FileNotFoundException e){
			throw new IOException(e);
		}catch(IOException e){
			throw new IOException();
		}
	}

}
