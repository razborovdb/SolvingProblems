package hackerrank.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            Pattern pattern = Pattern.compile("<([^<>]+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group(2));
                while (matcher.find()) System.out.println(matcher.group(2));
            } else System.out.println("None");

            testCases--;
        }
    }
}
