
/**
 * Beschreiben Sie hier die Klasse Benutzerprofil.
 * 
 * @author A. Löhr
 * @version 15.02.2015
 */
public class Benutzerprofil implements ComparableContent<Benutzerprofil>
{
    private String benutzername, pw;
    /**
     * Konstruktor für Objekte der Klasse Benutzerprofil
     */
    public Benutzerprofil(String pBenutzername, String pPw)
    {
        benutzername = pBenutzername;
        pw = pPw;
    }
    
    public String getBenutzername()
    {
        return benutzername;
    }
    
    public boolean isGreater(Benutzerprofil pProfil)
    {
        return this.getBenutzername().compareTo(pProfil.getBenutzername())>0;
    }
    
    public boolean isLess(Benutzerprofil pProfil)
    {
        return this.getBenutzername().compareTo(pProfil.getBenutzername())<0;
    }
    
    public boolean isEqual(Benutzerprofil pProfil)
    {
        return this.getBenutzername().compareTo(pProfil.getBenutzername())==0;
    }

}
