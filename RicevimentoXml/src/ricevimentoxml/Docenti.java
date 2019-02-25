package ricevimentoxml;

/**
 *
 * @author di_lella_andrea
 */

public class Docenti {
    
    int id=0;
    String nomeDocente="";
    String giornoSettimanale="";
    String oraRicevimento="";
    String note="";

    public Docenti() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public String getGiornoSettimanale() {
        return giornoSettimanale;
    }

    public void setGiornoSettimanale(String giornoSettimanale) {
        this.giornoSettimanale = giornoSettimanale;
    }

    public String getOraRicevimento() {
        return oraRicevimento;
    }

    public void setOraRicevimento(String oraRicevimento) {
        this.oraRicevimento = oraRicevimento;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    


}
