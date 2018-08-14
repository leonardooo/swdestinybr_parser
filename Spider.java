import java.io.*;
import java.util.*;
class Spider {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("banidas.txt"));
        Set<String> banidas = new HashSet<>();

        while(true) {
            String linha = br.readLine();

            if(linha == null || linha.trim().equals("")) {
                break;
            }

            banidas.add(linha.trim().toLowerCase());
        }

        br.close();
        br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String linha = br.readLine();

            if(linha == null || linha.trim().equals("")) {
                break;
            }

            String nome = br.readLine();
            String linha3 = br.readLine();
            String[] linha3_array = linha3.split(" ");

            Double valor = Double.parseDouble(linha3_array[2]);

            if(valor <= 5 && !banidas.contains(nome.trim().toLowerCase())) {
                System.out.println(nome + " " + valor);
            }
        }
    }
}