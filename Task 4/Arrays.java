class Arrays {


public static void main(String[] args) {
        int[] intArray = {5,2,8};
        String[] stringArray = {"One", "Five", "Eight"};
        boolean[] booleanArray = {true, false};

        printStrings(stringArray);
        sumOfInt(intArray);
        averageInt(intArray);
}


//Function to print all strings in the given array
public static void printStrings (String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
                System.out.println(stringArray[i]);
        }
}

//Function that adds all given ints in the array into sum
public static void sumOfInt (int[] intArray) {
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
        }
        System.out.println("Sum: " + sum);
}

//Function that prints out the average number of the int array
public static void averageInt (int[] intArray) {
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];

        }
        int average = sum/intArray.length;
        System.out.println("Average int: " + average);
}

//
public static void sortIntInArray (int[] intArray){
  int[] sortedArray = new int[intArray.length];

}

}
