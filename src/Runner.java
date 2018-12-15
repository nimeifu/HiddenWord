import java.util.Scanner;

public class Runner {
    public static void main(String [] args)
    {
        HiddenWord triall =new HiddenWord("APPLE");
        String hint ="";
        Scanner in=new Scanner(System.in);
        System.out.println("What is your guess?");
        String guess=in.nextLine();
        hint=triall.getHint(guess);

        while(!hint.equals("APPLE"))
        {
            System.out.println("Your hint:"+hint);
            System.out.println("What is your next guess?");
            guess=in.nextLine();
            hint=triall.getHint(guess);
        }
        System.out.println("Congrats you got the secret word!");
    }
}
