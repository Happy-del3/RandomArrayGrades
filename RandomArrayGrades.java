import java.util.Random;

public class RandomArrayGrades {

    public static void main(String[] args) {
        // Declare variables and constants
        double total = 0, avg = 0;
        int gradesArray[][] = new int[5][3];
        
        // Instantiate --> Create the Random object
        Random rand = new Random();
         
        // Generate random grades marks
        gradesArray[0][0] = rand.nextInt(100-10) + 10;
        gradesArray[0][1] = rand.nextInt(100-10) + 10;
        gradesArray[0][2] = rand.nextInt(100-10) + 10;
        gradesArray[1][0] = rand.nextInt(100-10) + 10;
        gradesArray[1][1] = rand.nextInt(100-10) + 10;
        gradesArray[1][2] = rand.nextInt(100-10) + 10;
        gradesArray[2][0] = rand.nextInt(100-10) + 10;
        gradesArray[2][1] = rand.nextInt(100-10) + 10;
        gradesArray[2][2] = rand.nextInt(100-10) + 10;
        gradesArray[3][0] = rand.nextInt(100-10) + 10;
        gradesArray[3][1] = rand.nextInt(100-10) + 10;
        gradesArray[3][2] = rand.nextInt(100-10) + 10;
        gradesArray[4][0] = rand.nextInt(100-10) + 10;
        gradesArray[4][1] = rand.nextInt(100-10) + 10;
        gradesArray[4][2] = rand.nextInt(100-10) + 10;
         
        // Display message
        System.out.println("Welcome to the grade book for" + "\n" +
                           "DPRS20 Introduction to Java Programming" + "\n\n" +
                           "The grades are: " + "\n" +
                           "\t" + "\tTest 1" + "\tTest 2" + "\tTest 3");
        
        for(int i=0; i<gradesArray.length; i++){
            System.out.print("Student " + (i+1));
            
            for(int j=0; j<gradesArray[i].length; j++)
                System.out.print("\t " + gradesArray[i][j]);
                total += gradesArray[i][0] + gradesArray[i][1] + gradesArray[i][2];
                avg = (total / gradesArray.length);
                System.out.println();
                
        }
        System.out.println("Points " + total);
        System.out.println("Average " + avg);
    }
    
}
