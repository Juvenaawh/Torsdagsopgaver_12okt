// 3.6 Lav en klasse Main med en main-metode, hvor du tester Student og Teacher.
// Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists af Strings (beståede kurser til de studerende og canTeach-kurser til underviserne).
// Gem alle dine objekter i en ArrayList persons.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Java 1.0");
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> passedCourses3 = new ArrayList<>();
        ArrayList<String> passedCourses4 = new ArrayList<>();
        ArrayList<String> currentCoursesS = new ArrayList<>();

        Student s1 = new Student("Tilde", passedCourses, currentCoursesS);
        Student s2 = new Student("Martin", passedCourses2, currentCoursesS);
        Student s3 = new Student("Jens", passedCourses3, currentCoursesS);
        Student s4 = new Student("Patrick", passedCourses4, currentCoursesS);

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Java 1.0");
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Physics");
        canTeach2.add("English");
        ArrayList<String> currentCoursesT = new ArrayList<>();
        currentCoursesT.add("Algebra");
        currentCoursesT.add("Biology");
        ArrayList<String> currentCoursesT2 = new ArrayList<>();
        currentCoursesT2.add("History");

        Teacher t1 = new Teacher("Hanne", canTeach, currentCoursesT);
        Teacher t2 = new Teacher("Jørgen", canTeach2, currentCoursesT2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(t1);
        persons.add(t2);

// 3.7 Kør din persons-liste igennem med en for-løkke og tilføj kurset "Java 1.0" til dem alle
// (sørg for at nogle af dine studerende allerede har bestået dette og andre ikke har,
// samt at nogle af underviserne er kvalificerede til at undervise i det og andre ikke er).
// Hver gang ét af dine kald til addCourse() returnerer false, skal du printe navnet på den studerende eller underviseren.
// Hvis det er en Student skal du også printe " har allerede bestået dette kursus." og hvis det er en Teacher skal du også printe " kan ikke undervise i dette fag".

        for(Person p: persons){
            boolean b = p.addCourse("Jave 1.0");

            if(!b){
                if(p instanceof Student){
                System.out.println(p.getName() + " have already passed this course.");
            }
            else if(p instanceof Teacher) {
                    System.out.println(p.getName() + " can not teach this course.");
                }
            }
        }
    }
}