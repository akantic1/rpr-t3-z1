package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Map;

public class Imenik extend TelefonskBroj {
    private HashMap<String, TelefonskiBroj> hmap = new HashMap<String, TelefonskiBroj>();
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


}
