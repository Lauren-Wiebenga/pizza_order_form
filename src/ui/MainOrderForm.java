/*
 * Date:   4/1/18
 * Author: Lauren Wiebenga
 * File:   PizzaOrderForm/src/ui/MainOrderForm.java
 */
package ui;

import business.*;
import validator.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class MainOrderForm extends javax.swing.JFrame {
    private Pizza currentOrder;
    /**
     * Creates new form MainOrderForm
     */
    public MainOrderForm() {
        initComponents();
        this.setLocationRelativeTo(this); //center form on screen
        currentOrder = new Pizza();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrustTypeGroup = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        BasicIngredPanel = new javax.swing.JPanel();
        PizzaSizeLabel = new javax.swing.JLabel();
        SizeComboBox = new javax.swing.JComboBox<>();
        CrustTypeLabel = new javax.swing.JLabel();
        RegBttn = new javax.swing.JRadioButton();
        GFBttn = new javax.swing.JRadioButton();
        SauceLabel = new javax.swing.JLabel();
        SauceComboBox = new javax.swing.JComboBox<>();
        CheeseLabel = new javax.swing.JLabel();
        CheeseComboBox = new javax.swing.JComboBox<>();
        AddIngredPanel = new javax.swing.JPanel();
        ToppingLabel = new javax.swing.JLabel();
        PepperoniLabel = new javax.swing.JLabel();
        HamLabel = new javax.swing.JLabel();
        TofuLabel = new javax.swing.JLabel();
        SardinesLabel = new javax.swing.JLabel();
        OnionLabel = new javax.swing.JLabel();
        GPepperLabel = new javax.swing.JLabel();
        JalapenosLabel = new javax.swing.JLabel();
        MushroomLabel = new javax.swing.JLabel();
        PineappleLabel = new javax.swing.JLabel();
        RPepperLabel = new javax.swing.JLabel();
        BasilLabel = new javax.swing.JLabel();
        PepperoniComboBox = new javax.swing.JComboBox<>();
        HamComboBox = new javax.swing.JComboBox<>();
        TofuComboBox = new javax.swing.JComboBox<>();
        SardinesComboBox = new javax.swing.JComboBox<>();
        OnionComboBox = new javax.swing.JComboBox<>();
        GPepperComboBox = new javax.swing.JComboBox<>();
        JalapenosComboBox = new javax.swing.JComboBox<>();
        MushroomComboBox = new javax.swing.JComboBox<>();
        PineappleComboBox = new javax.swing.JComboBox<>();
        RPepperComboBox = new javax.swing.JComboBox<>();
        BasilComboBox = new javax.swing.JComboBox<>();
        ClearBttn = new javax.swing.JButton();
        ExitBttn = new javax.swing.JButton();
        EnterBttn = new javax.swing.JButton();
        HelpBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(251, 247, 243));

        TitleLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Pizza Order Form");

        BasicIngredPanel.setBackground(new java.awt.Color(255, 255, 255));
        BasicIngredPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PizzaSizeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PizzaSizeLabel.setText("Pizza Size:");

        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "Small (8 inches)", "Medium (10 inches)", "Large (12 inches)", "X-Large (14 inches)" }));
        SizeComboBox.setName("Pizza Size"); // NOI18N
        SizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeComboBoxActionPerformed(evt);
            }
        });

        CrustTypeLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CrustTypeLabel.setText("Crust Type:");

        CrustTypeGroup.add(RegBttn);
        RegBttn.setSelected(true);
        RegBttn.setText("Regular");

        CrustTypeGroup.add(GFBttn);
        GFBttn.setText("Gluten-Free");

        SauceLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SauceLabel.setText("Sauce:");

        SauceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "No Sauce", "1/4 Cup Red Sauce", "1/2 Cup Red Sauce" }));
        SauceComboBox.setName("Sauce Amount"); // NOI18N
        SauceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauceComboBoxActionPerformed(evt);
            }
        });

        CheeseLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CheeseLabel.setText("Cheese:");

        CheeseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/4 Cup Pizza Cheese", "1/2 Cup Pizza Cheese" }));
        CheeseComboBox.setName("Cheese Amount"); // NOI18N
        CheeseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasicIngredPanelLayout = new javax.swing.GroupLayout(BasicIngredPanel);
        BasicIngredPanel.setLayout(BasicIngredPanelLayout);
        BasicIngredPanelLayout.setHorizontalGroup(
            BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                        .addComponent(PizzaSizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                        .addComponent(SauceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                        .addComponent(CheeseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheeseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                        .addComponent(CrustTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(RegBttn)
                        .addGap(18, 18, 18)
                        .addComponent(GFBttn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BasicIngredPanelLayout.setVerticalGroup(
            BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicIngredPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PizzaSizeLabel)
                    .addComponent(SizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrustTypeLabel)
                    .addComponent(RegBttn)
                    .addComponent(GFBttn))
                .addGap(18, 18, 18)
                .addGroup(BasicIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SauceLabel)
                    .addComponent(SauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheeseLabel)
                    .addComponent(CheeseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        AddIngredPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddIngredPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ToppingLabel.setText("* choose up to 5 toppings");

        PepperoniLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PepperoniLabel.setText("Pepperoni:");

        HamLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        HamLabel.setText("Ham Chunks:");

        TofuLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TofuLabel.setText("Tofu:");

        SardinesLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SardinesLabel.setText("Sardines:");

        OnionLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        OnionLabel.setText("Diced Onion:");

        GPepperLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        GPepperLabel.setText("Diced Green Pepper:");

        JalapenosLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JalapenosLabel.setText("Diced Jalapenos:");

        MushroomLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MushroomLabel.setText("Sliced Mushroom:");

        PineappleLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PineappleLabel.setText("Pineapple Chunks:");

        RPepperLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RPepperLabel.setText("Dried Red Pepper:");

        BasilLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BasilLabel.setText("Dried Basil:");

        PepperoniComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "2 Pieces", "4 Pieces", "6 Pieces", "8 Pieces" }));
        PepperoniComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepperoniComboBoxActionPerformed(evt);
            }
        });

        HamComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "4 Pieces", "8 Pieces", "12 Pieces", "16 Pieces" }));
        HamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamComboBoxActionPerformed(evt);
            }
        });

        TofuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/4 Cup", "1/2 Cup" }));
        TofuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TofuComboBoxActionPerformed(evt);
            }
        });

        SardinesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1", "2", "3", "4" }));
        SardinesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SardinesComboBoxActionPerformed(evt);
            }
        });

        OnionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/8 Cup", "1/4 Cup" }));
        OnionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnionComboBoxActionPerformed(evt);
            }
        });

        GPepperComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/8 Cup", "1/4 Cup" }));
        GPepperComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPepperComboBoxActionPerformed(evt);
            }
        });

        JalapenosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/8 Cup", "1/4 Cup" }));
        JalapenosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JalapenosComboBoxActionPerformed(evt);
            }
        });

        MushroomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1/8 Cup", "1/4 Cup" }));
        MushroomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MushroomComboBoxActionPerformed(evt);
            }
        });

        PineappleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "2 Pieces", "4 Pieces", "6 Pieces", "8 Pieces" }));
        PineappleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PineappleComboBoxActionPerformed(evt);
            }
        });

        RPepperComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1", "2", "3", "4" }));
        RPepperComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPepperComboBoxActionPerformed(evt);
            }
        });

        BasilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "1", "2" }));
        BasilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasilComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddIngredPanelLayout = new javax.swing.GroupLayout(AddIngredPanel);
        AddIngredPanel.setLayout(AddIngredPanelLayout);
        AddIngredPanelLayout.setHorizontalGroup(
            AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddIngredPanelLayout.createSequentialGroup()
                .addComponent(ToppingLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AddIngredPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PepperoniLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HamLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TofuLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SardinesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OnionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PepperoniComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TofuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SardinesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OnionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GPepperLabel)
                    .addComponent(JalapenosLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MushroomLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PineappleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RPepperLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BasilLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GPepperComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JalapenosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MushroomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PineappleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RPepperComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddIngredPanelLayout.setVerticalGroup(
            AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddIngredPanelLayout.createSequentialGroup()
                .addComponent(ToppingLabel)
                .addGap(21, 21, 21)
                .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddIngredPanelLayout.createSequentialGroup()
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PepperoniLabel)
                            .addComponent(PepperoniComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HamLabel)
                            .addComponent(HamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TofuLabel)
                            .addComponent(TofuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SardinesLabel)
                            .addComponent(SardinesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnionLabel)
                            .addComponent(OnionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddIngredPanelLayout.createSequentialGroup()
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPepperLabel)
                            .addComponent(GPepperComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JalapenosLabel)
                            .addComponent(JalapenosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MushroomLabel)
                            .addComponent(MushroomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PineappleLabel)
                            .addComponent(PineappleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RPepperComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RPepperLabel))
                        .addGap(18, 18, 18)
                        .addGroup(AddIngredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BasilLabel)
                            .addComponent(BasilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ClearBttn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ClearBttn.setText("Clear");
        ClearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBttnActionPerformed(evt);
            }
        });

        ExitBttn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ExitBttn.setText("Exit");
        ExitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBttnActionPerformed(evt);
            }
        });

        EnterBttn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        EnterBttn.setText("Enter");
        EnterBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterBttnActionPerformed(evt);
            }
        });

        HelpBttn.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        HelpBttn.setText("?");
        HelpBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddIngredPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BasicIngredPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addComponent(HelpBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EnterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(ClearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ExitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BasicIngredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddIngredPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(HelpBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ClearBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnterBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBttnActionPerformed
        // exit program normally
        JOptionPane.showMessageDialog(null, currentOrder.toString());
        System.exit(0);
    }//GEN-LAST:event_ExitBttnActionPerformed

    private void HelpBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpBttnActionPerformed
        // display info
        JOptionPane.showMessageDialog(null, "Crust, sauce, and cheese are required.\nChoose up to 5 additonal toppings.");
    }//GEN-LAST:event_HelpBttnActionPerformed

    private void ClearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBttnActionPerformed
        // clear form of all input
        currentOrder.clear();
        SizeComboBox.setSelectedIndex(0);
        SauceComboBox.setSelectedIndex(0);
        CheeseComboBox.setSelectedIndex(0);
        BasilComboBox.setSelectedIndex(0);
        GPepperComboBox.setSelectedIndex(0);
        HamComboBox.setSelectedIndex(0);
        JalapenosComboBox.setSelectedIndex(0);
        MushroomComboBox.setSelectedIndex(0);
        OnionComboBox.setSelectedIndex(0);
        PepperoniComboBox.setSelectedIndex(0);
        PineappleComboBox.setSelectedIndex(0);
        RPepperComboBox.setSelectedIndex(0);
        SardinesComboBox.setSelectedIndex(0);
        TofuComboBox.setSelectedIndex(0);
        RegBttn.setSelected(true);
    }//GEN-LAST:event_ClearBttnActionPerformed

    private void EnterBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterBttnActionPerformed
        // validate input
        if (Validate.isChosen(SizeComboBox) 
        && Validate.isChosen(SauceComboBox) 
        && Validate.isChosen(CheeseComboBox))
        {
            JOptionPane.showMessageDialog(null, currentOrder.toString());
            System.exit(0);
        }
    }//GEN-LAST:event_EnterBttnActionPerformed

    private void PepperoniComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepperoniComboBoxActionPerformed
        currentOrder.handleTopping(PepperoniComboBox, "Pepperoni", "Pepperoni");
    }//GEN-LAST:event_PepperoniComboBoxActionPerformed

    private void HamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamComboBoxActionPerformed
        currentOrder.handleTopping(HamComboBox, "Ham", "Ham Chunks");
    }//GEN-LAST:event_HamComboBoxActionPerformed

    private void TofuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TofuComboBoxActionPerformed
        currentOrder.handleTopping(TofuComboBox, "Tofu", "Tofu");
    }//GEN-LAST:event_TofuComboBoxActionPerformed

    private void SardinesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SardinesComboBoxActionPerformed
        currentOrder.handleTopping(SardinesComboBox, "Sardines", "Sardines");
    }//GEN-LAST:event_SardinesComboBoxActionPerformed

    private void OnionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnionComboBoxActionPerformed
        currentOrder.handleTopping(OnionComboBox, "Onion", "Diced Onion");
    }//GEN-LAST:event_OnionComboBoxActionPerformed

    private void GPepperComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPepperComboBoxActionPerformed
        currentOrder.handleTopping(GPepperComboBox, "GPepper", "Diced Green Pepper");
    }//GEN-LAST:event_GPepperComboBoxActionPerformed

    private void JalapenosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JalapenosComboBoxActionPerformed
        currentOrder.handleTopping(JalapenosComboBox, "Jalapenos", "Diced Jalapenos");
    }//GEN-LAST:event_JalapenosComboBoxActionPerformed

    private void MushroomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MushroomComboBoxActionPerformed
        currentOrder.handleTopping(MushroomComboBox, "Mushroom", "Sliced Mushroom");
    }//GEN-LAST:event_MushroomComboBoxActionPerformed

    private void PineappleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PineappleComboBoxActionPerformed
        currentOrder.handleTopping(PineappleComboBox, "Pineapple", "Pineapple Chunks");
    }//GEN-LAST:event_PineappleComboBoxActionPerformed

    private void RPepperComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPepperComboBoxActionPerformed
        currentOrder.handleTopping(RPepperComboBox, "RPepper", "Dried Red Pepper");
    }//GEN-LAST:event_RPepperComboBoxActionPerformed

    private void BasilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasilComboBoxActionPerformed
        currentOrder.handleTopping(BasilComboBox, "Basil", "Dried Basil");
    }//GEN-LAST:event_BasilComboBoxActionPerformed

    private void SizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeComboBoxActionPerformed
        String crustType = RegBttn.isSelected() ? "Regular Crust" : "Gluten-Free Crust";
        currentOrder.addCrust(new Topping(crustType, SizeComboBox.getSelectedItem().toString()));
    }//GEN-LAST:event_SizeComboBoxActionPerformed

    private void SauceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauceComboBoxActionPerformed
        currentOrder.handleTopping(SauceComboBox, "Sauce", "Sauce");
    }//GEN-LAST:event_SauceComboBoxActionPerformed

    private void CheeseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseComboBoxActionPerformed
        currentOrder.handleTopping(CheeseComboBox, "Cheese", "Cheese");
    }//GEN-LAST:event_CheeseComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MainOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddIngredPanel;
    private javax.swing.JPanel BasicIngredPanel;
    private javax.swing.JComboBox<String> BasilComboBox;
    private javax.swing.JLabel BasilLabel;
    private javax.swing.JComboBox<String> CheeseComboBox;
    private javax.swing.JLabel CheeseLabel;
    private javax.swing.JButton ClearBttn;
    private javax.swing.ButtonGroup CrustTypeGroup;
    private javax.swing.JLabel CrustTypeLabel;
    private javax.swing.JButton EnterBttn;
    private javax.swing.JButton ExitBttn;
    private javax.swing.JRadioButton GFBttn;
    private javax.swing.JComboBox<String> GPepperComboBox;
    private javax.swing.JLabel GPepperLabel;
    private javax.swing.JComboBox<String> HamComboBox;
    private javax.swing.JLabel HamLabel;
    private javax.swing.JButton HelpBttn;
    private javax.swing.JComboBox<String> JalapenosComboBox;
    private javax.swing.JLabel JalapenosLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JComboBox<String> MushroomComboBox;
    private javax.swing.JLabel MushroomLabel;
    private javax.swing.JComboBox<String> OnionComboBox;
    private javax.swing.JLabel OnionLabel;
    private javax.swing.JComboBox<String> PepperoniComboBox;
    private javax.swing.JLabel PepperoniLabel;
    private javax.swing.JComboBox<String> PineappleComboBox;
    private javax.swing.JLabel PineappleLabel;
    private javax.swing.JLabel PizzaSizeLabel;
    private javax.swing.JComboBox<String> RPepperComboBox;
    private javax.swing.JLabel RPepperLabel;
    private javax.swing.JRadioButton RegBttn;
    private javax.swing.JComboBox<String> SardinesComboBox;
    private javax.swing.JLabel SardinesLabel;
    private javax.swing.JComboBox<String> SauceComboBox;
    private javax.swing.JLabel SauceLabel;
    private javax.swing.JComboBox<String> SizeComboBox;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JComboBox<String> TofuComboBox;
    private javax.swing.JLabel TofuLabel;
    private javax.swing.JLabel ToppingLabel;
    // End of variables declaration//GEN-END:variables
}
