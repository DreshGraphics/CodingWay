/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingway.telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Brenno
 */
@Entity
@Table(name = "livros", catalog = "systembiblioteca", schema = "")
@NamedQueries({
    @NamedQuery(name = "Livros.findAll", query = "SELECT l FROM Livros l")
    , @NamedQuery(name = "Livros.findByIdLivro", query = "SELECT l FROM Livros l WHERE l.idLivro = :idLivro")
    , @NamedQuery(name = "Livros.findByAutorLivro", query = "SELECT l FROM Livros l WHERE l.autorLivro = :autorLivro")
    , @NamedQuery(name = "Livros.findByNomeLivro", query = "SELECT l FROM Livros l WHERE l.nomeLivro = :nomeLivro")})
public class Livros implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLivro")
    private Integer idLivro;
    @Column(name = "autorLivro")
    private String autorLivro;
    @Column(name = "nomeLivro")
    private String nomeLivro;

    public Livros() {
    }

    public Livros(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        Integer oldIdLivro = this.idLivro;
        this.idLivro = idLivro;
        changeSupport.firePropertyChange("idLivro", oldIdLivro, idLivro);
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        String oldAutorLivro = this.autorLivro;
        this.autorLivro = autorLivro;
        changeSupport.firePropertyChange("autorLivro", oldAutorLivro, autorLivro);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        String oldNomeLivro = this.nomeLivro;
        this.nomeLivro = nomeLivro;
        changeSupport.firePropertyChange("nomeLivro", oldNomeLivro, nomeLivro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivro != null ? idLivro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livros)) {
            return false;
        }
        Livros other = (Livros) object;
        if ((this.idLivro == null && other.idLivro != null) || (this.idLivro != null && !this.idLivro.equals(other.idLivro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "codingway.telas.Livros[ idLivro=" + idLivro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
