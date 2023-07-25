
package com.wub.bd_income_tax;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bd_income_tax extends javax.swing.JFrame {
    
    double wages;
    double salary;
    double tax;
    double gross;
    double deducted;
    

    public Bd_income_tax() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTitle = new javax.swing.JPanel();
        tvTitle = new javax.swing.JLabel();
        pEmployInfo = new javax.swing.JPanel();
        tvEmployer = new javax.swing.JLabel();
        tvReferenceNo = new javax.swing.JLabel();
        tvEmployee = new javax.swing.JLabel();
        tvJobTitle = new javax.swing.JLabel();
        etReferenceNo = new javax.swing.JTextField();
        etEmployer = new javax.swing.JTextField();
        etEmployee = new javax.swing.JTextField();
        etJobTitle = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        pFooter = new javax.swing.JLabel();
        pEmployInfo1 = new javax.swing.JPanel();
        tvTaxCode = new javax.swing.JLabel();
        tvTaxPeriod = new javax.swing.JLabel();
        tvNiNumber = new javax.swing.JLabel();
        tvNiCode = new javax.swing.JLabel();
        etNiNumber = new javax.swing.JTextField();
        cbTaxPeriod = new javax.swing.JComboBox<>();
        cbTaxCode = new javax.swing.JComboBox<>();
        cbNiCode = new javax.swing.JComboBox<>();
        pEmployInfo2 = new javax.swing.JPanel();
        tvUntaxedIncome = new javax.swing.JLabel();
        tvPayment = new javax.swing.JLabel();
        tvTaxableWages = new javax.swing.JLabel();
        etUntaxtedIncome = new javax.swing.JTextField();
        etTaxableWages = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        cbPayment = new javax.swing.JComboBox<>();
        pEmployInfo3 = new javax.swing.JPanel();
        tvGrossPay = new javax.swing.JLabel();
        tvDate = new javax.swing.JLabel();
        tvDeductions = new javax.swing.JLabel();
        tvNetPay = new javax.swing.JLabel();
        etDate = new javax.swing.JTextField();
        etGrossPay = new javax.swing.JTextField();
        etDeductions = new javax.swing.JTextField();
        etNetPay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pTitle.setBackground(new java.awt.Color(0, 102, 102));
        pTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tvTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tvTitle.setForeground(new java.awt.Color(255, 255, 255));
        tvTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvTitle.setText("BD Income Tax");
        tvTitle.setToolTipText("");

        javax.swing.GroupLayout pTitleLayout = new javax.swing.GroupLayout(pTitle);
        pTitle.setLayout(pTitleLayout);
        pTitleLayout.setHorizontalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tvTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTitleLayout.setVerticalGroup(
            pTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tvTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEmployInfo.setBackground(new java.awt.Color(0, 102, 102));
        pEmployInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tvEmployer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvEmployer.setForeground(new java.awt.Color(255, 255, 255));
        tvEmployer.setText("Employer:");
        tvEmployer.setToolTipText("");

        tvReferenceNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvReferenceNo.setForeground(new java.awt.Color(255, 255, 255));
        tvReferenceNo.setText("Reference No:");
        tvReferenceNo.setToolTipText("");

        tvEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvEmployee.setForeground(new java.awt.Color(255, 255, 255));
        tvEmployee.setText("Employee:");
        tvEmployee.setToolTipText("");

        tvJobTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvJobTitle.setForeground(new java.awt.Color(255, 255, 255));
        tvJobTitle.setText("Job Title:");
        tvJobTitle.setToolTipText("");

        etReferenceNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etReferenceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etReferenceNoActionPerformed(evt);
            }
        });

        etEmployer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmployerActionPerformed(evt);
            }
        });

        etEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmployeeActionPerformed(evt);
            }
        });

        etJobTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etJobTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmployInfoLayout = new javax.swing.GroupLayout(pEmployInfo);
        pEmployInfo.setLayout(pEmployInfoLayout);
        pEmployInfoLayout.setHorizontalGroup(
            pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tvJobTitle)
                    .addComponent(tvEmployee)
                    .addComponent(tvEmployer)
                    .addComponent(tvReferenceNo))
                .addGap(108, 108, 108)
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etReferenceNo)
                    .addComponent(etEmployer)
                    .addComponent(etEmployee)
                    .addComponent(etJobTitle))
                .addContainerGap())
        );
        pEmployInfoLayout.setVerticalGroup(
            pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etReferenceNo)
                    .addComponent(tvReferenceNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etEmployer)
                    .addComponent(tvEmployer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etEmployee)
                    .addComponent(tvEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etJobTitle)
                    .addComponent(tvJobTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        pFooter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pFooter.setForeground(new java.awt.Color(255, 255, 255));
        pFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFooter.setText("BD Income Tax Summary");
        pFooter.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEmployInfo1.setBackground(new java.awt.Color(0, 102, 102));
        pEmployInfo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tvTaxCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvTaxCode.setForeground(new java.awt.Color(255, 255, 255));
        tvTaxCode.setText("TaxCode:");
        tvTaxCode.setToolTipText("");

        tvTaxPeriod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvTaxPeriod.setForeground(new java.awt.Color(255, 255, 255));
        tvTaxPeriod.setText("Tax Period:");
        tvTaxPeriod.setToolTipText("");

        tvNiNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvNiNumber.setForeground(new java.awt.Color(255, 255, 255));
        tvNiNumber.setText("NI Number:");
        tvNiNumber.setToolTipText("");

        tvNiCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvNiCode.setForeground(new java.awt.Color(255, 255, 255));
        tvNiCode.setText("NI Code:");
        tvNiCode.setToolTipText("");

        etNiNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etNiNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNiNumberActionPerformed(evt);
            }
        });

        cbTaxPeriod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbTaxPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cbTaxCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbTaxCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TC1200", "TC1750", "TC2250", "TC2750", "TC3250" }));

        cbNiCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbNiCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC17700", "NIC17701", "", "NIC17702", "", "NIC17703", "", "NIC17704", "", "NIC17705" }));

        javax.swing.GroupLayout pEmployInfo1Layout = new javax.swing.GroupLayout(pEmployInfo1);
        pEmployInfo1.setLayout(pEmployInfo1Layout);
        pEmployInfo1Layout.setHorizontalGroup(
            pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmployInfo1Layout.createSequentialGroup()
                        .addComponent(tvNiCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbNiCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo1Layout.createSequentialGroup()
                        .addComponent(tvNiNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etNiNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmployInfo1Layout.createSequentialGroup()
                        .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tvTaxCode)
                            .addComponent(tvTaxPeriod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTaxPeriod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTaxCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pEmployInfo1Layout.setVerticalGroup(
            pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tvTaxPeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTaxPeriod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tvTaxCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTaxCode, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etNiNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(tvNiNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvNiCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNiCode, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pEmployInfo2.setBackground(new java.awt.Color(0, 102, 102));
        pEmployInfo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tvUntaxedIncome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvUntaxedIncome.setForeground(new java.awt.Color(255, 255, 255));
        tvUntaxedIncome.setText("Untaxed Income:");
        tvUntaxedIncome.setToolTipText("");

        tvPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvPayment.setForeground(new java.awt.Color(255, 255, 255));
        tvPayment.setText("Payment:");
        tvPayment.setToolTipText("");

        tvTaxableWages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvTaxableWages.setForeground(new java.awt.Color(255, 255, 255));
        tvTaxableWages.setText("Taxable Wages:");
        tvTaxableWages.setToolTipText("");

        etUntaxtedIncome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etUntaxtedIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUntaxtedIncomeActionPerformed(evt);
            }
        });

        etTaxableWages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etTaxableWages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTaxableWagesActionPerformed(evt);
            }
        });

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        cbPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1200", "1750", "2250", "2750", "3250" }));
        cbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmployInfo2Layout = new javax.swing.GroupLayout(pEmployInfo2);
        pEmployInfo2.setLayout(pEmployInfo2Layout);
        pEmployInfo2Layout.setHorizontalGroup(
            pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmployInfo2Layout.createSequentialGroup()
                        .addComponent(tvPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo2Layout.createSequentialGroup()
                        .addComponent(tvUntaxedIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etUntaxtedIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo2Layout.createSequentialGroup()
                        .addComponent(tvTaxableWages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etTaxableWages, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo2Layout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pEmployInfo2Layout.setVerticalGroup(
            pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tvPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etUntaxtedIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvUntaxedIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etTaxableWages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvTaxableWages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pEmployInfo3.setBackground(new java.awt.Color(0, 102, 102));
        pEmployInfo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tvGrossPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvGrossPay.setForeground(new java.awt.Color(255, 255, 255));
        tvGrossPay.setText("Gross Pay:");
        tvGrossPay.setToolTipText("");

        tvDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvDate.setForeground(new java.awt.Color(255, 255, 255));
        tvDate.setText("Date:");
        tvDate.setToolTipText("");

        tvDeductions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvDeductions.setForeground(new java.awt.Color(255, 255, 255));
        tvDeductions.setText("Deductions:");
        tvDeductions.setToolTipText("");

        tvNetPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tvNetPay.setForeground(new java.awt.Color(255, 255, 255));
        tvNetPay.setText("Net Pay:");
        tvNetPay.setToolTipText("");

        etDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDateActionPerformed(evt);
            }
        });

        etGrossPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etGrossPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etGrossPayActionPerformed(evt);
            }
        });

        etDeductions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etDeductions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDeductionsActionPerformed(evt);
            }
        });

        etNetPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etNetPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNetPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmployInfo3Layout = new javax.swing.GroupLayout(pEmployInfo3);
        pEmployInfo3.setLayout(pEmployInfo3Layout);
        pEmployInfo3Layout.setHorizontalGroup(
            pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmployInfo3Layout.createSequentialGroup()
                        .addComponent(tvDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo3Layout.createSequentialGroup()
                        .addComponent(tvNetPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo3Layout.createSequentialGroup()
                        .addComponent(tvGrossPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pEmployInfo3Layout.createSequentialGroup()
                        .addComponent(tvDeductions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pEmployInfo3Layout.setVerticalGroup(
            pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmployInfo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etDate)
                    .addComponent(tvDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etGrossPay)
                    .addComponent(tvGrossPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etDeductions)
                    .addComponent(tvDeductions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmployInfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etNetPay)
                    .addComponent(tvNetPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pEmployInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pEmployInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEmployInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pEmployInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pEmployInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEmployInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pEmployInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEmployInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 888, 452);
    }// </editor-fold>//GEN-END:initComponents

    private void etReferenceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etReferenceNoActionPerformed
        
    }//GEN-LAST:event_etReferenceNoActionPerformed

    private void etEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmployerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmployerActionPerformed

    private void etEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmployeeActionPerformed

    private void etJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etJobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etJobTitleActionPerformed

    private void etNiNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNiNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNiNumberActionPerformed

    private void etUntaxtedIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etUntaxtedIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etUntaxtedIncomeActionPerformed

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
        double pay;
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
        etUntaxtedIncome.setText(null);
        cbNiCode.setSelectedIndex(0);
        cbPayment.setSelectedIndex(0);
        cbTaxCode.setSelectedIndex(0);
        cbTaxPeriod.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private JFrame frame;
    
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

    private void cbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentActionPerformed
        if (cbPayment.getSelectedItem().equals("1200")){
            etUntaxtedIncome.setText("1200");
            etTaxableWages.setText("0");
            etGrossPay.setText("1200");
            etDeductions.setText("0");
        } else if (cbPayment.getSelectedItem().equals("1750")){
            etUntaxtedIncome.setText("1200");
            wages = Double.parseDouble(etUntaxtedIncome.getText());
            tax = 1750 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("1750");
            
            salary = (tax * 20) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);
            
        } else if (cbPayment.getSelectedItem().equals("2250")){
            etUntaxtedIncome.setText("1200");
            wages = Double.parseDouble(etUntaxtedIncome.getText());
            tax = 2250 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("2250");
            
            salary = (tax * 25) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);
            
        } else if (cbPayment.getSelectedItem().equals("2750")){
            etUntaxtedIncome.setText("1200");
            wages = Double.parseDouble(etUntaxtedIncome.getText());
            tax = 2750 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("2750");
            
            salary = (tax * 30) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);
            
        } else if (cbPayment.getSelectedItem().equals("3250")){
            etUntaxtedIncome.setText("1200");
            wages = Double.parseDouble(etUntaxtedIncome.getText());
            tax = 3250 - 1200;
            String wageTax = String.format("%.2f", tax);
            etTaxableWages.setText(wageTax);
            etTaxableWages.setText("0");
            etGrossPay.setText("3250");
            
            salary = (tax * 20) / 100;
            String deduction = String.format("%.2f", salary);
            etDeductions.setText(deduction);
            
        } else if (cbPayment.getSelectedItem().equals("0")){
            etUntaxtedIncome.setText("0");
            etTaxableWages.setText("0");
            etGrossPay.setText("0");
        }
    }//GEN-LAST:event_cbPaymentActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Bd_income_tax().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
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
    private javax.swing.JTextField etJobTitle;
    private javax.swing.JTextField etNetPay;
    private javax.swing.JTextField etNiNumber;
    private javax.swing.JTextField etReferenceNo;
    private javax.swing.JTextField etTaxableWages;
    private javax.swing.JTextField etUntaxtedIncome;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pEmployInfo;
    private javax.swing.JPanel pEmployInfo1;
    private javax.swing.JPanel pEmployInfo2;
    private javax.swing.JPanel pEmployInfo3;
    private javax.swing.JLabel pFooter;
    private javax.swing.JPanel pTitle;
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
    private javax.swing.JLabel tvTaxCode;
    private javax.swing.JLabel tvTaxPeriod;
    private javax.swing.JLabel tvTaxableWages;
    private javax.swing.JLabel tvTitle;
    private javax.swing.JLabel tvUntaxedIncome;
    // End of variables declaration//GEN-END:variables
}
