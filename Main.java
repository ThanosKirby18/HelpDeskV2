import java.util.Scanner;

class Main 
{
  Scanner keyboard = new Scanner (System.in); // Creates an object for inputs
  public static void main(String[] args) 
  {
    Scanner keyboard = new Scanner (System.in);
    Scanner keyboard2 = new Scanner (System.in);
    int num1, response;
    String report = " ";
    boolean satisfied = false;

    
    System.out.println("______________________________________________________________");
    System.out.println("|                                                            |");
    System.out.println("|                      Welcome To Help Desk                  |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("|                  A Safe Place To Ask For Help              |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("|                         Type \"1\" To Start                  |");
    System.out.println("|                         Type \"11\" To Quit                |");
    System.out.println("______________________________________________________________");
    while (satisfied != true)
    {
    num1 = keyboard.nextInt();
    response = num1;

     if(response == 1)
     {
      Trajectory();
   
    }
    else if(response == 5)
    {
      System.out.println("______________________________________________________________");
      System.out.println("|                     Mental Health Assistanc                |");
      System.out.println("|                                                            |");
      System.out.println("|        Suicide Prevention Lifeline at 1-800-273-TALK       |");
      System.out.println("|                                                            |");
      System.out.println("| South Coast mental Health Services https://bit.ly/2S0igyv| |");
      System.out.println("|                                                            |");
      System.out.println("|SAMSHA Substance Abuse And Mental Health Services Aministarition|");
      System.out.println("|        https://www.samhsa.gov/find-help/national-helpline|    ");
      System.out.println("|                                                            |");
      System.out.println("|                                                            |");
      System.out.println("______________________________________________________________");
   
   } else if(response == 4)//end if
   {
    System.out.println("______________________________________________________________");
    System.out.println("|                      Study Help Trajectory                 |");
    System.out.println("|                                                            |");
    System.out.println("|          Please Input One OF the Three options Below       |");
    System.out.println("|                                                            |");
    System.out.println("|       help For Math https://www.khanacademy.org/           |");
    System.out.println("|                                                            |");
    System.out.println("|  easybib.com has a variety of Services For Language arts   |");
    System.out.println("|         Free online Science tutors www.studypug.com        |");
    System.out.println("|                         Type \"0\" To Start                |");
    System.out.println("|                                                            |");
    System.out.println("______________________________________________________________");
   }
   else if(response == 6){
    System.out.println("______________________________________________________________");
    System.out.println("|                     Reporting Station                      |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("|           Type Annything You Wish To Report                |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("|           press \"9\" When Asked To Conform                 |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("|                                                            |");
    System.out.println("______________________________________________________________");
    report = keyboard2.nextLine();
    System.out.println("-"+ report +"-");
    System.out.println("Is This The Message you Wish to Send?");
    num1 = keyboard.nextInt();
    response = num1;
    if (response == 9){
      System.out.println("Your Report Has Been submited");
      Trajectory();
    }
    else if (response != 9)
    {
      System.out.println("Your Report Has Been Cancelled");
      Trajectory();
    }
   }
   else if(response == 11)
   {
     System.out.println("Goodbye");
    satisfied = true;
   }
   
  }// end of while
  }//wnd of public main
  private static void Trajectory() {
    System.out.println("______________________________________________________________");
    System.out.println("|                     Welcome To The Trajectory              |");
    System.out.println("|                                                            |");
    System.out.println("|          Please Input One OF the Three options Below       |");
    System.out.println("|                                                            |");
    System.out.println("|             Type \"4\" to get recources for Studying         |");
    System.out.println("|                                                            |");
    System.out.println("|          Type \"5\" to get recources for Mental Healh        |");
    System.out.println("|          Type \"6\" to Report Someone or Something           |");
    System.out.println("|                         Type \"11\" To Quit                  |");
    System.out.println("|                                                            |");
    System.out.println("______________________________________________________________");
  }
}//end of main