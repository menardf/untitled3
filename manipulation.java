/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 11:08 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class manipulation {
    public String Stringmanipulation(String newstring){
        String reverse="";
        for(int i=newstring.length()-1;i>=0;i++){
            reverse= reverse + newstring.charAt(i);
        }
        System.out.println("reverse is "+reverse);
        return reverse;



    }
    public static void main(String[] args){
        manipulation ts= new manipulation();
        String weak="t";
        ts.Stringmanipulation(weak);

    }
}
