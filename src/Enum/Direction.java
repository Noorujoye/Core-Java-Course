package Enum;

enum Direction {
    North,East,West,South;
      public static void main(String[] args){
          for (Direction d : Direction.values()) {
              System.out.println(d.name());
          }
          Direction str = Direction.valueOf("East");
          System.out.println(str);
      }
}
