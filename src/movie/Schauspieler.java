package movie;


public class Schauspieler {
    String vorname;
    String name;
    int gehalt;
    int erfahrung;
    float erfolgsfaktor;
    public Genre genre;


    public  Schauspieler() //übergibt was
    {
        Genre newGenre = new Genre("Thriller",80);
        setGenre(newGenre);
    }
    public Schauspieler(String vorname, String name)
    {
        this (vorname,name,25000,80,0.3f);
    }
    public  Schauspieler(String vorname, String name,int gehalt,int erfahrung,float erfolgsfaktor)
    {
        this.vorname = vorname;
        this.name = name;
        this.gehalt = gehalt;
        this.erfahrung = erfahrung;
        this.erfolgsfaktor = erfolgsfaktor;
    }
    public void getInfos()
    {
        System.out.println("Gehalt von " + vorname + " " + name + ": " + gehalt);
        System.out.println("Erfahrung von " + vorname + " " + name + ": " + erfahrung);
        System.out.println("Erfolgsfaktor von " + vorname + " " + name + ": " + erfolgsfaktor);
    }
    public Schauspieler getErfahrenerSchauspieler(Schauspieler s2)
    {
        return this.erfahrung > s2.erfahrung ? this : s2;
    }
    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }
}
