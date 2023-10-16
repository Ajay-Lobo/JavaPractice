
import java.util.Scanner;

class Enum {
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY;

        

      
        void isworkday() {
            if (this!=SUNDAY)
                System.out.println("IT IS A WORKING DAY!!!!!");
            else
                System.out.println("IT IS NOT A WORKING DAY");
        }
    }

    public static void main(String args[]) {
        int ch;
        while (true) {
            
            System.out.println("\nSelect your day\n1.Sunday\n2.Monday\n3Tuesday\n4.Wednesday\n5.Thursday\n6.Friday\n7.Saturday\nEnter your choice:");

            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1-> DayOfWeek.SUNDAY.isworkday();
            
                case 2->DayOfWeek.MONDAY.isworkday();
                
                case 3->DayOfWeek.TUESDAY.isworkday();
              
                case 4->DayOfWeek.WEDNESDAY.isworkday();
               
                case 5->DayOfWeek.THURSDAY.isworkday();
                 
                case 6->DayOfWeek.FRIDAY.isworkday();
                
                case 7->DayOfWeek.SATURDAY.isworkday();
                  
                default->System.exit(0);
            }
        }
    }
}
  

