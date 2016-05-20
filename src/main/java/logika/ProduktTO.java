package logika;

/**
 * Created by GR6 on 20.05.16.
 */
public class ProduktTO {
    private String nazwa;
    private String kodEAN;
    private String waga;
    private String producent;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKodEAN() {
        return kodEAN;
    }

    public void setKodEAN(String kodEAN) {
        this.kodEAN = kodEAN;
    }

    public String getWaga() {
        return waga;
    }

    public void setWaga(String waga) {
        this.waga = waga;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }
}
