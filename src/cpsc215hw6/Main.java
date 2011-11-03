/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cpsc215hw6;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author John Dickinson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        int i = 0;
        for (i = 0; i <= 5; i++){
            testList.add(i);
        }
        System.out.println(testList);
        testList = test(testList);
        System.out.println(testList);

    }

    //Takes a LinkedList and returns a reversed version
public static LinkedList reverse(LinkedList original) {
        ListIterator order = original.listIterator();
            if(original.size() >= 1){
            original.push(original.getLast());
            original.removeLast();
            System.out.println(original.size());
            reverse(original);
            return original;
           }
        return original;

    }

public static LinkedList test(LinkedList t){

      Object first = t.getFirst();
      Object rest = t.iterator().next();

      if (rest == null){
          return t;
      }
      test(t);
      return t;
}
}
