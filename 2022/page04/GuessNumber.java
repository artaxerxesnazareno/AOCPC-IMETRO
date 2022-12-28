/**
 * Grupo: O Grupo
 * @author Alfredo Junkeira
 * @author Rafael Marcos
 * @author Sebastião de Carvalho
 */

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessNumber{

    public static void main(String... args){
        int tries = 0;
        int number = (new Random()).nextInt((int) Math.pow(10, 9)); //gera um número pseudo-aleatório entre 1 e 10^9
        int guess = 0;
        Scanner s = new Scanner(System.in);
        
        //chances de acerto 0.000003%
        try{
            for(; tries <= 30; tries++){
                System.out.print(": ");
                System.out.flush();
                guess = s.nextInt();

                if(guess < number){
                    System.out.println(">");
                }
                else if(guess > number){
                    System.out.println("<");
                }
                System.out.flush();

                if(guess == number){
                    System.out.println("=");
                    System.out.flush();
                    System.out.println("! " + guess);
                    System.out.flush();
                    System.exit(0);
                }
            }
            System.out.println("Wrong answer veredict " + number); //só para sabermos o número que não acertamos depois da mensagem de erro
        }
        catch(InputMismatchException ime){} //caso a entrada não seja um número
    }
}
