package codingway.aluno;

public class QuerySql {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        AlunoDAO alunoDAO = new AlunoDAO();
        
        aluno.setAluno("Joao");
        aluno.setEmail("teste@gmail.com");
        aluno.setCurso("Administração");
        aluno.setMatricula(123456);
        
        alunoDAO.teste();
    }
}
