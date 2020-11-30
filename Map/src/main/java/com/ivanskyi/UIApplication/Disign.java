package com.ivanskyi.UIApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Disign {
    ListOfBooks listOfBooks = new ListOfBooks();
    JFrame mainWindow = new JFrame();
    JComboBox bookList = new JComboBox();
    JTextField yearWhenYouTakeBook = new JTextField();
    JTextField monthWhenYouTakeBook = new JTextField();
    JTextField dayWhenYouTakeBook = new JTextField();
    JLabel statusByTakeBook = new JLabel();
    JLabel resultSearchByData = new JLabel();

    public void createMainWindow(){
        mainWindow.getContentPane().setBackground(Color.white);
        mainWindow.setLayout(null);
        int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        mainWindow.setBounds(screenWidth / 2 - 400,screenHeight / 2 - 250,800,500);
        mainWindow.setDefaultCloseOperation(1);
        addMainWindowElements();
        mainWindow.setVisible(true);
    }

    public void addMainWindowElements(){
        addComboBox();
        addButtonForTakeBook();
        addTextFields();
        addLabels();
        addResultLabels();
    }

   public void addComboBox(){
        String[] booksName = {"ТРИСТА ПОЕЗІЙ","ДЖУРИ І КУДЛАТИК"};
       bookList.setModel(new DefaultComboBoxModel(booksName));
       bookList.getSelectedItem();
       bookList.getSelectedIndex();
       bookList.setBounds(10,50,200,50);
       mainWindow.add(bookList);
    }

    public void addButtonForTakeBook(){
        JButton takeBook = new JButton(Phrases.TAKETHISBOOKNOW.text);
        JButton getBookNameByData = new JButton(Phrases.GETBOOKNAMEBYDATA.getText());
        takeBook.setBounds(220,50,200,50);
        getBookNameByData.setBounds(10,280,250,50);
        takeBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = bookList.getSelectedItem().toString();
                statusByTakeBook.setText(selectedBook);
            }
        });
        mainWindow.add(takeBook);
        mainWindow.add(getBookNameByData);
    }


    public void addTextFields(){
        yearWhenYouTakeBook.setBounds(10,220,70,50);
        monthWhenYouTakeBook.setBounds(90,220,70,50);
        dayWhenYouTakeBook.setBounds(170,220,70,50);
        mainWindow.add(yearWhenYouTakeBook);
        mainWindow.add(monthWhenYouTakeBook);
        mainWindow.add(dayWhenYouTakeBook);
    }

    public void addLabels(){
        JLabel choiceBook = new JLabel(Phrases.CHOICEBOOK.getText());
        JLabel tookBook = new JLabel(Phrases.TOOKBOOK.getText());
        JLabel year = new JLabel(Phrases.YEAR.getText());
        JLabel month = new JLabel(Phrases.MONTH.getText());
        JLabel day = new JLabel(Phrases.DAY.getText());
        choiceBook.setBounds(10,10,350,20);
        tookBook.setBounds(10,175,450,20);
        year.setBounds(10,200,100,20);
        month.setBounds(90,200,100,20);
        day.setBounds(170,200,100,20);
        mainWindow.add(choiceBook);
        mainWindow.add(tookBook);
        mainWindow.add(year);
        mainWindow.add(month);
        mainWindow.add(day);
    }

    public void addResultLabels(){
        statusByTakeBook.setText(Phrases.BOOKTAKERESULT.getText());
        resultSearchByData.setText(Phrases.RESULTSEARCH.getText());
        statusByTakeBook.setBounds(450,10,300,100);
        resultSearchByData.setBounds(450,175,300,100);
        mainWindow.add(statusByTakeBook);
        mainWindow.add(resultSearchByData);
    }
}