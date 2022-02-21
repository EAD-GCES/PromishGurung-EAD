# How to be a contributor to the Open Source Projects?

<span style="color:#fff; font-family: 'Bebas Neue';" > 

1. Sign into GitHub. <br><br>
2. Fork the project repository.<br> <br>
3. Clone your fork (git clone URL_of_fork.)<br> <br>
4. Navigate to your local repository(cd NAME_OF_REPOSITORY.)<br> <br>
5. Check that your fork is the "origin" remote (git remote -v) or (git remote add origin URL_OF_FORK.)<br> <br>
6. Add the original project repository as the "upstream" remote (git remote add upstream URL_OF_PROJECT.)<br> <br>
7. Pull the latest changes from upstream into your local repository (git pull upstream main)<br> <br>
8. Create a new branch (git checkout -b BRANCH_NAME)<br> <br>
9. Make changes in your local repository.<br> <br>
10. Commit your changes (git add -A) and (git commit -m "DESCRIPTION OF CHANGES.")<br> <br>
11. Push your changes to your fork (git push origin BRANCH_NAME.)<br> <br>
12. Begin the pull request.<br> <br>
13. Create the pull request.<br> <br>
14. Review the pull request by owner.<br> <br>
15. Add more commits to your pull request.<br> <br>
16. Discuss the pull request.<br> <br>
17. Delete your branch from your fork.<br> <br>
18. Delete your branch from your local repository (git checkout master) and (git branch -D or -d BRANCH_NAME.)<br> <br> 
19. Synchronize your fork with the project repository (git pull upstream master in project repo) and (git push origin master in your fork)</span>

<br>

<br>

---

<h1 align = "center" >Singleton Design Pattern </h1>

<span style="color:#fff; font-family: 'Bebas Neue';">

Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern

**`Early Instantiation:`** creation of instance at load time.

**`Lazy Instantiation:`** creation of instance when required.


</span>

### SingleObject.java

```java
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
```
### SingletonObject.java

```java
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
```

### SingletonObjectDemo.java

```java
public class SingletonObjectDemo {
    public static void main(String[] args) {
 
       
       SingletonObject object = SingletonObject.getInstance();
 
       //show the message
       object.showMessage();
    }
 }
```

### SingletonPatternDemo.java

```java
public class SingletonPatternDemo {
    public static void main(String[] args) {
 
       //Get the only object available
       SingleObject object = SingleObject.getInstance();
 
       //show the message
       object.showMessage();
    }
 }
```
