public class Equipamento {
    private String nome;
    private String modelo;
    private String numeroSerie;

    public Equipamento(String nome, String modelo, String numeroSerie) {
        this.nome = nome;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
