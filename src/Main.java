import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static String opciones() {
        String a = "Menu de opciones principales \n\t 1:Agregar Nivel \n\t 2:Agregar Grado \n\t 3:Agregar Estudiante \n\t 4:Ver grados en un un nivel \n\t 5:Ver asignaciones en un grado \n\t 6:Salir";
        return a;
    }

    public static void main(String[] args){
        boolean pony = true;
        String nivi;
        String gradu;
        String estudi;
        String codi;
        Colegio cole = new Colegio();

        do{
            System.out.println(opciones());
    String opcion = scan.nextLine();
    switch (opcion){
        case "1":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            Nivel nivel = new Nivel(nivi);
            cole.agregarnivel(nivel);
            System.out.println("Ha agregado un nivel exitosamente \n");
            break;

        case "2":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            for (Nivel n : cole.getNivelArraylist()) {
                if (n.getNombre().equals(nivi)) {
                    System.out.println("Ingrese el nombre del grado");
                    gradu = scan.nextLine();
                    Grado grado = new Grado(gradu);
                    n.agregargrado(grado);
                    System.out.println("Ha agregado un grado exitosamente\n");
                    break;
                }
            }
            break;

        case "3":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            for (Nivel n : cole.getNivelArraylist()){
                if (n.getNombre().equals(nivi)){
                    System.out.println("Ingrese el nombre del grado");
                    gradu = scan.nextLine();
                    for (Grado g : n.getGradoArrayList()){
                        if (g.getNombre().equals(gradu)){
                            System.out.println("Ingrese el nombre del estudiante");
                            estudi = scan.nextLine();
                            System.out.println("Ingrese el codigo del estudiante");
                            codi = scan.nextLine();
                            Estudiante estudiante = new Estudiante(estudi, codi);
                            g.agregarestudiante(estudiante);
                            System.out.println("Ha agregado un estudiante nuevo");
                        }
                    }
                }
            }
            break;

        case "4":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            for (Nivel n : cole.getNivelArraylist()){
                if (n.getNombre().equals(nivi)){
                    System.out.println("Estos son los grados en ese nivel");
                    for (Grado g : n.getGradoArrayList()){
                        System.out.println(g.getNombre());

                    }
                }
            }
            break;

        case "5":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            for (Nivel n : cole.getNivelArraylist()){
                if (n.getNombre().equals(nivi)){
                    System.out.println("Ingrese el nombre del grado");
                    gradu = scan.nextLine();
                    for (Grado g : n.getGradoArrayList()){
                        if (g.getNombre().equals(gradu)){
                            for (Estudiante e : g.getEstudianteArraylist()){
                                System.out.println(e.getNombre()+" "+e.getCodigo());
                            }
                        }

                    }
                }
            }
            break;

        case "6":
            System.out.println("Cerrando Programa");
            pony = false;
            break;

            default:
                break;


    }
    

    }while (pony);
    }
}
