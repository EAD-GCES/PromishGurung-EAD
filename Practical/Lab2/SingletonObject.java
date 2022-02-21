public class SingletonObject{
    private static SingletonObject instance ;

    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        if(instance == null){
            synchronized(SingletonObject.class){
                if(instance == null){
                    instance = new SingletonObject(); //lazy Instantiation of Singleton Pattern
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("The object is : " + instance);
     }

}