import java.util.Scanner;
import java.util.ArrayList;


public class Some {
    public static class Quiz{
        private static int score=0;
        
        
      
        public static void question(){
            Scanner sc=new Scanner(System.in);
            
           System.out.println("Capital Of India");
           System.out.println("Press 1 for Banglore 2 for Kolkata 3 for Delhi 4 for Mumbai");
           int ans=sc.nextInt();
          
           if(ans==3){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
           
           System.out.println("Capital Of USA");
           System.out.println("Press 1 for New York 2 for Washington DC 3 for California 4 for L.A");
           int ans1=sc.nextInt();
          
           if(ans1==2){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
          
           System.out.println("Capital of Bangladesh");
           System.out.println("Press 1 for pargana 2 for Doiuy 3 for Qutob 4 for Dhaka");
           int ans2=sc.nextInt();
          
           if(ans2==4){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
          
           System.out.println("Capital of Nepal");
           System.out.println("Press 1 for doriya 2 for Kathmandu 3 for Thimpu 4 for arirya");
           int ans3=sc.nextInt();
           
           if(ans3==2){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
           
           System.out.println("Capital of Bhutan");
           System.out.println("Press 1 for Bangre 2 for Kohj  3 for Deorau 4 for Thimpu");
           int ans4=sc.nextInt();
           
           if(ans4==4){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
           
           System.out.println("Capital of SriLanka");
           System.out.println("Press 1 for Colombo 2 for Koata 3 for Deddi 4 for Mubai");
           int ans5=sc.nextInt();
           
           if(ans5==1){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
           
           System.out.println("Capital Of Myanmar");
           System.out.println("Press 1 for Basde 2 for Burma 3 for Delhddi 4 for Mkwe ai");
           
           int ans6=sc.nextInt();
           if(ans6==2){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
           
           System.out.println("Capital of Russia");
           System.out.println("Press 1 for Sochi 2 for Voscow 3 for Moscow 4 for St Pittsberg");
           int ans7=sc.nextInt();
    
           if(ans7==3){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
          
           System.out.println("Capital of France");
           System.out.println("Press 1 for Bajkcbore 2 for Paris 3 for Deldd 4 for Mumdwbai");
           int ans8=sc.nextInt();
           
           if(ans8==3){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
          
           System.out.println("Capital of Ukraine");    
            System.out.println("Press 1 for Kyiv 2 for Kharkiv 3 for Delcnqjhi 4 for Crimea");
           int ans9=sc.nextInt();
      
           if(ans9==1){
            System.out.println("Correct Answer");
            score++;
           }
           else{
            System.out.println("Wrong Answer");
           }
        System.out.println("Your Quiz is Completed ");
        if(score<4){
            System.out.printf("You Failed Your Score Is %d",score);
        }
        else{
            System.out.printf("You Passed With A Score Is %d",score);
        }
        }

    }
    public static void main(String[] args) {
        Scanner swc=new Scanner(System.in);
        
        
        System.out.println("Welcome To This Quiz Application on Computer Science");
        
    
        System.out.println(" Good Luck");
        Quiz obj=new Quiz();
        obj.question();


    }
}
