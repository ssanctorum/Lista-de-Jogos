import javax.swing.*;

public class Main {

    public static void main (String[] args){

        Metodos metodos = new Metodos();
        int opcaoLoop = 99;

        do {
            try {
                String primeiroInput = JOptionPane.showInputDialog(null, "Bem-vindo a sua caixa de coleção de consoles!\n\nSelecione a opção desejada:\n\n[1] - Adicionar console\n[2] - Remover console\n[3] - Buscar console\n[4] - Listar consoles\n[5] - Buscar consoles\n\n", "Consoles na Caixa", JOptionPane.PLAIN_MESSAGE);

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
                        metodos.adicionarConsole();
                        break;

                    case 2:
                        System.out.println("case2");
                        break;

                    case 3:
                        System.out.println("case3");
                        break;

                    case 4:
                        System.out.println("case4");
                        break;

                    case 5:
                        System.out.println("case5");
                        break;

                    default: JOptionPane.showMessageDialog(null, "Opção inválida.", "Consoles na Caixa", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente digitando um número, em vez de texto.", "Consoles na Caixa", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcaoLoop != 98);
    }
}
