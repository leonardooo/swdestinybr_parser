import java.io.*;
class Spider {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String linha = br.readLine();

            if(linha == null || linha.trim().equals("")) {
                break;
            }

            String nome = br.readLine();
            String linha3 = br.readLine();
            String[] linha3_array = linha3.split(" ");

            Double valor = Double.parseDouble(linha3_array[2]);

            if(valor <= 5) {
                System.out.println(nome + " " + valor);
            }
        }
    }
}