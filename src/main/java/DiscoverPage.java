

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class DiscoverPage extends javax.swing.JFrame {
    private Set<String> cartItems;

 
    public DiscoverPage() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setUndecorated(true);
        pack();
        cartItems = new HashSet<>(); // Initialize the cart items set
        loadCartItems();
        
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        StoresBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cartBtn = new javax.swing.JButton();
        coffeepanel1 = new javax.swing.JPanel();
        ImagePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        price1 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        coffeeNamePanel = new javax.swing.JPanel();
        coffeeName1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        rating1 = new javax.swing.JLabel();
        seemorebtn1 = new javax.swing.JButton();
        addtocartbtn1 = new javax.swing.JButton();
        coffeepanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        price2 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        CoffeeNames2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        rating2 = new javax.swing.JLabel();
        Seemorebtn2 = new javax.swing.JButton();
        addtocartbtn2 = new javax.swing.JButton();
        coffeepanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        price3 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        coffeeNames3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        rating3 = new javax.swing.JLabel();
        seemorebtn3 = new javax.swing.JButton();
        addtocartbtn3 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        nextbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1301, 732));
        setMinimumSize(new java.awt.Dimension(1301, 732));
        setPreferredSize(new java.awt.Dimension(1301, 732));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        BackBtn.setBackground(new java.awt.Color(255, 255, 204));
        BackBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\whiteArrow (1).png")); // NOI18N
        BackBtn.setBorder(null);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search coffee by store?  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 230, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        StoresBtn.setBackground(new java.awt.Color(0, 0, 0,80));
        StoresBtn.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        StoresBtn.setForeground(new java.awt.Color(255, 255, 255));
        StoresBtn.setText("Click here!");
        StoresBtn.setBorder(null);
        StoresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoresBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(StoresBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StoresBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 120, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        cartBtn.setBackground(new java.awt.Color(0, 0, 0));
        cartBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        cartBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\icons8-cart-64 (1) (1).png")); // NOI18N
        cartBtn.setBorderPainted(false);
        cartBtn.setContentAreaFilled(false);
        cartBtn.setFocusPainted(false);
        cartBtn.setFocusable(false);
        cartBtn.setRequestFocusEnabled(false);
        cartBtn.setVerifyInputWhenFocusTarget(false);
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 60, 30));

        coffeepanel1.setBackground(new java.awt.Color(204, 204, 204));
        coffeepanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 51)));
        coffeepanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        ImagePanel.setPreferredSize(new java.awt.Dimension(270, 270));
        ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,80));

        price1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 255));
        price1.setText("Php 260.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ImagePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, 40));

        image1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\pumpkincreamcoldbrew1.png")); // NOI18N
        ImagePanel.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 252));

        coffeepanel1.add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 250));

        coffeeNamePanel.setBackground(new java.awt.Color(204, 204, 204));

        coffeeName1.setBackground(new java.awt.Color(255, 255, 255, 80));
        coffeeName1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        coffeeName1.setText("Pumpkin Cream Cold Brew");

        javax.swing.GroupLayout coffeeNamePanelLayout = new javax.swing.GroupLayout(coffeeNamePanel);
        coffeeNamePanel.setLayout(coffeeNamePanelLayout);
        coffeeNamePanelLayout.setHorizontalGroup(
            coffeeNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffeeNamePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(coffeeName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        coffeeNamePanelLayout.setVerticalGroup(
            coffeeNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffeeNamePanelLayout.createSequentialGroup()
                .addComponent(coffeeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        coffeepanel1.add(coffeeNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, 50));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        rating1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\OneDrive\\Pictures\\5.0.png")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(rating1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(rating1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        coffeepanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 330, 50));

        seemorebtn1.setBackground(new java.awt.Color(204, 204, 204));
        seemorebtn1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        seemorebtn1.setText("See more...");
        seemorebtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        seemorebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seemorebtn1ActionPerformed(evt);
            }
        });
        coffeepanel1.add(seemorebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 30));

        addtocartbtn1.setBackground(new java.awt.Color(204, 204, 204));
        addtocartbtn1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addtocartbtn1.setText("Add to Cart");
        addtocartbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addtocartbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtn1ActionPerformed(evt);
            }
        });
        coffeepanel1.add(addtocartbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, 30));

        getContentPane().add(coffeepanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 350, 460));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 51)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setPreferredSize(new java.awt.Dimension(270, 270));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(0, 0, 0,80));

        price2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        price2.setForeground(new java.awt.Color(255, 255, 255));
        price2.setText("Php 280.00");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, 40));

        image2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\Untitled design (3).png")); // NOI18N
        jPanel11.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 250));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 250));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        CoffeeNames2.setBackground(new java.awt.Color(255, 255, 255, 80));
        CoffeeNames2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        CoffeeNames2.setText("Apple Crips Oatmilk Macchiato");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(CoffeeNames2)
                .addGap(23, 23, 23))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(CoffeeNames2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, 50));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        rating2.setBackground(new java.awt.Color(204, 204, 204));
        rating2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\OneDrive\\Pictures\\4rate.png")); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(rating2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(rating2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 330, -1, 60));

        Seemorebtn2.setBackground(new java.awt.Color(204, 204, 204));
        Seemorebtn2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        Seemorebtn2.setText("See more...");
        Seemorebtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        Seemorebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seemorebtn2ActionPerformed(evt);
            }
        });
        jPanel10.add(Seemorebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 30));

        addtocartbtn2.setBackground(new java.awt.Color(204, 204, 204));
        addtocartbtn2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addtocartbtn2.setText("Add to Cart");
        addtocartbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addtocartbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtn2ActionPerformed(evt);
            }
        });
        jPanel10.add(addtocartbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, 30));

        javax.swing.GroupLayout coffeepanel2Layout = new javax.swing.GroupLayout(coffeepanel2);
        coffeepanel2.setLayout(coffeepanel2Layout);
        coffeepanel2Layout.setHorizontalGroup(
            coffeepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(coffeepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );
        coffeepanel2Layout.setVerticalGroup(
            coffeepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(coffeepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );

        getContentPane().add(coffeepanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 360, 460));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 51)));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setPreferredSize(new java.awt.Dimension(270, 270));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(204, 204, 204,80));

        price3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        price3.setForeground(new java.awt.Color(255, 255, 255));
        price3.setText("Php 215.00");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, 40));

        image3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\matchagreentealatte.png")); // NOI18N
        jPanel20.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 252));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 270, 250));

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

        coffeeNames3.setBackground(new java.awt.Color(255, 255, 255, 80));
        coffeeNames3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        coffeeNames3.setText("Matcha Green Tea Latte");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coffeeNames3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(coffeeNames3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 50));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        rating3.setBackground(new java.awt.Color(204, 204, 204));
        rating3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\OneDrive\\Pictures\\4.5rate.png")); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rating3, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rating3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 330, 340, 60));

        seemorebtn3.setBackground(new java.awt.Color(204, 204, 204));
        seemorebtn3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        seemorebtn3.setText("See more...");
        seemorebtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        seemorebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seemorebtn3ActionPerformed(evt);
            }
        });
        jPanel19.add(seemorebtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 90, 30));

        addtocartbtn3.setBackground(new java.awt.Color(204, 204, 204));
        addtocartbtn3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addtocartbtn3.setText("Add to Cart");
        addtocartbtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        addtocartbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtn3ActionPerformed(evt);
            }
        });
        jPanel19.add(addtocartbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, 30));

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        javax.swing.GroupLayout coffeepanel3Layout = new javax.swing.GroupLayout(coffeepanel3);
        coffeepanel3.setLayout(coffeepanel3Layout);
        coffeepanel3Layout.setHorizontalGroup(
            coffeepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coffeepanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        coffeepanel3Layout.setVerticalGroup(
            coffeepanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffeepanel3Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(coffeepanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 350, 460));

        jPanel18.setBackground(new java.awt.Color(102, 102, 102,80));

        nextbtn.setBackground(new java.awt.Color(0, 0, 0));
        nextbtn.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        nextbtn.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn.setText("NEXT");
        nextbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 140, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\Coffee Supplier Presentation (1).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 730));

        setSize(new java.awt.Dimension(1317, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        MainPage main = new MainPage();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
           CartPage cart = new CartPage();
           cart.setVisible(true);
           this.setVisible(false);
           
    }//GEN-LAST:event_cartBtnActionPerformed

    private void addtocartbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtn1ActionPerformed
      addToCart("Pumpkin Cream Cold Brew", "Php 260.00");       
     
    }//GEN-LAST:event_addtocartbtn1ActionPerformed

    private void StoresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoresBtnActionPerformed
    CoffeeStores stores = new CoffeeStores();
    stores.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
    stores.setVisible(true); // Show the CoffeeStores page
    }//GEN-LAST:event_StoresBtnActionPerformed

    private void seemorebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seemorebtn1ActionPerformed
     Seemore1 see = new Seemore1();
    see.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
    see.setVisible(true); 
    }//GEN-LAST:event_seemorebtn1ActionPerformed

    private void Seemorebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seemorebtn2ActionPerformed
    Seemore2 seemore = new Seemore2();
    seemore.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
    seemore.setVisible(true);  
    }//GEN-LAST:event_Seemorebtn2ActionPerformed

    private void addtocartbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtn2ActionPerformed
   addToCart("Apple Crips Oatmilk Macchiato", "Php 280.00");        

    }//GEN-LAST:event_addtocartbtn2ActionPerformed

    private void seemorebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seemorebtn3ActionPerformed
    Seemore3 more = new Seemore3();
    more.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
    more.setVisible(true); 
    }//GEN-LAST:event_seemorebtn3ActionPerformed

    private void addtocartbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtn3ActionPerformed
   addToCart("Matcha Green Tea Latte", "Php 215.00");       
    }//GEN-LAST:event_addtocartbtn3ActionPerformed
 private void addToCart(String coffeeName, String price) {
    String itemKey = coffeeName + price; // Unique identifier for the item
    String filePath = "C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 2.txt";

    if (cartItems.contains(itemKey)) {
        // Show warning message if item is already in the cart
        JOptionPane.showMessageDialog(this, "Item is already added to cart!", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        // Prompt for quantity
        String quantityStr = JOptionPane.showInputDialog(this, "Enter quantity for " + coffeeName + ":");
        
        // Validate the input
        if (quantityStr != null && !quantityStr.trim().isEmpty()) {
            try {
                int quantity = Integer.parseInt(quantityStr);
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(this, "Quantity must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Calculate total price
                double priceValue = Double.parseDouble(price.replace("Php ", "").replace(",", ""));
                double totalPrice = priceValue * quantity;

                // Add item to cart
                cartItems.add(itemKey);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                    // Save coffee name, price, quantity, and total with "Php" prefix
                    writer.write(coffeeName + "," + price + "," + quantity + ",Php " + totalPrice); 
                    writer.newLine();
                    JOptionPane.showMessageDialog(this, coffeeName + " added to cart.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
 private void loadCartItems() {
        String filePath = "C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 2.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringData = line.split(","); // Assuming the file is comma-separated
                if (stringData.length >= 3) { // Ensure there are enough parts
                    String coffeeName = stringData[1];
                    String price = stringData[2];
                    String itemKey = coffeeName + price; // Create a unique key
                    cartItems.add(itemKey); // Add to the set
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        CoffeePage2 discover = new CoffeePage2 ();
        discover.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextbtnActionPerformed

   
    public static void main(String args[]) {
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscoverPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CoffeeNames2;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton Seemorebtn2;
    private javax.swing.JButton StoresBtn;
    private javax.swing.JButton addtocartbtn1;
    private javax.swing.JButton addtocartbtn2;
    private javax.swing.JButton addtocartbtn3;
    private javax.swing.JButton cartBtn;
    private javax.swing.JLabel coffeeName1;
    private javax.swing.JPanel coffeeNamePanel;
    private javax.swing.JLabel coffeeNames3;
    private javax.swing.JPanel coffeepanel1;
    private javax.swing.JPanel coffeepanel2;
    private javax.swing.JPanel coffeepanel3;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton nextbtn;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel rating1;
    private javax.swing.JLabel rating2;
    private javax.swing.JLabel rating3;
    private javax.swing.JButton seemorebtn1;
    private javax.swing.JButton seemorebtn3;
    // End of variables declaration//GEN-END:variables
}
