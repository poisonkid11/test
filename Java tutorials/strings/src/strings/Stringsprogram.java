package strings;
import java.util.Scanner;
public class Stringsprogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Skriv namn: ");
		String namn = input.nextLine();
		
		System.out.print("Skriv ålder: ");
	    int alder = input.nextInt();
		
		System.out.print("Skriv längd(Cm): ");
		double langd = input.nextDouble();
		
        System.out.println(namn + " är " + alder + " år gammal " + langd + " m lång");
        System.out.println("Stämmer detta"); 
		
		
		System.out.println("Madlibs!");
		
		String username= "Mojo jojo";
		
		System.out.println("Min syster körde en ____  för första gången "
				+ " och det gick ___");
		String motorA = "bil";
		String motorB = "motorcykel";
		String motorC = "lastbil";
		String ord = "katastrof";
		
		System.out.println("Min syster körde en "+ motorC +" för första gången och det gick "+ ord +" ");
		
		
		System.out.println(username);
		/*
		 * short = heltal -32768 till 32767
		 * int = heltal +- 2*10^9
		 * long  = Heltal +- 9*10^18
		 * float = decimaltal +- 3,4 * 10^38  meningslöst använda dobule
		 * double = decimaltal +- 1,7*10^308
		 * char = ett tecken
		 * boolean = true eller false
		 * String = en text
		 */
		
		 
		 int mittHelTal = 8;
		 System.out.println("Mitt heltal är " + mittHelTal);
		 mittHelTal = mittHelTal + 10;
		 System.out.println("Mitt heltal + 10 är " + mittHelTal);
		 System.out.println(mittHelTal);
		 
		 double a = 2.1;
		 double b = 3.1;
		 double summa = a+b;
		 System.out.println("Tal A är " + a);
		 System.out.println("Tal B är " +b);
		 System.out.println("Summan är "+  (a + b));
		 System.out.println("Summan är "+ summa);
		 
		 
		 
		
		
		

	}

}
