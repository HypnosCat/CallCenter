import java.time.LocalDateTime;

public class Info {
    private String nome;
    private String cognome;
    private String codice;
    private String indirizzo;
    private String citta;
    private String telefono;
    private LocalDateTime lastcall;

    private String nomeDipendente;
    private String cognomeDipendente;
    private String codiceDipendente;

    public Info(){
    }

    public void setInfo(String nome, String cognome, String codice, String indirizzo,
                String citta, String telefono, LocalDateTime lastcall, String nomeDipendente,
                String cognomeDipendente, String codiceDipendente) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.telefono = telefono;
        this.lastcall = lastcall;
        this.nomeDipendente = nomeDipendente;
        this.cognomeDipendente = cognomeDipendente;
        this.codiceDipendente = codiceDipendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getLastcall() {
        return lastcall;
    }

    public void setLastcall(LocalDateTime lastcall) {
        this.lastcall = lastcall;
    }

    public String getNomeDipendente() {
        return nomeDipendente;
    }

    public void setNomeDipendente(String nomeDipendente) {
        this.nomeDipendente = nomeDipendente;
    }

    public String getCognomeDipendente() {
        return cognomeDipendente;
    }

    public void setCognomeDipendente(String cognomeDipendente) {
        this.cognomeDipendente = cognomeDipendente;
    }

    public String getCodiceDipendente() {
        return codiceDipendente;
    }

    public void setCodiceDipendente(String codiceDipendente) {
        this.codiceDipendente = codiceDipendente;
    }

    @Override
    public String toString() {
        return " nome: " + nome +"\n"+
                " cognome: " + cognome +"\n"+
                " codice: " + codice +"\n"+
                " indirizzo: " + indirizzo +"\n"+
                " citta: " + citta +"\n"+
                " telefono: " + telefono +"\n"+
                " lastcall: " + lastcall +"\n"+
                " nome Dipendente: " + nomeDipendente +"\n"+
                " cognome Dipendente: " + cognomeDipendente +"\n"+
                " codice Dipendente: " + codiceDipendente ;
    }
}
