public class WeekDay {
    public static void main( String args[] ) {
        int min=1;
        int max=7;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String dayName = "";
        switch (random_int) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        System.out.println("number :"+random_int);
        System.out.println(dayName);
    }
}
