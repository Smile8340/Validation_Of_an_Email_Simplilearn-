

import java.util.Arrays;

import java.util.Scanner;

public class Email_Validation {

/*
    Project objective:
    As a developer, write a program to search a string entered by a user from the array of strings.
    Background of the problem statement:
    You have an array of email IDs of employees. As a programmer, write a program to search the email ID entered by a user.
    You must use the following:
    Eclipse/IntelliJ: An IDE to code the application
    Java: A programming language
    Git: To connect and push files from the local system to GitHub
    GitHub: To store the application code and track its versions
    Core Java concepts: Methods, collections, and strings
    Following requirements should be met:
    The versions of the code should be tracked on GitHub repositories
    The code should be able to search the required string from the array of strings
 */



    public static void main(String[] args){

        String[] emailList = new String[10];

        emailList[0] = "BTS@0000.com";
        emailList[1] = "RM@s1111.com";
        emailList[2] = "Jimin@2222.com";
        emailList[3] = "Jin@3333.com";
        emailList[4] = "Jungkook@4444.com";
        emailList[5] = "Suga@5555.com";
        emailList[6] = "Jhope@6666.com";
        emailList[7] = "Taehyung@7777.com";
        emailList[8] = "Dynamite@8888.com";
        emailList[9] = "Butter@9999.com";

        Scanner sc = new Scanner(System.in);
        System.out.println("Email addresses in current Array: " + Arrays.toString(emailList));

        System.out.println("\nEnter an email address OR email id to check if there is an associated email address in "+
                "the Array.");
        System.out.println("Note: email addresses and ids are case sensitive!");

        String searchStr = sc.nextLine();

        System.out.println(checkIfEmailExists(searchStr, emailList));


    }

    // Method is only used for the Array implementation
    private static String checkIfEmailExists(String searchStr, String[] emailList){
        for (String s : emailList) {
            if (s.toLowerCase().equals(searchStr.toLowerCase()) ||
                    searchStr.toLowerCase().equals(s.substring(0, s.indexOf('@')).toLowerCase()))
                return "\n\"" + searchStr + "\"" + " exists in the Array!\n" + "Matched email: " + s;
        }
        return "\""+searchStr+"\""+" does not exist in the Array.";
    }


}