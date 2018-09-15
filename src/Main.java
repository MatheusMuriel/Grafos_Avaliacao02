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
    public static ArrayList<Integer> listaTamanhos = new ArrayList<>();
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
            Main.geraListaTamanhos();
            System.out.println("Numero de possibilidades: " + resultadoDePosibilidade());
            System.out.println("Numero de funcionarios do maior grupo: " + );
            System.out.println("Numero de grupos existentes: " + listaTamanhos.size());


        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void geraListaTamanhos() {

        for(int i = 0; i < listas.size(); i++){
            listaTamanhos.add(listas.get(i).size());
        }

    }

    private static void criaConexoes(int elemento1, int elemento2) {

        int _elemento1;
        if(elemento2 < elemento1){
            //troca valores
            _elemento1 = elemento2;
            elemento2 = elemento1;
        }else{
            _elemento1 = elemento1;
        }

        for(int i = 0; i < listas.size(); i++){

            //Se a subLista contem o elemento1, adicione o elemento 2
            if (listas.get(i).contains(_elemento1)){
                //adicionou o segundo elemento na lista
                listas.get(i).add(elemento2);

                //mata as listas abaixo que sejam referentes ao elemento1
                Main.mataLista(i+1, elemento2 );

            }


        }


    }

    /**
     * Metodo que elimina listas que tem o identificador que já foi adicionado.
     *
     */
    private static void mataLista(int i, int _elemento1) {




        for (; i < listas.size(); i++){

            if (listas.get(i).get(0) == _elemento1)  listas.remove(i);

        }


    }

    private static void fazConexoes(int quantConexoes) {


    }

    //guilherme
    private static void criaSubListas(int quntSubListas) {
        //exemplo Recebe 10, cria 10 sublistas
        for (int i = 0; i < quntSubListas; i++ ){

            ArrayList<Integer> aux = new ArrayList<>(i);
            aux.add(i);

            listas.add(aux);

        }

    }

    private static int resultadoDePosibilidade (){

        int somador = 0;
        int resultadoDaMult = 0;
        int exececao = 0;
        for(int i = 0; i< listaTamanhos.size()-1; i++){
            if(listaTamanhos.get(i)== 1){
                exececao = listaTamanhos.size()-1 -i;
                for(int k = exececao; k<=1; k++){
                    somador += k;
                }
            }
            for(int j= 1; j< listaTamanhos.size()-1; j++){
                resultadoDaMult = listaTamanhos.get(i) * listaTamanhos.get(j);
                somador += resultadoDaMult;
            }
        }
        return somador;
    }

}
