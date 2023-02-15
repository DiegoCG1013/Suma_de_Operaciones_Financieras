import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Administracion {

    //Atributos
    private static final char[] NUM = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private static ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
    private static ArrayList<Obra> obras = new ArrayList<Obra>();

    private static Scanner sc = new Scanner(System.in);


    //Metodos recursivos para añadirCiudad, añadirObra, buscarCiudad, y buscarObra;
    public static void anyadirCiudad () throws Exception{

        System.out.println("Introduce el nombre de la ciudad");
        String nombre = sc.nextLine().toUpperCase();
        if(!compruebaNombres(nombre)) throw new Exception("Nombre de la ciudad incorrecto");

        System.out.println("Introduce el pais");
        String pais = sc.nextLine().toUpperCase();
        if(!compruebaNombres(pais)) throw new Exception("Nombre del pais incorrecto");

        System.out.println("Introduce el numero de habitantes de la ciudad");
        int habitantes = sc.nextInt();
        sc.nextLine();
        if(habitantes <= 0  || habitantes > 37000000) throw new Exception("");

        anyadirCiudad(new Ciudad(pais, nombre, habitantes));


    }
    private static void anyadirCiudad (Ciudad ciudad) {
        if(buscarCiudad(ciudad.getNombre(), ciudad.getPais()) == -1){
            boolean aux = true;
            System.out.println("Añadiendo ciudad......");
            for (int i = 0; i < ciudades.size(); i++){
                if (ciudades.get(i).comparador(ciudad) >= 0) {
                    ciudades.add(i, ciudad);
                    i = ciudades.size();
                    aux = false;
                }
            }
            if (aux) ciudades.add(ciudad);
            System.out.println("////////////AÑADIDA////////////");
        }else {
            System.out.println("Ya existe esta ciudad");
        }
    }


    public static void anyadirObra () throws Exception{
        System.out.println("Introduce el nombre de la obra");
        String nombre = sc.nextLine().toUpperCase();

        System.out.println("Introduce el año de la obra");
        int anyo = sc.nextInt();
        sc.nextLine();
        if(!compruebaNombres(nombre)) throw new Exception("Nombre de la obra incorrecto");

        System.out.println("Introduce el nombre de la ciudad");
        String ciudad = sc.nextLine().toUpperCase();

        System.out.println("Introduce el pais");
        String pais = sc.nextLine().toUpperCase();
        int aux = buscarCiudad(ciudad, pais);
        if(aux == -1) throw new Exception("Ciudad no encontrada");

        System.out.println("Tipo de obra:\n" +
                "1. Pintura\n" +
                "2. Escultura\n" +
                "3. Arquitectura\n");

        switch (sc.nextLine()){
            case "1":
                System.out.println("Introduce el nombre del autor");
                String autor = sc.nextLine().toUpperCase();
                if(!compruebaNombres(autor)) throw new Exception("Nombre incorrecto");
                anyadirObra(new Pintura(nombre, anyo, ciudades.get(aux), autor));
                break;
            case "2":
                System.out.println("Introduce el nombre del autor");
                String escultor = sc.nextLine().toUpperCase();
                if(!compruebaNombres(escultor)) throw new Exception("Nombre incorrecto");
                System.out.println("Introduce el material de la escultura");
                String material = sc.nextLine().toUpperCase();
                if(!compruebaNombres(material)) throw new Exception("Material incorrecto");
                anyadirObra(new Escultura(nombre, anyo, ciudades.get(aux), escultor, material));
                break;
            case "3":
                anyadirObra(new Arquitectura(nombre, anyo, ciudades.get(aux)));
        }

    }
    private static void anyadirObra (Obra obra) {
        boolean aux = true;
        if(!buscarObra(obra.nombre)){
            System.out.println("Añadiendo obra...");
            for (int i = 0; i < obras.size(); i++){
                if (obras.get(i).comparador(obra) >= 0) {
                    obras.add(i, obra);
                    i = obras.size();
                    aux = false;
                }
            }
            if(aux) obras.add(obra);
            System.out.println("////////////AÑADIDA////////////");
        }else {
            System.out.println("Ya existe esta obra");
        }
    }



    public static void buscarCiudad () {

        System.out.println("Introduce el nombre de la ciudad");
        String nombre = sc.nextLine().toUpperCase();

        System.out.println("Introduce el pais");
        String pais = sc.nextLine().toUpperCase();

        buscarCiudad(nombre, pais);
    }
    private static int buscarCiudad(String nombre, String pais){
        int contador = 0;
        for(Ciudad x : ciudades){
            if(x.getNombre().equals(nombre) && x.getPais().equals(pais)){
                System.out.println(x);
                return contador;
            }
            contador++;
        }
        System.out.println("No existe esta ciudad");
        return -1;
    }


    public static void buscarObra (){
        System.out.println("Introduce el nombre de la obra");
        String nombre = sc.nextLine().toUpperCase();
        buscarObra(nombre);
    }


    private static boolean buscarObra(String nombre){
        for(Obra x : obras){
            if(x.getNombre().equals(nombre)){
                System.out.println(x);
                return true;
            }
        }
        System.out.println("No existe esta obra");
        return false;
    }

    //Comprueba si un String tiene los caracteres dentro del array NUM, en este caso numeros
    private static boolean compruebaNombres(String nombre){
        String aux = nombre;
        for(char x : NUM){
            nombre = nombre.replace((char) x, 'a');
        }
        return nombre.equals(aux) && aux.length() > 0;
    }

    //Metodos para listar
    public static void listarObras(){
        for(Obra x : obras){
            System.out.println(x);
        }
    }

    public static void listarCiudades(){
        for(Ciudad x : ciudades){
            System.out.println(x.toString());
        }
    }
}
