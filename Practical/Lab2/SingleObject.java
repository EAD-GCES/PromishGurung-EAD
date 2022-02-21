public class SingleObject{
    private static SingleObject instance = new SingleObject(); //early instantiation

    private SingleObject(){

    }
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("The objcet is : " + instance);
     }

}