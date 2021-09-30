package br.com.fatec;

public class Principal {
    public static void main(String[] args) {
        Vacina vacina = new Vacina("vacina covid-19", 53, "Pfizer");
        ProfissionalDeSaude profissional = new ProfissionalDeSaude("Maria", 27, 11223344);
        Paciente paciente = new Paciente("João", 43);
        ProfissionalDeSaude.aplicar(vacina, paciente);
    }
}
