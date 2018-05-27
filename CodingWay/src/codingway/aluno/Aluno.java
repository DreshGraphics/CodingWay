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
    private int IdAluno;
    
    @Column(length = 100, nullable = false)
    private String nome;
    private String curso;
    private String semestre;
    private String email;

    /**
     * @return the IdAluno
     */
    public int getIdAluno() {
        return IdAluno;
    }

    /**
     * @param IdAluno the IdAluno to set
     */
    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    

}