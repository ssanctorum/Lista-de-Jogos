import javax.swing.JOptionPane;

public class Main {

    public static void main (String[] args){
        PilhaConsoles pilhaConsoles = new PilhaConsoles();
        Metodos metodos = new Metodos();
        int opcaoLoop = 99;

        do {
            try {
                String primeiroInput = JOptionPane.showInputDialog(null, "<html>Bem-vindo a sua caixa de coleção de consoles!" +
                        "<p><p>Selecione a opção desejada:" +
                        "<p><p>[1] - Adicionar console<p>[2] - Remover console<p>[3] - Buscar console<p>[4] - Listar consoles<p>[5] - Contar consoles" +
                        "<p><p><i>Tenha em vista que é uma caixa, imagine-a.</i>" +
                        "<p><i>Você não pode <b>empilhar</b> consoles</i><p/><i>dentro de uma caixa sem uma ordem.</i></html>", "Consoles na Caixa", JOptionPane.PLAIN_MESSAGE);

                if (primeiroInput == null){
                    return;
                }

                if (primeiroInput.isBlank()){
                    JOptionPane.showMessageDialog(null, "Você não digitou nada!", "Consoles na Caixa",JOptionPane.INFORMATION_MESSAGE);
                    continue;
                }

                int primeiroInputInt = Integer.parseInt(primeiroInput);

                switch (primeiroInputInt){

                    case 1:
                        metodos.adicionarConsole(pilhaConsoles);
                        break;

                    case 2:
                        metodos.removerConsole(pilhaConsoles);
                        break;

                    case 3:
                        metodos.buscarConsole(pilhaConsoles);
                        break;

                    case 4:
                        metodos.listarConsoles(pilhaConsoles);
                        break;

                    case 5:
                        metodos.contarConsoles(pilhaConsoles);
                        break;

                    default: JOptionPane.showMessageDialog(null, "Opção inválida.", "Consoles na Caixa", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente digitando um número, em vez de texto.", "Consoles na Caixa", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcaoLoop != 98);
    }
}
