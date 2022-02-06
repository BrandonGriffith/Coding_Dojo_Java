public class AlfredTest {

    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();

        String testGuestGreeting = alfredBot.guestGreeting("John Snow", "morning");

        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.answeringBeforeAlexis(
            "Alexis! Play some low-fi beats."
            );
        String alfredTest = alfredBot.answeringBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is."
            );
        String notRelevantTest = alfredBot.answeringBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
            );
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println("The end.");
    }
}
