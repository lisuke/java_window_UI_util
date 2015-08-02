package com.lisuke.UI;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Opaque extends JFrame {

	public Opaque(){
		setTitle("你好");
		setBounds(100,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Opaque w=new Opaque();
		util.setWindowOpacity(w, 0.5F);
		
		int Size=400;
		int distance = 7;
		distance=distance/2;
		
		int size1=Size/4-distance;
				int size2=Size/4+distance;
						int size3=Size/2-distance;
								int size4=Size/2;
		int size5=Size/2+distance;
				int size6=Size-(Size/4)-distance;
						int size7=Size-(Size/4)+distance;
								int size8=Size;
		
		Polygon p=new Polygon();
		/////窗体形状
		//斜正方形
		p.addPoint(size4, 0);
		p.addPoint(size8, size4);
		p.addPoint(size4, Size);
		p.addPoint(0, size4);
		p.addPoint(size4, 0);
		//切掉斜十字
		p.addPoint(size2,size1);
		p.addPoint(size1, size2);
		p.addPoint(size3, size4);
		p.addPoint(size1, size6);
		p.addPoint(size2, size7);
		p.addPoint(size4, size5);
		p.addPoint(size6, size7);
		p.addPoint(size7, size6);
		p.addPoint(size5, size4);
		p.addPoint(size7, size2);
		p.addPoint(size6, size1);
		p.addPoint(size4, size3);
		p.addPoint(size2, size1);
		
		util.setWindowShape(w, (Shape)p);
		
		
		w.setAlwaysOnTop(true);
		w.getContentPane().setBackground(new Color(200,200,255));
		util.setMoveable(w);
	}

}
