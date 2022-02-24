class Main {
public static boolean happy = true;

public static String helloWorld = "Hello World";

public static void main(String [] args) {
        if (iAmHappy())
        {
                System.out.println("I clap my hands");
        }
        else
        {
                System.out.println("I don't clap my hands");
        }

        addInts(10, 15);
        upperCaseIt(helloWorld);
        isFirstLetterUpperCase(helloWorld);
        System.out.println(isFirstLetterUpperCase(helloWorld));
}


public static boolean iAmHappy()
{
        if (happy) {
                return true;
        }

        return false;
}

//Function to add the given numbers together
public static int addInts(int a, int b){
        int sum = a + b;
        System.out.println("Sum = " + sum);

        return sum;
}

//Function to uppercase the given text
public static String upperCaseIt (String text){
        text = text.toUpperCase();
        System.out.println("Text UpperCased: " + text);

        return text;
}

public static boolean isFirstLetterUpperCase (String text) {
        char singleChar = text.charAt(0);

        if (Character.isUpperCase(singleChar)) {
          return true;
        }

        return false;
}

}
