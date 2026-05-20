import javax.swing.JOptionPane;

public class PilhaConsoles {

    private Console[] pilhaDeConsoles = new Console[5];
    private int topoDosConsoles = 0;

    public void pilhaPush(Console newConsole){
        pilhaDeConsoles[topoDosConsoles] = newConsole;
        topoDosConsoles++;

        if (pilhaDeConsoles.length == topoDosConsoles){
            Console[] novaPilhaDeConsoles = new Console [pilhaDeConsoles.length * 2];

            for (int i = 0; i < pilhaDeConsoles.length; i++){
                novaPilhaDeConsoles[i] = pilhaDeConsoles [i];
            }

            pilhaDeConsoles = novaPilhaDeConsoles;
        }
    }

//    public void pilhaPop(){
//
//        if (topoDosConsoles == 0) {
//            JOptionPane.showMessageDialog(null, "Não há nenhum console adicionado.", "Remover console", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//
//        topoDosConsoles--;
//
//        Console console = pilhaDeConsoles[topoDosConsoles];
//
//        pilhaDeConsoles[topoDosConsoles] = null;
//    }

    public void pilhaListar (){

        if (topoDosConsoles == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum console adicionado.", "Listar consoles", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (int i = topoDosConsoles - 1 ; i >= 0; i--){

            Console console = pilhaDeConsoles[i];
            JOptionPane.showMessageDialog(null,console.toString(),"Listar consoles",JOptionPane.PLAIN_MESSAGE);
        }
    }

}
