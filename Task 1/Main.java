public class Main {

String name;
int age;

public static void main(String[] args) {
        printEmptyLine();
        printGivenString("Hello");
        printNameAndAge(20, "Abdullah");

}

public static void printEmptyLine(){
        System.out.println("");
}

public static void printGivenString (String givenString){
        System.out.println(givenString);
}

public static void printNameAndAge (int age, String name){
        System.out.println("My name is " + name + ", I am " + age + " years old");
}

}
