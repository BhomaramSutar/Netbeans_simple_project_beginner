/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consandencap;

/**encapsulation is for wrapping code and data together into a single unit 
 * example:- capsule 
 * We can create a fully encapsulated class in Java -
 * - by making all the data members of the class private.
 * The Java Bean class is the example of a fully encapsulated class
 * It provides you the control over the data,It is a way to achieve data hiding in Java,
 * 
 * @author MJ
 */
public class Studencapsulation {
            private int rollno;
            private String firstname;
            private String lastname;
            private String field;
           

    /**
     * @return the rollno
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * @param rollno the rollno to set
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(String field) {
        this.field = field;
    }
            
         public static void main(String args[]) 
         {
             Studencapsulation se = new Studencapsulation();
             
             se.setRollno(11);
             se.setFirstname("Vishal");
             se.setLastname("sutar");
             se.setField("Msc");
             
             System.out.println(se.getRollno());
             System.out.println(se.getFirstname());
             System.out.println(se.getLastname());
             System.out.println(se.getField()); 
         }

}
