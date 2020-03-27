import java.util.Random;
import java.util.Scanner;

public class Comp {
    private String cpu;
    private int ram;
    private int hdd;
    private int work_cycle;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    boolean isRunning;
    boolean isDied;

    public Comp(String cpu, int ram, int hdd, int work_cycle){ //конструктор
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.work_cycle = work_cycle;
    }

    public String description(){
        return cpu + " " + ram + " " + hdd+ " " + work_cycle + " ";
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }


    public int getWork_cycle() {
        return work_cycle;
    }

    public void setWork_cycle(int work_cycle) {
        this.work_cycle = work_cycle;
    }

    public boolean isDied(){
        if(isDied){
            System.out.println("Died " + description());
            return true;
        }
        return false;
    }

    public void start(){
        if(isDied()) return;
        if(!isRunning && !error()){
            System.out.println("On " + description());
            isRunning = true;
        }
    }

    public void stop(){
        if(isDied()) return;
        if(isRunning && !error()){
            System.out.println("Off " + description());
            isRunning = false;
            work_cycle--;
            if(work_cycle == 0){
                isDied = true;
            }
        }
    }

    private boolean error(){
        System.out.print("Enter 1 or 0: ");
        if(scan.nextInt() == rand.nextInt(2)){
            return false;
        }
        System.out.println("Died" + description());
        isDied = true;
        return true;
    }
    }

