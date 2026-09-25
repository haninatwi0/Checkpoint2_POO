package model;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos > 0) {
            this.eixos = eixos;
        } else {
            System.out.println("Erro: a quantidade de eixos deve ser maior que zero.");
        }
    }
}