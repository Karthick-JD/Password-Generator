package PasswordGenerator;

import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the password:");
        int length = sc.nextInt();
        System.out.println(generatePassword(length));
        sc.close();
    }
    
    public static String generatePassword(int length) {
        String password = "";
        
        String lower_cased = "abcdefghijklmnopqrstuvwxyz";
        String upper_cased = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_char = "!@#$%^&*";
        
        for(int i = 0; i < length; i++) {
            int rand = (int)(4 * Math.random());
            
            switch(rand) {
                case 0: {
                    password += String.valueOf((int)(10 * Math.random()));
                    break;
                }
                case 1: {
                    int index = (int)(lower_cased.length() * Math.random());
                    password += String.valueOf(lower_cased.charAt(index));
                    break;
                }
                case 2: {
                    int index = (int)(upper_cased.length() * Math.random());
                    password += String.valueOf(upper_cased.charAt(index));
                    break;
                }
                case 3: {
                    int index = (int)(special_char.length() * Math.random());
                    password += String.valueOf(special_char.charAt(index));
                    break;
                }
            }
        }
        
        return password;
    }
}