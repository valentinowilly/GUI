package GUI;

import javax.swing.*;
import java.awt.*;

public class FormPendaftaran extends JFrame {
    public FormPendaftaran() {
        setTitle("Form Pendaftaran Ulang Mahasiswa Baru");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Menambahkan panel header
        Header headerPanel = new Header();
        add(headerPanel);

        // Menambahkan panel form
        FormPanel formPanel = new FormPanel();
        add(formPanel);

        // Menambahkan tombol submit
        JButton submitButton = new JButton("Submit");
        submitButton.setAlignmentX(CENTER_ALIGNMENT);
        submitButton.setBackground(new Color(0, 128, 0)); // Warna hijau
        submitButton.setForeground(new Color(255, 255, 255)); // Warna putih
        submitButton.addActionListener(e -> {
            if (formPanel.isAllFieldsFilled()) {
                int response = JOptionPane.showConfirmDialog(
                    null, 
                    "Apakah Anda yakin data yang Anda isi sudah benar?", 
                    "Konfirmasi", 
                    JOptionPane.OK_CANCEL_OPTION
                );

                if (response == JOptionPane.OK_OPTION) {
                    new DataMahasiswa(formPanel.getFormData()).setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Semua kolom harus diisi!", 
                    "Peringatan", 
                    JOptionPane.WARNING_MESSAGE
                );
            }
        });
        add(submitButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormPendaftaran().setVisible(true));
    }
}