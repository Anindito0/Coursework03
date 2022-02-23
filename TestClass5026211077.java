import java.util.Scanner;

public class TestClass5026211077{
 public static void main(String args[]){
 
 Scanner sc = new Scanner(System.in);
 ComputeMethods5026211077 cm = new ComputeMethods5026211077();

 //Temparture
 System.out.println("Please input the degrees in farenheit!");
 String farenheit = sc.next();
 double farenheitDb = Double.parseDouble(farenheit);
 double celciusDb = cm.fToC(farenheitDb);
 System.out.println("Temp in celcius is " + celciusDb);
 System.out.println(" ");

 //Hypotenuse
 System.out.println("Please input the length of a!");
 String a = sc.next();
 System.out.println("Please input the length of b!");
 String b = sc.next();
 int aInt = Integer.parseInt(a);
 int bInt = Integer.parseInt(b);
 double c = cm.hypotenuse(aInt, bInt);
 System.out.println("Hypotenuse is " + c);
 System.out.println(" ");

 //Dice
 int diceValue = cm.roll();
 System.out.println("The sum of the dice values is "+diceValue);
}
}