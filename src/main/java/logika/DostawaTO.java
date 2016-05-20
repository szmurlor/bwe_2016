package logika;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by GR6 on 20.05.16.
 */
public class DostawaTO {
    private String nrRejestracyjny;
    private String typPojazdu;
    private Date dataDostawy;
    private String stanowiskoBWE;
    private int liczbaPalet;

    private String status;

    private List<ProduktWDostawieTO> produkty = new LinkedList<ProduktWDostawieTO>();

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getTypPojazdu() {
        return typPojazdu;
    }

    public void setTypPojazdu(String typPojazdu) {
        this.typPojazdu = typPojazdu;
    }

    public Date getDataDostawy() {
        return dataDostawy;
    }

    public void setDataDostawy(Date dataDostawy) {
        this.dataDostawy = dataDostawy;
    }

    public String getStanowiskoBWE() {
        return stanowiskoBWE;
    }

    public void setStanowiskoBWE(String stanowiskoBWE) {
        this.stanowiskoBWE = stanowiskoBWE;
    }

    public int getLiczbaPalet() {
        return liczbaPalet;
    }

    public void setLiczbaPalet(int liczbaPalet) {
        this.liczbaPalet = liczbaPalet;
    }

    public List<ProduktWDostawieTO> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<ProduktWDostawieTO> produkty) {
        this.produkty = produkty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
