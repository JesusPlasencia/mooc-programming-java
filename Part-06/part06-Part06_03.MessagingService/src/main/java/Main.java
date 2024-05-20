
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message messageOne = new Message("jesusP", "Some bluffy text");
        Message messageTwo = new Message("angelP", "LOL XD");
        Message messageThree = new Message("lindaP", "Hey Jude?");
        
        MessagingService whatsapp = new MessagingService();
        whatsapp.add(messageTwo);
        whatsapp.add(messageThree);
        whatsapp.add(messageOne);
        
        for (Message msg : whatsapp.getMessages()) {
            System.out.println(msg.toString());
        }
        
    }
}
