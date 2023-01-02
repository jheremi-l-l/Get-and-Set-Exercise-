public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Aqui pasamos los valores de set y get
        persona.setEdad(16);
        System.out.println(persona.getEdad());

        persona.setNombre("Paula");
        System.out.println(persona.getNombre());

        persona.setTelf(656657611);
        System.out.println(persona.getTelf());
    }
}
//Creo clase Persona
class Persona {
    //Declaro mis variables privadas
    private int Edad;
    private String nombre;
    private int telf;
//Creo funciones get y set de mis variables inicializadas
    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public int getEdad() {
        return this.Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public int getTelf() {
        return this.telf;
    }
}