import java.util.regex.*;  
import java.util.ArrayList;
import java.util.List;  
import java.util.*;  
public class EmailValidationRegex {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	          
	        emails.add("Priyanka@domain.co.in");  
	        emails.add("priYanka@domain.com");  
	        emails.add("priyaNka.name@domain.com");  
	        emails.add("pRiyanka#@domain.co.in");  
	        emails.add("priyankat@domain.com");   
	        emails.add(".priyankat@yahoo.com");  
	        emails.add("priyanka@domain.com.");  
	        emails.add("priyanka#domain.com");  
	        emails.add("priyanka@domain..com");  
	        //Regular Expression   
	        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
}
