import java.util.Random;
import java.util.Scanner;
class P1
{
public static void main(String[] args) 
{
Random random = new Random();
Scanner sc=new Scanner(System.in);
while (true)
{
System.out.println("Guess the one randam number ");
int guessNum=sc.nextInt();
int randomNumber = random.nextInt(10);
if (guessNum<=10)
{
if (guessNum==randomNumber)
{
System.out.println("Random number: " + randomNumber);
System.out.println("Congrats ! your guess number and randam number both are same");
}
else
{
System.out.println("Random number: " + randomNumber);
System.out.println("Sorry ! your guess number and randam number both are diffarant ");
System.out.println("Enter '1' to play again, any other input to exit: ");
int playAgainInput =sc.nextInt();
if( playAgainInput==1)
{
//continue;
}
else
{
System.out.println("Thanks for playing! Goodbye.");
break;
}
}
}
else
{
System.out.println("Enter your value is less than 10");
}
}
}
}
