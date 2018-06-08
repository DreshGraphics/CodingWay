package codingway.aluno;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dresh
 */
public class AlunoTableModel extends AbstractTableModel {

    private List<Aluno> alunos = new ArrayList<>();
    private String[] colunas = {"Id","Matricula","Nome","Email","Curso"};

    public AlunoTableModel(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = alunos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aluno.getIdAluno();
            case 1:
                return aluno.getMatricula();
            case 2: 
                return aluno.getAluno();
            case 3:
                return aluno.getEmail();
            case 4:
                return aluno.getCurso();
        }
        return null;
    }

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
                    

        }
        return null;
    }

}
