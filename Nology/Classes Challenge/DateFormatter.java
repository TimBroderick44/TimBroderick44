public class DateFormatter {
    
    public static String formatTime(long seconds) {
        long hours = seconds / 3600;      
        long remainder = seconds % 3600;    
        long minutes = remainder / 60;      
        long secs = remainder % 60;        

        return String.format("%02dh%02dm%02ds", hours, minutes, secs);
    }
    
    public static String formatTime(long minutes, long seconds) {
        long totalSeconds = minutes * 60 + seconds; 
        return formatTime(totalSeconds);            
    }
    
    public static void main(String[] args) {
        System.out.println(formatTime(4000));     
        System.out.println(formatTime(1, 40));       
    }
}