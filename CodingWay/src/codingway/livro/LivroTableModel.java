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

    private List<Livros> livros = new ArrayList<>();
    private String[] colunas = {"ID", "Livro", "Autor"};

    public LivroTableModel(List<Livros> livros) {
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
        Livros livro = livros.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return livro.getIdLivro();
            case 1:
                return livro.getNomeLivro();
            case 2:
                return livro.getAutorLivro();
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
