import java.time.LocalDate;
import java.time.LocalTime;
class number{
    String ACSII;
}

public class clock{
    public static final String CLEAR = "\033[H\033[2J"; 
    static number[] num = new number[11];
  
    
    /**
     * @param args
     */
    public static void main(String args[]){ 
        
  
        System.out.println(CLEAR);
            num[0] = new number();
            num[1] = new number();
            num[2] = new number();
            num[3] = new number();
            num[4] = new number();
            num[5] = new number();
            num[6] = new number();
            num[7] = new number();
            num[8] = new number();
            num[9] = new number();
            num[10] = new number();
            
            num[0].ACSII="█▀▀█\n"+"█  █\n"+"█▄▄█";
            num[1].ACSII="▄█\n"+"▀█\n"+"▄█▄";
            num[2].ACSII="█▀▀█\n"+"  ▄▀\n"+"█▄▄█";
            num[3].ACSII="█▀▀█\n"+"──▀▄\n"+"█▄▄█";
            num[4].ACSII="█  █\n"+"█▄▄█\n"+"   █";
            num[5].ACSII="█▀▀▀\n"+"▀▀▀█\n"+"█▄▄█";
            num[6].ACSII="█▀▀▀\n"+"█▀▀█\n"+"█▄▄█";
            num[7].ACSII="▀▀▀█\n"+"  █ \n"+" █  ";
            num[8].ACSII="█▀▀█\n"+"█▀▀█\n"+"█▄▄█";
            num[9].ACSII="█▀▀█\n"+"█▄▄█\n"+"  ▄█";
            num[10].ACSII="█\n"+"\n"+"█";
 //
            while(true){
                System.out.println(CLEAR);
                System.out.println("\033[?25l");
                LocalTime clock = LocalTime.now();
                int x = clock.getSecond();
                int XfirstDigit = x / 10; // Result: 4 (Integer division)
                int XsecondDigit = x % 10;
                int y = clock.getHour();
                int YfirstDigit = y / 10;
                int YsecondDigit = y % 10;
                int F = clock.getMinute();
                int FfirstDigit = F / 10;
                int FsecondDigit = F % 10;
                int Z = 40;
                DrawN(20,6+Z,YfirstDigit);
                DrawN(20,12+Z,YsecondDigit);

                DrawN(20,20+Z,10);
                
                DrawN(20,26+Z,FfirstDigit);
                DrawN(20,32+Z,FsecondDigit);

                DrawN(20,40+Z,10);

                DrawN(20,46+Z,XfirstDigit);
                DrawN(20,52+Z,XsecondDigit);
                
                try {
                        Thread.sleep(1000);
                } catch (InterruptedException e) {
    // This happens if the thread is interrupted while sleeping
                    Thread.currentThread().interrupt(); 
                }

            }
    
       
 
    

    }
      public static void DrawN(int row, int col, int n){
        String result = num[n].ACSII;
        String[] lines = result.split("\n");
        for(int i = 0; i< lines.length;i++){
            System.out.printf("\033[%d;%dH%s", row+i, col,lines[i]);
            System.out.flush();
        }
    }
    
  

    
}