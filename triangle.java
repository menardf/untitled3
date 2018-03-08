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
        String result;
        if( size==0)return null;
        else {

            result="*";
            return drawtriangle(2-size*2);
            }
        }

    public static void Main(System [] args){
        triangle tr= new triangle();

    }
}
