import java.util.Random;

  class Main {
  public static void main(String[] args) {
    Random r = new Random();
  
  int randomNum = r.nextInt(50) + 1;
  
      System.out.println("The random number is:" + randomNum);

      for(int x = randomNum; x >= 0; x--) 
      { 
        System.out.println(x); 
      }
   
    if (randomNum <= 5)
      {System.out.println("Ahoy mateys!");
      }
    else if (randomNum > 25 && randomNum < 42)
      
      {System.out.println("Canonball!");
      }
    else
      {System.out.println("Blast off!");
      }
      }
    }
