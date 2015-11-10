/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkeysetpractice;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;
/**
 *
 * @author jbrown99
 */
public class Turkey implements Comparable {
    
    private String name;
    private int age;
    private String dnrTraceNum;

    public Turkey(String name, int age, String dnrTraceNum) {
        this.name = name;
        this.age = age;
        this.dnrTraceNum = dnrTraceNum;
    }

    @Override
    public String toString() {
        return "Turkey{" + "name=" + name + ", age=" + age + ", dnrTraceNum=" + dnrTraceNum + '}';
    }
    
    
    
    public int compareTo(Object other) {
        
        Turkey t = (Turkey)other;
        
        return new CompareToBuilder()
               .append(this.dnrTraceNum, t.dnrTraceNum)
               .toComparison();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.dnrTraceNum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (!Objects.equals(this.dnrTraceNum, other.dnrTraceNum)) {
            return false;
        }
        return true;
    }

   

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDnrTraceNum() {
        return dnrTraceNum;
    }

    public void setDnrTraceNum(String dnrTraceNum) {
        this.dnrTraceNum = dnrTraceNum;
    }
    
    
    
    

   
    
    
    
    
    
}
