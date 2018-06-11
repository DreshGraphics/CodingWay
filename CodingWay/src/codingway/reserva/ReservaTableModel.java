package codingway.reserva;


import codingway.reserva.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dresh
 */
public class ReservaTableModel extends AbstractTableModel {

    private List<Reserva> reservas = new ArrayList<>();
    private String[] colunas = {"ID", "Aluno", "Email", "Livro", "Autor", "Data Prevista"};

    public ReservaTableModel(List<Reserva> reservass) {
        this.reservas = reservass;
    }

    private String converterDataString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }
    
    @Override
    public int getRowCount() {
        return reservas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reserva livro = reservas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return livro.getIdReserva();
            case 1: 
                return livro.getNomeAluno();
            case 2: 
                return livro.getEmail();
            case 3:
                return livro.getNomeLivro();
            case 4:
                return livro.getNomeAutor();
            case 5:
                return converterDataString(livro.getDataPrevista());
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
            case 5:
                return colunas[5];
        }
        return null;
    }

}
