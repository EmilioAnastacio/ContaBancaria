import java.math.BigDecimal;
import java.util.Scanner;

public class conta {

    private String nome;

    private BigDecimal unidade = new BigDecimal(100);

    private BigDecimal saldoInvestido = new BigDecimal(0);

    public BigDecimal resgatar(){

        Scanner scanner = new Scanner(System.in);
        BigDecimal aumento = new BigDecimal("1.05");

        System.out.println("Saldo atual de: " + this.getUnidade());

        System.out.println("valor a retirar: ");
        BigDecimal valorTirar = scanner.nextBigDecimal();

        int comparar = this.getUnidade().compareTo(valorTirar);

        if (comparar < 0){
            System.out.println("Valor na conta insuficiente, tente com um valor inferior");
        }else {
            this.setUnidade(this.getUnidade().subtract(valorTirar));
            this.setSaldoInvestido(this.saldoInvestido.multiply(aumento));

            System.out.println("Saldo atual: "+ this.getUnidade());
            System.out.println("Saldo Investido: " + this.getSaldoInvestido());

        }


        return BigDecimal.ZERO;
    }

    public BigDecimal depositar(){

        Scanner scanner = new Scanner(System.in);
        BigDecimal aumento = new BigDecimal("0.05");

        System.out.println("Saldo atual de:" + this.getUnidade());

        System.out.println("valor a depositar: ");

        BigDecimal valor = scanner.nextBigDecimal();
        this.getUnidade().add(valor);

        this.setUnidade(this.getUnidade().add(valor));
        this.setSaldoInvestido(this.saldoInvestido.multiply(aumento));

        System.out.println("Saldo Atual: " + this.getUnidade());
        System.out.println("Saldo Investido: " + this.getSaldoInvestido());

        return BigDecimal.ZERO;
    }

    public void Investir(){
        Scanner scanner = new Scanner(System.in);
        BigDecimal aumento = new BigDecimal("0.05");

        System.out.println("Saldo atual de: " + this.getUnidade());
        System.out.println("Saldo Investido de: " + this.getSaldoInvestido());

        System.out.println("Valor a investir: ");

        BigDecimal valorInvestir = scanner.nextBigDecimal();

        int comparar = this.getUnidade().compareTo(valorInvestir);

        if (comparar < 0){
            System.out.println("Valor na conta insuficiente, tente com um valor inferior");
        }else {
            this.setUnidade(this.getUnidade().subtract(valorInvestir));
            this.setSaldoInvestido(valorInvestir);

            System.out.println("Saldo atual: "+ this.getUnidade());
            System.out.println("Saldo Investido: "+ this.getSaldoInvestido());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getUnidade() {
        return unidade;
    }

    public void setUnidade(BigDecimal unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(BigDecimal saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }
}
