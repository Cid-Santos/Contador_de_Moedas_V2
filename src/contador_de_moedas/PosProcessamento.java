/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador_de_moedas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Cid
 */
public class PosProcessamento {

    private Mat[] vetMatFile;

    private void baseImageList() {

        File dir = new File("baseConhecimento/");
        if (dir.isDirectory()) {
            String[] arqs = dir.list();
            vetMatFile = new Mat[arqs.length];
            for (int i = 0; i < arqs.length; i++) {
                String nome = "baseConhecimento/" + arqs[i];
                vetMatFile[i] = Imgcodecs.imread(nome, CvType.CV_8UC3);
            }
        }
    }

    public float ContaMoedas(double data) {
        int valor = 0;
        if (data > 20.0 && data < 28.0) {
            valor = 10;
        } else if (data > 27.0 && data < 32.0) {
            valor = 5;
        } else if (data > 30.0 && data < 34.0) {
            valor = 50;
        } else if (data > 35.0 && data < 37.0) {
            valor = 25;
        } else if (data > 37.0 && data < 40.0) {
            valor = 100;
        }

        return valor;
    }

    public void salvaImagem(Mat output, boolean criaBase, Point center, int raio) {
        if (criaBase) {
            FileWriter arq = null;
            try {
                String nome = "X" + (int) center.x + "Y" + (int) center.y + "R" + (int) raio;
                arq = new FileWriter("baseConhecimento/" + nome + ".txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.print(output.dump());
                arq.close();
                // Imgcodecs.imwrite("baseConhecimento/" + nome + ".yml", output);
            } catch (IOException ex) {
                Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    arq.close();
                } catch (IOException ex) {
                    Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public int totalValor(Mat output) {
        baseImageList();//Carrega a base de conhecimento
        int moeda = 0;
        for (int j = 0; j < vetMatFile.length - 1; j++) {
         /*  Mat histImag = vetMatFile[j];
            double distance = Imgproc.compareHist(output, histImag, Imgproc.CV_COMP_CORREL);
            if (distance > 0.8) {
                moeda = j;
            }*/
        }
        return moeda;
    }

}
