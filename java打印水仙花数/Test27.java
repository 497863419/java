class ShiXianHuan{
    public void print(){
        for(int num=100;num<1000;num++){
              if(isShiXianHuan(num)){
                System.out.print(num+"、");
             }             
        }  
     }
    public boolean isShiXianHuan(int num){
        int singledight = num%10;
        int tensdight = num/10%10;
        int hundredslight = num/100;
        if(singledight*singledight*singledight+tensdight*tensdight*tensdight+
        hundredslight*hundredslight*hundredslight==num){
            return true;
        }else{
            return false;
        }
      }           
        
    
}
public class Test27{
    public static void main(String[] args){
        ShiXianHuan shixianhuan = new ShiXianHuan();
        shixianhuan.print();
    }
}
