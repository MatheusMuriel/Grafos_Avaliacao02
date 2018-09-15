import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    protected   static  int     tamanho;
    protected   static  int     numeroVertices;
    protected   static  int[][] conexoes;
    protected   static  String  saidaPrograma;

    public static List< ArrayList<Integer> > listas = new ArrayList<>();


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




        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }


    }

}
