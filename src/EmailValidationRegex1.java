import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
public class EmailValidationRegex1 {
	public static void main(String[] args) {
		
	
ArrayList<String> emails = new ArrayList<String>();
emails.add("user@domain.com");
emails.add("user@domain.co.in");
emails.add("user.name@domain.com");
emails.add("user_name@domain.com");
emails.add("username@yahoo.corporate.in");
 
//Invalid emails
emails.add(".username@yahoo.com");
emails.add("username@yahoo.com.");
emails.add("username@yahoo..com");
emails.add("username@yahoo.c");
emails.add("username@yahoo.corporate");
 
String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]"
		+ "+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
 
Pattern pattern = Pattern.compile(regex);
 
for(String email : emails){
  Matcher matcher = pattern.matcher(email);
  System.out.println(email +" : "+ matcher.matches());
}
}

	@Override
	public String toString() {
		return "EmailValidationRegex1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}