import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.*;

public class tictac extends JPanel
{
    static JFrame f;
    static int c;
    static int k=0;
    static int p[][]=new int[3][3];
    static{
        for(int j=0;j<3;j++)
        for(int i=0;i<3;i++)
            p[i][j]=2;
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillRect(0,0,150,150);
        g.setColor(Color.BLACK);
        g.drawRect(0,0,150,150);
        g.drawLine(50,0,50,150);
        g.drawLine(100,0,100,150);
        g.drawLine(0,50,150,50);
        g.drawLine(0,100,150,100); 
        draw(g,0,0,50+5,200+5,40);   
        drawO(g,0,0,0+5,200+5,45); 
        int z[]={100,105,110};
        int w[]={220,230,220};
        g.setColor(Color.BLUE);
        int x=0,y=0,a=100,b=200,s=40;
        g.drawOval(5+a+x,b+y,s,s);
        g.drawOval(5+a+x+1,b+y+1,s-1,s-1);
        g.drawOval(5+a+x+1,b+y+1,s-2,s-2);
        g.setColor(Color.WHITE);
        g.fillRect(100,225,25,25);
        g.setColor(Color.BLUE);
        g.fillPolygon(z,w,3); 
    }
    public static void main(String args[])
    {
        f=new JFrame();
        f.setVisible(true);
        f.getContentPane().add(new tictac());
        f.setSize(300,400);
        f.setBackground(Color.WHITE);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                Graphics g=f.getGraphics(); 
                int a=50,b=200,f=11,h=33;
                int x=7,y=29;
                if(k==0){
                if(e.getX()<a+57&&e.getY()<b+79&&e.getX()>a+7&&e.getY()>b+29)
                    c=1;
                a=0;
                if(e.getX()<a+57&&e.getY()<b+79&&e.getX()>a+7&&e.getY()>b+29)
                    c=0;}
                    k=1;
                    a=100;
                if(e.getX()<a+57&&e.getY()<b+79&&e.getX()>a+7&&e.getY()>b+29)
                {   
                for(int j=0;j<3;j++)
                for(int i=0;i<3;i++)
                p[i][j]=2;        g.setColor(Color.CYAN);
        g.fillRect(9,31,150,150);
        g.setColor(Color.BLACK);
        g.drawRect(9,31,150,150);
        g.drawLine(58,32,58,182);
        g.drawLine(108,32,108,182);
        g.drawLine(8,82,158,82);
        g.drawLine(8,132,158,132);
        g.setColor(Color.WHITE);
        g.fillRect(8,290,300,100);
        k=0;
                }
                for(a=0;a<=100;a+=50)
                for(b=0;b<=100;b+=50)
                if(e.getX()<a+57&&e.getY()<b+79&&e.getX()>a+7&&e.getY()>b+29)
                {
                    if(p[a/50][b/50]!=1&&p[a/50][b/50]!=0)
                    {if(c==0)
                    {drawO(g,11,33,a+5,b+5,40);
                    p[a/50][b/50]=0;c=1;continue;}
                    if(p[a/50][b/50]!=0&&p[a/50][b/50]!=1&&c==1);
                    {draw(g,x,y,a+5,b+5,40);
                    p[a/50][b/50]=1;c=0;}
                }}
                g.setColor(Color.MAGENTA);
                Font fn=new Font("Serif",70,50);
                g.setFont(fn);
                for(int i=0;i<3;i++)
                if((p[i][0]==0)&&(p[i][1]==0)&&p[i][2]==0)
                g.drawString(" O Won!",50,350);
                for(int i=0;i<3;i++)
                if((p[0][i]==0)&&(p[1][i]==0)&&p[2][i]==0)
                g.drawString(" O Won!",50,350);
                for(int i=0;i<3;i++)
                if((p[i][0]==1)&&(p[i][1]==1)&&p[i][2]==1)
                g.drawString(" X Won!",50,350);
                for(int i=0;i<3;i++)
                if((p[0][i]==1)&&(p[1][i]==1)&&p[2][i]==1)
                g.drawString(" X Won!",50,350);
                if((p[0][0]==1)&&(p[1][1]==1)&&p[2][2]==1)
                g.drawString(" X Won!",50,350);
                if((p[2][0]==1)&&(p[1][1]==1)&&p[0][2]==1)
                g.drawString(" X Won!",50,350);
                if((p[0][0]==0)&&(p[1][1]==0)&&p[2][2]==0)
                g.drawString(" O Won!",50,350);
                if((p[2][0]==0)&&(p[1][1]==0)&&p[0][2]==0)
                g.drawString(" O Won!",50,350);
            }
        });
    }
    static void draw(Graphics g,int x,int y,int a,int b,int s)
    {
        g.setColor(Color.RED);
        g.drawLine(a+x,b+y,a+s+x,b+s+y);
        g.drawLine(a+x,b+1+y,a+s+x,b+s+1+y);
        g.drawLine(a+x,b+2+y,a+s+x,b+s+2+y);
        g.drawLine(a+s+x,b+y,a+x,b+s+y);
        g.drawLine(a+s+x,b+1+y,a+x,b+s+1+y);
        g.drawLine(a+s+x,b+2+y,a+x,b+s+2+y);
    }
    static void drawO(Graphics g,int x,int y,int a,int b,int s)
    {
        g.setColor(Color.GREEN);
        g.drawOval(a+x,b+y,s,s);
        g.drawOval(a+x+1,b+y+1,s-1,s-1);
        g.drawOval(a+x+1,b+y+1,s-2,s-2);
    }
}