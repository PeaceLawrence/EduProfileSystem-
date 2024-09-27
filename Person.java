public class Person {
    private String name;

    private int age;
  
    private HeightAndWeight hw;
  
    public Person(String name, int age, int height, int weight) {
  
     this.name = name;
  
     this.age = age;
  
     hw = new HeightAndWeight(height, weight);
  
    }
public String getName() {
    return name;
}

public int getAge(){
    return age;
}

public int getHeight() {
return hw.get_Height();
}
  
public int getWeight() {
    return hw.get_Weight();
}

public String toString() {
return name + " age:" + age + " height:" + getHeight() + " ins."
+ "weight: " + getWeight() + "Ibs"; 
}

public double getBMI(){
    return hw.getBMI();
}

public boolean getHealthyBMI(){
    return hw.healthyBMI();
}

    public boolean healthyBMI() {
  
     return hw.healthyBMI();
  
    }
}
