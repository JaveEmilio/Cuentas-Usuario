package Empresa;

public class Empresa {
    private String nombreEmpresa;
    private Cuenta[] cuentas;
    private final static int NUMERO_MAX_CUENTAS = 5;
    private int numeroCuentas;
    private boolean estadoActivo;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.estadoActivo = false;
        this.cuentas = new Cuenta[NUMERO_MAX_CUENTAS];
    }

    public void crearCuenta(Cuenta cuenta) {
        this.cuentas[numeroCuentas++] = cuenta;
    }

    public void abrirCuenta(int codigoCuenta, String contraseña) {
        Cuenta cuentaUsuario = buscarCuenta(codigoCuenta);
        if(!cuentaUsuario.laContraseñaEsCorrecta(contraseña)){
            System.out.println("Tu constraseña no es correcta");
            this.estadoActivo = false;
            return;
        }
        System.out.println("Has iniciado sección en tu cuenta");
        this.estadoActivo = true;
    }

    private Cuenta buscarCuenta(int codigoCuenta) {
        for (Cuenta cuenta: cuentas) {
            if(cuenta.existeLaCuenta(codigoCuenta)==true){
                return cuenta;
            }
        }
        return null;
    }

    public void cerrarCuenta(int codigoCuenta) {
        if(!estadoActivo){
            System.out.println("no ingresaste a  tu cuenta");
            this.estadoActivo = true;
            return;
        }
        System.out.println("cerraste tu cuenta" + codigoCuenta);
        this.estadoActivo = false;
    }


}
