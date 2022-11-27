public class Client {
    public static void main(String[] args) {
        ChinaWomensTeakwondo cwt = new ChinaWomensTeakwondo(4, 6);
        ChinaWomensWaterpolo cwp = new ChinaWomensWaterpolo(9, 3);
        ChinaWomensArtisticGymnastics cwag = new ChinaWomensArtisticGymnastics(6, 1);
        ChinaWomens cw = new ChinaWomens();
        ChinaMensShooting cms = new ChinaMensShooting(3, 8);
        ChinaMens cm = new ChinaMens();
        China c = new China();
        Afghanistan af = new Afghanistan();
        Asia a = new Asia();
        Africa africa = new Africa();
        Europe eu = new Europe();
        Germany ger = new Germany();
        GermanyWomens gw = new GermanyWomens();
        GermanyWomensCycling gwc = new GermanyWomensCycling(3, 2);
        GermanyWomensTennis gwt = new GermanyWomensTennis(5, 0);
        GermanyMens gm = new GermanyMens();
        GermanyMensTableTennis gmtt = new GermanyMensTableTennis(8, 2);
        GermanyMensFootbal gmf = new GermanyMensFootbal(15, 9);
        Italy it = new Italy();
        ItalyWomens iw = new ItalyWomens();
        ItalyWomensAlpineSky iwas = new ItalyWomensAlpineSky(4, 2);
        ItalyMens im = new ItalyMens();
        ItalyMensSwimmingTeam imst = new ItalyMensSwimmingTeam(5, 0);
        ItalyMensFootbal imf = new ItalyMensFootbal(16, 5);
        SouthAmerica sa = new SouthAmerica();
        OlympicsTeams o = new OlympicsTeams();

        cw.addTeam(cwt);
        cw.addTeam(cwp);
        cw.addTeam(cwag);
        cm.addTeam(cms);
        c.addTeam(cm);
        c.addTeam(cw);
        a.addTeam(c);
        a.addTeam(af);
        eu.addTeam(ger);
        eu.addTeam(it);
        ger.addTeam(gm);
        ger.addTeam(gw);
        gm.addTeam(gmtt);
        gm.addTeam(gmf);
        gw.addTeam(gwc);
        gw.addTeam(gwt);
        it.addTeam(im);
        it.addTeam(iw);
        iw.addTeam(iwas);
        im.addTeam(imf);
        im.addTeam(imst);
        o.addTeam(a);
        o.addTeam(africa);
        o.addTeam(eu);
        o.addTeam(sa);

        System.out.println("a)");
        gm.printNameAndAthletes();
        System.out.println("b)");
        ger.printNameAndMedals();
        System.out.println("c)");
        a.printNameAndMedals();
        System.out.println("d)");
        o.printNameAndAthletes();
    }
}
