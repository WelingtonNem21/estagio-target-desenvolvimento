package resposta03;

public class Resposta03 {

    public static void main(String[] args) {

        double[] faturamentos = { 0, 0, 0, 0, 0, 1000, 2000, 1500, 0, 0, 0, 3000, 0, 4000, 0, 0, 0, 2500, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0 };

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamentos) {
            if (valor > 0) {
                if (valor < menor)
                    menor = valor;
                if (valor > maior)
                    maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (double valor : faturamentos) {
            if (valor > media)
                diasAcimaDaMedia++;
        }

        System.out.println("Menor valor de faturamento: R$" + menor);
        System.out.println("Maior valor de faturamento: R$" + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
