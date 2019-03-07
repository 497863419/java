public class Car{
	//汽车类
	
	//属性
	private String brand;//品牌
	private String colour;//颜色
	private String engineNumber;//发动机编号
	private boolean autoType;//ture 自动挡 false 手动挡
	
	//构造方法
	//方法参数名：符合标识命名规范 简明思议
	public Car(String engineNumber){
		this.engineNumber=engineNumber;
		//this.colour=colour;//this该实例化的对象，即当前操作的对象
		
	}
	//getter setter
	public String getEngineNumber(){
		return this.engineNumber;
	}
	public String getBrand(){
		return this.brand;
	}
	// 
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getColour(){
		return this.colour;
	}
    public  void setColour(String colour){
	    this.colour=colour; 
    }
	//属性为boolean类型的getter方法=>isXxx
	public boolean isAutoType(){
		return this.autoType;
	}
	public void setAutoType(boolean autoType){
		this.autoType=autoType;
	}
	//方法
	public String getCarDescription(){
		return "发动机编号："+this.getEngineNumber()+"\n"+"品牌："+this.brand+"\n"+
		"颜色："+this.colour+"\n"+"是否自动挡:"+this.isAutoType();
	}
	
	//行为(功能)
	public void drive(){
		System.out.println("向前看 喝车不开酒，开酒不喝车");
		//结合方法使用
		if(this.isAutoType()){
			System.out.println("自动挡，好开");
		}else{
			System.out.println("手动挡，手疼！");
		}
	}
	public void back(){
		System.out.println("倒车请注意！");
	}
	public static void main(String[] args){
		Car dazhong=new Car("DZ0010");
		//dazhong.drive();
		dazhong.setAutoType(true);
		dazhong.drive();
		dazhong.setColour("红色");
		dazhong.setBrand("大众");
		String desc=dazhong.getCarDescription();
		System.out.println(desc);
	/*Car[] cars=new Car[]{
		new Car("BMW0012"),
		new Car("BYD0013")，
	}；
	cars[0].setBrand("");
	*/
}
}