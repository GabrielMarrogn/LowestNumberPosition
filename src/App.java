import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        String[] c = b.split(" ");
        List<Integer> arr = new ArrayList<>(); 
        int menor = 0;
        int posicao = 0;

        for(int i = 0; i < a; i++){
            arr.add(Integer.parseInt(c[i]));
        }
        
        for(int i = 0; i < a; i++){
            if(i == 0){
                menor = arr.get(i);
                posicao = i;
            }else if(arr.get(i) < menor){
                menor = arr.get(i);
                posicao = i;
            }
        }

        System.out.println("Menor valor: " +menor);
        System.out.println("Posicao: " +posicao);
    }
}
