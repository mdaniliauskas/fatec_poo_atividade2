package br.com.fatec;

public class Vacina {
    private String descricao;
    private int lote;
    private String fabricante;

    public Vacina() {

    }

    public Vacina(String descricao, int lote, String fabricante) {
        setDescricao(descricao);
        setLote(lote);
        setFabricante(fabricante);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}


