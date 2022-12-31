import Empresa.Cuenta;
import Empresa.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Patito");
        empresa.crearCuenta(new Cuenta(10,"usuario 1","adfadsg2"));
        empresa.crearCuenta(new Cuenta(25,"usuario 2", "546421a"));//una contraseña con mas de 6

        empresa.abrirCuenta(10,"adfadsg2");
        empresa.cerrarCuenta(10);

        empresa.abrirCuenta(25,"546421a");//paso mal la contraseña
        empresa.cerrarCuenta(25);


    }
}