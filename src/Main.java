import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    TrafficLight trafficLight = new TrafficLight("off");
    Scanner in = new Scanner(System.in);
    String command = "null";
    System.out.println("Введите команду для светофора \n 1)StartTraffic \n 2) StopTraffic " +
            " \n 3) ON \n 4) OFF \n " +
            "5) exit - выход из программы");
    while (!(command.equals("exit"))) {
      command = in.next();
      switch (command) {
        case "StartTraffic":
          trafficLight.startTraffic();
          break;
        case "StopTraffic":
          trafficLight.stopTraffic();
          break;
        case "ON":
          trafficLight.onTrafficLight();
          break;
        case "OFF":
          trafficLight.offTrafficLight();
          break;

      }
      System.out.println(command);
    }

  }
}
