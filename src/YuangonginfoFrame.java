import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


//class ApartmentManager{
//    String id;
//    String name;
//    String sex;
//    String apartment;
//    String id_num;
//    String birthday;
//    String call;
//    String address;
//    String hobby;
//    String attach;
//
//    @Override
//    public String toString() {
//        return "ApartmentManager{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", sex='" + sex + '\'' +
//                ", apartment='" + apartment + '\'' +
//                ", id_num='" + id_num + '\'' +
//                ", birthday='" + birthday + '\'' +
//                ", call='" + call + '\'' +
//                ", address='" + address + '\'' +
//                ", hobby='" + hobby + '\'' +
//                ", attach='" + attach + '\'' +
//                '}';
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getApartment() {
//        return apartment;
//    }
//
//    public void setApartment(String apartment) {
//        this.apartment = apartment;
//    }
//
//    public String getId_num() {
//        return id_num;
//    }
//
//    public void setId_num(String id_num) {
//        this.id_num = id_num;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getCall() {
//        return call;
//    }
//
//    public void setCall(String call) {
//        this.call = call;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
//
//    public String getAttach() {
//        return attach;
//    }
//
//    public void setAttach(String attach) {
//        this.attach = attach;
//    }
//}
//class Apartment{
//    String id;
//    String name;
//    String attach;
//
//    @Override
//    public String toString() {
//        return "Apartment{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", attach='" + attach + '\'' +
//                '}';
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAttach() {
//        return attach;
//    }
//
//    public void setAttach(String attach) {
//        this.attach = attach;
//    }
//}


public  class YuangonginfoFrame extends JFrame {
    ScoreDao sd = new ScoreDao();
    Yuangonginfo s = new Yuangonginfo();

    private JButton jbt1 = new JButton("??????");
    private JButton jbt2 = new JButton("??????");
    private JButton jbt3 = new JButton("??????");
    private JButton jbt4 = new JButton("??????");
    private JButton jbt5 = new JButton("??????");
    private JTextField jtf = new JTextField(10);
    private JLabel lbl = new JLabel("????????????????????????");

    //?????????????????????
    private static JTable table = new JTable();
    private JScrollPane jsp = new JScrollPane(table);


    //?????????????????????
    private JPanel jp1 = new JPanel();

    private JPanel jp3 = new JPanel();


    public YuangonginfoFrame() {
        this.setTitle("??????????????????");
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        //???    ????????????
        jp1.add(lbl);
        jp1.add(jtf);
        jp1.add(jbt1);
//		jtf.setPreferredSize(new Dimension(10,10));?????????????????????
        this.add(jp1,BorderLayout.NORTH);

        //???  ????????????
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("??????");
        dtm.addColumn("??????");
        dtm.addColumn("??????");
        dtm.addColumn("??????");
        dtm.addColumn("????????????");
        dtm.addColumn("????????????");
        dtm.addColumn("????????????");
        dtm.addColumn("????????????");
        dtm.addColumn("????????????");
        dtm.addColumn("??????");
        for(int i=1;i<5;i++)
        {
            Vector<Object> data = new Vector<Object>();
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            data.add("");
            dtm.addRow(data);
        }
        //????????????
        this.add(jsp, BorderLayout.CENTER);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//???????????????????????????
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//???????????????????????????
        //??? ??????????????????
        jp3.add(jbt2);
        jp3.add(jbt3);
        jp3.add(jbt4);
        jp3.add(jbt5);
        this.add(jp3,BorderLayout.SOUTH);
        this.setVisible(true);


        //????????????---???????????????????????????????????????
        jbt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                int rows = table.getSelectedRows().length;
                System.out.println("??????????????????"+rows);
                for (int i = 0; i < rows; i++) {
                    int row=table.getSelectedRow();
                    String id=(String) dtm.getValueAt(row, 0);
                    String name = (String) dtm.getValueAt(row, 1);
                    String sex = (String) dtm.getValueAt(row, 2);
                    String apartment = (String) dtm.getValueAt(row, 3);
                    String id_num = (String) dtm.getValueAt(row, 4);
                    String birthday = (String) dtm.getValueAt(row, 5);
                    String call = (String) dtm.getValueAt(row, 6);
                    String address = (String) dtm.getValueAt(row, 7);
                    String hobby = (String) dtm.getValueAt(row, 8);
                    String attach = (String) dtm.getValueAt(row, 9);
                    System.out.println("??????");
                    String str = sd.Insert(id, name, sex, apartment,id_num,birthday,call,address,hobby,attach);
                    JOptionPane.showMessageDialog(null, str);
                }
                    Vector<Object> data = new Vector<Object>();
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    dtm.addRow(data);
            }
        });

        //????????????
        jbt3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rows = table.getSelectedRows().length;
                for (int i = 0; i < rows; i++) {
                    int row = table.getSelectedRow();
                    System.out.println("????????????"+row);
                    String oid = dtm.getValueAt(row, 0).toString();
                    System.out.println("?????????"+oid);
                    String str = sd.Del(oid);
                    System.out.println("?????????"+oid);
                    dtm.removeRow(row);
                    JOptionPane.showMessageDialog(null, str);
                }
            }
        });

        //????????????
        jbt4.addActionListener(new ActionListener() {
                public void actionPerformed (ActionEvent arg0){
                    int row = table.getSelectedRow();
                    String id=(String) dtm.getValueAt(row, 0);
                    String name = (String) dtm.getValueAt(row, 1);
                    String sex = (String) dtm.getValueAt(row, 2);
                    String apartment = (String) dtm.getValueAt(row, 3);
                    String id_num = (String) dtm.getValueAt(row, 4);
                    String birthday = (String) dtm.getValueAt(row, 5);
                    String call = (String) dtm.getValueAt(row, 6);
                    String address = (String) dtm.getValueAt(row, 7);
                    String hobby = (String) dtm.getValueAt(row, 8);
                    String attach = (String) dtm.getValueAt(row, 9);
                    System.out.println("??????"+id);
                    String str = sd.Update(id, name, sex, apartment,id_num,birthday,call,address,hobby,attach);
                    JOptionPane.showMessageDialog(null, str);
                }
        });
        //????????????
        jbt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //??????????????????--?????????????????????????????????
                if (jtf.getText().equals("")) {
                    List<Yuangonginfo> list = sd.ScoreDao();
                    dtm.setRowCount(0);//??????????????????
                    for (int i = 0; i < list.size(); i++) {
                        Vector<Object> data = new Vector<Object>();
                        Yuangonginfo yuangong = list.get(i);
                        data.add(yuangong.getId());
                        data.add(yuangong.getName());
                        data.add(yuangong.getSex());
                        data.add(yuangong.getApartment());
                        data.add(yuangong.getId_num());
                        data.add(yuangong.getBirthday());
                        data.add(yuangong.getCall());
                        data.add(yuangong.getAddress());
                        data.add(yuangong.getHobby());
                        data.add(yuangong.getAttach());
                        dtm.addRow(data);
                    }
                }
                else {
                    List<Yuangonginfo> list1= sd.Select(jtf.getText());//???????????????id
                    dtm.setRowCount(0);//??????????????????
                    Vector<Object> data = new Vector<Object>();
                    System.out.println(list1.size());
                    for (int i = 0; i < list1.size(); i++) {
                        Vector<Object> data1 = new Vector<Object>();
                        Yuangonginfo yuangong = list1.get(i);
                        data1.add(yuangong.getId());
                        data1.add(yuangong.getName());
                        data1.add(yuangong.getSex());
                        data1.add(yuangong.getApartment());
                        data1.add(yuangong.getId_num());
                        data1.add(yuangong.getBirthday());
                        data1.add(yuangong.getCall());
                        data1.add(yuangong.getAddress());
                        data1.add(yuangong.getHobby());
                        data1.add(yuangong.getAttach());
                        dtm.addRow(data1);
                    }
                }
            }
        });
        //????????????
        jbt5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                //?????????????????????????????????????????????
                dtm.setRowCount(0);
                for(int i=1;i<15;i++)
                {
                    Vector<Object> data = new Vector<Object>();
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    data.add("");
                    dtm.addRow(data);
                }

            }
        });

    }

    public static void main(String[] args) {
        new YuangonginfoFrame();
    }
}


