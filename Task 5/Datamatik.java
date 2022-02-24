class Datamatik {
static Student[] Students = new Student[10];

public static void main(String[] args) {
        Student Abdullah = new Student("Abdullah", 21, false, "Gruppe F");
        Student Natasja = new Student("Natasja", 22, true, "Team 5");
        Student Dummy1 = new Student("Dummy1", 20, false, "Team0");
        Student Dummy2 = new Student("Dummy2", 21, true, "Team0");
        Student Dummy3 = new Student("Dummy3", 22, false, "Team0");
        Student Dummy4 = new Student("Dummy4", 23, true, "Team0");
        Student Dummy5 = new Student("Dummy5", 24, false, "Team0");
        Student Dummy6 = new Student("Dummy6", 25, true, "Team0");
        Student Dummy7 = new Student("Dummy7", 26, false, "Team0");
        Student Dummy8 = new Student("Dummy8", 27, true, "Team0");

        Students[0] = Abdullah;
        Students[1] = Natasja;
        Students[2] = Dummy1;
        Students[3] = Dummy2;
        Students[4] = Dummy3;
        Students[5] = Dummy4;
        Students[6] = Dummy5;
        Students[7] = Dummy6;
        Students[8] = Dummy7;
        Students[9] = Dummy8;

        getStudentName(Students, 1);
        getStudentIndex(Students, "Dummy1");

        //System.out.println("First Student name: " + Abdullah.name + " from Team " + Abdullah.datamatikerTeam);
        //System.out.println("Second Student name: " + Natasja.name + " from Team " + Natasja.datamatikerTeam);
}

//Function that returns the name of the student from the given index and student array
public static String getStudentName (Student[] studentArray, int index){
  System.out.println("Student Name: " + studentArray[index].name);

  return studentArray[index].name;
}

//Function that compares the given name to the studentarray and returns the index of that student
public static int getStudentIndex (Student[] studentArray, String name){
  for (int i = 0; i < studentArray.length; i++){
    if (studentArray[i].name == name){
      System.out.println("Student Index: " + i);
      return i;
    }
  }

  return 0;
}


}
