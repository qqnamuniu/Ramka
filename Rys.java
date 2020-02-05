import javax.swing.*;
import java.awt.*;

public class Rys extends JFrame {
    public Rys() {
        this.setTitle("Rysowanie");
        this.setBounds(250, 300, 300, 250);

        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)

    {
        new Rys().setVisible(true);
    }

    private PanelKosa panelDoRysowania = new PanelKosa();
}
class PanelKosa extends JPanel {
    public PanelKosa() {
        super();

        this.add(new JButton("Tekst") {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Napis", 0, 60);

        g.drawImage(new ImageIcon("kobieta.jpg").getImage(), 200, 80, 1500, 850, null);

        g.drawRect(200, 80, 1500, 850);

        g.drawLine(60, 60, 40, 60);

        Graphics2D g2 = (Graphics2D) g;

        System.out.println(i++);
    }

    public static int i = 0;
}