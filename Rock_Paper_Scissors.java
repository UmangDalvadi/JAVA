
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors{
    public static void main(String[] args)
    {
        Random rand=new Random();
        try (Scanner sc = new Scanner(System.in)) 
        {
            int userpoint=0;
            int compoint=0;

            System.out.println("\nHow many rounds you wants to play : ");
            int num=sc.nextInt();

            for (int i=0;i<num;i++) {
                int gen=rand.nextInt(1,4);

                System.out.println("==========================================");

                System.out.println("\n1.Rock\n2.Paper\n3.scissors\n");

                System.out.println("Enter your choice : ");
                int choice = sc.nextInt();

                if (choice == 1){
                    if (gen==1){
                        System.out.println("Computer choice : "+gen);
                    }
                    else if (gen==2) { compoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                    else { userpoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                }
                else if (choice==2) {
                    if (gen==1){
                        userpoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                    else if (gen==2) {
                        System.out.println("Computer choice : "+gen);

                    }
                    else { compoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                }
                else {
                    if (gen==1){compoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                    else if (gen==2) { userpoint+=1;
                        System.out.println("Computer choice : "+gen);
                    }
                    else {
                        System.out.println("Computer choice : "+gen);
                    }
                }

                System.out.println("\nYour score : "+userpoint);
                System.out.println("Computer score : "+compoint+"\n");
            }

            System.out.println("=================================");
            
            if (userpoint>compoint)
                System.out.println("You are a Winner!!");
            else
                System.out.println("You are a Losser!!");
        }
    }
}
