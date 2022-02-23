import java.util.Scanner;

public class ProcessAName5026211077{
 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
  
  System.out.print("Type your name: ");
  String name = sc.nextLine();
  String[] chapters = name.split(" ");
  String chapter1 = chapters[0];
  String chapter2 = chapters[1];
  System.out.println(name.indexOf(" "));
  System.out.println(chapter2 + ", " + chapter1.charAt(0) +".");
}
}