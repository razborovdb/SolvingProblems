Q: How to replace all non-alphanumeric characters with empty strings?
A:
replaceAll("[^A-Za-z0-9]", "");


Q: How to replace 2 or more spaces with single space in string and delete leading and trailing spaces?

Example - String test = " Test String " should be returned as "Test String"
A:
replaceAll("\\s{2,}", " ").trim();


Q: Create a regular expression that accepts alphanumeric characters only. Its length must be five characters long only
A:
import java.util.regex.*;

public class RegexTutorial {
public static void main(String args[]) {
System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "java1"));
System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "java12"));
System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "JA1Va"));
System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "Java$"));
}
}


Q: Create a regular expression that accepts 10 digit numeric characters starting with 1, 2 or 3 only.
A:
import java.util.regex.*;

public class RegexTutorial{

	public static void main(String args[]) {
		System.out.println("Regex Using character classes and quantifiers");

		System.out.println(Pattern.matches("[123]{1}[0-9]{9}", "1953038949"));
		System.out.println(Pattern.matches("[123][0-9]{9}", "1993038949"));

		System.out.println(Pattern.matches("[123][0-9]{9}", "9950389490"));
		System.out.println(Pattern.matches("[123][0-9]{9}", "695338949"));
		System.out.println(Pattern.matches("[123][0-9]{9}", "885338949"));

		System.out.println("Regex Using Metacharacters");
		System.out.println(Pattern.matches("[123]{1}\\d{9}", "2885338949"));
		System.out.println(Pattern.matches("[123]{1}\\d{9}", "685308949"));

	}
}