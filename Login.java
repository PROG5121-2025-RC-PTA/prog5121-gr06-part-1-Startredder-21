/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naledi_Moloto;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
    public Login(){
}
    public boolean checkUserName (String username){
        
        if (username.contains ("_") && username.length() <=5) {
            return true;
        }else{
            return false;
        }
    }
    public boolean checkPasswordComplexity(String password){
        String Capital = ".*[A-Z].*";//checks for capital letters
        String Small = ".*[a-z].*";//checks for small letters
        String Special = ".*[!@#$%^&*(),.?\":{}|<>].*";//checks for special characters
        String Digit = ".*\\d.*";//checks for digit characters
        if (password.length() >=8 && password.matches(Capital) && password.matches(Small) && password.matches(Digit) && password.matches(Special)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkCellPhonenumber (String phone){
        String SACode = "+27";
        String firstThreeCharacters = phone.substring(0,3);//Retrieves characters from index 0-2 (inclusive)
        
        int fourthDigit = Character.getNumericValue(phone.charAt(3));//Retrives and converts the fourth digit
        if (phone.length ()<=12 && firstThreeCharacters.equals(SACode) && fourthDigit >=6 && fourthDigit <=8){
            return true;
        }else{
            return false;
        }
    }
    
    public String registerUser(String Username, String Password, String Phone){
        boolean validatePhone = checkCellPhonenumber (Phone);
        boolean validateUsername = checkUserName (Username);
        boolean validatePassword = checkPasswordComplexity (Password);
        
        if (validateUsername ==true && validatePhone ==true && validatePassword ==true){
            return "Successful User registration";
        }else{
            return "Failed User registration!!!";
        }
        
    }
    
    public boolean LoginUser(String username, String password){
        boolean validateUsername = checkUserName (username);
        boolean validatePassword = checkPasswordComplexity (password);
        
        if (validateUsername ==true && validatePassword ==true){
            return true;
        }else{
            return false;
        }
    }
    public String returnLoginStatus(String username, String password){
        boolean validateUsername = checkUserName (username);
        boolean validatePassword = checkPasswordComplexity(password);
        
        if (validateUsername==true && validatePassword==true){
            return "Successful login";
        }else{
            return "Failed Login";
        }
    }
}