package ejerempleado;

public class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private boolean genero;
    private boolean salario;
    private Fecha FechaNacimiento;
    private Fecha FechaIngreso;

    public Empleados(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public boolean isSalario() {
        return salario;
    }

    public void setSalario(boolean salario) {
        this.salario = salario;
    }

    public Fecha getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }
}



