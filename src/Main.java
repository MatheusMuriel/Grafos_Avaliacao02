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
                    //Lendo conexeões

                    
                    System.out.println("lendo a primeira conexao");
                    int elemento1 = new Integer(st.substring(0, st.indexOf(' ')));
                    System.out.println(elemento1);


                    System.out.println("lendo a segunda conexao");
                    int elemento2 = new Integer(st.substring(st.indexOf(' ')+1));
                    System.out.println(elemento2);
                    
                    Main.criaConexoes(elemento1, elemento2);
                    
                }
            }




        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void criaConexoes(int elemento1, int elemento2) {

        for(int i = 0; i < listas.size(); i++){

            //Se a subLista contem o elemento1, adicione o elemento 2

            //Apos isso, apage a lista que tem o numero de indece 0 igual a elemento1
            if (listas.get(i).contains(elemento1)){
                
            }

        }


    }

    private static void fazConexoes(int quantConexoes) {


    }

    //guilherme
    private static void criaSubListas(int quntSubListas) {
        //exemplo Recebe 10, cria 10 sublistas
        for (int i = 0; i < quntSubListas; i++ ){

            listas.add(new ArrayList<>(i));

        }

    }

}
