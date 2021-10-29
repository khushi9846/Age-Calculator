import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.demo.DateChooserPanel;
import com.toedter.calendar.demo.JCalendarDemo;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;

public class agecalculate extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	JDateChooser dateChooser = new JDateChooser();
	JLabel agestxt = new JLabel("");
	JLabel daystxt = new JLabel("");
	JLabel monthtxt = new JLabel("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agecalculate frame = new agecalculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void calculate() {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		String str = sd.format(dateChooser.getDate());
		String str2[] = str.split("/");
		int month,year,day;
		day = Integer.parseInt(str2[0]);
		month = Integer.parseInt(str2[1]);
		year = Integer.parseInt(str2[2]);
		
		
		LocalDate birthdate = LocalDate.of(year, month, day);
		LocalDate currentdate = LocalDate.now();
		Period age = Period.between(birthdate, currentdate);
		
		int years = age.getYears();
		int months=age.getMonths();
		int days=age.getDays();
		
		
		  agestxt.setText(String.valueOf(years));
		  monthtxt.setText(String.valueOf(months));
		  daystxt.setText(String.valueOf(days));
		 
	}
	public agecalculate() {
		setForeground(new Color(102, 205, 170));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 778);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setForeground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Enter year of birth");
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(33, 231, 235, 70);
		contentPane.add(lblNewLabel);
		
		dateChooser.setDateFormatString("dd/MM/yyyy");
		
		JButton show = new JButton("SHOW");
		show.setFont(new Font("Tahoma", Font.PLAIN, 22));
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calculate();
			}
		});
		show.setBounds(356, 521, 111, 45);
		contentPane.add(show);

		
		lblNewLabel_1 = new JLabel("THE AGE CALCULATOR");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(25, 50, 795, 70);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("YOUR AGE IS ");
		lblNewLabel_2.setFont(new Font("Colonna MT", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(25, 332, 218, 57);
		contentPane.add(lblNewLabel_2);
		dateChooser.setDateFormatString("dd/MM/yyyy");
		textField = new JTextField();
		textField.setBackground(Color.BLUE);
		textField.setBounds(10, 120, 858, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.BLUE);
		textField_1.setBounds(10, 35, 868, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		dateChooser.setBounds(234, 255, 197, 35);
		contentPane.add(dateChooser);
		
		//JLabel agestxt = new JLabel("");
		agestxt.setFont(new Font("Tahoma", Font.BOLD, 29));
		agestxt.setForeground(Color.WHITE);
		agestxt.setBounds(240, 332, 92, 39);
		contentPane.add(agestxt);
		
		JLabel newlabel = new JLabel("DAYS");
		newlabel.setForeground(Color.WHITE);
		newlabel.setFont(new Font("Colonna MT", Font.BOLD, 30));
		newlabel.setBounds(33, 401, 116, 35);
		contentPane.add(newlabel);
		
		//JLabel daystxt = new JLabel("");
		daystxt.setFont(new Font("Tahoma", Font.BOLD, 29));
		daystxt.setForeground(SystemColor.window);
		daystxt.setBackground(SystemColor.window);
		daystxt.setBounds(234, 400, 103, 45);
		contentPane.add(daystxt);
		
		JLabel lblNewLabel_4 = new JLabel("MONTHS");
		lblNewLabel_4.setForeground(SystemColor.textHighlightText);
		lblNewLabel_4.setFont(new Font("Colonna MT", Font.BOLD, 29));
		lblNewLabel_4.setBounds(33, 458, 124, 45);
		contentPane.add(lblNewLabel_4);
		
		//JLabel monthtxt = new JLabel("");
		monthtxt.setForeground(SystemColor.textHighlightText);
		monthtxt.setFont(new Font("Tahoma", Font.BOLD, 29));
		monthtxt.setBounds(234, 457, 111, 46);
		contentPane.add(monthtxt);
		
	}
}
