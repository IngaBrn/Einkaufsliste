
/**
 * @author 
 * @version 
 */
public class Einkaufsliste
{
    // Bezugsobjekte

    // Attribute
    List<Produkt> produktliste;

    // Konstruktor
    public Einkaufsliste()
    {
        produktliste = new List();
    }

    // Dienste
    public void fuegeProduktHinzu(Produkt p)
    {
        produktliste.append(p);
    }
    
    public void loescheProdukt()
    {
    
    }
    
    public void gebeProduktAus()
    {
    
    }
}
