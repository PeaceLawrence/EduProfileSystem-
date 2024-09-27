public class HeightAndWeight {
  private int height;  // ins.
  private int weight;  // lbs.

  // Constructor
  public HeightAndWeight(int h, int w){
      height = h;
      weight = w;
  }

  // toString method
  public String toString() {
    return "Height: " + height + " in. " +
           "Weight: " + weight + " lbs";
  }

  // Getter Methods
  public int get_Weight(){
    return weight; 
  }

  public int get_Height(){
    return height; 
  }
  
  // HeightAndWeight Operators
  public double getBMI(){
    return convertPoundsToKgs(weight) / 
          Math.pow(convertFeetToMeters(height), 2);
  }

  public boolean healthyBMI() {
 if(getBMI() > 18.5 && getBMI() < 24.9){
return true; 
 }else {
  return false; 

 }

  }

  public String getDescript(){
    if(getBMI() < 18.5){
      return "Underweight"; 
    }
    else if(getBMI() > 18.5 && getBMI() < 24.9){
      return "Normal"; 
    } 
    else if(getBMI() > 25.0 && getBMI() < 29.9){
      return " Overweight";
    }
    else{
      return "Obese";
    }
	
  }

  // Private Methods
  private double convertFeetToMeters(int h){
       return h * 0.0254;
  }

  private double convertPoundsToKgs(int p){
      return p * 0.454;
  }

}