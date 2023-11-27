 import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;

public class Problem42 extends GraphicsProgram {
	private int countClick = 0;
	private GLine line = null;
	private int startX = -1;
	private int startY = -1;
	private boolean finished = false;
	public void run() {
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e){
		if(line != null && !finished){
			remove(line);
			line = new GLine(startX, startY, e.getX(), e.getY());
			add(line);
		}
	}
	
	public void mouseClicked(MouseEvent e){
		countClick++;
		if(countClick == 1){
			startX = e.getX();
			startY = e.getY();
			line = new GLine(startX, startY,
					startX + 1, 
					startY + 1
					);
			
			add(line);
		}else if(countClick == 2){
			finished = true;
		}
	}
	
	

}