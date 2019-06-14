public class TV {
  
  int channel =1;
  int volumeLevel = 1;
  boolean on = false;
  String brand = "undefined";
  
  public TV (){
    System.out.println("Creating TV object using no Args- constructor");
  }
  
  public TV (String brand){
    this.brand =brand;
    System.out.println("Creating TV object using 1 arg - constructor");
  }
  
  public int getVolumeLevel (){
    return volumeLevel;
  }
  
  public void setVolumeLevel (int volumeLevel){
    if (on==false || volumeLevel <0 || volumeLevel>8){
      System.out.println ("ERROR: TV is either OFF or invalid Volume level");
      return;
    }
    this.volumeLevel=volumeLevel;
  }
  
  public int getChannel (){
    return channel;
  }
  
  public void setChannel (int channel){
    if (on == false || channel <=0 || channel >120){
      System.out.println ("ERROR: TV is either OFF or invalid Channel");
      return;
    } 
    this.channel = channel;
  }
  
  public String getBrand (){
    return brand;
  }
  public void setBrand (String brand){
    this.brand = brand;
  }
  public void channelUp (){
    if (on == true && channel <120){
    this.channel++;
    } else {
      System.out.println ("ERROR: TV is either OFF or invalid Channel");
    }
  }
  public void channelDown (){
    if (on ==true && channel>=1){
    this.channel--;
    }else {
      System.out.println ("ERROR: TV is either OFF or invalid Channel");
      
    }
  }
  
  public void volumeUp(){
    if (on ==true && volumeLevel <7){
    this.volumeLevel++;
    } else {
      System.out.println ("ERROR: TV is either OFF or invalid Volume level");
    }
  }
  public void volumeDown (){
    if (on ==true && volumeLevel >1){
    this.volumeLevel--;
    } else {
      System.out.println ("ERROR: TV is either OFF or invalid Volume level");
    }
  }
  
  public boolean isOn (){
     if(on==false) {
      return false;
    }
    return true;
  }
  
  public void turnOn (){
    if (on == true){
      System.out.println ("TV is already ON");
    } else{
      this.on = true;
    }
  }
  
  public void turnOff (){
    if (on == false){
      System.out.println ("TV is already OFF");
    } else{
      this.on = false;
    }
  }
  
  
  
}