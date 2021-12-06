interface Vehicle{
  abstract void numberOfWheels();
  abstract void engineNumber();
  abstract void vehicleName();
  abstract void vehicleType();
}

class Test implements Vehicle{
   public void numberOfWheels(){
      System.out.println("4"); 
   }
   public void engineNumber(){
      System.out.println("3109"); 
   }
   public void vehicleName(){
      System.out.println("Duek 200"); 
   }
   public void vehicleType(){
      System.out.println("200cc"); 
   }
   public static void staticMethod(){
      System.out.println("Static of Test Class");
   }
}
class InterfaceTest extends Test{
   public void vehicleName(){
      System.out.println("Duek 250"); 
   }
   public static void staticMethod(){
      System.out.println("Static of Sample Class");
   }
   public static void main(String[] args){
      Test t = new Sample();
      t.staticMethod();
      t.numberOfWheels();
      t.vehicleName();
   }
}