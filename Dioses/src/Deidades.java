import java.util.ArrayList;
import java.util.Scanner;

public class Deidades {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Dioses> diosesList = new ArrayList<>();

        //Instanciar dioses del olimpo

        boolean continuar = true;
        while (continuar) {
            System.out.println("Que tipo de Deidad quieres añadir?\n1.- Dios del Olimpo\n2.- Dios Moderno\nEscribe 'parar' para detener. (mínimo 1 Dios por tipo)");
            String tipo = teclado.nextLine();

            if(tipo.equalsIgnoreCase("parar")){
                continuar = false;
                break;
            }

            switch (tipo) {
                case "1":
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
                    
                    break;
                
                case "2":
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

                    break;
            
                default:
                    System.out.println("opción no válida, por favor elije 1 o 2, o escribe 'parar' para detener. ");
            }
        }

        /* System.out.println("Introduce los datos para un Dios del Olimpo: ");
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
        diosesList.add(diosModerno); */

        //Características

        if (diosesList.isEmpty()) {
            System.out.println("No se han añadido dioses suficientes.");
        } else {
            
            System.out.println("Características de todos los dioses: ");
            for (Dioses dios : diosesList) {
                System.out.println(dios);    
            }
        }

        if (diosesList.size() >= 2) {
            System.out.println("\nSeleccione los dioses que desea comparar por su índice:");

            for (int i = 0; i < diosesList.size(); i++) {
                System.out.println(i + ": " + diosesList.get(i).getNombre());
            }

            System.out.print("\nIngrese el índice del primer dios: ");
                int indice1 = teclado.nextInt();
                System.out.print("Ingrese el índice del segundo dios: ");
                int indice2 = teclado.nextInt();

        // Grados de fuerza
        if (indice1 >= 0 && indice1 < diosesList.size() && indice2 >= 0 && indice2 < diosesList.size() && indice1 != indice2) {

            Dioses dios1 = diosesList.get(indice1);
            Dioses dios2 = diosesList.get(indice2);
    
            double diferenciaFuerza = Math.abs(dios1.getGradoFuerza() - dios2.getGradoFuerza());
            String ganador = dios1.getGradoFuerza() > dios2.getGradoFuerza() ? dios1.getNombre() : dios2.getNombre();
            String perdedor = dios1.getGradoFuerza() > dios2.getGradoFuerza() ? dios2.getNombre() : dios1.getNombre();
    
            System.out.println("\n" + ganador + " vence a " + perdedor + " por una diferencia de " + diferenciaFuerza + " puntos. ");
        } else {
        System.out.println("Indices no válidos, Asegurese de que los índices son diferentes y existen en el rango.");
                } 
            } else { System.out.println("No hay suficientes dioses para comparar sus grados de fuerza.");
        }

        System.out.println("Hasta la próxima!");
        teclado.close();
    }
}
