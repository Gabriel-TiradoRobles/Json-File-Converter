/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gtconverter.jsonconverter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

/**
 *
 * @author gabri
 */
public class JsonConverterUI extends javax.swing.JFrame {

    // Create fileType Enumerator
    enum fileType {
        NONE,
        TEXT,
        JSON
    }
    
    // Create Global Variables
    private static fileType convertFromType = fileType.TEXT;
    private static fileType convertToType = fileType.JSON;
    private static char fileDelimiter = ' ';
    private static boolean headerOptionSelected = false;
    private static boolean firstLineHeader = false;
    private String convertToTypeExtension = ".json";
    private String[] lines;
    private String[] headers;
    
    /**
     * Creates new form JsonConverterUI
     */
    public JsonConverterUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConvertFromGroup = new javax.swing.ButtonGroup();
        ConvertToGroup = new javax.swing.ButtonGroup();
        FileChooser = new javax.swing.JFileChooser();
        HeaderAskGroup = new javax.swing.ButtonGroup();
        TypeChoicePanel = new javax.swing.JPanel();
        TypeChoiceLabel = new javax.swing.JLabel();
        FromTextFile = new javax.swing.JRadioButton();
        FromJsonFile = new javax.swing.JRadioButton();
        ProgramTitle = new javax.swing.JLabel();
        FilePreviewPanel = new javax.swing.JPanel();
        FilePrevLabel = new javax.swing.JLabel();
        FileScrollPanel = new javax.swing.JScrollPane();
        FilePreviewArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        DelimiterPanel = new javax.swing.JPanel();
        DelimiterExample = new javax.swing.JLabel();
        DelimiterTextField = new javax.swing.JTextField();
        Delimiterlabel = new javax.swing.JLabel();
        HeaderAskPanel = new javax.swing.JPanel();
        HeaderAskLabel = new javax.swing.JLabel();
        NoButton = new javax.swing.JRadioButton();
        YesButton = new javax.swing.JRadioButton();
        HeaderListPanel = new javax.swing.JPanel();
        FilePrevLabel1 = new javax.swing.JLabel();
        HeaderScrollPanel = new javax.swing.JScrollPane();
        HeaderPreviewArea = new javax.swing.JTextArea();
        TypeChoicePanel1 = new javax.swing.JPanel();
        TypeChoiceLabel1 = new javax.swing.JLabel();
        ToTextFile = new javax.swing.JRadioButton();
        ToJsonFile = new javax.swing.JRadioButton();
        TargetPathLabel = new javax.swing.JLabel();
        TargetPreviewArea = new javax.swing.JTextField();
        TargetBrowseButton = new javax.swing.JButton();
        FileNameLabel = new javax.swing.JLabel();
        FileNameArea = new javax.swing.JTextField();
        TargetPathLabel1 = new javax.swing.JLabel();
        ConvertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File to JSON Converter");
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        TypeChoicePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TypeChoicePanel.setToolTipText("File Type to Convert");
        TypeChoicePanel.setPreferredSize(new java.awt.Dimension(675, 75));

        TypeChoiceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TypeChoiceLabel.setText("File Type To Convert From:");

