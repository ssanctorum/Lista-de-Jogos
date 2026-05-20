import javax.swing.JOptionPane;

public class Metodos {

    public void adicionarConsole(PilhaConsoles pilhaConsoles){
        String nomeConsole = "";

        do {
            nomeConsole = JOptionPane.showInputDialog(null,"Insira o nome do console:", "Adicionar console", JOptionPane.PLAIN_MESSAGE);

            if (nomeConsole == null) { return; }

            if (nomeConsole.isBlank()) {
                JOptionPane.showMessageDialog(null,"O nome não pode ficar vazio!","Adicionar console",JOptionPane.INFORMATION_MESSAGE);
            }

        } while (nomeConsole.isBlank());

        String nomeFabricante = "";

        do {
            nomeFabricante = JOptionPane.showInputDialog(null,"Insira o nome do fabricante:","Adicionar console",JOptionPane.PLAIN_MESSAGE);

            if (nomeFabricante == null) { return; }

            if (nomeFabricante.isBlank()) {
                JOptionPane.showMessageDialog(null,"O fabricante não pode ficar vazio!","Adicionar console",JOptionPane.INFORMATION_MESSAGE);
            }

        } while (nomeFabricante.isBlank());

        String anoConsole = "";
        int anoConsoleInt = 0;

        do {
            try {
                anoConsole = JOptionPane.showInputDialog(null,"Insira o ano de lançamento:","Adicionar console",JOptionPane.PLAIN_MESSAGE);

                if (anoConsole == null) { return; }

                if (anoConsole.isBlank()){
                    JOptionPane.showMessageDialog(null,"O ano não pode ficar vazio!","Adicionar console",JOptionPane.INFORMATION_MESSAGE);
                    continue;
                }

                anoConsoleInt = Integer.parseInt(anoConsole);

            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ocorreu um erro! Tente novamente com um ano de verdade, em vez de texto.", "Adicionar console", JOptionPane.ERROR_MESSAGE);

            }

        } while (anoConsole.isBlank() || anoConsoleInt == 0);

        String geracaoConsole = "";
        int geracaoConsoleInt = 0;

        do {
            try {
            geracaoConsole = JOptionPane.showInputDialog(null,"Insira a geração do console:\n(Apenas um número, ex: 3)","Adicionar console",JOptionPane.PLAIN_MESSAGE);

            if (geracaoConsole == null) { return; }

            if (geracaoConsole.isBlank()){
                JOptionPane.showMessageDialog(null,"A geração não pode ficar vazia!","Adicionar console",JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

            geracaoConsoleInt = Integer.parseInt(geracaoConsole);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ocorreu um erro! Tente novamente com um número de verdade, em vez de texto.", "Adicionar console", JOptionPane.ERROR_MESSAGE);
        }

        } while (geracaoConsole.isBlank() || geracaoConsoleInt == 0);

        Console console = new Console(nomeConsole, nomeFabricante, anoConsoleInt, geracaoConsoleInt);

        pilhaConsoles.pilhaPush(console);

        JOptionPane.showMessageDialog(null,"Console adicionado com sucesso!\n\n" + console.toString(), "Adicionar console",JOptionPane.PLAIN_MESSAGE);

    }

    public void removerConsole(){

    }

    public void buscarConsole(){

    }

    public void listarConsoles(PilhaConsoles pilhaConsoles){
        pilhaConsoles.pilhaListar();

        /// ainda nao testei ///
        ///preciso terminar
    }

    public void contarConsoles(){

    }
}
