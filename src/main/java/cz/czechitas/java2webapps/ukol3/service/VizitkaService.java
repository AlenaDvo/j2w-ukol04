package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkaService {
    private final List<Vizitka> seznamVizitek = new ArrayList<>();

    public VizitkaService() {
        seznamVizitek.add(
                new Vizitka(
                        "Alena Dvořáková",
                        "Oracle s.r.o.",
                        "Karlovo náměstí 2097/9",
                        "120 00 Praha 2",
                        "alenadvorakova@oracle.com",
                        "+420 608541324",
                        "www.oracle.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Pavlína Sedláčková",
                        "Google Ltd.",
                        "Antonínova 5174",
                        "760 01 Zlín",
                        null,
                        "+420 608745963",
                        "www.google.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Helena Szewieczek",
                        "Amazon a.s.",
                        "Hlavní třída 439/71",
                        "73601 Havířov",
                        "helenaszewieczek@amazon.com",
                        null,
                        "www.amazon.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Hana Martinková Kuchyňková",
                        "Microsoft Ltd.",
                        "Tomanova 1530/7",
                        "61300 Brno",
                        "hanamartinkovakuchynkova@microsoft.com",
                        "+420 608745963",
                        null
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Dagmar Podkulová",
                        "Apple s.r.o.",
                        "Hlavní třída 679/116",
                        "70800 Ostrava",
                        null,
                        null,
                        "www.apple.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Vlastimil Černíček",
                        "Czechitas z. s.",
                        "Lipová 1789/9",
                        "37005 České Budějovice",
                        "vlastimil.cernicek@czechitas.cz",
                        null,
                        "www.czechitas.cz"
                )
        );
    }

    public List<Vizitka> getAll() {
        return seznamVizitek;
    }

    public Vizitka getById(int id) {
        return seznamVizitek.get(id);
    }
}
