import java.util.Scanner;

public class main {

    public static void main (String [] args){

   /*     int temp = 1;

        if (temp>30){
            System.out.println("it is out outside");
        }

        else if (temp>=20&& temp<=30){
            System.out.println("it is warm outside");
        }

        else {
            System.out.println("it is cold outside");
        }
    }
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("your are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q")  && !response.equals("Q")){
            System.out.println("You still playing");
        }
        else {
            System.out.println("your quit");
        }





    }}

