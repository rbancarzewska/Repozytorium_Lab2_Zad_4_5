public class Pracownik//Tworze klase Pracownik
    //Pola klasy
   {private String imie;
    private String nazwisko;
    private int id;
    // Konstruktor
    public Pracownik (String imie, String nazwisko, int id)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.id=id;

    }
    //Metoda wyswietlania
    public void drukuj()
    {
        System.out.println("Dane podstawowe pracownika: ");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Id: "+id);

    }
}

