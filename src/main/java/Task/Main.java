/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        /*
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
                            ProductOutOfDate date = new ProductOutOfDate();
                            date.ProductOutOfDate();
			}
		});
        
        */
        final ProductOutOfDate date = new ProductOutOfDate();
        final JFrame parent = new JFrame();
        JButton button = new JButton();

        button.setText("Click để hiện danh sách sản phẩm hết hạn, móp méo");
        parent.add(button);
        parent.pack();
        parent.setVisible(true);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        date.ProductOutOfDate();
                    }
                });
            }
        });
	}
}
