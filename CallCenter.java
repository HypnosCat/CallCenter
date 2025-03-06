import java.time.LocalDateTime;
import java.util.HashMap;

public class CallCenter {
    private final HashMap<String , Clienti> clienti = new HashMap<String, Clienti>();
    private final HashMap<String , Dipendenti> dipendenti = new HashMap<String, Dipendenti>();
    private final Info info = new Info();

    public String addCliente(String nome, String cognome , String telefono , String indirizzo, String citta , String codice){
        if (!clienti.containsKey(codice)){
            Clienti clientie = new Clienti(nome, cognome, codice, indirizzo, citta, telefono);
            clienti.put(codice,clientie);
            return "Сliente aggiunto \n";
        }else
            return "Il cliente è già presente \n";
    }

    public String addDipendente(String nome, String cognome, String codice ){
        if (!dipendenti.containsKey(codice)) {
            Dipendenti dipendente = new Dipendenti(nome, cognome, codice, true);
            dipendenti.put(codice, dipendente);
            return "Dipendente aggiunto \n";
        }else
            return "Il Dipendente è già presente \n";
    }

    public String call(String numero) {
        String codiceCliente = codicecliente(numero);

        String codiceDipendente = assignDipendente();

        if (!codiceCliente.isEmpty() && !codiceDipendente.equals("Nessun dipendente disponibile")) {
            updateLog(codiceCliente, codiceDipendente);
        }
        dipendenti.get(codiceDipendente).setDisponibile(true);
        return info.toString() + "\n";
    }

    public String assignDipendente() {
        for (Dipendenti dipendente : dipendenti.values()) {
            if (dipendente.isDisponibile()) {
                dipendente.setDisponibile(false);
                return dipendente.getCodice();
            }
        }
        return "Nessun dipendente disponibile";
    }
    
    public void updateLog(String codiceCliente , String codiceDipendente){
        info.setInfo(clienti.get(codiceCliente).getNome(),clienti.get(codiceCliente).getCognome()
                , codiceCliente, clienti.get(codiceCliente).getIndirizzo(),clienti.get(codiceCliente).getCitta()
                , clienti.get(codiceCliente).getTelefono(), lastCall(), dipendenti.get(codiceDipendente).getNome()
                ,dipendenti.get(codiceDipendente).getCognome(), codiceDipendente);
    }

    public String codicecliente(String numero){
        String idCliente = "";
        for (Clienti cliente : clienti.values()) {
            if (cliente.getTelefono().equals(numero)) {
                idCliente = cliente.getCodice();
            }
        }
        return idCliente;
    }

    public LocalDateTime lastCall(){
        LocalDateTime currentDateTime;
        return currentDateTime = LocalDateTime.now();
    }
}
