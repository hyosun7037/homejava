package javaGame;

import java.awt.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

///////////////////////// 아이템 클래스 생성완료 ///////////////////
public class Item {
	private Image image; // 젤리 이미지

	// 젤리들의 좌표와 크기
	private int x;
	private int y;
	private int width;
	private int height;

	private int Score;
}
