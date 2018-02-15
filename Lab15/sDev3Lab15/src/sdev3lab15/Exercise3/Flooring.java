package sdev3lab15.Exercise3;

/**
 *
 * @author conorgriffin
 */
public class Flooring extends Material {
  private double coverage;    

  public Flooring(String initName, double initPrice, double coverage) {
    super(initName, initPrice);
    this.coverage = coverage;
  }

  public double getCoverage() {
    return coverage;
  }


  @Override
  public double getMaterialReq(Surface aSurface) {
    double area = aSurface.calcArea();
    double noOfPacks = area / coverage;
    return noOfPacks;
  }
}
