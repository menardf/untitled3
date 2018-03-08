import jdk.internal.util.xml.impl.Input;

import java.util.*;

/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 3/8/18
 * Time: 10:53 AM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class classmap {

    public Map<String,String> classmap(String word,String synonyms){

        Map<String,String> exmple= new HashMap<>();

        exmple.put(word,synonyms);
        return exmple;

    }
    public Set<String> thesaurus(String word){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String same=sc.nextLine();

        Set<String> newst =new HashSet<>();
        newst.add(same);
        return newst;

    }

}
