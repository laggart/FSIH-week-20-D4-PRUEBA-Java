public class Dioses {
    private String nombre;
    private int edad;
    private double gradoFuerza;


    public Dioses(String nombre, int edad, double gradoFuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.gradoFuerza = gradoFuerza;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getGradoFuerza() {
        return this.gradoFuerza;
    }

    public void setGradoFuerza(double gradoFuerza) {
        this.gradoFuerza = gradoFuerza;
    }


    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", grado de Fuerza: " + getGradoFuerza();
    } 
}
