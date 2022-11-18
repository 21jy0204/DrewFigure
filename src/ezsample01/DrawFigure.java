package ezsample01;
/*
 * DrawFigure.java
 * EZ Graphics縺ｧ蜷�遞ｮ蝗ｳ蠖｢繧呈緒縺�
 * [縺薙�ｮ繧ｳ繝ｼ繝峨→蜷後§繝輔か繝ｫ繝�縺ｫEZ.java繧堤ｽｮ縺�縺ｦ縺翫￥縺薙→]
 */

import java.awt.Color;

public class DrawFigure {
	public static void main(String[] args) {
		EZ.initialize(400, 400); // 逕ｻ髱｢縺ｮ螟ｧ縺阪＆繧呈ｱｺ繧√ｋ�ｼ�

		//閭梧勹濶ｲ繧定ｨｭ螳�

		
		EZ.setBackgroundColor(Color.YELLOW);


		//邱壹ｒ謠上￥(蟋狗せx, 蟋狗せy, 邨らせx, 邨らせy, 濶ｲ, 邱壼ｹ�)
		EZ.addLine(40,0, 40,50, Color.RED, 1);
		EZ.addLine(0,20, 200,20, Color.RED, 1);

		//遏ｩ蠖｢繧呈緒縺�(荳ｭ蠢�蠎ｧ讓凅, y, 蟷�, 鬮倥＆, 濶ｲ, 蝪励ｊ縺､縺ｶ縺�)
		EZ.addRectangle(100,300, 100,50, Color.CYAN, true);
		
		//繝昴Μ繧ｴ繝ｳ繧呈緒縺�(蠎ｧ讓咎�榊�踊, 蠎ｧ讓咎�榊�遥, 濶ｲ, 蝪励ｊ縺､縺ｶ縺�)
		int[] xp = {200,300,220,250,290,200};
		int[] yp = {100,100,200,80,190,100};
		EZ.addPolygon(xp, yp, Color.MAGENTA, false);

		//繧､繝｡繝ｼ繧ｸ繧呈緒逕ｻ (繝輔ぃ繧､繝ｫ蜷�, 荳ｭ蠢�蠎ｧ讓凅, 荳ｭ蠢�蠎ｧ讓凉)
		EZImage cat = EZ.addImage("src/ezsample01/cat.jpg", 300,300);
		cat.turnLeft(30);

		//譁�蟄励ｒ謠冗判縺吶ｋ(譁�蟄怜�励�ｮ荳ｭ蠢�蠎ｧ讓凅, 譁�蟄怜�励�ｮ荳ｭ蠢�蠎ｧ讓凉, 譁�蟄怜�暦ｼ瑚牡 [,繧ｵ繧､繧ｺ] )
		EZ.addText(40,20, "Hello World", Color.BLACK, 12);
		EZ.addText(300,50, "012縺ゅ＞縺�貍｢蟄�", Color.BLACK, 24);

		// 蜀�繧呈緒縺擾ｼ�(荳ｭ蠢�蠎ｧ讓凅, 荳ｭ蠢�蠎ｧ讓凉, 蟷��ｼ碁ｫ倥＆�ｼ瑚牡�ｼ悟｡励ｊ縺､縺ｶ縺�)
		EZCircle circle = EZ.addCircle(100, 100, 150, 150, Color.RED, true);
		EZ.addCircle(200, 200, 200, 200, Color.RED,  false);
	}
}
