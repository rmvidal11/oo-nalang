/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expense_income_tracker;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import javax.swing.JTable;
import java.awt.*;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
/**
 *
 * @author mia
 */
public class ExpensesIncomesTracker extends JFrame{
    
    private final ExpenseIncomeTableModel tableModel;
    private final JTable table;
    private final JTextField descriptionField;
    private final JTextField amountField = null;
    private final JComboBox<String>typeCombobox;
    private final JButton addButton; 
    private final JLabel balanceLabel;
    private double balance;
    private final JTextField dateField;
    
   public ExpensesIncomesTracker(){
   
       try{
        UIManager.setLookAndFeel(new FlatDarkLaf());
    
   }
   catch(UnsupportedLookAndFeelException ex){
       System.err.println("Failed to Set FlatDarkLaf LookAndFeel");
   }
      UIManager.put("TextField.forground", Color.WHITE);
      UIManager.put("TextField.background", Color.DARK_GRAY);
      UIManager.put("TextField.caretForground", Color.RED);
      UIManager.put("ComboBox.forground", Color.YELLOW);
      UIManager.put("ComboBox.selectionForground", Color.WHITE);
      UIManager.put("ComboBox.background", Color.BLACK);
      UIManager.put("Button.forground", Color.WHITE);
      UIManager.put("Button.background", Color.ORANGE);
      UIManager.put("Label.forground", Color.RED);
      
      balance = 0.0;
      tableModel = new ExpenseIncomeTableModel();
      table = new JTable(tableModel);
      JScrollPane scrollpane = new JScrollPane(table);
      
      dateField = new JTextField(10);
      descriptionField = new JTextField(20);
      typeCombobox = new JComboBox<>(new String[]{"Expense", "Income"});
      
      addButton = new JButton("Add");
      balanceLabel = new JLabel("Balance: $" + balance);
      
      JPanel inputPanel = new JPanel();
      inputPanel.add(new JLabel("Date"));
      inputPanel.add(dateField);
      
      inputPanel.add(new JLabel("Description"));
      inputPanel.add(descriptionField);
      
      inputPanel.add(new JLabel("Amount"));
      inputPanel.add(amountField);
      
      inputPanel.add(new JLabel("Type"));
      inputPanel.add(typeCombobox);
      
      inputPanel.add(addButton);
      
      JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      bottomPanel.add(balanceLabel);
      setLayout(new BorderLayout());
      
      add(inputPanel, BorderLayout.NORTH);
      add(scrollpane, BorderLayout.CENTER);
      add (bottomPanel, BorderLayout.SOUTH);
      
      setTitle("Expenses And Incomes Tracker");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
      
      
   }
}