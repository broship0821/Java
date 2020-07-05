import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	//그림 그리는 함수 가져다 쓰기
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawRect(100, 100, 200, 100); // 네모 만들기
		g.drawString("ㅋㅋㅋ", 101, 101); //글자 만들기
	}
}
