package jewellery;

public class Ring {

  private MetalType metal;
  private GemType gem;

  // Constructor for Ring ------------------
  public Ring(MetalType metal, GemType gem) {
    this.metal = metal;
    this.gem = gem;

  }

  // Getters --------------------------------
  public MetalType getMetal(){
    return this.metal;
  }

  public GemType getGem(){
    return this.gem;
  }



}