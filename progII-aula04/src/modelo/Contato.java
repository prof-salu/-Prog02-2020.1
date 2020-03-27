package modelo;


import java.time.LocalDate;

/**
 * @author prof-salu
 */
//MVC
    // MODEL--> MODELO
    // VIEW --> VISÃO
    // CONTROLLER --> CONTROLE
//Java BEANS

// DAO --> Data Acess Object
public class Contato {
    private int id;
    private String nome;
    private String email;
    private String endereco;
    //LocalDate existe a partir do JAVA8
    private LocalDate dataNascimento;
    
    public Contato(){
        
    }

    public Contato(int id, String nome, String email, String endereco, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + '}';
    }
}