        ConvertFromGroup.add(FromTextFile);
        FromTextFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FromTextFile.setSelected(true);
        FromTextFile.setText("Text File");
        FromTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromTextFileActionPerformed(evt);
            }
        });

        ConvertFromGroup.add(FromJsonFile);
        FromJsonFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FromJsonFile.setText("JSON File");
        FromJsonFile.setEnabled(false);
        FromJsonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromJsonFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TypeChoicePanelLayout = new javax.swing.GroupLayout(TypeChoicePanel);
        TypeChoicePanel.setLayout(TypeChoicePanelLayout);
        TypeChoicePanelLayout.setHorizontalGroup(
            TypeChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeChoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TypeChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeChoiceLabel)
                    .addComponent(FromTextFile)
                    .addComponent(FromJsonFile))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        TypeChoicePanelLayout.setVerticalGroup(
            TypeChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeChoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TypeChoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FromTextFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FromJsonFile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProgramTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProgramTitle.setText("JSON File Converter");

        FilePreviewPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FilePrevLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FilePrevLabel.setText("Selected File Preview:");

        FilePreviewArea.setColumns(20);
        FilePreviewArea.setRows(5);
        FileScrollPanel.setViewportView(FilePreviewArea);

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FilePreviewPanelLayout = new javax.swing.GroupLayout(FilePreviewPanel);
        FilePreviewPanel.setLayout(FilePreviewPanelLayout);
        FilePreviewPanelLayout.setHorizontalGroup(
            FilePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilePreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileScrollPanel)
                    .addGroup(FilePreviewPanelLayout.createSequentialGroup()
                        .addComponent(FilePrevLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FilePreviewPanelLayout.setVerticalGroup(
            FilePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilePreviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePrevLabel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FileScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        DelimiterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DelimiterPanel.setToolTipText("File Type to Convert");
        DelimiterPanel.setPreferredSize(new java.awt.Dimension(675, 75));

        DelimiterExample.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DelimiterExample.setText("Leave Empty for Space");

        DelimiterTextField.setColumns(5);
        DelimiterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DelimiterTextFieldKeyReleased(evt);
            }
        });

        Delimiterlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delimiterlabel.setText("File Delimiter:");

        javax.swing.GroupLayout DelimiterPanelLayout = new javax.swing.GroupLayout(DelimiterPanel);
        DelimiterPanel.setLayout(DelimiterPanelLayout);
        DelimiterPanelLayout.setHorizontalGroup(
            DelimiterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelimiterPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(DelimiterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DelimiterExample)
                    .addGroup(DelimiterPanelLayout.createSequentialGroup()
                        .addComponent(Delimiterlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelimiterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        DelimiterPanelLayout.setVerticalGroup(
            DelimiterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelimiterPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(DelimiterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelimiterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delimiterlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DelimiterExample)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        HeaderAskPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HeaderAskPanel.setToolTipText("File Type to Convert");
        HeaderAskPanel.setPreferredSize(new java.awt.Dimension(675, 75));

        HeaderAskLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderAskLabel.setText("First Line Headers:");

        HeaderAskGroup.add(NoButton);
        NoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NoButton.setText("No");
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });

        HeaderAskGroup.add(YesButton);
        YesButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        YesButton.setText("Yes");
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderAskPanelLayout = new javax.swing.GroupLayout(HeaderAskPanel);
        HeaderAskPanel.setLayout(HeaderAskPanelLayout);
        HeaderAskPanelLayout.setHorizontalGroup(
            HeaderAskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderAskPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(YesButton)
                .addGap(18, 18, 18)
                .addComponent(NoButton)
                .addGap(53, 53, 53))
            .addGroup(HeaderAskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderAskLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderAskPanelLayout.setVerticalGroup(
            HeaderAskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderAskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderAskLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HeaderAskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoButton)
                    .addComponent(YesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HeaderListPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FilePrevLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FilePrevLabel1.setText("Header Names:");

        HeaderScrollPanel.setWheelScrollingEnabled(false);

        HeaderPreviewArea.setColumns(20);
        HeaderPreviewArea.setRows(5);
        HeaderPreviewArea.setEnabled(false);
        HeaderScrollPanel.setViewportView(HeaderPreviewArea);

        javax.swing.GroupLayout HeaderListPanelLayout = new javax.swing.GroupLayout(HeaderListPanel);
        HeaderListPanel.setLayout(HeaderListPanelLayout);
        HeaderListPanelLayout.setHorizontalGroup(
            HeaderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderListPanelLayout.createSequentialGroup()
                        .addComponent(FilePrevLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(HeaderScrollPanel))
                .addContainerGap())
        );
        HeaderListPanelLayout.setVerticalGroup(
            HeaderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FilePrevLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TypeChoicePanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TypeChoicePanel1.setToolTipText("File Type to Convert");
        TypeChoicePanel1.setPreferredSize(new java.awt.Dimension(675, 75));

        TypeChoiceLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TypeChoiceLabel1.setText("File Type To Convert To:");

        ConvertToGroup.add(ToTextFile);
        ToTextFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToTextFile.setText("Text File");
        ToTextFile.setEnabled(false);
        ToTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToTextFileActionPerformed(evt);
            }
        });

        ConvertToGroup.add(ToJsonFile);
        ToJsonFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToJsonFile.setSelected(true);
        ToJsonFile.setText("JSON File");
        ToJsonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToJsonFileActionPerformed(evt);
            }
        });

        TargetPathLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TargetPathLabel.setText("Target File Location:");

        TargetPreviewArea.setColumns(10);

        TargetBrowseButton.setText("Browse");
        TargetBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TargetBrowseButtonActionPerformed(evt);
            }
        });

        FileNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FileNameLabel.setText("New File Name: (Exclude File Extention)");

        FileNameArea.setColumns(10);

        TargetPathLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TargetPathLabel1.setText("(Blank for Documents as Directory)");

        javax.swing.GroupLayout TypeChoicePanel1Layout = new javax.swing.GroupLayout(TypeChoicePanel1);
        TypeChoicePanel1.setLayout(TypeChoicePanel1Layout);
        TypeChoicePanel1Layout.setHorizontalGroup(
            TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeChoicePanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TypeChoiceLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TypeChoicePanel1Layout.createSequentialGroup()
                        .addComponent(ToTextFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToJsonFile)))
                .addGap(30, 30, 30)
                .addGroup(TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TypeChoicePanel1Layout.createSequentialGroup()
                        .addComponent(TargetPathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TargetBrowseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TargetPathLabel1))
                    .addComponent(TargetPreviewArea, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileNameLabel)
                    .addComponent(FileNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        TypeChoicePanel1Layout.setVerticalGroup(
            TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypeChoicePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeChoiceLabel1)
                    .addComponent(TargetPathLabel)
                    .addComponent(TargetBrowseButton)
                    .addComponent(FileNameLabel)
                    .addComponent(TargetPathLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TypeChoicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToTextFile)
                    .addComponent(ToJsonFile)
                    .addComponent(TargetPreviewArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FileNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        ConvertButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConvertButton.setText("Convert");
        ConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypeChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelimiterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HeaderAskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HeaderListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FilePreviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(TypeChoicePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProgramTitle)
                .addGap(378, 378, 378))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConvertButton)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ProgramTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FilePreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TypeChoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DelimiterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeaderAskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeChoicePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConvertButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FromTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromTextFileActionPerformed
        // TODO add your handling code here:
        convertFromType = fileType.TEXT;
    }//GEN-LAST:event_FromTextFileActionPerformed

    private void FromJsonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromJsonFileActionPerformed
        // TODO add your handling code here:
        convertFromType = fileType.JSON;
    }//GEN-LAST:event_FromJsonFileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setFileFilters();
        FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = FileChooser.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            try {
                FilePreviewArea.read(new FileReader( file.getAbsolutePath() ), null);
                lines = FilePreviewArea.getText().split("\\n");
            }
            catch (IOException e) {
                System.out.println("Issue accessing file: " + file.getAbsolutePath());
            }
        }
        else {
            System.out.println("File browsing canceled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Update delimiter when typing in text box
    private void DelimiterTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DelimiterTextFieldKeyReleased
        // TODO add your handling code here:
        if (!DelimiterTextField.getText().isEmpty()) {
            fileDelimiter = DelimiterTextField.getText().charAt(0);
        }
    }//GEN-LAST:event_DelimiterTextFieldKeyReleased

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        // TODO add your handling code here:
        headerOptionSelected = true;
        firstLineHeader = false;
        HeaderPreviewArea.setEnabled(true);
    }//GEN-LAST:event_NoButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        // TODO add your handling code here:
        headerOptionSelected = true;
        firstLineHeader = true;
        HeaderPreviewArea.setEnabled(false);
        
        if (lines != null && lines.length >= 1) {
            HeaderPreviewArea.setText(lines[0]);
        }
    }//GEN-LAST:event_YesButtonActionPerformed

    private void ToTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToTextFileActionPerformed
        // TODO add your handling code here:
        convertToType = fileType.TEXT;
        convertToTypeExtension = ".txt";
    }//GEN-LAST:event_ToTextFileActionPerformed

    private void ToJsonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToJsonFileActionPerformed
        // TODO add your handling code here:
        convertToType = fileType.JSON;
        convertToTypeExtension = ".json";
    }//GEN-LAST:event_ToJsonFileActionPerformed

    private void ConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertButtonActionPerformed
        // TODO add your handling code here:
        String path, fileName;
        int loopOffset;
        
        // Determines where the converter should start based on if first line are headers
        if (firstLineHeader) {
            loopOffset = 1;
            headers = lines[0].split(String.valueOf(fileDelimiter));
            System.out.println(headers.length);
        }
        else {
            loopOffset = 0;
            headers = HeaderPreviewArea.getText().split(String.valueOf(fileDelimiter));
            System.out.println(headers.length);
        }
        
        // Determines where the converted file will be saved at
        if (!TargetPreviewArea.getText().isEmpty()) {
            path = TargetPreviewArea.getText();
        }
        else {
            path = ".\\";
        }
        
        // Determines the name for the converted file
        if (!FileNameArea.getText().isEmpty()) {
            fileName = FileNameArea.getText();
        }
        else {
            fileName = "output";
        }
        
        // Actually writing the file
        if (headerOptionSelected && !FilePreviewArea.getText().isEmpty()) {
            try (FileWriter writer = new FileWriter(path + "\\" + fileName + convertToTypeExtension)) {
                
                
                for (int i = loopOffset; i < lines.length; i++) {
                    String[] columns = lines[i].split(String.valueOf(fileDelimiter));
                    
                    writer.write("{\n");
                    
                    for (int n = 0; n < headers.length; n++) {
                        writer.write("\t\"" + headers[n] + "\": ");
                        // check if value is a number for conversion
                        try {
                          Integer.parseInt(columns[n]);  
                          
                          writer.write(columns[n] + ",\n");
                        }
                        catch (NumberFormatException e) {
                            writer.write("\"" + columns[n] + "\",\n");
                        }
                    }
                    
                    // Check to cap off json file at end of file
                    if (i >= lines.length - 1) {
                        writer.write("}\n");
                    }
                    else {
                        writer.write("},\n");
                    }
                }
            }
            catch (IOException e) {
                System.out.println("An error occured writing to file: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_ConvertButtonActionPerformed

    private void TargetBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TargetBrowseButtonActionPerformed
        // TODO add your handling code here:
        if (FileChooser.getFileFilter() != null) {
            FileChooser.removeChoosableFileFilter(FileChooser.getFileFilter());
        }
        
        FileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = FileChooser.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            TargetPreviewArea.setText(file.getAbsolutePath());
        }
        else {
            System.out.println("File browsing canceled by user.");
        }
    }//GEN-LAST:event_TargetBrowseButtonActionPerformed

    private void setFileFilters () {
        FileFilter textFilter = new FileNameExtensionFilter("Text file", "txt");
        FileFilter jsonFilter = new FileNameExtensionFilter("JSON file", "json");
        
        if (FileChooser.getFileFilter() != null) {
            FileChooser.removeChoosableFileFilter(FileChooser.getFileFilter());
        }
        
        // Set filter depending on user choice
        switch (convertFromType) {
            case (fileType.TEXT):
                FileChooser.setFileFilter(textFilter);
                break;
                
            case (fileType.JSON):
                FileChooser.setFileFilter(jsonFilter);
                break;
                
            default:
                FileChooser.setFileFilter(textFilter);
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(JsonConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JsonConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JsonConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JsonConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JsonConverterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConvertButton;
    private javax.swing.ButtonGroup ConvertFromGroup;
    private javax.swing.ButtonGroup ConvertToGroup;
    private javax.swing.JLabel DelimiterExample;
    private javax.swing.JPanel DelimiterPanel;
    private javax.swing.JTextField DelimiterTextField;
    private javax.swing.JLabel Delimiterlabel;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JTextField FileNameArea;
    private javax.swing.JLabel FileNameLabel;
    private javax.swing.JLabel FilePrevLabel;
    private javax.swing.JLabel FilePrevLabel1;
    private javax.swing.JTextArea FilePreviewArea;
    private javax.swing.JPanel FilePreviewPanel;
    private javax.swing.JScrollPane FileScrollPanel;
    private javax.swing.JRadioButton FromJsonFile;
    private javax.swing.JRadioButton FromTextFile;
    private javax.swing.ButtonGroup HeaderAskGroup;
    private javax.swing.JLabel HeaderAskLabel;
    private javax.swing.JPanel HeaderAskPanel;
    private javax.swing.JPanel HeaderListPanel;
    private javax.swing.JTextArea HeaderPreviewArea;
    private javax.swing.JScrollPane HeaderScrollPanel;
    private javax.swing.JRadioButton NoButton;
    private javax.swing.JLabel ProgramTitle;
    private javax.swing.JButton TargetBrowseButton;
    private javax.swing.JLabel TargetPathLabel;
    private javax.swing.JLabel TargetPathLabel1;
    private javax.swing.JTextField TargetPreviewArea;
    private javax.swing.JRadioButton ToJsonFile;
    private javax.swing.JRadioButton ToTextFile;
    private javax.swing.JLabel TypeChoiceLabel;
    private javax.swing.JLabel TypeChoiceLabel1;
    private javax.swing.JPanel TypeChoicePanel;
    private javax.swing.JPanel TypeChoicePanel1;
    private javax.swing.JRadioButton YesButton;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
