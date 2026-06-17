// Clase principal
public class Main {
    public static void main(String[] args) {
        
        // Crear objeto perro
        Perro perro1 = new Perro("Isaac Yahir Hernandez Venancio", "Chihuahua", 5);
        
        // Llamar métodos
        perro1.presentarse();
        perro1.ladrar();
    }
}

// Clase Perro
class Perro {
    
    // Atributos
    String nombre;
    String raza;
    int edad;
    
    // Constructor
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    // Método ladrar
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Wau Wau!");
    }
    
    // Método presentarse
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + 
                           ", soy de raza " + raza + 
                           " y tengo " + edad + " años.");
    }
}