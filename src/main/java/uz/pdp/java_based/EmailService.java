package uz.pdp.java_based;

public class EmailService {

    private final DatabaseManager databaseManager;

    public EmailService(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void send(){
        System.out.println(EmailService.class.getName() + " send()...");
    }
}
