
import java.util.Random;
import java.util.Scanner;
public class evenOdd {
    public static String even = "E";
    public static String odd = "O";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nUSE CAPITAL LETTERS\n Are you sure you want to play this game??\nwrite your name");
        String name = input.next();
        System.out.println("hello " + name + "\nyou do have guts\nchoose(E)ven or (O)dd");
        String choice = input.next();
        if (choice.equals(even)) {
            System.out.println("you choose\n" + choice + "\ncomputer has O");

        } else if(choice.equals(odd)) {
            System.out.println("you choose\n" + choice + "\n computer has E");
        }
        else{
            System.out.println("asshole wrong choice");
            return;
        }
        System.out.println("enter number of fingers you want to play\n");
        int fing = input.nextInt();
        Random rand = new Random();
        int com = rand.nextInt(6);
        System.out.println("you played" + fing + "computer played" + com);
        int sum = fing + com;
        System.out.println("sum is "+ sum);
        if ((sum % 2 == 0) && choice.equals(even)) {
            System.out.println("sum and your choice both are even\n you won");
        } else if ((sum % 2 == 1)&&choice.equals(odd)) {
            System.out.println("sum and your choice both are odd\n you won");
        } else {
            System.out.println("better luck next time\n computor won");
        }
    }
}
