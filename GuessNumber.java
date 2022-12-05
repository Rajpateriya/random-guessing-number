import java.util.Scanner;

 class GuessNumber {
    public static void main(String[] args) {
        int max=100;
        int min =0;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println();
        int score = 100;
        int count =5;
        Scanner sc = new Scanner(System.in);
        int yourGuess;
        System.out.println("Hey, You will get 5 chance to guess the correct number");
        System.out.println("*Good luck*");
        System.out.println();
        while (count>0){
            System.out.print("Enter your Number : ");
            yourGuess = sc.nextInt();
            if(yourGuess<randomNumber){
                System.out.println("That's too low.  Try again:");
                System.out.println();
            } else if (yourGuess>randomNumber) {
                System.out.println("That's too high.  Try again:");
                System.out.println();
            }else if(yourGuess==randomNumber){
                System.out.println("Congratulations !! YOU Win , Your Score is: "+ score);
                System.out.println();
                break;
            }
            score-=20;
            count--;
        }
        if (score==0){
            System.out.println("You didn't get the number in 5 guesses.");
            System.out.println("You lose. My number was : " + randomNumber);
        }
    }
}