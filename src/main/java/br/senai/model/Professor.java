package br.senai.model;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(int id, String nome, String email, String departamento) {
        super(id, nome, email);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return "Professor [id=" + getId() + ", nome=" + getNome() + ", email=" + getEmail() + ", departamento=" + departamento + "]";
    }
}

