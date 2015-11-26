import java.awt.Container;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import com.sun.xml.internal.txw2.Document;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ImplementsDemo {
    private static final DocumentListener DocumentTestListener = null;

	public static void main(String[] args) throws EmptyStackException, ParserConfigurationException, Exception{
        JFrame f=new JFrame("Tool");
        JTextField name=new JTextField(30);
        JTextField noed=new JTextField("name",10);
        JLabel nameLab=new JLabel("name");
        JLabel noedLab=new JLabel("Can't write");
        JButton B = new JButton("Finish");
        JButton C = new JButton("C");
        noed.setEnabled(false);
        name.setColumns(30);
        noed.setColumns(30);
        f.setLayout(new GridLayout(2,3));//设置布局管理器 2行2列
        f.add(nameLab);
        f.add(name);
        f.add(B);
        f.add(noedLab);
        f.add(noed);
        f.add(C);
        f.setSize(300,100);
        f.setLocation(300,200);
        f.setVisible(true);
        
        f.addWindowListener(new B()); //closing
        
        
        
        


        
        
        String a = name.getText();
        
        /*  本部分为视频部分 找收藏 只有string方法 其它方法还没有添加   */
        DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newInstance();
        DocumentBuilder  documentBuilder = documentBuilderFactory.newDocumentBuilder();
        
        org.w3c.dom.Document document = documentBuilder.newDocument();
        
        Element element  = document.createElement("Group");
        document.appendChild(element);
        
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource (document);
        
        Element name_1 = document.createElement("name");
        name_1.appendChild(document.createTextNode(a));
        element.appendChild(name_1);
        
        StreamResult streamResult = new StreamResult( new File("/Users/pro/Desktop/1.xml"));
        transformer.transform(source, streamResult);
        
        
        
        /*监听按钮部分*/
        
        //ABC abc = new ABC();
        //B.addActionListener(abc);
       
       
 
       
        
 
    }
    
}
class B extends WindowAdapter{  // 关闭窗口的动作
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}

class ABC implements ActionListener{ //监听的class
	public void actionPerformed(ActionEvent e){// 这行很重要 不能修改 固定格式
		
		System.exit(0);  // -1非正常退出 0正常退出
	}
	// 未完成部分。。。。。。缺少一个监听对Finish键 
}
