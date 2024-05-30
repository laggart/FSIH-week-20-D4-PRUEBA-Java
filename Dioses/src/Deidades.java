import java.util.ArrayList;
import java.util.Scanner;

public class Deidades {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Dioses> diosesList = new ArrayList<>();

        //Instanciar dioses del olimpo

        System.out.println("Introduce los datos para un Dios del Olimpo: ");
        System.out.println("Nombre: ");
        String nombreOlimpo = teclado.nextLine();
        System.out.println("Edad: ");
        int edadOlimpo = teclado.nextInt();
        System.out.println("Grado de fuerza: ");
        int gradoFuerzaOlimpo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Poder: ");
        String poderOlimpo = teclado.nextLine();
        System.out.println("Debilidad: ");
        String debilidadOlimpo = teclado.nextLine();

        DiosesOlimpo diosOlimpo = new DiosesOlimpo(nombreOlimpo, edadOlimpo, gradoFuerzaOlimpo, poderOlimpo, debilidadOlimpo);
        diosesList.add(diosOlimpo);

        //Instanciar dioses modernos

        System.out.println("Introduce los datos para un Dios Moderno");
        System.out.println("Nombre: ");
        String nombreModerno = teclado.nextLine();
        System.out.println("Edad: ");
        int edadModerno = teclado.nextInt();
        System.out.println("Grado de fuerza: ");
        int gradoFuerzaModerno = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Especialidad: ");
        String especialidadModerno = teclado.nextLine();
        System.out.println("Nemesis: ");
        String nemesisModerno = teclado.nextLine();

        DiosesModernos diosModerno = new DiosesModernos(nombreModerno, edadModerno, gradoFuerzaModerno, especialidadModerno, nemesisModerno);
        diosesList.add(diosModerno);

        //Características

        System.out.println("Características de todos los dioses: ");
        for (Dioses dios : diosesList) {
            System.out.println(dios);
            
        }

        // Grados de fuerza

        Dioses dios1 = diosesList.get(0);
        Dioses dios2 = diosesList.get(1);

        double diferenciaFuerza = Math.abs(dios1.getGradoFuerza() - dios2.getGradoFuerza());
        String ganador = dios1.getGradoFuerza() > dios2.getGradoFuerza() ? dios1.getNombre() : dios2.getNombre();
        String perdedor = dios1.getGradoFuerza() > dios2.getGradoFuerza() ? dios2.getNombre() : dios1.getNombre();

        System.out.println("\n" + ganador + " vence a " + perdedor + " por una diferencia de " + diferenciaFuerza + " puntos. ");
        teclado.close();
    }
}
