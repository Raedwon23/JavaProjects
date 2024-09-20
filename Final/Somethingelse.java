//A car rental management system that allows users to search for and rent cars
import java.util.*;





public class Somethingelse {
   public static class Rental {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> Bill = new ArrayList<Integer>();
        public Rental() {
            cars.add("Kwid|500/hr");
            cars.add("WagonR|300/hr");
            cars.add("Polo|600/hr");
            cars.add("Swift|500/hr");
            cars.add("Alto|250/hr");
        }
      
    }

    public static void main(String[] args) {
        Rental show =new Rental();
        while(true){
        System.out.println("Welcome To This Rental Service");
        System.out.println("What You Would Like To Do Today \n Press 1 For Renting a Car \n Press 2 For Listing a Car \n Press 3 For Logging out");
        Scanner sc= new Scanner(System.in);
       
        int input=sc.nextInt();
        if(input==1){
            System.out.println("Here are Some Cars Available For Rental");
            System.out.println(show.cars);
            int input1=sc.nextInt();
            System.out.println("Want To Hire One Then Press 1");
            if(input1==1){
                System.out.println("Which Car Would You Like To Hire");
                System.out.println("Kwid==500/hr \n WagonR==300/hr \n POLO==600/hr\n Swift==500/hr Alto==250/hr");
                System.out.println("Press 1 for Kwid Press 2 for WagonR Presss 3 For Polo Press 4 for Swift Press 5 for Alto");
                int input2=sc.nextInt();
                if(input2==1){
                    System.out.println("Your Order Is Booked");
                    show.cars.remove("Kwid");
                }
               else if(input2==2){
                    System.out.println("Your Order Is Booked");
                    show.cars.remove("WagonR");
                }
                else if(input2==3){
                    System.out.println("Your Order Is Booked");
                    show.cars.remove("Polo");
                }
                else if(input2==4){
                    System.out.println("Your Order Is Booked");
                    show.cars.remove("Swift");
                }
                else if(input2==5){
                    System.out.println("Your Order Is Booked");
                    show.cars.remove("Alto");
                }
                else{
                    System.out.println("Please Prompt An Actual Command");
                }
            }
        }
            else if(input==2){
                System.out.println("Hello ThankYou For Listing a car");
                System.out.println("What Kind Of Car Would You Like To List ");
                String wooo=sc.next();
                System.out.println("What Would Be The Cost Per Hour");
                int kyooo=sc.nextInt();
                String q=wooo+"=="+kyooo+"/hr";
                show.cars.add(q);
                System.out.println(" ");
                System.out.printf("Your %s Car  Has been Listed For %d",wooo,kyooo);
            }
            else if (input==3){
                System.out.println("ThankYou For Using Our Car Rental Service");
                System.out.println("Logging Out");
                
                break;
            }
            else{
                System.out.println("InValid Prompt");
            }

            sc.close();
        

    }
    }
}
