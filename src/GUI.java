import javax.swing.JOptionPane;
public class GUI {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, "+name+"!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old!");
        // Integer.parseInt converts to int

        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you? (in inches)"));
        int feet = (int) height/12;
        int inches = (int) height%12;
        JOptionPane.showMessageDialog(null, "You are "+feet+" foot "+inches+"!");
        // convert using (int) aswell
    }
}
