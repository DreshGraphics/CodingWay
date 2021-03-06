package codingway.reserva;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Dresh
 */
@Entity
public class Reserva{ 

    @Id
    @GeneratedValue
    private int idReserva;
    
    @Column(length = 100, nullable = false)
    private String nomeAluno;
    private String nomeLivro;
    private String nomeAutor;
    private Date dataPrevista;
    private String email;
    private String status;
    
    @Column(length = 100, nullable = true)
    private Date dataExpira;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the dataExpira
     */
    public Date getDataExpira() {
        return dataExpira;
    }

    /**
     * @param dataExpira the dataExpira to set
     */
    public void setDataExpira(Date dataExpira) {
        this.dataExpira = dataExpira;
    }
}