package com.lisuke.UI;

import java.awt.Shape;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public final class util {
	public util() {
	}
	
	public static boolean setWindowShape(Window w,Shape shape){
		if(! (w instanceof Window) || shape==null)
			return false;
		
		com.sun.awt.AWTUtilities.setWindowShape(w, shape);
		return true;
	}
	
		
	public static boolean setMoveable(Window w){
		boolean is=w instanceof JFrame;
		if(is)
			w.addMouseListener(new MouseListener(){
			double x,y;
			boolean ismove=false;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				int count=e.getClickCount();
				if(count==1){
					
				}else if(count==2){
					System.exit(0);
				}else if(count==3){
					
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				x=e.getXOnScreen();
				y=e.getYOnScreen();
				ismove=true;
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
					if(ismove){
					int X=(int) (w.getLocationOnScreen().getX()-(x-e.getXOnScreen()));
					int Y=(int) (w.getLocationOnScreen().getY()-(y-e.getYOnScreen()));
					w.setLocation(X,Y);
					ismove=false;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
			
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
		});
		return is;
	}

	public static boolean setWindowOpacity(Opaque w, float alpha) {
		if(! (w instanceof Window) || alpha>1.0 || alpha<0.0)
			return false;
		com.sun.awt.AWTUtilities.setWindowOpacity(w, alpha);
		return true;
	}

}
