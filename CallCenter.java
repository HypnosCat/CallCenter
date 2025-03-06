import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.TreeSet;

public class CallCenter {
    private final HashMap<String , Clienti> clienti = new HashMap<String, Clienti>();
    private final HashMap<String , Dipendenti> dipendenti = new HashMap<String, Dipendenti>();
    private final TreeSet <Info> telefonate = new TreeSet<Info>();

    public String addCliente(String nome, String cognome , String telefono , String indirizzo, String citta , String codice){
        if (!clienti.containsKey(codice)){
            Clienti clientie = new Clienti(nome, cognome, codice, indirizzo, citta, telefono, null);
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

    public String removeCliente(String codice) {
        if (clienti.containsKey(codice)) {
            clienti.remove(codice); 
            return "Dipendente cancellato: " +codice;
        } else  
            return "Dipendente non trovato:: " +codice;
    }

    public String removeDipendente(String codice){
        if (dipendenti.containsKey(codice)) {
            dipendenti.remove(codice);
            return "Cliente cancellato: " +codice;
        }else 
            return "Cliente non trovato: " + codice;
    }


    public String call(String numero) {
        String codiceCliente = codicecliente(numero);
        String codiceDipendente = assignDipendente();
    
        if (!codiceCliente.isEmpty() && !codiceDipendente.equals("Nessun dipendente disponibile")) {
            // Aggiorna l'ultima chiamata del cliente
            clienti.get(codiceCliente).setLastCall(setLastCall(codiceCliente));
            // Crea un nuovo oggetto Info per la chiamata
            Info newInfo = new Info();
            updateLog(newInfo, codiceCliente, codiceDipendente);
            telefonate.add(newInfo); // Aggiungi il nuovo oggetto Info a telefonate

            dipendenti.get(codiceDipendente).setDisponibile(true);
            return clienti.get(codiceCliente).toString() +"\n"+ dipendenti.get(codiceDipendente).toString();
        }
        return "Chiamata non riuscita: " + numero + "\n";
    }

    public LocalDateTime setLastCall(String codice){
        for (Info info : telefonate) {
            if (info.getCodiceCliente().equals(codice)) {
                if (info.getLastCall()!= null) {
                    return info.getLastCall();
                }
            }
        }
        return null;
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
    
    public void updateLog(Info info, String codiceCliente, String codiceDipendente) {
        info.setInfo(clienti.get(codiceCliente).getNome(), clienti.get(codiceCliente).getCognome(),
                codiceCliente, clienti.get(codiceCliente).getIndirizzo(), clienti.get(codiceCliente).getCitta(),
                clienti.get(codiceCliente).getTelefono(), lastCall(), dipendenti.get(codiceDipendente).getNome(),
                dipendenti.get(codiceDipendente).getCognome(), codiceDipendente);
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
        return LocalDateTime.now();
    }

    public void getAllTelefonate() {
        System.out.println("Log telefonate: \n");
        for (Info info : telefonate) {
            System.out.println(info);
        }
    }
}
