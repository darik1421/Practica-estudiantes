package datosestudiantes;
// * @author Darikson

public class Estudiante {

double carnet;
String nombres;
String apellidos;
String carrera;
String nivel;

    public Estudiante(double carnet, String nombres, String apellidos, String carrera, String nivel) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public double getCarnet() {
        return carnet;
    }

    public void setCarnet(double carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
}
