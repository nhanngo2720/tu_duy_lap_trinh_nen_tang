public class App {

public static int maxValue(int a ,int  b , int c ) {
        int maxValue = a;
         if (b> a) {
             maxValue = b;
         }
         if (c> b) {maxValue = c;
         }
         //dung 2 if la vi kiem tra lan luot, neu dung else la sai 
         return maxValue; 
     }
public static void main(String[] args){
    int x = 1;
    int y = 2;
    int z = 3;
int result = maxValue(x,y,z);
System.out.println("so lon nhat is: " + result); 
    }
}
