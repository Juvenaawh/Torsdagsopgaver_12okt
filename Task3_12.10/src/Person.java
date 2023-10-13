// 3.1 Lav en klasse Person, med feltet name.
// Lav også en konstruktør og relevant getter- og setter-metode.
// Lav derudover metoden boolean addCourse(String course).
// Metoden skal ikke gøre noget, så du kan lade den returnere true og ikke gøre andet (en dummy-metode)

public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);

}
