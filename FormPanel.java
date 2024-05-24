package GUI;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    private JTextField namaField, nomorPendaftaranField, alamatField, emailField, teleponField;
    private JFormattedTextField tanggalLahirField;

    public FormPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
            
        // Membuat label dan text field dengan tooltips
        JLabel namaLabel = new JLabel("Nama Lengkap:");
        namaField = new JTextField(20);
        namaField.setToolTipText("Masukkan nama lengkap Anda.");

        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
        tanggalLahirField = new JFormattedTextField(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        tanggalLahirField.setColumns(10);
        tanggalLahirField.setToolTipText("Masukkan tanggal lahir Anda (dd/MM/yyyy).");

        JLabel nomorPendaftaranLabel = new JLabel("Nomor Pendaftaran:");
        nomorPendaftaranField = new JTextField(20);
        nomorPendaftaranField.setToolTipText("Masukkan nomor pendaftaran Anda.");

        JLabel teleponLabel = new JLabel("No. Telepon:");
        teleponField = new JTextField(20);
        teleponField.setToolTipText("Masukkan nomor telepon Anda.");
            
        JLabel alamatLabel = new JLabel("Alamat:");
        alamatField = new JTextField(20);
        alamatField.setToolTipText("Masukkan alamat rumah Anda.");
            
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        emailField.setToolTipText("Masukkan alamat email Anda.");

        // Menambahkan komponen ke form panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(namaLabel, gbc);
        gbc.gridx = 1;
        add(namaField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(tanggalLahirLabel, gbc);
        gbc.gridx = 1;
        add(tanggalLahirField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(nomorPendaftaranLabel, gbc);
        gbc.gridx = 1;
        add(nomorPendaftaranField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(teleponLabel, gbc);
        gbc.gridx = 1;
        add(teleponField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(alamatLabel, gbc);
        gbc.gridx = 1;
        add(alamatField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(emailLabel, gbc);
        gbc.gridx = 1;
        add(emailField, gbc);
    }

    // Method untuk memeriksa apakah semua kolom form telah diisi
    public boolean isAllFieldsFilled() {
        return !namaField.getText().isEmpty() &&
            !tanggalLahirField.getText().isEmpty() &&
            !nomorPendaftaranField.getText().isEmpty() &&
            !teleponField.getText().isEmpty() &&
            !alamatField.getText().isEmpty() &&
            !emailField.getText().isEmpty();
    }

    // Method untuk mendapatkan data yang diisi pada form
    public String[] getFormData() {
        return new String[]{
            namaField.getText(),
            tanggalLahirField.getText(),
            nomorPendaftaranField.getText(),
            teleponField.getText(),
            alamatField.getText(),
            emailField.getText()
        };
    }
}