import java.time.LocalDateTime;

public class Clienti {
    private String nome;
    private String cognome;
    private String codice;
    private String indirizzo;
    private String citta;
    private String telefono;
    private LocalDateTime lastCall;

    public Clienti(String nome, String cognome, String codice, String indirizzo, String citta, String telefono, LocalDateTime ultimaChiamata) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.telefono = telefono;
        this.lastCall = ultimaChiamata;

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

    public LocalDateTime getLastCall() {
        return lastCall;
    }

    public void setLastCall(LocalDateTime lastCall) {
        this.lastCall = lastCall;
    }

    @Override
    public String toString() {
        return  "nome Cliente: " + nome + '\n' +
                "cognome Cliente: " + cognome + '\n' +
                "codice Cliente: " + codice + '\n' +
                "indirizzo Cliente: " + indirizzo + '\n' +
                "citta Cliente: " + citta + '\n' +
                "telefono Cliente: " + telefono + '\n' +
                "ultima chiamata: " + lastCall;
    }

    
    
}
