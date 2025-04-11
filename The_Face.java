/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naledi_Moloto;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class The_Face {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        String Firstname,Lastname,Username,Password, Phone;//Prompts user to receive their input
        
        System.out.println("**********************");
        System.out.println("*******Register*******");
        System.out.println("**********************");
        System.out.print("Enter First Name:");
        Firstname = input.nextLine();
        System.out.print("Enter Last Name:");
        Lastname = input.nextLine();
        System.out.print("Enter Username:");
        Username = input.nextLine();
        System.out.print("Enter Password:");
        Password = input.nextLine();
        System.out.print("Enter Phone Number(starting with South African international code (+27)):");
        Phone= input.nextLine();
        
        
        Login login = new Login();//Instantiates and creates Login object
        
        boolean validatePhone = login.checkCellPhonenumber (Phone);
        boolean validateUsername= login.checkUserName(Username);
        boolean validatePassword= login.checkPasswordComplexity(Password);
        
        //Validates Username
        if (validateUsername==true){
           System.out.println("Username captured successfully");
        }else{
           System.out.println("Username is incorrectly formatted, please ensure it contains an underscore and contains no more than five characters in length"); 
        }
        
        //validates Password
        if(validatePassword==true){
           System.out.println("Password captured successfully");
        }else{
          System.out.println("Password is incorrecrtly formatted, please ensure it contains the following: At least 8 characters; A capital letter; A small letter; A special character.");  
        }
        //Validates Phonenumber
        if (validatePhone==true){
           System.out.println("CellPhonenumber successfully captured");
        }else{
          System.out.println("CellPhonenumber is incorrectly formatted or does not contain international code");  
        }
        
        if (validateUsername==true && validatePassword==true && validatePhone==true){
            System.out.println("You have registered successfully!");
            String loginUsername;
            String loginPassword;
            
            System.out.println("*********************");
            System.out.println("*******LOGIN*********");
            System.out.println("*********************");
            
            System.out.print("Enter Username:");
            loginUsername = input.nextLine();
            System.out.print("Enter Password");
            loginPassword = input.nextLine();
            
           if (loginUsername.equals(Username) && loginPassword.equals(Password)){
               System.out.println("Welcome" + Firstname + " " + Lastname + "Great to see you again.");
           }else{
              System.out.println("Login failed! incorrect Username or Password");
           }
           }else{
               System.out.println(" Failed to register!");
               main(null);
           } 
        }
        
         
        
    }
    

