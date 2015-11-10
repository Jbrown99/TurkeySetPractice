/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkeysetpractice;

import java.util.Comparator;

/**
 *
 * @author jbrown99
 */
public class TurkeyByName implements Comparator<Turkey>{

    @Override
    public int compare(Turkey t1, Turkey t2) {
        return t1.getName().compareTo(t2.getName());
    }
    
    
}
