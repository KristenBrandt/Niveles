import java.util.ArrayList;

public class Nivel {
    public Nivel(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private ArrayList<Grado> gradoArrayList = new ArrayList<>();

    public void agregargrado(Grado grado){
        gradoArrayList.add(grado);

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grado> getGradoArrayList() {
        return gradoArrayList;
    }
}
