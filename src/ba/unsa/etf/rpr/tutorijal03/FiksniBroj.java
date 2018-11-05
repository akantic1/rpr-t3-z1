package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    @Override
    public int compareTo(TelefonskiBroj o) {
        return 0;
    }

    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}

    private Grad grad;
    private String broj;

    private static String[] pozivni = { "030", "031", "032", "033", "034", "035", "036", "037", "038", "039", "049"};

    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }

    public String getPozivniGrada () {
        return pozivni[grad.ordinal()];
    }

    public String getPozivniTrazenogGrada (Grad g) {
        return pozivni[g.ordinal()];
    }

    @Override
    public String ispisi () {
        return pozivni[grad.ordinal()] + "/" + broj;
    }


    @Override
    public int hashCode(){
        return broj.hashCode();
    }




}



