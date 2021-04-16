package projeto;

import java.util.ArrayList;
import java.util.Map;

public class Avancado extends Jogador {
    private int finalizacao;
    private int compostura;

    public Avancado() {
        super();
        this.finalizacao = 0;
        this.compostura = 0;
    }

    public Avancado(String nom, String eq, int ide, ArrayList<String> hist, Map<String,Integer> ats, int fn, int cp) {
        super(nom, eq,ide, hist, ats);
        this.finalizacao = fn;
        this.compostura = cp;
    }

    public Avancado(Avancado a) {
        super(a);
        this.finalizacao = a.finalizacao;
        this.compostura = a.compostura;
    }

    public Avancado clone() {
        return new Avancado(this);
    }

    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || o.getClass() != this.getClass()) return false;

        Avancado a = (Avancado) o;
        return super.equals(o) && this.finalizacao == a.finalizacao && this.compostura == a.compostura;
    }

    public String toString() {
        return super.toString() + "\nFinalizacao: " + this.finalizacao + "\nCompostura: " + this.compostura + "\n";
    }

    public int calculaOverall() {
        return 0;
    }

    public void setFinalizacao(int fn) {
        this.finalizacao = fn;
    }
    public void setCompostura(int cp) {
        this.compostura = cp;
    }
    public int getFinalizacao() {
        return this.finalizacao;
    }
    public int getCompostura() {
        return this.compostura;
    }
}