import java.util.Calendar;

public class Kalender {
    public static void main(String[] args) {
        String s = datum();
        System.out.println(s);
    }

    public static String datum(){
        String datumNu = Calendar.getInstance().getTime().toString(); // Få in data
        String år = datumNu.substring(24, 28); // Ta ut året
        String månad = datumNu.substring(4, 7); // Ta ut månaden
        String dag = datumNu.substring(8,11); // Ta ut datumet

        månad = månaderCheck(månad);

        datumNu = år + "-" + månad + "-" + dag;
        return datumNu;
    }

    public static String månaderCheck (String månad){ // Metod för månad namn -> siffror

        if (månad.contains("Jan")){
            månad = "01";}

        if (månad.contains("Feb")) {
            månad = "02";}

        if (månad.contains("Mar")){
            månad = "03";}

        if (månad.contains("Apr")){
            månad = "04";}

        if (månad.contains("May")){
            månad = "05";}

        if (månad.contains("Jun")) {
            månad = "06";}

        if (månad.contains("Jul")){
            månad = "07";}

        if (månad.contains("Aug")){
            månad = "08";}

        if (månad.contains("Sep")){
            månad = "09";}

        if (månad.contains("Oct")) {
            månad = "10";}

        if (månad.contains("Nov")){
            månad = "11";}

        if (månad.contains("Dec")){
            månad = "12";}
        return månad;
    }
}
