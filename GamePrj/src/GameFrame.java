import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	//�׸� �׸��� �Լ� ������ ����
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawRect(100, 100, 200, 100); // �׸� �����
		g.drawString("������", 101, 101); //���� �����
	}
}
