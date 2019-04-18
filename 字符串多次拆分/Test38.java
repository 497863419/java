
public class Test38{
    //多次拆分问题
    public static void main(String[] args){
        String str="Amanda:21|Dabe:20";
        String[] result = str.split("\\|");
        for(int i=0;i<result.length;i++){
            String[] data = result[i].split(":");                      
            System.out.println(data[0]+"="+data[1]);
        }       
        
    }
}