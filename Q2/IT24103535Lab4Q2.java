import java.util.Scanner;

public class IT24103535Lab4Q2{
    public static void main(String[] args){
        Scanner input = new Scanner (System .in);

        System.out.print("Enter the exam marks (0-100):");
        int exammarks = input.nextInt();s
        if (exammarks < 0|| exammarks > 100){
            System.out.println("Invalid exam marks.Must be between 0 and 100.");

        }
          System.out.print("Enter the lab submission marks(0-100:)");
          int labmarks = input.nextInt();
          if (labmarks < 0|| labmarks >100){
            System.out.println("Invalid lab submission marks. Must be between 0 and 100.");

          }
            System.out.print("Enter thepercentage for exam marks:");
            double exampercentage = input.nextDouble();
           
            System.out.print("Enter thepercentage for labsumission marks:");
            double labpercentage = input.nextDouble();

            if (exampercentage + labpercentage != 100){
                System.out.print("The percentage must add up to 100.");

            }
                double finalmark = ((exammarks * exampercentage/100) + (labmarks * labpercentage/100));
                System.out.println("the final marks is " + finalmark);
                
                


        
    }
}