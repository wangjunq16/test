import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame  {
    private static final long serialVersionUID = 1L;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField tf;
    JPasswordField psf;
    JRadioButton rb1;
    JRadioButton rb2;
    JButton bt1;
    JButton bt2;
    JPanel jp;
    public static void main(String[] args) {
        Gui gui = new Gui();
        ActionListener bt1_ls=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {	
                gui.setVisible(false);
                new Gui2();
			}
		};

        ActionListener bt1_2s=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                System.exit(0);
            }
        };
        gui.bt1.addActionListener(bt1_ls);
        gui.bt2.addActionListener(bt1_2s);

    }

    public Gui() {
        this.setVisible(true);
        this.setSize(450, 220);
        this.setVisible(true);
        this.setLocation(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("登陆界面");
        label2 = new JLabel("账号：");
        label3 = new JLabel("密码：");
        tf = new JTextField();
        psf = new JPasswordField();
        rb1 = new JRadioButton("记住密码");
        rb2 = new JRadioButton("自动登陆");
        bt1 = new JButton("登陆");
        bt2 = new JButton("退出");
        jp=new JPanel();
        jp.add(bt1);
        jp.add(bt2);
        // 为指定的 Container 创建 GroupLayout
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        
        // 创建GroupLayout的水平连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        // 添加间隔
        hGroup.addGap(5);
        hGroup.addGroup(layout.createParallelGroup().addComponent(label2).addComponent(label3));
        hGroup.addGap(5);
        hGroup.addGroup(layout.createParallelGroup().addComponent(label1).addComponent(psf).addComponent(rb1)
                .addComponent(rb2).addComponent(tf).addComponent(jp));
        hGroup.addGap(5);
        // 设置水平分组
        layout.setHorizontalGroup(hGroup);
        
        // 创建GroupLayout的垂直连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGap(10);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        vGroup.addGap(10);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label2).addComponent(tf));
        vGroup.addGap(10);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label3).addComponent(psf));
        vGroup.addGroup(layout.createParallelGroup().addComponent(rb1));
        vGroup.addGroup(layout.createParallelGroup().addComponent(rb2));
        vGroup.addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(jp));
        vGroup.addGap(10);
        // 设置垂直组
        layout.setVerticalGroup(vGroup);       
    } 
    
}
