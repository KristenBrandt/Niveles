import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    /** menu principal **/
    public static String opciones() {
        String a = "Menu de opciones principales \n\t 1:Agregar Nivel \n\t 2:Agregar Grado \n\t 3:Agregar Estudiante \n\t 4:Ver grados en un un nivel \n\t 5:Ver asignaciones en un grado \n\t 6:Salir";
        return a;
    }

    public static void main(String[] args){

        /** variables **/
        boolean pony = true;
        String nivi;
        String gradu;
        String estudi;
        String codi;
        Colegio cole = new Colegio();

        /** loop general **/
        do{
            System.out.println(opciones());
    String opcion = scan.nextLine();
    switch (opcion){

        /** agregar nivel **/
        case "1":
            System.out.println("Ingrese el nombre del nivel");
            nivi = scan.nextLine();
            Nivel nivel = new Nivel(nivi);
            cole.agregarnivel(nivel);
            System.out.println("Ha agregado un nivel exitosamente \n");

            break;

            /** agregar grado **/
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

            /** agregar estudiante **/
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

            /** ver grados en un nivel **/
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

            /** ver asignaciones en un grado **/
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

            /** salir del programa **/
        case "6":
            System.out.println("Cerrando Programa");
            pony = false;
            break;

            /** por si usuario no ingresa alguno de los numeros deseados **/
            default:
                System.out.println("Debe de ingresar un numero del 1-6, intente denuevo \n");
                break;


    }

/** para cerrar programa **/
    }while (pony);
    }
}
