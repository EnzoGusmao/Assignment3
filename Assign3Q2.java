public class Assign3Q2 {
    public static void main(String args[]) {
      String currentMonth ="January";

      System.out.println("The current month is: " + currentMonth);
      
      switch (currentMonth)
      {
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
        System.out.println("This Mounth has 31 days");
        break;
        case "April":
        case "June":
        case "September":
        case "November":
        System.out.println("This Mounth has 30 days");
        break;
        default:
        System.out.println("This Mounth has 28 or 29 days");
      } 
    }
}