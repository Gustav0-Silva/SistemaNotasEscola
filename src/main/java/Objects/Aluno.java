package Objects;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeAluno;
    private String emailResponsavel;
    private String telefoneResponsavel;
    private List<Integer>notasPotions;
    private List<Integer>notasDADefense;
    private List<Integer>notaHerbology;

    private Enum house;

    public Aluno(String nomeAluno, String emailResponsavel, String telefoneResponsavel, Enum house) {
        this.nomeAluno = nomeAluno;
        this.emailResponsavel = emailResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.house = house;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

}
