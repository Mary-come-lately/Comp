import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        //массив компов
//        Comp[] comps = new Comp[5];
//        comps[0] = new Comp("Intel", 32, 2, 3);
//        comps[1] = new Comp("AMD", 24, 1, 2);
//        comps[2] = new Comp("Ciryx", 16, 512, 4);
//        comps[3] = new Comp("NexGen", 8, 512, 5);
//        comps[4] = new Comp("Texas Instruments", 4, 250, 3);

        Comp comp = new Comp("Intel", 32,512,3);

        //вывод
//        for (int i = 0; i < comps.length; i++) {
//            System.out.println(comps[i].description());
//        }
//        System.out.println();

        //компы, у которых ram > 8
//        for (int i = 0; i < comps.length; i++) {
//            if(comps[i].getRam() > 8){
//                System.out.println(comps[i].description());
//            }
//        }
//        System.out.println();

        //максимальный hdd
//        int max = 0;
//        for (int i = 0; i < comps.length; i++) {
//            if(max < comps[i].getHdd()){
//                max = comps[i].getHdd();
//            }
//        }
//        System.out.println("The comp with max HDD is " + max);

        //циклы включения
    comp.start();
    comp.start();
    comp.start();
    comp.start();
    comp.stop();
        comp.stop();
        comp.stop();
        comp.stop();
        comp.stop();
        comp.stop();
        comp.start();
        comp.start();
        comp.stop();
        comp.stop();




        }
    }

