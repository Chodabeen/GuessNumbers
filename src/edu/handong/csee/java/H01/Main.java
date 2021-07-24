package src.edu.handong.csee.java.H01;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h01();
    }

    void h01() {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      int answer;
      int number_try;
      int count = 0;

      answer = r.nextInt(100) + 1;
     
      while(true){
        count++;
        System.out.print("Guess the number from 1 to 100 > ");
        number_try = s.nextInt();
        if(number_try > answer)
          System.out.println("Down!");
        else if(number_try < answer)
          System.out.println("Up!");
        else if(number_try == answer){
          System.out.println("You figured out the number in " + count + " times");
          break;
        }
      }
	}
}