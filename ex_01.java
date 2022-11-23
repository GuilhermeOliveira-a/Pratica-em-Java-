//Primeiro exercicio proposto


public class ex_01 {
    public static void main(String[] args) {

        String productOne = "Computer" ;
        String productTwo = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("%s,which price is $ %.2f%n",productOne ,priceOne);
        System.out.printf("%s, which price is $ %.2f%n",productTwo ,priceTwo);
        System.out.println();
        System.out.println("Record: "+age+" year old, code "+code+" and gender : "+gender);
        System.out.println("Measure with eight decimal places : "+measure);
        System.out.println("Rouded (tree decimal place): "+measure);
        System.out.println("US decimal point:" +measure);



    }
}
