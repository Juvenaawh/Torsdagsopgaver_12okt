// 4.2 Lav to klasser, Circle og Square, som implementerer interfacet.
// Lad de to klasser tage en double som parameter i konstruktøren.
// Denne double repræsenterer henholdsvis radius og længde på en cirkel og et kvadrat.
// Metoderne getArea() skal returnere cirklens eller kvadratets areal.
// Arealet for en cirkel er pi * r² (altså 3,14 * (radius * radius)).
// Test i en main, at getArea()-metoderne virker som du forventer.

public class Circle implements Shape{

    double c;

    Circle(double c){
        this.c = c;
    }

    @Override
    public void getArea() {

    }

}
