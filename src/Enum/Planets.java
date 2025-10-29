package Enum;

enum planet {
    Mercury(10),Mars,venus(30),Earth(40);//objects

    private double distancefromsun;
    //the constructor of enum is default private


    planet() {
        distancefromsun = 100;
    }

    planet(double distance) {
        this.distancefromsun = distance;
    }
    public double getDistance(){
        return  distancefromsun;
    }

    public static void main(String[] args){

          planet x = planet.valueOf("Earth");
          planet p = planet.Mercury;
          System.out.println(planet.Mercury);
          System.out.println(x);
          System.out.println(p.name());
          System.out.println(p.ordinal());
          System.out.println(planet.Mercury.equals(planet.Mars));

          for (planet i : planet.values()) {
              System.out.println(i.name()  +" "+ i.getDistance());
          }
          }
}
