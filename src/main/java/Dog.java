
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author makay
 */
public class Dog {
    String petType = "dog";
    String petName;
    int petAge;
    int dogSpace = 20;
    int daysStay;
    char returning;
    double groomingFee;
    double totalCost;
    double dailyBoard;
    int dogWeight;
    String grooming;
    int dogSpaceNbr;
  Character c1;
  Character c2;
    public Dog(){
    }
    
     
    public int checkIn(){
        Dog checkIn = new Dog();
        Scanner scnr = new Scanner(System.in);
        petType = "dog";
       
        c1 = new Character('r');
        c2 = new Character('n');
        boolean yesEqualR = c1.equals(returning);
        boolean yesEqualN = c2.equals(returning);
        
       
            
            if (dogSpace < 30 ){
                
            System.out.println("If your dog is new, type n. If your dog is returning, type r");
            char returning = scnr.next().charAt(0);
            
            if (yesEqualN == true){ 
                getPet();
                createPet();
                
                daysStay = checkIn.createPet();
       
                    }
        else if (yesEqualR == true){
            getPet();
            updatePet();
            
            daysStay = checkIn.updatePet();
        }
            }
        else if (dogSpace >= 30){
            
        System.out.println("Unfortunately, we do not have any space available for your dog.");
        }
        return daysStay;
    
    }
    public void setCheckIn(int nDaysStay){
        daysStay = nDaysStay;
    }
   
    public double checkOut(){
        Dog checkOut = new Dog();
        
        checkOut.getGrooming();
        double groomingFee = checkOut.getGrooming();
        checkOut.setGrooming(groomingFee);
        
        checkOut.getDogWeight();
        int dogWeight = checkOut.getDogWeight();
        checkOut.setDogWeight(dogWeight);
       
        checkOut.checkIn();
        daysStay = checkOut.checkIn();
        checkOut.setCheckIn(daysStay);
 
        double totalCost;
       
       if (grooming.equals("yes")){
           
       if (dogWeight <20 ){
           dailyBoard = 24.00;
       }
       else if(dogWeight >= 20 && dogWeight < 30){
                dailyBoard = 29.00;
       }
        else if (dogWeight >= 30 ){
                dailyBoard = 34.00;
        } 
       }     
       else if (grooming.equals("no")) {
           System.out.println("Dog will not be groomed. ");
       }
    
       totalCost = groomingFee + (dailyBoard * daysStay);
       
       return totalCost;
    }
 
    public String getPet(){
        Scanner scnr = new Scanner(System.in);
        String petName;
   
        System.out.println("Please enter your " + petType + "'s name: ");
        petName = scnr.nextLine();
        return petName;
    }
   
    public int createPet(){
        Scanner scnr = new Scanner(System.in);
         petType.equals("dog");
        System.out.println("How many days will your dog stay? ");
        daysStay = scnr.nextInt(); 
        System.out.println("This is a " + petType + "whose name is " + petName);
        return  daysStay;
}
   
    public int updatePet(){
        
       Scanner scnr = new Scanner(System.in);
       petType.equals("dog");
            System.out.println("How many days will your dog stay? ");
            daysStay = scnr.nextInt(); 
            System.out.println("This is a " + petType + "whose name is " + petName);
            return daysStay;
        
    }
    
    public double getGrooming(){
        Scanner scnr = new Scanner(System.in);
         if (daysStay >= 2 ){
                System.out.println("Would you like for your dog to be groomed? enter yes or no ");
                String grooming = scnr.nextLine();
                if (grooming.equals( "yes")){
                if (dogWeight < 20){
                groomingFee = 19.95;
                }
                else if(dogWeight >= 20 && dogWeight < 30){
                groomingFee = 24.95;
                }
                else if (dogWeight >= 30){
                groomingFee = 29.95;
                }
                }
                if (grooming.equals("no")) {
                System.out.println("Dog will not be groomed. ");
                }
         }
         return groomingFee;
    }

    
    public void setGrooming(double newGroomingFee){
        groomingFee = newGroomingFee;
    }
    public int getDogWeight(){
        Scanner scnr = new Scanner(System.in);
         System.out.println("Please enter your dog's weight in pounds (ex: 15): ");
         int dogWeight = scnr.nextInt();
        return dogWeight;
    }
    public void setDogWeight(int newDogWeight){
        dogWeight = newDogWeight;
    }


    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        
        Dog newPetType = new Dog();
   
        newPetType.checkIn();
       
        int dogWeight = newPetType.getDogWeight();
        newPetType.setDogWeight(dogWeight);
        
        double groomingFee = newPetType.getGrooming();
        newPetType.setGrooming(groomingFee);
        
        double totalCost = newPetType.checkOut();
       System.out.println("The total cost is " + totalCost);
        
    }
    
}
