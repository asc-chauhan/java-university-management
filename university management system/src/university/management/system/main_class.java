package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new information
        JMenu newInfo = new JMenu("New Information");
//        newInfo.setForeground(Color.red);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
//        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
//        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        // Details
        JMenu details = new JMenu("View Details");
        mb.add(details);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.addActionListener(this);
        details.add(studentDetails);

        // Leave
        JMenu leave = new JMenu("Apply Leave");
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave= new JMenuItem("Student Leave");
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetail = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetail.addActionListener(this);
        leaveDetails.add(facultyLeaveDetail);

        JMenuItem studentLeaveDetail = new JMenuItem("Student Leave Details");
        studentLeaveDetail.addActionListener(this);
        leaveDetails.add(studentLeaveDetail);

        // Exams
        JMenu exam = new JMenu("Examination");
        mb.add(exam);

        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.addActionListener(this);
        exam.add(enterMarks);

        // Update info
        JMenu updateInfo = new JMenu("Update Details");
        mb.add(updateInfo);

        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.addActionListener(this);
        updateInfo.add(updateFacultyInfo);

        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);

        // fees
        JMenu fee = new JMenu("Fee Details");
        mb.add(fee);

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.addActionListener(this);
        fee.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.addActionListener(this);
        fee.add(feeForm);

        // Utility
        JMenu utility = new JMenu("Utility");
        mb.add(utility);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenuItem notePad = new JMenuItem("NotePad");
        notePad.addActionListener(this);
        utility.add(notePad);


        // About
        JMenu about = new JMenu("About");
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.addActionListener(this);
        about.add(About);

        // exit
        JMenu exit = new JMenu("Exit");
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.addActionListener(this);
        exit.add(Exit);


        setJMenuBar(mb);

        setSize(1540, 850);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if(sm.equals("Exit")){
            System.exit(15);
        } else if (sm.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("open -a Calculator");
//              Runtime.getRuntime().exec("calc.exe");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else if (sm.equals("NotePad")) {
            try{
                Runtime.getRuntime().exec("open -a TextEdit");
//              Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }else if (sm.equals("New Faculty Information")) {
            new AddFaculty();
        }else if (sm.equals("New Student Information")){
            new AddStudent();
        } else if (sm.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (sm.equals("View Student Details")) {
            new StudentDetails();
        } else if (sm.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (sm.equals("Student Leave")) {
            new StudentLeave();
        } else if (sm.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (sm.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (sm.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (sm.equals("Update Student Details")) {
            new updateStudent();
        } else if (sm.equals("Enter Marks")) {
            new EnterMarks();
        } else if (sm.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (sm.equals("Fee Structure")) {
            new FeeStructure();
        }else if (sm.equals("Student Fee Form")){
            new StudentFeeForm();
        } else if (sm.equals("About")) {
            new About();
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}
