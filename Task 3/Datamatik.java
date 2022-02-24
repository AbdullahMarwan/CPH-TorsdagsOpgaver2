class Datamatik {

public static void main(String[] args) {
  Teacher Tobias = new Teacher("Tobias", 35, false);
  Student Abdullah = new Student("Abdullah", 21, false, "Gruppe F");
  Student Natasja = new Student("Natasja", 22, false, "Team 5");


  System.out.println("Teacher's name: " + Tobias.name);
  System.out.println("First Student name: " + Abdullah.name + " from Team " + Abdullah.datamatikerTeam);
  System.out.println("Second Student name: " + Natasja.name + " from Team " + Natasja.datamatikerTeam);
}
}
