import java.util.Random;
public class ComputeMethods5026211077{

public double fToC(double degreesF){
 double degreesC = 5.0/9.0*(degreesF-32.0);
 return degreesC;
}

public double hypotenuse(int a, int b){
 double hypot = Math.hypot(a,b);
 return hypot;
}

public int roll(){
 Random rng = new Random();
 int diceOne = rng.nextInt(6) +1;
 int diceTwo = rng.nextInt(6) +1;
 int sumDice = diceOne + diceTwo;
 return sumDice;
}
}