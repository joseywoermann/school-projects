
/**
 * Beschreiben Sie hier die Klasse Benutzerverwaltung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Benutzerverwaltung
{
    private BinarySearchTree<Benutzerprofil> benutzerBaum;
    /**
     * Konstruktor für Objekte der Klasse Benutzerverwaltung
     */
    public Benutzerverwaltung()
    {
        benutzerBaum = new BinarySearchTree<Benutzerprofil>();
    }
    
    public void neuenNutzerAnlegen(String pBenutzername, String pPw)
    {
        Benutzerprofil b = new Benutzerprofil(pBenutzername, pPw);
        benutzerBaum.insert(b);
    }
    
    public void nutzerLoeschen(String pBenutzername, String pPw)
    {
        Benutzerprofil b = new Benutzerprofil(pBenutzername, pPw);
        benutzerBaum.remove(b);
    }
    
    public boolean profilVorhanden(String pBenutzername) 
    {
        Benutzerprofil b = new Benutzerprofil(pBenutzername, "");
        Benutzerprofil ergebnis = benutzerBaum.search(b);
        if(ergebnis != null)
        {
            return true;
        }
        else return false;
    }
}
