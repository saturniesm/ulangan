/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
		int index = input.nextInt();
		for (int i = 0; i < index; i++) {
			  int a = input.nextInt();
			         if(a%2 == 0){
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
		}
	}
}
