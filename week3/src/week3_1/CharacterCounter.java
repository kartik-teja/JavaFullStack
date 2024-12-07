package week3_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character to check: ");
        char toCheck = scan.nextLine().toLowerCase().charAt(0);
        System.out.print("Enter the file name: ");
		String fileName = scan.next();
		try {
			int count = countCharacterInFile(fileName,toCheck);
			System.out.println("File "+fileName+" has "+count+" instances of letter '"+toCheck+"'");
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			scan.close();
		}
	}
	private static int countCharacterInFile(String fileName, char charToCount) throws IOException {
		File file = new File(fileName);
		System.out.println("Attempting to read file: " + file.getAbsolutePath());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int count = 0;
            int ch;
            while ((ch = br.read()) != -1) { 
                if (ch == charToCount | ch == charToCount-32) {
                    count++;
                }
            }
            return count; 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            throw new IOException("File not found");
        }
        catch (IOException e) {
        	throw e;
        }
	}
}