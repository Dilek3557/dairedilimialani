import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double yaricap;
        double pi = 3.14;
        double aci;
        Scanner input = new Scanner(System.in);


        yaricap = input.nextDouble();
        aci = input.nextDouble();
        double alan=(pi*yaricap*yaricap*aci)/360;
        System.out.println(alan);
    }}


