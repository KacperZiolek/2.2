import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


    double pierwsza_l;
    double druga_l;
    Scanner wej = new Scanner(System.in);       // zadeklaruj że chcesz zczytywać
    System.out.println("PODAJ PIERWSZA LICZBE :");
    pierwsza_l = wej.nextDouble();             // Wczytywanie wartosci z klawiatury
    System.out.println("PODAJ DRUGA LICZBE :");
    druga_l = wej.nextDouble();
    System.out.println(pierwsza_l + druga_l);
    System.out.println(pierwsza_l - druga_l);
    System.out.println(pierwsza_l * druga_l);
    if(druga_l != 0){
      System.out.println(pierwsza_l / druga_l);
    } else{
      System.out.println("nie dziel przez 0");
        
    }
  }
}