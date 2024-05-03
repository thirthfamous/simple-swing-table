import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App {
    public App() {
        JFrame jFrame = new JFrame("Aplikasi Hello World");

        String columns[] = {
            "ID", "Nama", "NIM"
        };
        String data[][] = {
            {"MHS01", "Farhan", "153040112"},
            {"MHS02", "Kemal", "153040113"},
            {"MHS03", "Rizky", "153040114"},
        };
 
        JTable table = new JTable(data, columns);
        JScrollPane pane = new JScrollPane(table);

        jFrame.setContentPane(pane);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
        jFrame.setBounds(3, 4, 300, 400);
    }

    public static void main(String[] args) {
        new App();
    }
}
