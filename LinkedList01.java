/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist01;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class LinkedList01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        ImplemList list;
        int size, op, num, sumary, replace;
        
        System.out.print("Define a size of your list: ");
        size = in.nextInt();
        list = new ImplemList(size);
        
        do{
            System.out.println("Enter you option: \n"
                    + "1 - Insert a number in the list; \n"
                    + "2 - Remove a number in the list; \n"
                    + "3 - Insert a number in specific position in the list; \n"
                    + "4 - See all numbers in the list: \n"
                    + "5 - Exit. \n");
            op = in.nextInt();
            
            switch(op)  {
                case 1:
                    for(int i = 0; i < size; i++)   {
                        System.out.print("Insert the item " + (i + 1) + " in the list: ");
                        num = in.nextInt();
                        list.insert(num);
                    }
                    break;
                case 2:
                    System.out.print("Insert the position that you wish remove: ");
                    sumary = in.nextInt();
                    list.remove((sumary - 1)); 
                    break;
                case 3:
                    System.out.print("Insert the number that you wish insert: ");
                    num = in.nextInt();
                    System.out.print("Insert the position that you wish replace: ");
                    replace = in.nextInt();
                    replace = replace - 1;
                    list.replace(num, replace);
                    break;
                case 4:
                    list.toPrint();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op >= 1 && op < 6);
    }
    
}
