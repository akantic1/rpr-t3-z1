package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
     enum Grad{SARAJEVO, ZENICA, TUZLA, TRAVNIK, ORASJE, MOSTAR, BIHAC, GORAZDE, SIROKI , BRCKO ,LIVNO};
    FiksniBroj(Grad grad, String broj){
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        String s = new String();
        if(grad == 'SARAJEVO') s += "033/";
         if(grad == 'ZENICA') s += "032/";
        if(grad == 'TUZLA') s += "035/";
        if(grad == 'TRAVNIK') s += "030/";
        if(grad == 'ORASJE') s += "031/";
        if(grad == 'MOSTAR') s += "036/";
        if(grad == 'BIHAC') s += "037/";
        if(grad == 'GORAZDE') s += "038/";
        if(grad == 'SIROKI BRIJEG') s += "039/";
        if(grad == 'LIVNO') s += "034/";
        if(grad == 'BRCKO') s += "0349/";
        s+=broj;
        return s;
    }

    @Override
    public int hashCode() {
        return grad.hashCode()+broj.hashCode();
    }
}
