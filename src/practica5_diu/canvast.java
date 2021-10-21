package practica5_diu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class canvast extends JPanel{
    private BufferedImage imagen = null;
    private Image logo = null;
    private boolean c_red;
    private boolean c_blue;
    private boolean c_green;
    int x = x_righ;
    int y = y_top;
    
    static int x_righ = 473;
    static int x_left = 0;
    static int y_top = -20;
    static int y_bottom = 485;
    
    public canvast(){
        try {
            c_red = Boolean.TRUE;
            c_blue = Boolean.TRUE;
            c_green = Boolean.TRUE;
            imagen = ImageIO.read(new URL("https://i.pinimg.com/564x/b5/cb/63/b5cb633370b799cbcb96ab946e6246c0.jpg"));
            BufferedImage bi = ImageIO.read(new URL("https://i.ibb.co/fp2VRS4/kisspng-straw-hat-sombrero-sun-hat-hat-5aa7478e69a567-7288363115209122704327.png"));
            logo = bi.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(canvast.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(canvast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(seleccionarComponentes(imagen, c_red, c_green, c_blue), 0, 0, null);
        g.drawImage(logo, x,y, null);
        
    }
    
    private static BufferedImage clonarImagen(BufferedImage bi) {
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }
    
    public static BufferedImage seleccionarComponentes(BufferedImage img, boolean c_red, boolean c_green, boolean c_blue){
        int mask = 0x000000;
        if (c_red) mask = mask | 0xFF0000;
        if (c_green) mask = mask | 0x00FF00;
        if (c_blue) mask = mask | 0x0000FF;
        
        BufferedImage img_copy = clonarImagen(img);
        for (int j=0;j<img.getHeight();j++){
            for (int i=0;i<img.getWidth();i++){
                img_copy.setRGB(i, j, mask & img.getRGB(i, j));
            }
        }
        return img_copy;
    }

    public void changeImageChannels(boolean c_red, boolean c_green, boolean c_blue) {
       this.c_blue = c_blue;
       this.c_green = c_green;
       this.c_red = c_red;
       this.repaint();
    }
    
    public void setLogoPosition(int x, int y){
        this.x = x;
        this.y = y;
        this.repaint();
    }
    
}
