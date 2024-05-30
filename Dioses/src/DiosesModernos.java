public class DiosesModernos extends Dioses {
    private String especialidad;
    private String nemesis;
    
    public DiosesModernos(String nombre, int edad, double gradoFuerza, String especialidad, String nemesis) {
        super(nombre, edad, gradoFuerza);
        this.especialidad = especialidad;
        this.nemesis = nemesis;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNemesis() {
        return this.nemesis;
    }

    public void setNemesis(String nemesis) {
        this.nemesis = nemesis;
    }


    @Override
    public String toString() {
        return super.toString() + " Su especialidad es: " + getEspecialidad() + " y su nemesis es " + getNemesis();
    }


}
