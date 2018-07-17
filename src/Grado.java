import java.util.ArrayList;


public class Grado {

    private String nombre;
    private ArrayList<Estudiante> estudianteArraylist = new ArrayList<>();

    public Grado(String nombre) {
        this.nombre = nombre;
    }

    public void agregarestudiante(Estudiante estudiante) {
        estudianteArraylist.add(estudiante);

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudianteArraylist() {
        return estudianteArraylist;
    }
}