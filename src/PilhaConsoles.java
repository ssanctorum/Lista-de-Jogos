public class PilhaConsoles {

    private Console[] pilhaDeConsoles = new Console[5];
    private int topoDosConsoles = 0;

    public int getTopoDosConsoles() {
        return topoDosConsoles;
    }

    public void pilhaPush(Console console) {
        pilhaDeConsoles[topoDosConsoles] = console;
        topoDosConsoles++;

        if (pilhaDeConsoles.length == topoDosConsoles) {
            Console[] novaPilhaDeConsoles = new Console[pilhaDeConsoles.length * 2];

            for (int i = 0; i < pilhaDeConsoles.length; i++) {
                novaPilhaDeConsoles[i] = pilhaDeConsoles[i];
            }

            pilhaDeConsoles = novaPilhaDeConsoles;
        }
    }

    ///falta apenas tentar retornar o console que foi excluido
    public void pilhaPop() {
        Console console = pilhaDeConsoles[topoDosConsoles];
        String string = "";

//        console.toString() = string;
        pilhaDeConsoles[topoDosConsoles - 1] = null;
        topoDosConsoles--;




    }

    public String pilhaListar() {
        String consolesRetorno = "";

        for (int i = topoDosConsoles - 1; i >= 0; i--) {

            Console console = pilhaDeConsoles[i];
            consolesRetorno += console.toString() + "\n\n";
        }
        return consolesRetorno;
    }


    public String pilhaBuscar(String stringBusca) {

        String stringRetorno = "";

        for (int i = topoDosConsoles - 1; i >= 0 ; i--) {

            Console console = pilhaDeConsoles[i];

            if (console.getNome().toLowerCase().contains(stringBusca.toLowerCase())) {
                stringRetorno += console.toString() + "\n\n";

            }
        }

        if (stringRetorno == ""){
            return "Nenhum console: " + stringBusca + " encontrado.";
        }

        return stringRetorno;
    }
}
