package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;


    private JLabel totalRequestsNumber;

    private JLabel totalUsersNumber;
    private JLabel mostActiveUserName;
    private JLabel mostPopularActivityName;
    private BufferedImage background;


    public Panel(int x, int y, int width, int height){
        this.x=x;
        this.y = y;
        this.width=width;
        this.height=height;
        this.setBounds(this.x,this.y,this.width,this.height);
        this.setLayout(null);
        try {
            this.background= ImageIO.read(new File("src/res/IMG_4756.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        titleLabel();

        totalRequestsNumberLabel();
        totalRequestsLabel();

        totalUsersNumberLabel();
        totalUsersLabel();

        mostActiveUserNameLabel();
        mostActiveUserLabel();

        mostPopularActivityNameLabel();
        mostPopularActivityLabel();


    }

    private void titleLabel(){
        JLabel title=new JLabel("Statistics");
        title.setBounds(Constants.TITLE_X,Constants.TITLE_Y,Constants.TITLE_WIDTH,Constants.TITLE_HEIGHT);
        title.setFont(new Font(Constants.FONT, 20,40));
        title.setOpaque(false);
        this.add(title);
        title.setVisible(true);
    }

    private void totalRequestsNumberLabel(){
        this.totalRequestsNumber=new JLabel("0");
        this.totalRequestsNumber.setBounds(280,150,200,100);
        this.totalRequestsNumber.setFont(new Font("Arial",10,15));
        this.totalRequestsNumber.setOpaque(false);
        this.add(this.totalRequestsNumber);
        this.totalRequestsNumber.setVisible(true);
    }

    private void totalRequestsLabel(){
        JLabel totalRequests=new JLabel("Total Requests From The Bot: ");
        totalRequests.setBounds(Constants.REQUEST_LABEL_X,Constants.REQUEST_LABEL_Y,Constants.REQUEST_LABEL_WIDTH,Constants.REQUEST_LABEL_HEIGHT);
        totalRequests.setFont(new Font(Constants.FONT,10,15));
        totalRequests.setOpaque(false);
        this.add(totalRequests);
        totalRequests.setVisible(true);
    }

    private void totalUsersNumberLabel(){
        this.totalUsersNumber=new JLabel("1");
        this.totalUsersNumber.setBounds(this.totalRequestsNumber.getX(),this.totalRequestsNumber.getY()+Constants.Y_LABEL_SPACING,this.totalRequestsNumber.getWidth(),this.totalRequestsNumber.getHeight());
        this.totalUsersNumber.setFont(new Font("Arial", 10,15));
        this.totalUsersNumber.setOpaque(false);
        this.add(this.totalUsersNumber);
        this.totalUsersNumber.setVisible(true);

    }
    private void totalUsersLabel(){
        JLabel totalUsers=new JLabel("Total Users Used The Bot: ");
        totalUsers.setBounds(this.totalUsersNumber.getX()-260,this.totalUsersNumber.getY(),this.totalUsersNumber.getWidth(),this.totalUsersNumber.getHeight());
        totalUsers.setFont(new Font(Constants.FONT,10,15));
        totalUsers.setOpaque(false);
        this.add(totalUsers);
        totalUsers.setVisible(true);
    }
    private void mostActiveUserNameLabel(){
        this.mostActiveUserName=new JLabel("2");
        this.mostActiveUserName.setBounds(this.totalUsersNumber.getX(),this.totalUsersNumber.getY()+Constants.Y_LABEL_SPACING,this.totalUsersNumber.getWidth(),this.totalUsersNumber.getHeight());
        this.mostActiveUserName.setFont(new Font(Constants.FONT,10,15));
        this.mostActiveUserName.setOpaque(false);
        this.add(this.mostActiveUserName);
        this.mostActiveUserName.setVisible(true);

    }
    private void mostActiveUserLabel(){
        JLabel mostActiveUser=new JLabel("Most Active User: ");
        mostActiveUser.setBounds(this.totalUsersNumber.getX()-260,this.totalUsersNumber.getY()+Constants.Y_LABEL_SPACING,this.totalUsersNumber.getWidth(),this.totalUsersNumber.getHeight());
        mostActiveUser.setFont(new Font(Constants.FONT, 10,15));
        mostActiveUser.setOpaque(false);
        this.add(mostActiveUser);
        mostActiveUser.setVisible(true);

    }
    private void mostPopularActivityNameLabel(){
        this.mostPopularActivityName=new JLabel("3");
        this.mostPopularActivityName.setBounds(this.mostActiveUserName.getX(),this.mostActiveUserName.getY()+Constants.Y_LABEL_SPACING,this.mostActiveUserName.getWidth(),this.mostActiveUserName.getHeight());
        this.mostPopularActivityName.setFont(new Font(Constants.FONT,10,15));
        this.mostPopularActivityName.setOpaque(false);
        this.add(this.mostPopularActivityName);
        this.mostPopularActivityName.setVisible(true);
    }

    private void mostPopularActivityLabel(){
        JLabel mostPopularActivity=new JLabel("Most Popular API: ");
        mostPopularActivity.setBounds(this.mostPopularActivityName.getX()-260,this.mostPopularActivityName.getY(),this.mostPopularActivityName.getWidth(),this.mostPopularActivityName.getHeight());
        mostPopularActivity.setFont(new Font(Constants.FONT, 10,15));
        mostPopularActivity.setOpaque(false);

        this.add(mostPopularActivity);
        mostPopularActivity.setVisible(true);
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(this.background,0,0,this.width,this.height,null);
    }

}
