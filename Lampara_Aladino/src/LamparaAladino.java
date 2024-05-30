import java.util.ArrayList;
import java.util.Scanner;

public class LamparaAladino {
    public static void main(String[] args) throws Exception {
        ArrayList<String> deseos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String deseo = "";

        System.out.println("Soy el genio de la lampara, tu eres mi.. hmmm.. nuevo Amo??");
        System.out.println("Puedo hacer realidad tus sueños ¿Que deseas? (escribe 'parar' cuando termines)");

        while (!deseo.equalsIgnoreCase("parar")) {
            System.out.println("Escribe tu deseo: ");
            deseo = teclado.nextLine();
            if (!deseo.equalsIgnoreCase("parar")){
                deseos.add(deseo);
            }
            
        }

        if (!deseos.isEmpty()) {
            int indiceAleatorio = (int) (Math.random() * deseos.size());
            String deseoAleatorio = deseos.get(indiceAleatorio);

            System.out.println("Has pedido " + deseos.size() + " deseos, y tu deseo concedido será: " + deseoAleatorio);
        } else {
            System.out.println("No has pedido ningún deseo.");
        }
        teclado.close();
    }
}
