import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String carName = JOptionPane.showInputDialog(" Your Favorite Car?");
        JOptionPane.showMessageDialog(null, " Nice"+ carName);
    }
    
}
