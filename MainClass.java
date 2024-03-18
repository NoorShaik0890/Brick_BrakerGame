import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame obj = new JFrame();
        // Create a GamePlay object
        GamePlay gamePlay = new GamePlay();
        // Set JFrame properties
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add the GamePlay object to the JFrame
        obj.add(gamePlay);
    }
}