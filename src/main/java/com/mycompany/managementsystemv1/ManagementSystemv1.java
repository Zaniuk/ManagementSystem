package com.mycompany.managementsystemv1;


import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.views.MainForm;
import javax.swing.UIManager;

public class ManagementSystemv1 {
    public static void main(String[] args) {   
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch (Exception e) {
            e.printStackTrace();
        }
        MainForm window = new MainForm();
        window.setVisible(true);

    }
}
