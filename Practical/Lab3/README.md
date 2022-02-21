<h1 align="center">Factory Design Pattern</h1>

<span style="color:#fff; font-family: 'Bebas Neue';">

A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

The Factory Method Pattern is also known as **Virtual Constructor**.
</span>

## Implementation

We're going to create a Shape interface and concrete classes implementing the Shape interface. A factory class ShapeFactory is defined as a next step.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

![image](../assets/Lab3/factory_pattern_uml_diagram.jpeg)

### Shape.java

```java
public interface Shape {
	void draw();
}
```

### Rectangle.java

```java
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing rectangle ...");
	}
}
```

### Square.java 

```java
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing square ...");
	}
}
```

### Circle.java 

```java
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing circle ...");
	}
}
```

### ShapeFactory.java

```java
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null){
			return null;
		}		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle(); 
		}
		else if shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle(); 
		}
		else if shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
}
```

### FactoryPatternDemo.java

```java
public class FactoryPatternDemo {

	public static void main(String[] args) {
    	ShapeFactory shapeFactory = new ShapeFactory();

    	// Get an object of Circle and call its draw method.
    	Shape shape1 = shapeFactory.getShape("CIRCLE");

    	// Call draw method of Circle
      	shape1.draw();

      	// Get an object of Rectangle and call its draw method.
      	Shape shape2 = shapeFactory.getShape("RECTANGLE");

      	// Call draw method of Rectangle
      	shape2.draw();

      	// Get an object of Square and call its draw method.
      	Shape shape3 = shapeFactory.getShape("SQUARE");

      	// Call draw method of square
      	shape3.draw();
	}
}
```