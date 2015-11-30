/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vipul Sharma
 */
public class FlowChart extends javax.swing.JFrame {

    /**
     * Creates new form FlowChart
     */
    public FlowChart() {
        shapeNo = new Object[20];
        root = new Node(0,1,"START",false);
        shapeNo[count] = count;
        count++;
        printTree(root,400,70);
        //repaint();
        initComponents();
    }
    int px;
    int py;
    String content = "";
    int count=0;
    int nodeNo;
    int attachTo;
    boolean isDecisionBox;
    Object[] shapeNo;
    Object[] decision = {0, 1};
    Node newNode = null;
    Node root;
    boolean success;
    double phi = Math.toRadians(30);
    int barb = 10;
    String line = "";
    String msg = "";
    
    
    private static class Node{
        public Node left;
        public Node right;
        public int shapeNo;
        public String shapeContent;
        public int shapeType;
        public boolean flag;
        public int x;
        public int y;
        
        Node(int shapeNo,int shapeType,String shapeContent,boolean flag){
            left = null;
            right = null;
            this.flag = false;              //Testing to remove error
            this.shapeNo = shapeNo;
            this.shapeType = shapeType;
            this.shapeContent = shapeContent;
            this.flag = flag;
        }
		
	public boolean ninsert (int dir, Node n1){
            if(dir==0){
                if(this.left == null)
                    this.left=n1;
                else{
                    //System.out.println(">>>>>> Node exists here <<<<<<");
                    JOptionPane.showMessageDialog(null, ">> Node exists here << \n Please select another node to attach to!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                    }
                }
            else if (dir==1){
                if(this.right == null)
                {
                    this.right=n1;
                    return true;
                }
                    
                else{
                    //System.out.println(">>>>>> Node exists here <<<<<<");
                    JOptionPane.showMessageDialog(null, ">> Node exists here << \n Please select another node to attach to!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                    }
                }
            return true;
            }     
    }
    
   public void printTree(Node node,int x,int y){
       if (node!=null){
           node.x = x;
           node.y = y;
              
       if (!node.flag){
           printTree(node.left,x,y+80);
       }
       else{
           printTree(node.left,x,y+110);
           printTree(node.right,x+200,y+110);
       }
     }
       
   }
   
   public void fileTree(Node node, PrintWriter writer) throws IOException{
		if(node != null){
			System.out.println(node.shapeNo+"\t"+node.shapeContent);
				
			if(!node.flag){
				writer.println(node.shapeContent);
				fileTree(node.left, writer);
			}
			else{
				writer.println("IF ("+node.shapeContent+"){");
				fileTree(node.left, writer);
				writer.println("} ELSE {");
				fileTree(node.right, writer);
				writer.println("}");
			}			
		}
	}
   

    public Node findNode(Node node, int no){ 
        if(node != null){ 
            if(node.shapeNo == no){ 
                return node; 
                } 
            else{ 
                Node tempnode = null; 
                if(node.left != null){ 
                    tempnode = findNode(node.left, no); 
                    } 
                if(tempnode==null && node.right != null){ 
                    tempnode = findNode(node.right, no); 
                    } 
                return tempnode; 
                } 
            } 
        return null; 
}
    
    public void paint(Graphics g){
        super.paint(g);
        displayTree(g,root);
        
        
    }
      
    public void displayTree(Graphics g,Node node){
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Point sw;// = new Point(x, y);  
        Point ne;// = new Point(x, y+200); 
        
        if (node!=null){
          
            switch(node.shapeType){
                
                case 1:
                    //Start Oval
                    g.drawOval(node.x - 25, node.y, 50, 50);
                    g.drawString("Fig: " + node.shapeNo, node.x - 100, node.y + 20);
                    g.drawString(node.shapeContent, node.x - 18, node.y + 30);
                    sw = new Point(node.x, node.y + 50);
                    ne = new Point(node.x, node.y + 80);
                    g2.draw(new Line2D.Double(sw, ne));
                    drawArrowHead(g2, ne, sw, Color.blue);
                    g.setColor(Color.black);
                    break;
                    
                case 2:
                    //Input/Output Box
                    g.drawRect(node.x - 70, node.y, 150, 50);
                    g.drawString("Fig: " + node.shapeNo, node.x - 100, node.y + 20);
                    g.drawString(node.shapeContent, node.x - 60, node.y + 20);
                    sw = new Point(node.x, node.y + 50);
                    ne = new Point(node.x, node.y + 80);
                    g2.draw(new Line2D.Double(sw, ne));
                    drawArrowHead(g2, ne, sw, Color.blue);
                    g.setColor(Color.black);
                    break;
                    
                case 3:
                    //Deccsion Box
                    g.drawLine(node.x - 40, node.y + 40, node.x, node.y);
                    g.drawLine(node.x - 40, node.y + 40, node.x, node.y + 80);
                    g.drawLine(node.x, node.y, node.x + 40, node.y + 40);
                    g.drawLine(node.x + 40, node.y + 40, node.x, node.y + 80);
                    g.drawString("Fig: " + node.shapeNo, node.x - 100, node.y + 20);
                    g.drawString(node.shapeContent, node.x - 30, node.y + 40);
                    
                    //Draw No line
                    sw = new Point(node.x, node.y + 80);
                    ne = new Point(node.x, node.y + 110);
                    g2.draw(new Line2D.Double(sw, ne));
                    drawArrowHead(g2, ne, sw, Color.blue);
                    g.drawString("NO",node.x+10,node.y+95);
                    g.setColor(Color.black);
                    
                    
                    //Draw yes line
                    g.drawLine(node.x+40, node.y+40, node.x+200, node.y+40);
                    g.drawLine(node.x+200, node.y+40, node.x+200, node.y+110);
                    sw = new Point(node.x+200, node.y + 70);
                    ne = new Point(node.x+200, node.y + 110);
                    drawArrowHead(g2, ne, sw, Color.blue);
                    g.drawString("YES",node.x+170,node.y+95);
                    g.setColor(Color.black);
                    
                    break;
                    
                case 4:
                    //Stop
                    g.drawOval(node.x - 25, node.y, 50, 50);
                    g.drawString("Fig: " + node.shapeNo, node.x - 100, node.y + 20);
                    g.drawString(node.shapeContent, node.x - 15, node.y + 30);
                    break;
            }
              
       if (!node.flag){
           displayTree(g,node.left);
       }
       else{
           displayTree(g,node.left);
           displayTree(g,node.right);
       }
     }
        
    }
    
    
    private void drawArrowHead(Graphics2D g2, Point tip, Point tail, Color color) {
        g2.setPaint(color);
        double dy = tip.y - tail.y;
        double dx = tip.x - tail.x;
        double theta = Math.atan2(dy, dx);
        //System.out.println("theta = " + Math.toDegrees(theta));  
        double x, y, rho = theta + phi;
        for (int j = 0; j < 2; j++) {
            x = tip.x - barb * Math.cos(rho);
            y = tip.y - barb * Math.sin(rho);
            g2.draw(new Line2D.Double(tip.x, tip.y, x, y));
            rho = theta - phi;
        }
    }
    
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Draw FlowChart", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Input/Output Box");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Decisional Box");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Stop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flow Chart", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Compile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        attachTo = 0;   //by Default attach to left node
        isDecisionBox = false;
        content = JOptionPane.showInputDialog("Enter the content of Input/Ouput box: ");
        nodeNo = (int) JOptionPane.showInputDialog(null, "Input/Output Box",
                "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                shapeNo, // Array of choices
                0);
        
        System.out.println("Attach to node no: " + nodeNo);
        
        
        newNode = (new FlowChart()).findNode(root, nodeNo);
        
        System.out.println("Value of newNode.flag: " + newNode.flag);
        
        
        if(newNode.flag){
            attachTo = (int) JOptionPane.showInputDialog(null, "0:No 1:Yes ",
                    "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                    decision, // Array of choices
                    decision[0]);
            System.out.println("attachTo: " + attachTo);
        }
                
        
        success = newNode.ninsert(attachTo,new Node(count,2,content,isDecisionBox));
        if (success){
            printTree(root,400,70);
            repaint();
            shapeNo[count] = count;
            count++;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        attachTo = 0;   //by Default attach to left node
        isDecisionBox = true;
        content = JOptionPane.showInputDialog("Enter the content of Decisional box: ");
        nodeNo = (int) JOptionPane.showInputDialog(null, "Decisional Box",
                "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                shapeNo, // Array of choices
                0);
        newNode = (new FlowChart()).findNode(root, nodeNo);
        
        System.out.println("Attach to node no: " + nodeNo);
        
        
        if(newNode.flag){
            attachTo = (int) JOptionPane.showInputDialog(null, "0:No 1:Yes ",
                    "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                    decision, // Array of choices
                    decision[0]);
            System.out.println("attachTo: " + attachTo);
        }
        
        
        success = newNode.ninsert(attachTo,new Node(count,3,content,isDecisionBox));
        if (success){
            printTree(root,400,70);
            repaint();
            shapeNo[count] = count;
            count++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        attachTo = 0;   //by Default attach to left node
        isDecisionBox = false;
        content = "STOP";
        nodeNo = (int) JOptionPane.showInputDialog(null, "STOP",
                "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                shapeNo, // Array of choices
                0);
        newNode = (new FlowChart()).findNode(root, nodeNo);
        
        System.out.println("Attach to node no: " + nodeNo);
        
        
        if(newNode.flag){
            attachTo = (int) JOptionPane.showInputDialog(null, "0:No 1:Yes ",
                    "Link to shape no: ", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
                    decision, // Array of choices
                    decision[0]);
            System.out.println("attachTo: " + attachTo);
        }        
        
        success = newNode.ninsert(attachTo,new Node(count,4,content,isDecisionBox));
        if (success){
            printTree(root,400,70);
            repaint();
            shapeNo[count] = count;
            count++;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        printTree(root,400,70);
        try {
            PrintWriter writer = new PrintWriter("input-flowme.txt","UTF-8");			
            (new FlowChart()).fileTree(root, writer);
            writer.close();			
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Some IO error occured!", "Unable to save to the file!", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FlowChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {  
            Process p_1 = Runtime.getRuntime().exec("cmd /C cd C:/Javalib");
            p_1 = Runtime.getRuntime().exec("cmd /C java org.antlr.v4.runtime.misc.TestRig Flow a input-flowme.txt");
            
            BufferedReader in_1 = new BufferedReader(new InputStreamReader(p_1.getErrorStream()));
            BufferedReader in_2 = new BufferedReader(new InputStreamReader(p_1.getInputStream()));
            
            while ((line = in_1.readLine()) != null) {  
                //System.out.println(line);
                msg = msg + line;
            }
            while ((line = in_2.readLine()) != null) {  
                //System.out.println(line);
                msg = msg + line;
            }
            
            System.out.println("Msg: " + msg);
            if(msg.equals("")){
                JOptionPane.showMessageDialog(null, "Source code generated successfully!", "Congratulations", JOptionPane.PLAIN_MESSAGE);
                Process p1 = Runtime.getRuntime().exec("cmd /C javac test.java");  
                Process p2 = Runtime.getRuntime().exec("cmd /C java test"); 
                
                File file = new File("Output.java");
                // if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
                
                BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()));  
                while ((line = br.readLine()) != null) {  
                    //System.out.println(line);
                    msg = msg + line + "\n";
                }
                
                
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(msg);
		bw.close();
                
                System.out.println("Content of test.java: " + msg);
                JOptionPane.showMessageDialog(null, msg, "SOURCE CODE", JOptionPane.PLAIN_MESSAGE);
                msg = "";
            }else{
                JOptionPane.showMessageDialog(null, "Some error occured. Please contact Vipul!", "ERROR", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, msg, "ERROR DETAILS", JOptionPane.ERROR_MESSAGE);
                msg = "";
            }
            //System.out.println(desc);
        
        } catch (IOException e) {  
            System.out.println(e.toString());
            e.printStackTrace();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        root = null;
        //root.left = null;
        //root.right = null;
        count = 0;
        shapeNo = null;
        System.gc();
        shapeNo = new Object[20];
        root = new Node(0,1,"START",false);
        shapeNo[count] = count;
        count++;
        printTree(root,400,70);
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlowChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlowChart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
