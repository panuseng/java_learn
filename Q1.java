// Name (in English): 
// ID: 

public class Q1 {
  public static void main(String[] args) {
    BMI myBMI = new BMI(70.2, 1.65);
    BMI yourBMI = new BMI(80.5, 1.91);
    System.out.println("My BMI:\n" + myBMI);
    System.out.println("Your BMI:\n" + yourBMI);
    System.out.println("Your BMI and my BMI are " + (myBMI.equals(yourBMI) ? "the same." : "not the same."));
    System.out.println("Your BMI is " + (yourBMI.getBMI() > myBMI.getBMI() ? "larger" : "smaller") + " than mine.");

    myBMI.setWeight(60.8).setHeight(1.66);
    System.out.println("My BMI:\n" + myBMI);
    System.out.println("Your BMI and my BMI are now " + (myBMI.equals(yourBMI) ? "the same." : "not the same."));
  }
}

class BMI {
  private double weight;
  private double height;

  public BMI(double weight, double height){
    setWeight(weight);
    setHeight(height);
  }
  public  BMI setWeight(double weight){
    if(weight > 0)
      this.weight = weight;
    return this;
  }

  public BMI setHeight(double height){
    if(height > 0)
    this.height = height;
    return this;
  }

  public double getBMI(){
    return weight / (height*height);  
  }

  public String getLevel(){
    if(getBMI() >= 30) return "obesity";
    else if(getBMI() >= 25) return "overweight";
    else if(getBMI() >=18.5) return "normal";
    else return "underweight";
  }

  public String toString(){
    return "\tWeight: " + weight + "\n\tHeight: " + height + "\n\tBMI: " + getBMI() + "\n\tLevel: " + getLevel();
  }

  public boolean equals(Object other){
    if(!(other instanceof BMI)) return false;
    BMI o = (BMI) other;
    return Math.abs(o.getBMI() - getBMI()) < 0.01;
  }
}

  

