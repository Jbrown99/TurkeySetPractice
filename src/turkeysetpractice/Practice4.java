/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkeysetpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jbrown99
 */
public class Practice4 {
    public static void main(String[] args) {
        
        Turkey t1 = new Turkey("Tom",4,"678");
        Turkey t2 = new Turkey("Bob",2,"234");
        Turkey t3 = new Turkey("Fred",3,"756");
        
        Set<Turkey> turkeys = new TreeSet<Turkey>();
        turkeys.add(t1);
        turkeys.add(t2);
        turkeys.add(t3);
        
        
        List<Turkey> turkeyList = new ArrayList<>(turkeys);
        //Collections.sort(turkeyList, new TurkeyByName());
        for(Turkey t: turkeys ){
            System.out.println(t);
        }
        
        
        
    }
}
