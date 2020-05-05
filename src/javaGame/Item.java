package javaGame;

import java.awt.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

///////////////////////// ������ Ŭ���� �����Ϸ� ///////////////////
public class Item {
	private Image image; // ���� �̹���

	// �������� ��ǥ�� ũ��
	private int x;
	private int y;
	private int width;
	private int height;

	private int Score;
}
