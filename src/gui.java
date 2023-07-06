import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
        JOptionPane.showMessageDialog(null,  "You are " + name+" and you are "+age+" years old!" );
    }
}
