package br.senai;

import br.senai.dao.Conexao;
import br.senai.dao.EstudanteDAO;
import br.senai.dao.PessoaDAO;
import br.senai.dao.ProfessorDAO;
import br.senai.model.Estudante;
import br.senai.model.Pessoa;
import br.senai.model.Professor;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //INICIAR
        EstudanteDAO estudanteDAO = new EstudanteDAO();
        List<Estudante> estudantes = estudanteDAO.listarTodos();

        //INSERIR
        Estudante leo = new Estudante(
                0,
                "Leonardo",
                "Leonardo@leonardo.com",
                "2222"
        );
        estudanteDAO.inserir(leo);

        //BUSCAR POR ID
        System.out.println(estudanteDAO.buscarPorId(15));

        //ATUALIZAR
        leo.setNome("Leo");
        leo.setEmail("Leo@leo.com");
        leo.setMatricula("3322");
        estudanteDAO.atualizar(leo);

        //LISTAR TODOS
        System.out.println(estudanteDAO.listarTodos());

        //DELETAR
        //estudanteDAO.deletar(15);



    }
}