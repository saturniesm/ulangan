/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    static void nomor(int a){
        if(a%2 == 0){
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int one;
	    one = in.nextInt();
	    nomor(one);
	}
}
