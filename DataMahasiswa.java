package GUI;

import javax.swing.*;
import java.awt.*;

public class DataMahasiswa extends JFrame {
    public DataMahasiswa(String[] formData) {
        setTitle("Data Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nama Lengkap:"));
        add(new JLabel(formData[0]));
        add(new JLabel("Tanggal Lahir:"));
        add(new JLabel(formData[1]));
        add(new JLabel("Nomor Pendaftaran:"));
        add(new JLabel(formData[2]));
        add(new JLabel("No. Telepon:"));
        add(new JLabel(formData[3]));
        add(new JLabel("Alamat:"));
        add(new JLabel(formData[4]));
        add(new JLabel("Email:"));
        add(new JLabel(formData[5]));
    }
}