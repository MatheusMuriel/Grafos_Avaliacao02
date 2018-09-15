import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    protected   static  int quantFuncionarios;
    protected   static  int quantConexoes;
    protected   static  int     numeroVertices;
    protected   static  int[][] conexoes;
    protected   static  String  saidaPrograma;

    public static List< ArrayList<Integer> > listas = new ArrayList<>();
    public static Scanner teclado;


    public static void main(String[] args) {
        System.out.println("Hello World!");

        teclado = new Scanner(System.in);

        File arquivoEntrada = new File("input.txt");
        ReadFile(arquivoEntrada);



    }

    public static void ReadFile(File file) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;


            for(int i = 1; (st=br.readLine()) != null; i++){
                if(i == 1){
                    System.out.println("lendo a primeira elemento");
                    quantFuncionarios = new Integer(st.substring(0, st.indexOf(' ')));
                    System.out.println(quantFuncionarios);

                    //GUILHERME
                    Main.criaSubListas(quantFuncionarios);



                    System.out.println("lendo a segundo elemento");
                    quantConexoes = new Integer(st.substring(st.indexOf(' ')+1));
                    System.out.println(quantConexoes);



                }else{
                    Integer x = 0;
                    Integer y = 0;
                    for(int j = 0; j < st.length(); j++){
                        if (j == 0) x = Integer.parseInt(st.substring(0,1));
                        if (j == 2) y = Integer.parseInt(st.substring(2,3));

                    }

                    //leConexoes(x,y);
                }
            }




        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //guilherme
    private static void criaSubListas(int quantFuncionarios) {



    }

}
