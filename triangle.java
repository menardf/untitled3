/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 11:23 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class triangle {
    public String drawtriangle(int size){

        if( size==0)return "";
        else {
            String res= drawtriangle(size-1);
            res = "*";
            System.out.println(res);
            return res;
            }
        }

    public static void main (String [] args){
        triangle tr= new triangle();
        tr.drawtriangle(3);

    }
}
