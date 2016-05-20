package dao;

import logika.DostawaTO;
import logika.ProduktWDostawieTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by GR6 on 20.05.16.
 */
public class BWEDAO {
    List<DostawaTO> _dostawy = new LinkedList<>();

    public BWEDAO() {
        bootstrap();
    }

    private void bootstrap() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            DostawaTO d = new DostawaTO();
            d.setDataDostawy(sdf.parse("2016-05-20"));
            d.setLiczbaPalet(10);
            d.setNrRejestracyjny("WD 0098A");
            d.setStanowiskoBWE("BWE02");
            d.setStatus("Pojazd podjechał");
            d.setTypPojazdu("Samochód dostawczy");

            ProduktWDostawieTO p = new ProduktWDostawieTO();
            p.setLiczbaLuzem(4);
            p.setLiczbaOpakowan(12);
            p.setNazwa("Dezodorant marki perspirant");
            p.setRodzajOpakowania("Pudełko główne");
            d.getProdukty().add(p);

            p = new ProduktWDostawieTO();
            p.setLiczbaLuzem(0);
            p.setLiczbaOpakowan(8);
            p.setNazwa("Mydełka Faaa");
            p.setRodzajOpakowania("Pudełko główne");
            d.getProdukty().add(p);

            _dostawy.add(d);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<DostawaTO> getDostawy() {
        return _dostawy;
    }
}
