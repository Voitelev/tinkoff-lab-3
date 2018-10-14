

class TrafficLight {
  private String stateTrafficLight;

  TrafficLight(String stateTrafficLight) {
    this.stateTrafficLight = stateTrafficLight;
  }

  void startTraffic() {
    if (stateTrafficLight.equals("off")) {
      System.out.println("Сначала нужно включить светофор");
    } else {
      System.out.println(stateTrafficLight + " yellow " + " green");
      stateTrafficLight = "green";
    }

  }

  void stopTraffic() {
    if (stateTrafficLight.equals("off")) {
      System.out.println("Сначала нужно включить светофор");
    } else {
      System.out.println(stateTrafficLight + " yellow " + " red");
      stateTrafficLight = "red";
    }
  }


  void onTrafficLight() {
    System.out.println(stateTrafficLight + " yellow " + " green");
    stateTrafficLight = "green";
  }

  void offTrafficLight() {
    System.out.println(stateTrafficLight + " yellow " + " off");
    stateTrafficLight = "off";

  }

}
