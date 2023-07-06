import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name");
        JOptionPane.showMessageDialog(null,  "Hello " +name);
    }
}
