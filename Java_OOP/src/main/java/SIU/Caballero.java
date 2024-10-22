
package SIU;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author javie
 */
public class Caballero extends Personaje{
    private double DT;
    private boolean defensaActivada;
    Random random = new Random();
    public Caballero() {}

    public Caballero(int mana, String Nombre, double PV, double PD, double PA) {
        super(Nombre, 100, 30, 25, mana);
    }
    
    public double getDT() {
        return DT;
    }
    
    private double calcularDT(Personaje personaje) {
    double PD = personaje.getPD();
    double porcentajeDefensa = PD / 100.0;
    double DT = this.getPA() * (1 - porcentajeDefensa);
    return DT;
}
    
    public void Rempalago( Personaje personaje) {
        double DT = calcularDT(personaje);
        DT = Math.round(DT);
        JOptionPane.showMessageDialog(null, getNombre()+" Makes the air feel more dense...", "Warning", JOptionPane.WARNING_MESSAGE);
        int Nrand = random.nextInt(10) + 1;
        if (Nrand >= 3 && Nrand <=6){
            int nuevaPV = (int) (personaje.getPV() - DT);
            personaje.setPV(nuevaPV);
            JOptionPane.showMessageDialog(null, "Lightning has reach with " + DT + " of damage", "Warning", JOptionPane.WARNING_MESSAGE);}
        if(Nrand > 6 && Nrand <=10){
            DT = DT*2;
            int nuevaPV = (int) (personaje.getPV() - DT);
            personaje.setPV(nuevaPV);
            JOptionPane.showMessageDialog(null, "!Great, you have strucked twice\nTotal damage of "+ DT, "Warning", JOptionPane.WARNING_MESSAGE);
        if(Nrand < 3){
            JOptionPane.showMessageDialog(null,"You've missed!!");}
        }
    }
    
public void atacar(Personaje personaje) {
    JOptionPane.showMessageDialog(null, getNombre()+" gets ready to throw a hit");
    double DT = calcularDT(personaje);
    DT = Math.round(DT);
    int critico = random.nextInt(10) + 1;

    if (critico > 8 && critico > 1) {
        DT *= 2;
        int nuevaPV = (int) (personaje.getPV() - DT);
        personaje.setPV(nuevaPV);
        JOptionPane.showMessageDialog(null, getNombre()+" have hit a critical!!\nTotal damage: " + DT);
    }
    if (critico > 1 && critico <=8) {
    int nuevaPV = (int) (personaje.getPV() - DT);
    personaje.setPV(nuevaPV);
    JOptionPane.showMessageDialog(null, getNombre()+" swings his sword and hits.\nTotal damage: " + DT);}

    if (critico == 1) {
        JOptionPane.showMessageDialog(null, getNombre()+" have missed!!");
    }
}
    
    public void curarse() {
        JOptionPane.showMessageDialog(null, getNombre()+" Drinks a potion to heal himself");
        if (getPV()<100){
        int nuevaPV = (int) (getPV() + 15);
        if(nuevaPV>100){
            this.setPV(100);
        }
        else{
            this.setPV(nuevaPV);}}
    }

    
    public void defender() {
    double defensa = Math.random(); // Genera un número aleatorio entre 0 y 1
    if (defensa < 0.5) {  // Reducción del 50% del daño
        this.setPD(50);
        JOptionPane.showMessageDialog(null, getNombre()+" assumes a defensive stance.\nDamage reduced by 50%.", "Defensive Move", JOptionPane.INFORMATION_MESSAGE);
    } else if (defensa < 0.7) { // Reducción del 70% del daño
        this.setPD(70);
        JOptionPane.showMessageDialog(null, getNombre()+" raises the shield and braces for impact.\nDamage reduced by 70%.", "Defensive Move", JOptionPane.INFORMATION_MESSAGE);
    } else { // Reducción del 100% del daño
        this.setPD(100);
        JOptionPane.showMessageDialog(null, getNombre()+" activates an impenetrable barrier.\nNo damage will be taken.", "Defensive Move", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    public boolean isDefensaActivada() {
        return defensaActivada;
    }
    
    public void restablecerValoresDefensa() {
        this.setPD(30); // Restablecer el valor de defensa al valor predeterminado
        defensaActivada = false;
    }
    
    
    public void display() {
    StringBuilder sb = new StringBuilder();
    sb.append("/////////////////////////////////////////\n");
    sb.append("This is your character\n");
    sb.append("Your name is: "+ getNombre()).append("\n");
    sb.append("Health "+ getPV()).append("\n");
    sb.append("Damage: "+ getPA()).append("\n");
    sb.append("Defense: "+ getPD() +"% of the damage").append("\n");
    sb.append("Skills: Lightning and healing").append("\n");
    sb.append("/////////////////////////////////////////\n");

    JOptionPane.showMessageDialog(null, sb.toString(), "Character Information", JOptionPane.INFORMATION_MESSAGE);
}
}
