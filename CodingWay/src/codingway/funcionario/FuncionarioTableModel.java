package codingway.funcionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dresh
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Código", "Nome", "Login", "Senha", "Função", "CPF", "Cidade", "Telefone"};

    public FuncionarioTableModel(List<Funcionario> professor) {
        this.funcionarios = professor;
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = funcionarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return funcionario.getId();
            case 1:
                return funcionario.getNome();
            case 2:
                return funcionario.getLoginUsuario();
            case 3:
                return funcionario.getSenhaUsuario();
            case 4:
                return funcionario.getFuncaoFuncionario();
            case 5:
                return funcionario.getCpf();
            case 6:
                return funcionario.getCidade();
            case 7:
                return funcionario.getTelefone();
        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];

        }
        return null;
    }

}
