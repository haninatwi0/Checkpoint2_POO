package model;

public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: a placa não pode estar vazia.");
        }
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: a capacidade deve ser maior que zero.");
        }
    }
}