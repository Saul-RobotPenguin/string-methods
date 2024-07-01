import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10


        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());


        s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+"how are you");


        s1="HELLO HOW Are You?";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);

        s1="hello how are you";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);


        //------By using concat method----
         str1 = "Learn ";
         str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "
        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        s1 = "Supplement" + 'B'; // s1 becomes SupplementB


        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));


        s1="hello";
        s2="hello";
        s3="hemlo";
        s4="flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4));



        str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));


        str1 = "Java is fun";
        int result2;

        // getting index of character 's'
        result2 = str1.indexOf('s');

        System.out.println(result2); // 6

        // getting index of character 'J'
        result2 = str1.lastIndexOf('J');
        System.out.println(result2); // 0


        // the last occurrence of 'a' is returned
        result2 = str1.lastIndexOf('a');
        System.out.println(result2); // 3

        // character not in the string
        result2 = str1.lastIndexOf('j');
        System.out.println(result2); // -1

        // getting the last occurrence of "ava"
        result2 = str1.lastIndexOf("ava");
        System.out.println(result2); // 1

        // substring not in the string
        result2 = str1.lastIndexOf("java");
        System.out.println(result2); // -1

        str1 = "Learn Java";

        Boolean result3;

        // check if str1 contains "Java"
        result3 = str1.contains("Java");
        System.out.println(result3);  // true

        // check if str1 contains "Python"
        result3 = str1.contains("Python");
        System.out.println(result3);  // false

        // check if str1 contains ""
        result3 = str1.contains("");

        System.out.println(result3);  // true


        str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));


        str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));


        s1="PerScholas";
        s2="PerScholas";
        s3=new String("PerScholas");
        s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        s1="Perscholas";
        s2="Perscholas";
        s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);

        s1="Perscholas";
        s2="Perscholas";
        s3="Perschola";
        s4="PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )











    }





}