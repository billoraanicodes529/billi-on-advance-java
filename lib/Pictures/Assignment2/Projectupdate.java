/*Q5.Create a PROJECT table with fields project_id, Project_name, Project_description, Project_Status. etc. 
update and delete values in the table.(using swing).*/
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

class Projectupdate extends JFrame implements ActionListener {

    Connection con;
    ResultSet rs;
    Statement st;

    static JTable table;
    // This column names are taken from database table which we have created...i.e here we have create project table.
    String[] columnNames = { "eno", "ename", "description", "status" };
    JFrame frm;
    JPanel p1;
    String p_id = "", p_name = "", p_description = "", p_status = "";
    JTextField txtid, txtname, txtdesc, textstatus;

    JButton  Update, Delete, Exit;

    
    Update uobj;
    Delete dobj;

    Projectupdate() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("PROJECT INFO");

        p1 = new JPanel();

        p1.setLayout(new GridLayout(5, 5, 30, 30));


        Update = new JButton("Update");
        p1.add(Update);

        Delete = new JButton("Delete");
        p1.add(Delete);

  

        Exit = new JButton("Exit");
        p1.add(Exit);

        
        Update.addActionListener(this);
        Delete.addActionListener(this);
       
        Exit.addActionListener(this);

        add(p1, BorderLayout.CENTER);
        setVisible(true);
        setSize(600, 600);
    }// ProjectDetails

    public void actionPerformed(ActionEvent ae) {

      
       

        if (ae.getSource() == Update) {
            uobj = new Update();
        }

        if (ae.getSource() == Delete) {
            dobj = new Delete();
        }

        if (ae.getSource() == Exit) {

            System.exit(1);

        }

    }

    public static void main(String arg[]) {

        new Projectupdate();
    }// main
}// class


class Update extends JFrame implements ActionListener {

    JTextField txtst, txtpid, txtpname, txtdsc;
    JButton btnadd;

    Update() {
        setTitle("Peoject Record Update");
        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(3, 2, 40, 40));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel pid = new JLabel("Enter Projcet ID To Update: ");
        add(pid);
        txtpid = new JTextField(10);
        add(txtpid);

        JLabel st = new JLabel("Enter Updated Project Status: ");
        add(st);
        txtst = new JTextField(10);
        add(txtst);

        btnadd = new JButton("Update");
        add(btnadd);
        btnadd.addActionListener(this);

    }// update()

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        int p_id = Integer.parseInt(txtpid.getText());
        String st = (txtst.getText());

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // load a driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/tybcs", "postgres", "postgres");
            if (str.equals("Update")) {
                String SQL = "Update fields set status=? where eno=?";
                pstmt = conn.prepareStatement(SQL);

                pstmt.setString(1, st);
                pstmt.setInt(2, p_id);

                int update = pstmt.executeUpdate();
                if (update == 1) {

                    JOptionPane.showMessageDialog(null, "Succesfully Updated", st, JOptionPane.INFORMATION_MESSAGE);
                } // if

                txtpid.setText("");
                txtst.setText("");
                pstmt.close();
                conn.close();
            } // if

        } // try
        catch (Exception e) {
            System.out.println(e);
        } // catch

    }// method
}// update class

class Delete extends JFrame implements ActionListener {

    JTextField txtpid, txtst;
    JButton btnadd;

    Delete() {
        setTitle("Peoject Record Delete");
        setSize(400, 400);
        setVisible(true);
        setLayout(new GridLayout(3, 2, 20, 20));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel pid = new JLabel("Enter Projcet ID To Delete: ");
        add(pid);
        txtpid = new JTextField(10);
        add(txtpid);

        JLabel st = new JLabel("Enter Updated Project Status: ");
        add(st);
        txtst = new JTextField(10);
        add(txtst);

        btnadd = new JButton("Delete");
        add(btnadd);
        btnadd.addActionListener(this);

    }// Delete()

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        int p_id = Integer.parseInt(txtpid.getText());
        String st = (txtst.getText());

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // load a driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/tybcs", "postgres", "postgres");
            if (str.equals("Delete")) {
                String SQL = "delete from fields where eno =?";
                pstmt = conn.prepareStatement(SQL);

                pstmt.setInt(1, p_id);

                int delete = pstmt.executeUpdate();
                if (delete == 1) {
                    JOptionPane.showMessageDialog(null, "Succesfully Deleted", st, JOptionPane.INFORMATION_MESSAGE);
                }
                txtpid.setText("");
                txtst.setText("");
                pstmt.close();
                conn.close();
            } // if

        } // try
        catch (Exception e) {
            System.out.println(e);
        } // catch
    }
}// class
