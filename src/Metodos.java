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

    public void removerConsole(PilhaConsoles pilhaConsoles){

        if (pilhaConsoles.getTopoDosConsoles() == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum console na caixa.", "Remover console", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String consoleRemovido = pilhaConsoles.pilhaPop();

        JOptionPane.showMessageDialog(null,"O console:\n\n" + consoleRemovido + "\n\nfoi removido da pilha.", "Remover console",JOptionPane.INFORMATION_MESSAGE);

    }

    public void buscarConsole(PilhaConsoles pilhaConsoles){

        if (pilhaConsoles.getTopoDosConsoles() == 0){
            JOptionPane.showMessageDialog(null,"Não há nenhum console na caixa.", "Buscar console", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String consoleABuscar = JOptionPane.showInputDialog(null,"Insira exatamente nome do console a ser pesquisado:","Buscar console",JOptionPane.PLAIN_MESSAGE);

        if (consoleABuscar == null){
            return;
        }

        if (consoleABuscar.isBlank()){
            JOptionPane.showMessageDialog(null,"Você não digitou nada!", "Buscar console", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String consoleEncontrado = pilhaConsoles.pilhaBuscar(consoleABuscar.trim());

        JOptionPane.showMessageDialog(null, consoleEncontrado, "Buscar console", JOptionPane.PLAIN_MESSAGE);
    }

    public void listarConsoles(PilhaConsoles pilhaConsoles){

        if (pilhaConsoles.getTopoDosConsoles() == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum console na caixa.", "Listar consoles", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String listaRetorno = pilhaConsoles.pilhaListar();

        JOptionPane.showMessageDialog(null,listaRetorno,"Listar consoles", JOptionPane.PLAIN_MESSAGE);

    }

    public void contarConsoles(PilhaConsoles pilhaConsoles){

        if (pilhaConsoles.getTopoDosConsoles() == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum console na caixa.", "Contar consoles",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (pilhaConsoles.getTopoDosConsoles() == 1){
            JOptionPane.showMessageDialog(null,"No momento há "+ pilhaConsoles.getTopoDosConsoles() + " console empilhado na caixa.","Contar consoles", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,"No momento há "+ pilhaConsoles.getTopoDosConsoles() + " consoles empilhados na caixa.", "Contar consoles", JOptionPane.PLAIN_MESSAGE);

    }
}
