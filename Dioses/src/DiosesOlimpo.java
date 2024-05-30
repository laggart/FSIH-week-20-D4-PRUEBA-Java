public class DiosesOlimpo extends Dioses {
    private String poder;
    private String debilidad;

    public DiosesOlimpo(String nombre, int edad, int gradoFuerza, String poder, String debilidad){
        super(nombre, edad, gradoFuerza);
        this.poder = poder;
        this.debilidad = debilidad;
    }

    public String getDebilidad() {
        return this.debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }


    @Override
    public String toString() {
        return super.toString() + " Su poder es: " + getPoder() + " y su debilidad es: " + getDebilidad();
    }


    
}
