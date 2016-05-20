package logika;

/**
 * Created by GR6 on 20.05.16.
 */
public class ProduktWDostawieTO {
    private String nazwa;
    private String rodzajOpakowania;
    private int liczbaOpakowan;
    private int liczbaLuzem;

    private int liczbaOpakowanZinwenataryzowanych;
    private int liczbaLuzemZinwenataryzowanych;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getRodzajOpakowania() {
        return rodzajOpakowania;
    }

    public void setRodzajOpakowania(String rodzajOpakowania) {
        this.rodzajOpakowania = rodzajOpakowania;
    }

    public int getLiczbaOpakowan() {
        return liczbaOpakowan;
    }

    public void setLiczbaOpakowan(int liczbaOpakowan) {
        this.liczbaOpakowan = liczbaOpakowan;
    }

    public int getLiczbaLuzem() {
        return liczbaLuzem;
    }

    public void setLiczbaLuzem(int liczbaLuzem) {
        this.liczbaLuzem = liczbaLuzem;
    }

    public int getLiczbaOpakowanZinwenataryzowanych() {
        return liczbaOpakowanZinwenataryzowanych;
    }

    public void setLiczbaOpakowanZinwenataryzowanych(int liczbaOpakowanZinwenataryzowanych) {
        this.liczbaOpakowanZinwenataryzowanych = liczbaOpakowanZinwenataryzowanych;
    }

    public int getLiczbaLuzemZinwenataryzowanych() {
        return liczbaLuzemZinwenataryzowanych;
    }

    public void setLiczbaLuzemZinwenataryzowanych(int liczbaLuzemZinwenataryzowanych) {
        this.liczbaLuzemZinwenataryzowanych = liczbaLuzemZinwenataryzowanych;
    }
}
