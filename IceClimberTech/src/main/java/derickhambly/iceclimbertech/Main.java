/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derickhambly.iceclimbertech;


import com.studiohartman.jamepad.ControllerButton;
import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.ControllerState;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derick
 */
public class Main {
    
    private int clicks = 0;
    
    //Gamepad variables
    private static ControllerManager cm;
    private static ControllerButton grab = null, cc = null, pummel = null;
    private static MainForm mf;
    
    //Loop variables
    private static boolean reset = false, setbinds = false;
    private static int state = 0;
    private static long[] times = new long[10];
    
    public static void main (String[] args){
        //new GUI();
        //new NewJFrame().setVisible(true);
        cm = new com.studiohartman.jamepad.ControllerManager();
        cm.initSDLGamepad();
        mf = new MainForm();
        mf.setVisible(true);
        ccPractice();
    }
    
    private static void ccPractice() {
        
        long prev = 0;
        while (true) {
            mf.editTick(System.currentTimeMillis() - prev);
            prev = System.currentTimeMillis();
            ControllerState cs = cm.getState(0);
            if (!setbinds) continue;
            if (reset || cs.start) {
                state = 0;
                resetTimes();
                reset = false;
                continue;
            }
            
            if (state == 0){
                mf.editState("Awaiting Dash");
                state++;
            } else if (state == 1){
                if (cs.leftStickX > .5 || cs.leftStickX < -0.5){
                        times[0] = System.currentTimeMillis();
                        state++;
                        mf.editState("Awaiting grab");
                    }
                
            } else if (state == 2){
                if (pressed(grab)){
                        times[1] = System.currentTimeMillis();
                        state++;
                        mf.editState("Awaiting CC");
                }
            } else if (state == 3){
                if (pressed(cc)){
                    times[2] = System.currentTimeMillis();
                    state++;
                    mf.editState(("Awaiting pummel"));
                }
            } else if (state == 4){
                if (pressed(pummel)){
                    times[3] = System.currentTimeMillis();
                    if (pummel.equals(grab)){
                        if (times[3]-times[2] < 10){
                            continue;
                        }   
                    }
                    state++;
                    mf.editState(("CC complete..."));
                }
            } else if (state == 5) {
                double dashtograbms = times[1] - times[0];
                double grabtoccms = times[2] - times[1];
                double grabtopummelms = times[3] - times[1];
                mf.editDashToGrab(dashtograbms);
                mf.editGrabToCC(grabtoccms);
                mf.editGrabToPummel(grabtopummelms);
                
                if (Math.rint(grabtoccms/16.667) == 3 && Math.rint(grabtopummelms/16.667)>=4 && Math.rint(grabtopummelms/16.667) <= 10) {
                    mf.editState("Successful CC");
                } else {
                    mf.editState("Unsuccessful CC");
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                resetTimes();
                state = 0;
            }
            
        }
    }
    
    private static void resetTimes() {
        for (int i = 0; i < 10; i++) {
            times[i] = 0;
        }
    }
    
    public static void reset() {
        reset = true;
    }
    
    public static void setGrab(ControllerButton cb){
        grab = cb;
        if (grab != null && cc != null && pummel != null){
            mf.editState("Awaiting Dash");
            setbinds = true;
        }
    }
    
    public static void setCC(ControllerButton cb) {
        cc = cb;
        if (grab != null && cc != null && pummel != null){
            mf.editState("Awaiting Dash");
            setbinds = true;
        }
    }
    public static void setPummel(ControllerButton cb){
        pummel = cb;
        if (grab != null && cc != null && pummel != null){
            mf.editState("Awaiting Dash");
            setbinds = true;
        }
    }
    
    public static boolean pressed(ControllerButton button){
        ControllerState cs = cm.getState(0);
        if (button.equals(ControllerButton.A)){
                return cs.a;
        }if (button.equals((ControllerButton.B)))
            return cs.b;
        if (button.equals((ControllerButton.X)))
            return cs.x;
        if (button.equals((ControllerButton.Y)))
            return cs.y;
        if (button.equals((ControllerButton.LEFTBUMPER)))
            return cs.lb;
        if (button.equals((ControllerButton.RIGHTBUMPER)))
            return cs.rb;
        if (button.equals(ControllerButton.LEFTSTICK)){
            return cs.leftTrigger>.2;
        } if (button.equals(ControllerButton.RIGHTSTICK)){
            return cs.rightTrigger>.2;
        } 
        return false;
    }
    public static ControllerButton getNextButton() {
        while (true){
            ControllerState cs = cm.getState(0);
            if(!cs.isConnected || cs.start) {
              return null;
            }
            if (cs.a)
                return ControllerButton.A;
            if (cs.b)
                return ControllerButton.B;
            if (cs.x)
                return ControllerButton.X;
            if (cs.y)
                return ControllerButton.Y;
            if (cs.rb)
                return ControllerButton.RIGHTBUMPER;
            if (cs.lb)
                return ControllerButton.LEFTBUMPER;
            if (cs.rightTrigger > 0.5)
                return ControllerButton.RIGHTSTICK;
            if (cs.leftTrigger > 0.5) {
                return ControllerButton.LEFTSTICK;
            }
            
            
        }
    }

}
