package Empresa;

public class Cuenta {
    private  int codigoCuenta;
    private  String nombreUsuario;
    private  String contraseña;

    public Cuenta(int codigoCuenta, String nombreUsuario, String contraseña) {
        this.codigoCuenta = codigoCuenta;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public boolean existeLaCuenta(int codigoCuenta) {
        return codigoCuenta == this.codigoCuenta;
    }

    public boolean laContraseñaEsCorrecta(String contraseñaIngreso) {
        return contraseñaIngreso == contraseña;
    }
}
