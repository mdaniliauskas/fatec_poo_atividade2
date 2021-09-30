package br.com.fatec;

public class ProfissionalDeSaude extends Pessoa {
    private int matricula;

    public ProfissionalDeSaude (String nome, int idade, int matricula) {
        super(nome, idade);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public static void aplicar (Vacina vacina, Paciente paciente){
        System.out.printf("%s vacinado com %s", paciente.getNome(), vacina.getFabricante());
    }
}
