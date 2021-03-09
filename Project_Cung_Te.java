import java.util.Scanner; 
public class Project_Cung_Te{
   public static void main(String [] args){
   
      //Create scanner object for keyboard input 
      Scanner keyboard = new Scanner(System.in);
      
      // Declare constants for multiplier
      final double RSL_1280x720 = 1 ;
      final double RSL_1920x1080 =.75;
      final double RSL_2560x1440 = .55;
      final double RSL_3840x2160 = .35; 
        
      // Declare variable for input 
      double GPU = 0.00;
      double CPU = 0.00;
      int numCores = 0;
      String monitorRe="";
      int menuChoice = 0;
      
      System.out.print("Please enter the clock speed (in Megahertz) of your graphics card:");
      GPU = keyboard.nextDouble();
      System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
      CPU = keyboard.nextDouble();
      System.out.print("Please enter the number of core for the CPU: ");
      numCores = keyboard.nextInt();
      
      System.out.print("What is the resolution of your monitor?");
      System.out.println("\n\t1. 1280 x 720 \n\t2. 1920 x 1080 \n\t3. 2560 x 1440 \n\t4. 3840 x 2160");
      System.out.print("Please selected from the option above: ");
      menuChoice = keyboard.nextInt();
      
       // variables for calculations
      double perfScore = 0.00;
      String ReGraQy = "";
      double multiplier = 0.00;
   
      
      // Create string object
      String qualityName = "\nComputer Hardware Graphics Quality Recommendation Tool";
      
      switch (menuChoice){
         case 1:
            monitorRe = "1280x720";
            multiplier = RSL_1280x720;
            break;
         
         case 2:   
            multiplier = RSL_1920x1080;
            monitorRe = "1920x1080";
            break;
         case 3: 
            multiplier = RSL_2560x1440;
            monitorRe = "2560x1440";
            break;
         default: 
            multiplier = RSL_3840x2160;   
            monitorRe = "3840x2160";
         
         }
         
      // Calculate performance Scores
         perfScore = ((5*GPU)+(numCores*CPU))*multiplier;
        
      //Determine recommended graphics quality 
      
      if (perfScore>17000){
         ReGraQy = "Ultra";
        } 
      else if (perfScore>15000 && perfScore<=17000){
         ReGraQy = "High";
       }
      else if (perfScore>13000 && perfScore<=15000){
         ReGraQy = "Medium";
         }
      else if(perfScore>11000 && perfScore<=13000){
         ReGraQy = "Low";
        }
      else if (perfScore <= 11000){
         ReGraQy = "Unable to play";      
        }       
                        
       // Display output
      
       System.out.println(qualityName);
       System.out.printf("\nGPU Clock Speed:%.0f HMz ",GPU);
       System.out.printf("\nCPU Clock Speed:%.0f HMz ",CPU);
       System.out.printf("\nNumber of cores:%s ",numCores);
       System.out.printf("\nMonitor Resolution:%s ",monitorRe);
       System.out.printf("\nPerformance Score: %,.3f ",perfScore);
       System.out.printf("\nRecommended Graphics Quality:%s ",ReGraQy);
      
   
   
      }
   
   }
}
}