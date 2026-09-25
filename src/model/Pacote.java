package model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Erro: o código não pode estar vazio.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: o peso deve ser maior que zero.");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !status.isEmpty()) {
            this.status = status;
        } else {
            System.out.println("Erro: o status não pode estar vazio.");
        }
    }

    public void mudarStatus(String novoStatus) {
        setStatus(novoStatus);
    }
}
