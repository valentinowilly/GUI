package GUI;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    public Header() {
        setLayout(new FlowLayout());
        JLabel headerLabel = new JLabel("Pendaftaran Ulang Mahasiswa Baru");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18)); 
        headerLabel.setForeground(Color.BLUE); 
        add(headerLabel);
    }
}