import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  int i;
  System.out.println("Podaj liczbe");
  Scanner a = new Scanner(System.in);
    i = a.nextInt();

    if(i<2)
    {
      System.out.println("to nie liczba pierwsza");
    }
    
      else for(int j=2;j<=i/2;j++)
        {
          if(i%j==0)
          {
          System.out.println("to nie jest liczba pierwsza "+i);
          break;
          }
          else
          {
          System.out.println("jest to liczba pierwsza "+i);
          break;
          }
        }
    }
    
    
  }
