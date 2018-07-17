import java.util.ArrayList;

public class Colegio {

    private ArrayList<Nivel> nivelArraylist = new ArrayList<>();
    public void agregarnivel(Nivel nivel){
        nivelArraylist.add(nivel);
    }

    public ArrayList<Nivel> getNivelArraylist() {
        return nivelArraylist;
    }
}
