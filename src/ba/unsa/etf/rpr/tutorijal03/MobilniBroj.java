package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    public int mobilnaMreza;
    public String broj;

    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode();
    }

    @Override
    public int compareTo(TelefonskiBroj o) {
        return 0;
    }
}
