
package bdincometax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class v2 extends javax.swing.JFrame {
    
    double pay;
    double wages;
    double salary;
    double tax;
    double gross;
    double deducted;
    double payableTax;
    

    public v2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tvTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tvEmployee = new javax.swing.JLabel();
        tvJobTitle = new javax.swing.JLabel();
        etReferenceNo = new javax.swing.JTextField();
        etEmployer = new javax.swing.JTextField();
        cbPayment = new javax.swing.JComboBox<>();
        tvUntaxedIncome = new javax.swing.JLabel();
        tvPayment = new javax.swing.JLabel();
        tvTaxableWages = new javax.swing.JLabel();
        etIncome = new javax.swing.JTextField();
        etTaxableWages = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        cbTaxCode = new javax.swing.JComboBox<>();
        cbNiCode = new javax.swing.JComboBox<>();
        tvTaxCode = new javax.swing.JLabel();
        tvTaxPeriod = new javax.swing.JLabel();
        tvNiNumber = new javax.swing.JLabel();
        tvNiCode = new javax.swing.JLabel();
        etNiNumber = new javax.swing.JTextField();
        cbTaxPeriod = new javax.swing.JComboBox<>();
        etEmployee = new javax.swing.JTextField();
        etJobTitle = new javax.swing.JTextField();
        tvEmployer = new javax.swing.JLabel();
        tvReferenceNo = new javax.swing.JLabel();
        tvGrossPay = new javax.swing.JLabel();
        tvDate = new javax.swing.JLabel();
        tvDeductions = new javax.swing.JLabel();
        tvNetPay = new javax.swing.JLabel();
        etDate = new javax.swing.JTextField();
        etGrossPay = new javax.swing.JTextField();
        etDeductions = new javax.swing.JTextField();
        etNetPay = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tvReferenceNo1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        tvTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        tvTitle.setForeground(new java.awt.Color(255, 255, 255));
        tvTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvTitle.setText("BD INCOME TAX CREATED BY MOHI-UDDIN (3659/62B)");
        tvTitle.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tvTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tvTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tvEmployee.setBackground(java.awt.Color.white);
        tvEmployee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvEmployee.setText("Employee:");
        tvEmployee.setToolTipText("");

        tvJobTitle.setBackground(java.awt.Color.white);
        tvJobTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvJobTitle.setText("Job Title:");
        tvJobTitle.setToolTipText("");

        etReferenceNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etReferenceNo.setText("Najmus Sakib");
        etReferenceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etReferenceNoActionPerformed(evt);
            }
        });

        etEmployer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etEmployer.setText("Najmus Sakib");
        etEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmployerActionPerformed(evt);
            }
        });

        cbPayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1200", "1750", "2250", "2750", "3250" }));
        cbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaymentActionPerformed(evt);
            }
        });

        tvUntaxedIncome.setBackground(java.awt.Color.white);
        tvUntaxedIncome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvUntaxedIncome.setText("Income:");
        tvUntaxedIncome.setToolTipText("");

        tvPayment.setBackground(java.awt.Color.white);
        tvPayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvPayment.setText("Payment:");
        tvPayment.setToolTipText("");

        tvTaxableWages.setBackground(java.awt.Color.white);
        tvTaxableWages.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvTaxableWages.setText("Taxable Wages:");
        tvTaxableWages.setToolTipText("");

        etIncome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etIncomeActionPerformed(evt);
            }
        });

        etTaxableWages.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etTaxableWages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTaxableWagesActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 51, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cbTaxCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbTaxCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TC1200", "TC1750", "TC2250", "TC2750", "TC3250" }));

        cbNiCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbNiCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC17700", "NIC17701", "", "NIC17702", "", "NIC17703", "", "NIC17704", "", "NIC17705" }));

        tvTaxCode.setBackground(java.awt.Color.white);
        tvTaxCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvTaxCode.setText("TaxCode:");
        tvTaxCode.setToolTipText("");

        tvTaxPeriod.setBackground(java.awt.Color.white);
        tvTaxPeriod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvTaxPeriod.setText("Tax Period:");
        tvTaxPeriod.setToolTipText("");

        tvNiNumber.setBackground(java.awt.Color.white);
        tvNiNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvNiNumber.setText("NI Number:");
        tvNiNumber.setToolTipText("");

        tvNiCode.setBackground(java.awt.Color.white);
        tvNiCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvNiCode.setText("NI Code:");
        tvNiCode.setToolTipText("");

        etNiNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etNiNumber.setText("123456789");
        etNiNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNiNumberActionPerformed(evt);
            }
        });

        cbTaxPeriod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbTaxPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        etEmployee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etEmployee.setText("Mohi-Uddin");
        etEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmployeeActionPerformed(evt);
            }
        });

        etJobTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etJobTitle.setText("Flutter Developer");
        etJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etJobTitleActionPerformed(evt);
            }
        });

        tvEmployer.setBackground(java.awt.Color.white);
        tvEmployer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvEmployer.setText("Employer:");
        tvEmployer.setToolTipText("");

        tvReferenceNo.setBackground(java.awt.Color.white);
        tvReferenceNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvReferenceNo.setText("Reference No:");
        tvReferenceNo.setToolTipText("");

        tvGrossPay.setBackground(java.awt.Color.white);
        tvGrossPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvGrossPay.setText("Gross Pay:");
        tvGrossPay.setToolTipText("");

        tvDate.setBackground(java.awt.Color.white);
        tvDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvDate.setText("Date:");
        tvDate.setToolTipText("");

        tvDeductions.setBackground(java.awt.Color.white);
        tvDeductions.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvDeductions.setText("Deductions:");
        tvDeductions.setToolTipText("");

        tvNetPay.setBackground(java.awt.Color.white);
        tvNetPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tvNetPay.setText("Net Pay:");
        tvNetPay.setToolTipText("");

        etDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etDate.setText("25/07/2023");
        etDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDateActionPerformed(evt);
            }
        });

        etGrossPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etGrossPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etGrossPayActionPerformed(evt);
            }
        });

        etDeductions.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etDeductions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDeductionsActionPerformed(evt);
            }
        });

        etNetPay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etNetPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNetPayActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(51, 51, 255));
        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 51, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tvReferenceNo1.setBackground(java.awt.Color.white);
        tvReferenceNo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tvReferenceNo1.setForeground(new java.awt.Color(153, 153, 153));
        tvReferenceNo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvReferenceNo1.setText("Created on 25/07/2023 at 11:41 PM");
        tvReferenceNo1.setToolTipText("");

        btnInsert.setBackground(new java.awt.Color(51, 51, 255));
        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tvJobTitle)
                                    .addComponent(tvEmployee)
                                    .addComponent(tvEmployer)
                                    .addComponent(tvReferenceNo))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etReferenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(etEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tvPayment)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(tvUntaxedIncome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(203, 203, 203)
                                    .addComponent(cbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(tvTaxableWages)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etTaxableWages, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addComponent(tvReferenceNo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tvTaxCode)
                            .addComponent(tvTaxPeriod)
                            .addComponent(tvNiNumber)
                            .addComponent(tvNiCode)
                            .addComponent(tvDate)
                            .addComponent(tvGrossPay)
                            .addComponent(tvDeductions)
                            .addComponent(tvNetPay))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNiCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etNiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTaxCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTaxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbTaxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cbTaxCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(etNiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tvNiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tvTaxPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tvTaxCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbNiCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tvNiCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tvGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etGrossPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tvDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tvNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tvReferenceNo1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etReferenceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tvReferenceNo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(etEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tvEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tvEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etJobTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(tvJobTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPayment)
                            .addComponent(tvPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etIncome)
                            .addComponent(tvUntaxedIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etTaxableWages)
                            .addComponent(tvTaxableWages, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1007, 567);
    }// </editor-fold>//GEN-END:initComponents

    private void etNiNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNiNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNiNumberActionPerformed

    private void etEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmployeeActionPerformed

    private void etJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etJobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etJobTitleActionPerformed

    private void etReferenceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etReferenceNoActionPerformed

    }//GEN-LAST:event_etReferenceNoActionPerformed

    private void etEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmployerActionPerformed

    private void cbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentActionPerformed
        if (cbPayment.getSelectedItem().equals("1200")){
            etIncome.setText("1200");
            etTaxableWages.setText("0");
            etGrossPay.setText("1200");
            etDeductions.setText("0");
        } else if (cbPayment.getSelectedItem().equals("1750")){
            etIncome.setText("1200");
            wages = Double.parseDouble(etIncome.getText());
            tax = 1750 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("1750");

            salary = (tax * 20) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);

        } else if (cbPayment.getSelectedItem().equals("2250")){
            etIncome.setText("1200");
            wages = Double.parseDouble(etIncome.getText());
            tax = 2250 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("2250");

            salary = (tax * 25) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);

        } else if (cbPayment.getSelectedItem().equals("2750")){
            etIncome.setText("1200");
            wages = Double.parseDouble(etIncome.getText());
            tax = 2750 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("2750");

            salary = (tax * 30) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);

        } else if (cbPayment.getSelectedItem().equals("3250")){
            etIncome.setText("1200");
            wages = Double.parseDouble(etIncome.getText());
            tax = 3250 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("3250");

            salary = (tax * 20) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);

        } else if (cbPayment.getSelectedItem().equals("0")){
            etIncome.setText("0");
            etTaxableWages.setText("0");
            etGrossPay.setText("0");
        }
    }//GEN-LAST:event_cbPaymentActionPerformed

    private void etIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etIncomeActionPerformed

    private void etTaxableWagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTaxableWagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTaxableWagesActionPerformed

    private void etDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etDateActionPerformed

    private void etGrossPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etGrossPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etGrossPayActionPerformed

    private void etDeductionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDeductionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etDeductionsActionPerformed

    private void etNetPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNetPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNetPayActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        gross = Double.parseDouble(etGrossPay.getText());
        deducted = Double.parseDouble(etDeductions.getText());
        pay = gross - deducted;
        String wageTax = String.format("BD%.2f", pay);
        etNetPay.setText(wageTax);

        String g = String.format("BD%.2f", gross);
        etGrossPay.setText(g);

        String d = String.format("BD%.2f", deducted);
        etDeductions.setText(d);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        etDate.setText(null);
        etDeductions.setText(null);
        etEmployee.setText(null);
        etEmployer.setText(null);
        etGrossPay.setText(null);
        etJobTitle.setText(null);
        etNetPay.setText(null);
        etNiNumber.setText(null);
        etReferenceNo.setText(null);
        etTaxableWages.setText(null);
        etIncome.setText(null);
        cbNiCode.setSelectedIndex(0);
        cbPayment.setSelectedIndex(0);
        cbTaxCode.setSelectedIndex(0);
        cbTaxPeriod.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,
            "Confirm if you want to exit",
            "Income Tax Calculator",
            JOptionPane.YES_NO_OPTION
        )==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String dbURL = "jdbc:mysql://localhost:3306/income_tax_manager";
        String username = "root";
        String password = "1234";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            try ( 
                    
                Connection conn = DriverManager.getConnection(dbURL, username, password)) {
                String sql = "INSERT INTO tax_info (income, tax) VALUES (?, ?)";
                
                try ( 
                    
                    PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    double income = Double.parseDouble(etIncome.getText());
                    preparedStatement.setDouble(1, income);
                    preparedStatement.setDouble(2, pay);
                    preparedStatement.executeUpdate();
                }
            }

            JOptionPane.showMessageDialog(this, "Data inserted successfully.");
        } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(this, "Error executing SQL query: " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private JFrame frame;
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new v2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbNiCode;
    private javax.swing.JComboBox<String> cbPayment;
    private javax.swing.JComboBox<String> cbTaxCode;
    private javax.swing.JComboBox<String> cbTaxPeriod;
    private javax.swing.JTextField etDate;
    private javax.swing.JTextField etDeductions;
    private javax.swing.JTextField etEmployee;
    private javax.swing.JTextField etEmployer;
    private javax.swing.JTextField etGrossPay;
    private javax.swing.JTextField etIncome;
    private javax.swing.JTextField etJobTitle;
    private javax.swing.JTextField etNetPay;
    private javax.swing.JTextField etNiNumber;
    private javax.swing.JTextField etReferenceNo;
    private javax.swing.JTextField etTaxableWages;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel tvDate;
    private javax.swing.JLabel tvDeductions;
    private javax.swing.JLabel tvEmployee;
    private javax.swing.JLabel tvEmployer;
    private javax.swing.JLabel tvGrossPay;
    private javax.swing.JLabel tvJobTitle;
    private javax.swing.JLabel tvNetPay;
    private javax.swing.JLabel tvNiCode;
    private javax.swing.JLabel tvNiNumber;
    private javax.swing.JLabel tvPayment;
    private javax.swing.JLabel tvReferenceNo;
    private javax.swing.JLabel tvReferenceNo1;
    private javax.swing.JLabel tvTaxCode;
    private javax.swing.JLabel tvTaxPeriod;
    private javax.swing.JLabel tvTaxableWages;
    private javax.swing.JLabel tvTitle;
    private javax.swing.JLabel tvUntaxedIncome;
    // End of variables declaration//GEN-END:variables
}
