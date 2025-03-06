public class Dipendenti {
    private String nome;
    private String cognome;
    private String codice;
    private boolean disponibile;

    public Dipendenti(String nome, String cognome, String codice, boolean disponibile) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.disponibile = disponibile;
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

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return  "nome Dipendente: " + nome + '\n' +
                "cognome Dipendente: " + cognome + '\n' +
                "codice Dipendente: " + codice + '\n' ;
    }
}
