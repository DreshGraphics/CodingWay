package codingway.livro;


import codingway.livro.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dresh
 */
public class LivroTableModel extends AbstractTableModel {

    private List<Livro> livros = new ArrayList<>();
    private String[] colunas = {"ID", "Livro", "Autor"};

    public LivroTableModel(List<Livro> aluno) {
        this.livros = livros;
    }

    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro aluno = livros.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aluno.getIdLivro();
            case 1:
                return aluno.getNomeLivro();
            case 2:
                return aluno.getAutorLivro();
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
        }
        return null;
    }

}
