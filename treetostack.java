import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 11:39 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class treetostack {
    public Stack<Integer> method(Queue<Integer> theque){
        Set<Integer> theset= new HashSet<>();
        theset.addAll(theque);
        Stack<Integer> thestach=new Stack<>();

        thestach.addAll(theset);
        return thestach;


    }
}
