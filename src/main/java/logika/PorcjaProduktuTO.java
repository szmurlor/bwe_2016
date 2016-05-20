package logika;

/**
 * Created by GR6 on 20.05.16.
 */
public class PorcjaProduktuTO {
    private ProduktTO produkt;
    private RodzajOpakowania rodzajOpakowania;
    private int liczba;

    public ProduktTO getProdukt() {
        return produkt;
    }

    public void setProdukt(ProduktTO produkt) {
        this.produkt = produkt;
    }

    public RodzajOpakowania getRodzajOpakowania() {
        return rodzajOpakowania;
    }

    public void setRodzajOpakowania(RodzajOpakowania rodzajOpakowania) {
        this.rodzajOpakowania = rodzajOpakowania;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
