package codingway.funcionario;

import codingway.usuario.Usuario;
import javax.persistence.Entity;

/**
 *
 * @author Dresh
 */
@Entity
public class Funcionario extends Usuario{
    
    private String funcaoFuncionario;

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }
    
}
