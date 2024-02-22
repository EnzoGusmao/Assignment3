public class Assign3Q4_3 {
    public static void main(String args[]){
        
    for (int lines=0; lines<5; lines++){
        for (int caracter=0; caracter<4-lines; caracter++){
       System.out.print(" ");       
    } 
    for (int caracter=0; caracter<=lines; caracter++){
       System.out.print("*"); 
    }
    System.out.println();
    }
}
}