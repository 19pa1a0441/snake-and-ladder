public class Jumper{
    int start;
    int end;
    public Jumper(int start,int end){
        this.start=start;
        this.end=end;
    }
     public int  getstart(){
         return start;
     }
    public int getend(){
        return end;
    }
}
class Snake extends Jumper{
    public Snake(int start,int end){
        super(start,end);
    }
    public int getendpoint(){
        return end;
    }
        
}
class Ladder extends Jumper{
    public Ladder(int start,int end){
        super(start,end);
    }
    public int getendpoint(){
        return end;
    }
}
