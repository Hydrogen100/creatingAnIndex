import java.util.ArrayList;
/**
 * Write a description of class IndexEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IndexEntry
{
    private String word;
    private ArrayList <Integer> numsList;
    
    public IndexEntry(String a){
    word=word.toUpperCase(a);
    numsList=new ArrayList<Integer>();
    }
    
    public void add (int num){
        boolean check=true;
    for(int i=0;i<numsList.size();i++){
    if(num==numsList.get(i)){
    check=false;
    }
    }
        if(check){
        numsList.add(num);
        }
        check=true;
    }
    
    public String getWord(){
    return word;
    }
    
    public String toString(){
        String lines="";
        for(int i=0;i<numsList.size();i++){
        lines=lines+numsList.get(i)+", ";
        if(i==numsList.size()-1){
        lines=lines.substring(0,lines.length()-2);
        }
        }
        
    return getWord()+" "+lines;
    }
}
