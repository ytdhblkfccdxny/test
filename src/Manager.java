import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.ScrollPane;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;


//class Yuangonginfo{
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
//
//    @Override
//    public String toString() {
//        return "Yuangonginfo{" +
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
//}
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
//class BaseDao {
//    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//    String url="jdbc:mysql://localhost:3306/???????????????????" +
//            "useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true";
//    String username="root";//???????????????????????????
//    String password="Llf20020717";//????????????????????????
//    static{
//        try {
//            Class.forName(DRIVER);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    public Connection getConn() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url,username,password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return conn;
//    }
//    public void close(ResultSet rs,Statement state,Connection conn) {
//        try {
//            if(rs != null) {
//                rs.close();
//            }
//            if(state != null) {
//                state.close();
//            }
//            if(conn !=null) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}//???????????????
//class ScoreDao {
//    //???????????????????????????
//
//    BaseDao bd = new BaseDao();
//    Connection conn = null;
//    Statement state = null;
//    ResultSet rs = null;
//    PreparedStatement pstate;
//    String [] str = new String[4];
//
//    //????????????????????????
//    public List<Score> ScoreDao() {
//        conn = bd.getConn();
//        List<Score> list1 = new ArrayList<Score>();
//        try {
//            state = conn.createStatement();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        String sql = "select * from score";
//        try {
//            rs = state.executeQuery(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            while(rs.next()) {
//                Score stu = new Score();
//                stu.setId(rs.getInt("id"));
//                stu.setName(rs.getString("name"));
//                stu.setCourse(rs.getString("course"));
//                stu.setDegree(rs.getString("degree"));
//                System.out.println(stu);
//                list1.add(stu);
//            }
//            bd.close(rs, pstate, conn);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list1;
//    }
//
//    //????????????????????????????????????
//    public List<Score> Select(String id) {
//        List<Score> list2 = new ArrayList<Score>();
//        conn = bd.getConn();
//        int result = -1;
//        String sql = "select * from score where id = ?";
//        try {
//            pstate = conn.prepareStatement(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            pstate.setString(1, id);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            ResultSet rs = pstate.executeQuery();
//            while(rs.next()) {
//                Score stu = new Score();
//                stu.setId(rs.getInt("id"));
//                stu.setName(rs.getString("name"));
//                stu.setCourse(rs.getString("course"));
//                stu.setDegree(rs.getString("degree"));
//                System.out.println(stu);
//                list2.add(stu);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            bd.close(null, pstate, conn);
//        }
//        return list2;
//    }
//
//
//    //??????????????????
//    @SuppressWarnings("finally")
//    public String Insert(String id,String name ,String course,String degree) {
//        conn = bd.getConn();
//        int result = -1;
//        String sql = "insert into score values('"+id+"','"+name+"','"+course+"','"+degree+"')";
//        try {
//            pstate = conn.prepareStatement(sql);
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        try {
//            result = pstate.executeUpdate();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }finally {
//            bd.close(null, pstate, conn);
//            if(result > 0) {
//                return "????????????";
//            }else {
//                return "????????????";
//            }
//        }
//    }
//
//
//    //????????????
//    @SuppressWarnings("finally")
//    public String Del(String id,String name ,String course,String degree) {
//        conn = bd.getConn();
//        int result = -1;
//        String sql = "delete from score where id ='"+id+"' and name ='"+name+"' and course ='"+course+"' and degree='"+degree+"'";
//        try {
//            pstate = conn.prepareStatement(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            result = pstate.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            bd.close(null, pstate, conn);
//            if(result > 0) {
//                return "????????????";
//            }else {
//                return "????????????";
//            }
//        }
//    }
//
//    //?????????????????????????????????????????????id??????
//    @SuppressWarnings("finally")
//    public String Update(String id,String name ,String course,String degree) {
//        conn = bd.getConn();
//        int result = -1;
//        String sql = "update score set  name ='"+name+"',course ='"+course+"',degree="+degree+" where id='"+id+"'";
//        try {
//            pstate = conn.prepareStatement(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            result = pstate.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            bd.close(null, pstate, conn);
//            if(result > 0) {
//                return "????????????";
//            }else {
//                return "????????????";
//            }
//        }
//    }
//
//
//
//}//????????????
public class Manager extends JFrame implements TreeSelectionListener {
    JTree tree;
    private JPanel p;
    Manager Manager = this;

    Manager() {
        Container c = this.getContentPane();
        setTitle("???????????????");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("??????");
        DefaultMutableTreeNode yuangonginfo = new DefaultMutableTreeNode("????????????");
        DefaultMutableTreeNode action1 = new DefaultMutableTreeNode("????????????");
        DefaultMutableTreeNode bumenmanagerinfo = new DefaultMutableTreeNode("?????????????????????");
        DefaultMutableTreeNode action2 = new DefaultMutableTreeNode("????????????");
        DefaultMutableTreeNode bumeninfo = new DefaultMutableTreeNode("????????????");
        DefaultMutableTreeNode action3 = new DefaultMutableTreeNode("????????????");
        root.add(yuangonginfo);
        root.add(bumenmanagerinfo);
        root.add(bumeninfo);
        yuangonginfo.add(action1);
        bumenmanagerinfo.add(action2);
        bumeninfo.add(action3);
        tree = new JTree(root);
        //tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);//?????????????????????
        tree.addTreeSelectionListener(this);
        p = new JPanel();//?????????????????????????????????
        p.setSize(1000, 1000);
        c.add(new JScrollPane(tree), BorderLayout.WEST);
        c.add(p, BorderLayout.CENTER);
        setBounds(400, 400, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode selectionNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (selectionNode.isLeaf()) { //?????????????????????
            System.out.println("????????????:" + selectionNode.toString());
            if (selectionNode.toString() == "????????????") {    //??????
                new YuangonginfoFrame();
            }


            if (selectionNode.toString() == "????????????") {//????????????
                new BumenmanagerinfoFrame();
            }

            if (selectionNode.toString() == "????????????") {
                new Bumenn();
            }
        }
    }
    public static void main(String[] args) {
        new Manager();
    }
}
