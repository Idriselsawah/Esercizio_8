import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cognome, lingua;
        String vuoto = "";
        System.out.println("Inserisci il tuo nome");
        nome = scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        cognome = scan.nextLine();

        if (nome.equals(vuoto)) {
            System.out.println("Manca il nome");
        } else if (cognome.equals(vuoto)) {
            System.out.println("Manca il cognome");
        } else {
            System.out.println("Che lingua parli? (scegli tra IT-EN-FR-DE-ES)");
            lingua = scan.nextLine();

            switch (lingua) {
                case "IT":
                    System.out.println("Benvenuto " + nome + " " + cognome);
                    break;

                case "EN":
                    System.out.println("Welcome " + nome + " " + cognome);
                    break;

                case "FR":
                    System.out.println("Bienvenue " + nome + " " + cognome);
                    break;

                case "DE":
                    System.out.println("Willkommen " + nome + " " + cognome);
                    break;

                case "ES":
                    System.out.println("Bienvenido " + nome + " " + cognome);
                    break;

                default:
                    System.out.println("Non so parlare questa lingua");
            }
        }
    }
}
