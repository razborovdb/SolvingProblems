package hacker;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a regex to split String by new line?
//        String lines[] = string.split("\\r?\\n");


//        *	Zero or more occurrences	. * - Any sequence
//        ?	Zero or one occurrences(Optional)	[0-9]? - Any optional digit
//        +	One or more occurrences	[0-9]+ - One or more digit
//        {x}	x instance of occurrences	m{5} - Five instances of the letter m
//        {x,y}	between x and y instances of occurrences	[0-9]{13,19} - Between 13 and 19 digits
//        {x,}	at least x instances of occurrences	.{8,} - At least 8 characters



public class RegEx {
    //final static String regularExpression = "(^b[ab]*b$)|(^a[ab]*a$)|^.$";
    final static String regularExpression = "^a.*a$|^b.*b$|[a,b]";



    public static void main(String[] args)  {
        String s = "dfvSDF dsafSADF sdfSDF dfSDF sdfgSDF";
        String[] ss = s.split(" ");
        List<String> list = Arrays.stream(s.split(" ")).toList();

        list.stream().forEach(System.out::println);

        String[] result = new String[] {
                "a", "b", "abb", "baa", "aba"
        };


        for (int i = 0; i < result.length; i++) {
            String someString = result[i];

            if (someString.matches(regularExpression)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        System.out.println("-----------------------------");
        String data = "This is a test String and 'This is data we want'";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
        }
        System.out.println("-----------------------------");
        pattern = Pattern.compile("1");
        String test = "JavaInUse123";
        Matcher m = pattern.matcher(test);

        if (m != null){
            System.out.println(m.find());
            System.out.println(m.start() + "; " + m.end());
            System.out.println(m.matches());
        }


    }
}
