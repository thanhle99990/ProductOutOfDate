/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

/**
 *
 * @author Admin
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.jdesktop.swingx.JXDatePicker;

public class ProductOutOfDate extends JPanel {

    public void ProductOutOfDate() {
        JFrame frame = new JFrame("Khai báo sản phẩm sắp hết hạn, móp méo");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout(10, 10));

        panel.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(200, 100));
        panel3.setPreferredSize(new Dimension(280, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel.setPreferredSize(new Dimension(100, 50));

        panel.setLayout(new BorderLayout());
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.LINE_AXIS));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.LINE_AXIS));

        JTextField textField = new JTextField();
        textField.setMaximumSize(new Dimension(1000, 50));
        textField.setText("100");

        JLabel label1 = new JLabel("Số lượng áp dụng:");
        JLabel label2 = new JLabel("Loại áp dụng:");
        JLabel label3 = new JLabel("% giảm giá:");
        JLabel label4 = new JLabel("Từ ngày:");
        JLabel label5 = new JLabel("Đến ngày:");
        JLabel label6 = new JLabel("Phím tắt(ESC):Hủy");
        JLabel label7 = new JLabel("8935058901011 - TRỨNG GÀ CP SỐ 3 HỘP 10", JLabel.CENTER);

        JButton Save = new JButton("Lưu(F12)");
        JButton Delete = new JButton("Xóa(F11)");

        String type[] = {"móp méo", "hết hạn"};
        JComboBox cb = new JComboBox(type);
        cb.setMaximumSize(new Dimension(1000, 50));
        cb.setSize(20, 20);
        String saleoff[] = {"10", "20"};
        JComboBox cb2 = new JComboBox(saleoff);
        cb2.setMaximumSize(new Dimension(1000, 50));
        cb2.setSize(20, 20);

        JXDatePicker picker1 = new JXDatePicker();
        picker1.setDate(Calendar.getInstance().getTime());
        picker1.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker1.setMaximumSize(new Dimension(1000, 50));
        JXDatePicker picker2 = new JXDatePicker();
        picker2.setDate(Calendar.getInstance().getTime());
        picker2.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker2.setMaximumSize(new Dimension(1000, 50));

        panel.add(label7, BorderLayout.CENTER);

        panel1.add(label6);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(Box.createRigidArea(new Dimension(5, 0)));
        panel1.add(Save);
        panel1.add(Delete);

        panel2.add(label1);
        panel2.add(Box.createVerticalGlue());
        panel2.add(Box.createRigidArea(new Dimension(5, 5)));
        panel2.add(label2);
        panel2.add(Box.createVerticalGlue());
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(label3);
        panel2.add(Box.createVerticalGlue());
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(label4);
        panel2.add(Box.createVerticalGlue());
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(label5);

        panel3.add(textField);
        panel3.add(Box.createVerticalGlue());
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(cb);
        panel3.add(Box.createVerticalGlue());
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(cb2);
        panel3.add(Box.createVerticalGlue());
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(picker1);
        panel3.add(Box.createVerticalGlue());
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(picker2);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(panel1, BorderLayout.SOUTH);
        frame.getContentPane().add(panel2, BorderLayout.WEST);
        frame.getContentPane().add(panel3, BorderLayout.EAST);

        frame.setVisible(true);
    }

}
