import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class COfchase extends JPanel
{
    static int k=1;
    static int j=0;
    static int a=0;
    static JFrame f=new JFrame();
    static KeyEvent e;
    static int in;
    static int x,y;
    static int s=0 ;
    static Thread t=new Thread(new r());
    static Thread t2;
    static Thread t3;
    static JLabel l=new JLabel();
    public static void main(String args[])throws Exception
    {
        COfchase c=new COfchase();
        f.getContentPane().add(c);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.setSize(1000,800);
        f.setResizable(false);
        Graphics g=f.getGraphics();
        t.start();
        f.addKeyListener(new kl());
        Runnable r2=new Runnable()
        {
            public void run()
            {
                try{
        for(j=0;j<=1500;j+=100)
        { 
            g.setColor(Color.BLACK);
            g.drawString("Score "+(c.s),70,70);
            if(k==0||k==3)
            {
                break;
            }
            g.setColor(Color.GREEN);
            g.fillRect(j,a,100,100);
            t2.sleep(500);
            g.setColor(Color.GREEN);
            g.fillRect(j+100,a,100,100);
            g.setColor(Color.WHITE);
            g.fillRect(j,a,100,100);
            g.setColor(Color.BLACK);
            g.drawString("Score "+(c.s),70,70);
            g.setColor(Color.WHITE);
        }  
        for(long z=0;z<=1000000000000000000l;z++)
        {
            if(z==0)
            t2.sleep(2000);
            if(k==1)//right
            {
                if(in==3)
                {a+=100;}
                else if(in==0)
                    a-=100;
                for(;j<=1500;j+=100)
                {
                    if(k==0||k==3)
                    {
                        in=1;
                        break;
                    }
                    g.setColor(Color.GREEN);
                    g.fillRect(j,a,100,100);
                    if(x==j&&y==a)
                    {
                        c.s++;
                        g.setColor(Color.WHITE);
                        g.drawString("Score "+(c.s-1),70,70);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    }
                    t2.sleep(500);
                    g.setColor(Color.GREEN);
                    g.fillRect(j+100,a,100,100);
                    g.setColor(Color.WHITE);
                    g.fillRect(j,a,100,100);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    g.setColor(Color.WHITE);
                }}      
            if(k==0)//down
            {
                if(in==2)
                    j+=100;
                for(;COfchase.a<=1000;COfchase.a+=100)
                {
                    if(COfchase.k==2||COfchase.k==1)
                    {
                        in=0;
                        break;
                    }
                    t2.sleep(500);
                    g.setColor(Color.GREEN);
                    g.fillRect(COfchase.j,COfchase.a,100,100);if(x==j&&y==a)
                    {
                        c.s++;
                        g.setColor(Color.WHITE);
                        g.drawString("Score "+(s-1),70,70);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(s),70,70);
                        
                    }
                    g.setColor(Color.WHITE);
                    g.fillRect(COfchase.j,COfchase.a-100,100,100);
                    
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    g.setColor(Color.WHITE);
                }
            }
            if( k==2)/*left*/  
            {
                if(in==0)
                {j-=100;
                    a-=100;}
                else if(in==3)
                {
                    j-=100;
                    a+=100;
                }
                for(;COfchase.j>=-100;COfchase.j-=100)
                {
                    if(COfchase.k==3||COfchase.k==0)
                    {in=2;
                        break;}
                    g.setColor(Color.GREEN);
                    g.fillRect(COfchase.j+100,COfchase.a,100,100);
                    t2.sleep(500);
                    if(x==j&&y==a)
                    {
                        c.s++;
                        g.setColor(Color.WHITE);
                        g.drawString("Score "+(s-1),70,70);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(s),70,70);
                    }
                    g.setColor(Color.GREEN);
                    g.fillRect(COfchase.j,COfchase.a,100,100);
                    g.setColor(Color.WHITE);
                    g.fillRect(COfchase.j+100,COfchase.a,100,100);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    g.setColor(Color.WHITE);
                }
            }
            if(k==3)//up
            {
                if(in==2)
                {
                    j+=100;
                    a-=100;
                }
                else if(in==1)
                    a-=100;
                for(;COfchase.a>=-100;COfchase.a-=100)
                {
                    if(COfchase.k==2||COfchase.k==1)
                    {
                        in=3;
                        break;
                    }
                    g.setColor(Color.GREEN);
                    g.fillRect(COfchase.j,COfchase.a+100,100,100);
                    
                        g.drawString("Score "+(c.s),70,70);
                    t2.sleep(500);
                    if(x==j&&y==a)
                    {
                        c.s++;
                        g.setColor(Color.WHITE);
                        g.drawString("Score "+(c.s-1),70,70);
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    }
                    g.setColor(Color.GREEN);
                    g.fillRect(COfchase.j,COfchase.a,100,100);
                    g.setColor(Color.WHITE);
                    g.fillRect(COfchase.j,COfchase.a+100,100,100);
                    
                        g.setColor(Color.BLACK);
                        g.drawString("Score "+(c.s),70,70);
                    g.setColor(Color.WHITE);
                }
            }}
        }catch(Exception e){}
        }};
        t2=new Thread(r2);
        t2.start();
    }
}
class kl implements KeyListener
{
    public void keyPressed(KeyEvent e)
    {
        Graphics g=COfchase.f.getGraphics();
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            COfchase.k=0;
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            COfchase.k=2;
        }if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            COfchase.k=1;
        }if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            COfchase.k=3;
        }
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}
}
class r implements Runnable
{
    @Override
    public void run()
    {
        
            Graphics g=COfchase.f.getGraphics();g.setColor(Color.BLACK);
            g.drawString("Score "+(COfchase.s),70,70);
            for(int i=1;i<=101;i++)
            {
                    
                if(i==4){
                    g.setColor(Color.WHITE);
                    g.fillRect(00,00,1000,800);
                }g.drawString("Score "+(COfchase.s),70,70);
                g.setColor(Color.BLUE);
                COfchase.x=100*((int)(Math.random()*9));
                COfchase.y=100*((int)(Math.random()*7));
                g.fillRect(COfchase.x,COfchase.y,100,100);
                if(i==1)
                continue;
                for(long j=1;j<=2000000000l;j++)
                {
                    
                }
                g.setColor(Color.WHITE);
                g.fillRect(COfchase.x,COfchase.y,100,100);         
        } 
    }   
}