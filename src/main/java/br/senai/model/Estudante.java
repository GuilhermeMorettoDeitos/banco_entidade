package br.senai.model;

public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(int id, String nome, String email, String matricula) {
        super(id, nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public String toString() {
        return "Estudante [id=" + getId() + ", nome=" + getNome() + ", email=" + getEmail() + ", matricula=" + matricula + "]";
    }
}

