// 2.1 Hent klassen Cinema.java og klassen FindFemFejl.java.
// Kig koden igennem og dan dig et overblik over hvad den gør.
// 2.2 Kør main-metoden i FindFemFejl.java. Koden vil fejle.
// 2.3 Find ud af hvorfor koden fejler og ret Cinema til, så koden kører uden fejl.
// Der er fem ting, der skal rettes i koden.

public class Main {
    public static void main(String[] args) {

        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Reserver række 9, sæde 7
        System.out.println("Række 9, sæde 7 er reserveret: " + biogrande.reserve(9, 7));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));

    }
}