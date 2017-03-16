
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocumentIndex extends ArrayList<IndexEntry>
{
   public DocumentIndex(){
       super();
   }
   
   public DocumentIndex(int size){
    super(size);
    }
    
    public void addAllWords(String str,int num){
    //make array
    String [] stringArr=str.split("\\W+");
    for(int l=0;l<stringArr.size();l++){
        if(!(stringArr[l].equalTo("")||stringArr[l].equalTo(" ")))
    stringArr[l].addWord();
    }
    }
    
    public void addWord(String word, int num){
        boolean check=true;
        for(int i=0;i<this.size();i++){
            if(this.get(i).word.equalsTo(word))){
            check=false;
            }
        }
        if(check){
            if(word.compareTo(this.get(0))<0){
            //put in beginning and shift everything
            for(int j=this.size();j>=0j--){
            this.set(j+1,this.get(j));
            }
            this.set(0,new IndexEntry(word));
            this.get(0).add(num);
            }else if(word.compareTo(this.get(this.size()-1))>0){
            this.add(new IndexEntry(word));
            this.get(ArrayList<IndexEntry<.size()-1).add(num);
            }else{
            for(int i=0; i<this.size()-2;i++){
            //find spot in between and just move relevant indexes
                if(word.compareTo(this.get(i))<0&&
                word.compareTo(this.get(i+1))>0){
                        //move everything at i and above up by 1, then insert new object into i
                        for(int k=this.size();k>=i;k--){
                            this.set(k+2,this.get(k));
                        }
                        this.set(i,new IndexEntry(word));
                        this.get(i).add(num);
                }
            }
        }
            
        }
            this.get(i).add(num);
            
    }
}
