
public class Main {
    public static void main(String[] args) {
       CallCenter callCenter = new CallCenter();

        String cliente1 = callCenter.addCliente("Mario", "Rossi", "1234567890", "Via Roma 1", "Roma", "1");
        System.out.println(cliente1);

        String cliente2 = callCenter.addCliente("Giulia", "Bianchi", "0987654321", "Via Milano 2", "Milano", "2");
        System.out.println(cliente2);

        String cliente3 = callCenter.addCliente("Luca", "Verdi", "1122334455", "Via Napoli 3", "Napoli", "3");
        System.out.println(cliente3);

        String dipendente1 = callCenter.addDipendente("Francesco", "Rossi", "1");
        System.out.println(dipendente1);

        String dipendente2 = callCenter.addDipendente("Laura", "Bianchi", "2");
        System.out.println(dipendente2);

        System.out.println(callCenter.call("1234567890"));
        System.out.println(callCenter.call("0987654321"));
        System.out.println(callCenter.call("1122334455"));
        System.out.println(callCenter.call("1234567890"));
        //System.out.println(callCenter.call("1122334455"));

       callCenter.getAllTelefonate();
    }
}