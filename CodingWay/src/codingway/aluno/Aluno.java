package codingway.aluno;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Dresh
 */
@Entity
public class Aluno{ 

    @Id
    @GeneratedValue
    private int idAluno;
    
    @Column(length = 100, nullable = false)
    private String Aluno;
    private String Curso;
    private String Email;
    private int Matricula;
    
    
   public int getMatricula() {
        return Matricula;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String Aluno) {
        this.Aluno = Aluno;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}