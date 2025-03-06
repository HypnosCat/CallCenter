import java.time.LocalDateTime;

public class Info implements Comparable<Info> {
    private String nomeCliente;
    private String cognomeCliente;
    private String codiceCliente;
    private String indirizzoCliente;
    private String cittaCliente;
    private String telefonoCliente;
    private LocalDateTime lastCall;
    private String nomeDipendente;
    private String cognomeDipendente;
    private String codiceDipendente;
    
    public Info() {
        
    }

    public void setInfo(String nomeCliente, String cognomeCliente, String codiceCliente,
                        String indirizzoCliente, String cittaCliente, String telefonoCliente,
                        LocalDateTime lastCall, String nomeDipendente, String cognomeDipendente,
                        String codiceDipendente) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.codiceCliente = codiceCliente;
        this.indirizzoCliente = indirizzoCliente;
        this.cittaCliente = cittaCliente;
        this.telefonoCliente = telefonoCliente;
        this.lastCall = lastCall;
        this.nomeDipendente = nomeDipendente;
        this.cognomeDipendente = cognomeDipendente;
        this.codiceDipendente = codiceDipendente;
    }

    

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public LocalDateTime getLastCall() {
        return lastCall;
    }

    public String getCodiceDipendente() {
        return codiceDipendente;
    }

    @Override
    public int compareTo(Info other) {
        return this.lastCall.compareTo(other.lastCall);
    }

    @Override
    public String toString() {
        return  "nome Cliente: " + nomeCliente + '\n' +
                "cognome Cliente: " + cognomeCliente + '\n' +
                "codice Cliente: " + codiceCliente + '\n' +
                "indirizzo Cliente: " + indirizzoCliente + '\n' +
                "citta Cliente: " + cittaCliente + '\n' +
                "telefono Cliente: " + telefonoCliente + '\n' +
                "ultima chiamata: " + lastCall +'\n'+
                "nome Dipendente: " + nomeDipendente + '\n' +
                "cognome Dipendente: " + cognomeDipendente + '\n' +
                "codice Dipendente: " + codiceDipendente + '\n' ;
    }
}
