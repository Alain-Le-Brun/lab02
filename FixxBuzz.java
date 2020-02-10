/**COMMENTAIRE QUELCONQUE DANS lab02*/
public class FixxBuzz {
    public static void main(String[]args){
        int cpt = 1;
        int butFin = 100;
        while(cpt <= butFin){
            System.out.print(cpt);
            System.out.print(": ");
            boolean multiple_3 = false;
            boolean multiple_5 = false;
            if(cpt % 3 == 0){
                multiple_3 = true;
            }
            if(cpt % 5 == 0){
                multiple_5 = true;
            }
            if(multiple_3 == true){
                System.out.print("Fizz");
                if(multiple_5 == true){
                    System.out.print("Buzz");
                    multiple_5 = false;
                }
                System.out.println();
            }else if(multiple_3 == false){
                if(multiple_5 == false){
                    System.out.println(cpt);
                }
            }
            if(multiple_5 == true){
                System.out.println("Buzz");
            }
            cpt = cpt + 1;
        }
    }
}
