package ba.unsa.etf.rpr.tutorijal03;


import java.util.*;

public class Imenik  {


    enum Grad{TRAVNIK,ORASJE,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,SIROKIBRIJEG,BRCKO}
    private HashMap<String, TelefonskiBroj> hmap = new HashMap<>();
    public Imenik() {
        hmap = new HashMap<>();
    }
    public void dodaj(String ime, TelefonskiBroj broj){
        hmap.put(ime, broj);

    }
    public String dajBroj(String ime){
        return hmap.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> m : hmap.entrySet()){
            if(m.getValue().equals(broj)) return m.getKey();
        }
        return "";
    }

    public String naSlovo(char s){
        String vratiString = new String();
        for(Map.Entry<String, TelefonskiBroj> m : hmap.entrySet()){
            if(m.getKey().charAt(0) == s) {
                vratiString += m.getKey() + m.getValue().ispisi() + "\n";
            }
        }
        return vratiString;
    }


    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        return null;
    }
    public Set<String> izGrada(FiksniBroj.Grad g) {
        Set<String> skup = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> e : hmap.entrySet()) {
            TelefonskiBroj broj = e.getValue();
            if (broj instanceof FiksniBroj) {
                FiksniBroj broj2 = (FiksniBroj) broj;
                if (broj2.getPozivniGrada().equals(broj2.getPozivniTrazenogGrada(g))) {
                    skup.add(e.getKey());
                }
            }
        }
        List<String> lista = new ArrayList<>(skup);
        Collections.sort(lista);
        return skup;
    }


    @Override
    public int hashCode() {
        return 0;
    }



}
