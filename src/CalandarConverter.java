public class CalandarConverter {
    public static final int MONDAY =1;
    public static final int TUESDAY =2;
    public static final int WEDNESDAY =3;
    public static final int THURSDAY =4;
    public static final int FRIDAY =5;
    public static final int SATURDAY =6;
    public static final int SUNDAY =7;

    static String convertDayToString(int dayNumber){
        String dzien="";
        switch(dayNumber){
            case MONDAY:
                dzien="Poniedziałek";
                break;
            case TUESDAY:
               dzien="Wtorek";
                break;
            case WEDNESDAY:
               dzien= "Sroda";
                break;
            case THURSDAY:
               dzien="Czwartek";
                break;
            case FRIDAY:
               dzien="Piatek";
                break;
            case SATURDAY:
                dzien="Sobota";
                break;
            case SUNDAY:
                dzien="Niedziela";
                break;

        }

        return dzien+"\n";
    }


}
