public class Usuario {

    String usuario1 = "";
    int senha1;

    String usuario2 = "admin";
    int senha2 = 1234;

    boolean verificarLogin() {

        if (usuario1.equals(usuario2) && senha1 == senha2) {
            return true;
        } else {
            return false;
        }
    }
}